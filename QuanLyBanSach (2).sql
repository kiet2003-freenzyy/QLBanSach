create database QuanLyNhaSach;
use QuanLyNhaSach;

CREATE TABLE NguoiDung(
    MaDN INT PRIMARY KEY,
    TenDN NVARCHAR(20),
    MatKhau NVARCHAR(45),
    TenNV NVARCHAR(45),
    Role NVARCHAR(20)
);

CREATE TABLE LoaiSach (
  LS_ID INT PRIMARY KEY,
  Ten NVARCHAR(100),
  MoTa NVARCHAR(255)
);

CREATE TABLE Sach (
  S_ID INT PRIMARY KEY,
  TieuDe NVARCHAR(255),
  TacGia NVARCHAR(255),
  NamXuatBan INT,
  TheLoai INT,
  GiaBan MONEY,
  MoTa NVARCHAR(255),
  FOREIGN KEY (TheLoai) REFERENCES LoaiSach (LS_ID)
);

CREATE TABLE HoaDon (
  HD_ID INT PRIMARY KEY,
  Ngay DATE,
  NhanVien NVARCHAR(255),
  TenKhachHang NVARCHAR(255),
  GhiChu NVARCHAR(255),
  TongTien MONEY,
);


CREATE TABLE ChiTietHoaDon (
  CTHD_ID INT PRIMARY KEY,
  IDHoaDon INT,
  IDSach INT,
  SoLuong INT,
  ThanhTien MONEY,
  FOREIGN KEY (IDHoaDon) REFERENCES HoaDon(HD_ID),
  FOREIGN KEY (IDSach) REFERENCES Sach(S_ID)
);


CREATE TABLE PhieuNhap (
  PNS_ID INT PRIMARY KEY,
  GhiChu NVARCHAR(255),
  Ngay DATE,
  NhanVien nvarchar(255),
  TongTien MONEY,
);	

CREATE TABLE ChiTietPhieuNhap (
  CTPNS_ID INT PRIMARY KEY,
  IDPhieuNhap INT,
  IDSach INT,
  SoLuong int,
  ThanhTien MONEY,
  FOREIGN KEY( IDPhieuNhap) REFERENCES PhieuNhap(PNS_ID),
  FOREIGN KEY (IDSach) REFERENCES Sach(S_ID)
);
--HoaDon
-- Trigger UpdateThanhTien 
CREATE TRIGGER UpdateThanhTien
ON ChiTietHoaDon
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    UPDATE c
    SET ThanhTien = s.GiaBan * c.SoLuong
    FROM ChiTietHoaDon c
    JOIN Sach s ON c.IDSach = s.S_ID
    JOIN inserted i ON c.CTHD_ID = i.CTHD_ID
    WHERE EXISTS (SELECT 1 FROM inserted);
END;

drop trigger UpdateTongTien
-- Trigger UpdateTongTien
CREATE TRIGGER UpdateTongTien
ON ChiTietHoaDon
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    SET NOCOUNT ON;

    WITH CTE AS (
        SELECT IDHoaDon, SUM(ThanhTien) AS TongTien
        FROM ChiTietHoaDon
        GROUP BY IDHoaDon
    )
    UPDATE HoaDon
    SET TongTien = CTE.TongTien
    FROM HoaDon
    INNER JOIN CTE ON HoaDon.HD_ID = CTE.IDHoaDon;
END;
-- Trigger UpdateThanhTien cho bảng ChiTietPhieuNhap
CREATE TRIGGER UpdateThanhTien_PN
ON ChiTietPhieuNhap
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    UPDATE c
    SET ThanhTien = s.GiaBan * c.SoLuong
    FROM ChiTietPhieuNhap c
    JOIN Sach s ON c.IDSach = s.S_ID
    JOIN inserted i ON c.CTPNS_ID = i.CTPNS_ID
    WHERE EXISTS (SELECT 1 FROM inserted);
END;

-- Trigger UpdateTongTien cho bảng PhieuNhap
CREATE TRIGGER UpdateTongTien_PN
ON ChiTietPhieuNhap
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    DECLARE @PNS_ID INT;

    IF EXISTS (SELECT * FROM inserted)
        SELECT @PNS_ID = IDPhieuNhap FROM inserted;
    ELSE
        SELECT @PNS_ID = IDPhieuNhap FROM deleted;

    UPDATE PhieuNhap
    SET TongTien = (
        SELECT SUM(ThanhTien)
        FROM ChiTietPhieuNhap
        WHERE IDPhieuNhap = @PNS_ID
    )
    WHERE PNS_ID = @PNS_ID;
END;




INSERT INTO NguoiDung (MaDN, TenDN, MatKhau, TenNV, Role)
VALUES
(1, 'user1', 'pass1', N'Nguyễn Văn A', 'Nhan Vien'),
(2, 'user2', 'pass2', N'Nguyễn Thị B', 'Quan Ly'),
(3, 'user3', 'pass3', N'Trần Văn C', 'Nhan Vien');

INSERT INTO LoaiSach (LS_ID, Ten, MoTa) 
VALUES 
    (1, 'Kinh Di', N'Đáng sợ'), 
    (2, 'Tieu Thuyet', N'Lãng mạn'), 
    (3, 'Trinh Tham', N'Tìm ra lời giải'),
    (4, 'Khoa Hoc', N'Khám phá vũ trụ'),
    (5, 'Phieu Luu', N'Mạo hiểm và khám phá');

INSERT INTO Sach (S_ID, TieuDe, TacGia, NamXuatBan, TheLoai,GiaBan, MoTa)
VALUES
(1, N'Kẻ Trộm Yêu Tinh', N'Darren Shan', 2020, 1, 50000, N'Câu chuyện của gia đình Will'),
(2, N'Mắt biếc', N'Nhật Ánh', 2018, 2, 120000,N'Cuộc đời Hà Lan sau khi lên phố'),
(3, N'Conan', N'Aoyama', 2019, 3, 90000,N'Conan bị teo nhỏ'),
(4, N'Lý Thuyết Về Tất Cả Mọi Thứ',N'Stephen Hawking', 2010, 4, 85000,N'Khám phá vũ trụ'),
(5, N'Những Cuộc Phiêu Lưu Của Tom Sawyer', N'Mark Twain', 1876, 5, 75000,N'Một tác phẩm kinh điển của Mỹ');

INSERT INTO HoaDon (HD_ID, Ngay, NhanVien, TenKhachHang, GhiChu)
VALUES
-- Quý 1
(1, '2024-01-15', N'Nhân viên D', N'Ông Trần', N'Ghi chú hóa đơn 1'),
(2, '2024-02-10', N'Nhân viên E', N'Bà Lê', N'Ghi chú hóa đơn 2'),
(3, '2024-03-05', N'Nhân viên F', N'Cô Nguyễn', N'Ghi chú hóa đơn 3'),

-- Quý 2
(4, '2024-04-25', N'Nhân viên G', N'Ông Phạm', N'Ghi chú hóa đơn 4'),
(5, '2024-05-15', N'Nhân viên H', N'Bà Vũ', N'Ghi chú hóa đơn 5'),
(6, '2024-06-20', N'Nhân viên I', N'Cô Hoàng', N'Ghi chú hóa đơn 6'),

-- Quý 3
(7, '2024-07-10', N'Nhân viên J', N'Ông Lý', N'Ghi chú hóa đơn 7'),
(8, '2024-08-05', N'Nhân viên K', N'Bà Phạm', N'Ghi chú hóa đơn 8'),
(9, '2024-09-15', N'Nhân viên L', N'Cô Đặng', N'Ghi chú hóa đơn 9'),

-- Quý 4
(10, '2024-10-20', N'Nhân viên M', N'Ông Bùi', N'Ghi chú hóa đơn 10'),
(11, '2024-11-10', N'Nhân viên N', N'Bà Trần', N'Ghi chú hóa đơn 11'),
(12, '2024-12-05', N'Nhân viên O', N'Cô Đỗ', N'Ghi chú hóa đơn 12');

INSERT INTO ChiTietHoaDon (CTHD_ID, IDHoaDon, IDSach, SoLuong)
VALUES
-- Các chi tiết cho Hóa đơn 1
(1, 1, 1, 2),
(2, 1, 5, 3),
(3, 1, 2, 1),

-- Các chi tiết cho Hóa đơn 2
(4, 2, 1, 4),
(5, 2, 4, 2),
(6, 2, 3, 5),

-- Các chi tiết cho Hóa đơn 3
(7, 3, 5, 1),
(8, 3, 2, 3),
(9, 3, 3, 2),

-- Các chi tiết cho Hóa đơn 4
(10, 4, 4, 3),
(11, 4, 2, 1),
(12, 4, 3, 4),

-- Các chi tiết cho Hóa đơn 5
(13, 5, 4, 5),
(14, 5, 2, 2),
(15, 5, 3, 1),

-- Các chi tiết cho Hóa đơn 6
(16, 6, 1, 4),
(17, 6, 5, 1),
(18, 6, 3, 3),

-- Các chi tiết cho Hóa đơn 7
(19, 7, 1, 2),
(20, 7, 2, 3),
(21, 7, 4, 4),

-- Các chi tiết cho Hóa đơn 8
(22, 8, 1, 1),
(23, 8, 2, 2),
(24, 8, 4, 5),

-- Các chi tiết cho Hóa đơn 9
(25, 9, 1, 3),
(26, 9, 2, 4),
(27, 9, 5, 1),

-- Các chi tiết cho Hóa đơn 10
(28, 10, 1, 2),
(29, 10, 5, 1),
(30, 10, 3, 3),

-- Các chi tiết cho Hóa đơn 11
(31, 11, 1, 5),
(32, 11, 2, 2),
(33, 11, 3, 4),

-- Các chi tiết cho Hóa đơn 12
(34, 12, 1, 3),
(35, 12, 2, 4),
(36, 12, 3, 2);



INSERT INTO PhieuNhap (PNS_ID, GhiChu, Ngay, NhanVien)
VALUES
(1, N'Ghi chú phiếu nhập 1', '2024-05-07', N'Nhân viên A'),
(2, N'Ghi chú phiếu nhập 2', '2024-07-29', N'Nhân viên B'),
(3, N'Ghi chú phiếu nhập 3', '2024-09-10', N'Nhân viên C');

INSERT INTO ChiTietPhieuNhap (CTPNS_ID, IDPhieuNhap, IDSach, SoLuong)
VALUES
(1, 1, 1, 70),
(2, 1, 2, 50),
(3, 2, 3, 80);


DELETE FROM ChiTietPhieuNhap;
DELETE FROM PhieuNhap;
DELETE FROM ChiTietHoaDon;
DELETE FROM HoaDon;
DELETE FROM Sach;
DELETE FROM LoaiSach;
DELETE FROM NguoiDung;

SELECT * FROM LoaiSach;
SELECT * FROM Sach;
SELECT * FROM NguoiDung;
SELECT * FROM HoaDon;
SELECT * FROM ChiTietHoaDon;
SELECT * FROM PhieuNhap;
SELECT * FROM ChiTietPhieuNhap;


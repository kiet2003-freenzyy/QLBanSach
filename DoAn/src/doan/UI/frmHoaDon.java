
package doan.UI;

import doan.Dao.ChiTietHoaDonDao;
import doan.Dao.HoaDonDao;
import doan.Dao.SachDao;
import doan.Model.ChiTietHoaDon;
import doan.Model.HoaDon;
import doan.Model.Sach;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class frmHoaDon extends javax.swing.JInternalFrame {
    
    DefaultTableModel dtm = new DefaultTableModel();
    DefaultTableModel dtm2 = new DefaultTableModel();
    
    public frmHoaDon() {  
        initComponents();
        this.setTitle("Quản lý hóa đơn");
        HienThiSach();
        HienThiHoaDon();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNgayXuatHD = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        btnXoaHD = new javax.swing.JButton();
        btnSuaHD = new javax.swing.JButton();
        btnTaoHD = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        btnXemHD = new javax.swing.JButton();
        btnXemCTHD = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTimSach = new javax.swing.JTextField();
        btnTimSach = new javax.swing.JButton();
        btnResetSach = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        XuatHD = new javax.swing.JButton();

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin hóa đơn"));

        jLabel1.setText("Ngày xuất HĐ ");

        jLabel2.setText("Tên KH");

        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        jLabel5.setText("Ghi chú");

        txtGhiChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGhiChuActionPerformed(evt);
            }
        });

        btnXoaHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btnXoaHD.setText("  Xóa HĐ");
        btnXoaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHDActionPerformed(evt);
            }
        });

        btnSuaHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fix30.png"))); // NOI18N
        btnSuaHD.setText("Sửa HĐ");
        btnSuaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaHDActionPerformed(evt);
            }
        });

        btnTaoHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/create.png"))); // NOI18N
        btnTaoHD.setText("Tạo HĐ mới");
        btnTaoHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(txtNgayXuatHD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTaoHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuaHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtNgayXuatHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnXoaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnSuaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );

        jScrollPane1.setViewportView(jPanel1);

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add30.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setToolTipText("");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/del.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-fix-32.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-logout-32.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnXemHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-prev-32.png"))); // NOI18N
        btnXemHD.setText("Quay về");
        btnXemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemHDActionPerformed(evt);
            }
        });

        btnXemCTHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-view-32.png"))); // NOI18N
        btnXemCTHD.setText("Xem CTHĐ");
        btnXemCTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemCTHDActionPerformed(evt);
            }
        });

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSach);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Chọn sách:");

        txtTimSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimSachActionPerformed(evt);
            }
        });

        btnTimSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnTimSach.setText("Tìm kiếm");
        btnTimSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSachActionPerformed(evt);
            }
        });

        btnResetSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
        btnResetSach.setText("Reset");
        btnResetSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetSachActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Nhập SL:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addComponent(txtTimSach, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetSach)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTimSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimSach)
                    .addComponent(btnResetSach)
                    .addComponent(jLabel6)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel4.setText("LẬP HÓA ĐƠN");

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblHoaDon);

        XuatHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-pdf-32.png"))); // NOI18N
        XuatHD.setText("Xuất HĐ");
        XuatHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XuatHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXemHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(XuatHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXemCTHD)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXemCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(XuatHD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnXemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed

    }//GEN-LAST:event_txtTenKHActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        int idHoaDon;
        if (tblHoaDon.getSelectedRow() != -1) {
            idHoaDon = Integer.parseInt(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 0).toString());
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hóa đơn!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idSach;
        if (tblSach.getSelectedRow() != -1) {
            idSach = Integer.parseInt(tblSach.getValueAt(tblSach.getSelectedRow(), 0).toString());
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtSoLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int soLuong = Integer.parseInt(txtSoLuong.getText());
        
        Double sl;
        Double giaBan;
        if (tblSach.getSelectedRow() != -1) {
            String giaBanStr = tblSach.getValueAt(tblSach.getSelectedRow(), 5).toString();
            giaBan = Double.parseDouble(giaBanStr);
            sl = Double.parseDouble(txtSoLuong.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Double thanhtien = giaBan*sl;
        ChiTietHoaDon cthd = new ChiTietHoaDon();
        cthd.setIdHoaDon(idHoaDon);
        cthd.setTieuDeSach(String.valueOf(idSach));
        cthd.setSoLuong(soLuong);
        cthd.setThanhTien(thanhtien);

        ChiTietHoaDonDao cthdDAO = new ChiTietHoaDonDao();
        if (cthdDAO.themCTHD(cthd)) {
            JOptionPane.showMessageDialog(this, "Thêm sách vào hóa đơn thành công!");
            HienThiHoaDon();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm sách vào hóa đơn không thành công!");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            if (tblHoaDon.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn chi tiết hóa đơn cần xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int cthd_id = Integer.parseInt(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 0).toString());
            ChiTietHoaDonDao chiTietHoaDonDao = new ChiTietHoaDonDao();

            if (chiTietHoaDonDao.xoaCTHD(cthd_id)) {
                JOptionPane.showMessageDialog(this, "Xóa chi tiết hóa đơn thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                HienThiHoaDon();
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy chi tiết hóa đơn để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(frmHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Lỗi khi xóa chi tiết hóa đơn: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int idHoaDon;
        if (tblHoaDon.getSelectedRow() != -1) {
            idHoaDon = Integer.parseInt(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1).toString());
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hóa đơn!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int idCTDH;
        if (tblHoaDon.getSelectedRow() != -1) {
            idCTDH = Integer.parseInt(tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 0).toString());
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hóa đơn!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idSach;
        if (tblSach.getSelectedRow() != -1) {
            idSach = Integer.parseInt(tblSach.getValueAt(tblSach.getSelectedRow(), 0).toString());
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtSoLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int soLuong = Integer.parseInt(txtSoLuong.getText());
        
        Double sl;
        Double giaBan;
        if (tblSach.getSelectedRow() != -1) {
            String giaBanStr = tblSach.getValueAt(tblSach.getSelectedRow(), 5).toString();
            giaBan = Double.parseDouble(giaBanStr);
            sl = Double.parseDouble(txtSoLuong.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Double thanhTien = giaBan*sl;
        ChiTietHoaDon cthd = new ChiTietHoaDon();
        cthd.setCthd_id(idCTDH);
        cthd.setIdHoaDon(idHoaDon);
        cthd.setTieuDeSach(String.valueOf(idSach));
        cthd.setSoLuong(soLuong);
        cthd.setThanhTien(thanhTien);

        ChiTietHoaDonDao cthdDAO = new ChiTietHoaDonDao();
        if (cthdDAO.suaCTHD(cthd)) {
            JOptionPane.showMessageDialog(this, "Sửa thông tin chi tiết hóa đơn thành công!");
            HienThiHoaDon();
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thông tin chi tiết hóa đơn không thành công!");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnTimSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSachActionPerformed
        String keyword = txtTimSach.getText();
        
        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập từ khóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SachDao sachDao = new SachDao();
        ArrayList<Sach> danhSachSach = sachDao.timKiemSach(keyword);

        DefaultTableModel dtm = (DefaultTableModel) tblSach.getModel();
        dtm.setRowCount(0);

        String[] tieuDe = {"Mã sách", "Tiêu đề", "Tác giả", "Năm xuất bản", "Thể loại", "Giá bán", "Mô tả"};
        dtm.setColumnIdentifiers(tieuDe);

        for (Sach sach : danhSachSach) {
            Object[] row = {
                sach.getsId(),
                sach.getTieuDe(),
                sach.getTacGia(),
                sach.getNamXuatBan(),
                sach.getTheLoai(),
                sach.getGiaBan(),
                sach.getMoTa()
            };
            dtm.addRow(row);
        }
    }//GEN-LAST:event_btnTimSachActionPerformed

    private void btnResetSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetSachActionPerformed
        HienThiSach();
    }//GEN-LAST:event_btnResetSachActionPerformed

    private void txtGhiChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGhiChuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGhiChuActionPerformed

    private void btnXemCTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemCTHDActionPerformed
        int selectedRow = tblHoaDon.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hóa đơn!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int invoiceId = (int) tblHoaDon.getValueAt(selectedRow, 0);

        ChiTietHoaDonDao cthdDao = new ChiTietHoaDonDao();
        ArrayList<ChiTietHoaDon> danhSachChiTietHoaDon = cthdDao.hienThi(invoiceId);

        String[] tieuDeCTHD = {"ID CTHD", "ID Hóa Đơn", "Tiêu Đề Sách", "Số Lượng", "Thành Tiền"};
        dtm2.setColumnIdentifiers(tieuDeCTHD);
        tblHoaDon.setModel(dtm2);

        dtm2.setRowCount(0);
        for (ChiTietHoaDon ctHD : danhSachChiTietHoaDon) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(ctHD.getCthd_id());
            vec.add(ctHD.getIdHoaDon());
            vec.add(ctHD.getTieuDeSach());
            vec.add(ctHD.getSoLuong());
            vec.add(ctHD.getThanhTien());
            dtm2.addRow(vec);
        }

        tblHoaDon.setModel(dtm2);
    }//GEN-LAST:event_btnXemCTHDActionPerformed

    private void btnXemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemHDActionPerformed
        HienThiHoaDon();
    }//GEN-LAST:event_btnXemHDActionPerformed

    private void btnXoaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHDActionPerformed
        int selectedRow = tblHoaDon.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hóa đơn để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int hdID = (int) tblHoaDon.getValueAt(selectedRow, 0);
        HoaDonDao hoaDonDao = new HoaDonDao();
        if (hoaDonDao.xoaHoaDon(hdID)) {
            JOptionPane.showMessageDialog(this, "Hóa đơn đã được xóa thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            HienThiHoaDon();
        } else {
            JOptionPane.showMessageDialog(this, "Không thể xóa hóa đơn.", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaHDActionPerformed

    private void btnSuaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaHDActionPerformed
        int selectedRow = tblHoaDon.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hóa đơn để cập nhật!");
            return;
        }

        int hdId = Integer.parseInt(tblHoaDon.getValueAt(selectedRow, 0).toString());
        String ngayStr = txtNgayXuatHD.getText();
        String tenKhachHang = txtTenKH.getText();
        String ghiChu = txtGhiChu.getText(); 
        String tenNhanVien = frmDangNhap.TenNV;
        if (ngayStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày hóa đơn!");
            return;
        }
        HoaDon hoaDon = new HoaDon();
        try {
            Date ngay = new SimpleDateFormat("yyyy-MM-dd").parse(ngayStr);
            hoaDon.setNgay(ngay);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngày nhập không hợp lệ!");
        }
        
        hoaDon.setHd_id(hdId);
        hoaDon.setNhanVien(tenNhanVien);
        hoaDon.setTenKhachHang(tenKhachHang);
        hoaDon.setGhiChu(ghiChu);
        hoaDon.setTongTien(0.0);

        HoaDonDao hoaDonDao = new HoaDonDao();
        boolean capNhatThanhCong = hoaDonDao.capNhatHoaDon(hoaDon);

        if (capNhatThanhCong) {
            JOptionPane.showMessageDialog(this, "Cập nhật hóa đơn thành công!");
            HienThiHoaDon();
        } else {
            JOptionPane.showMessageDialog(this, "Cập nhật hóa đơn không thành công!");
        }

        txtNgayXuatHD.setText("");
        txtTenKH.setText("");
        txtGhiChu.setText("");
    }//GEN-LAST:event_btnSuaHDActionPerformed

    private void btnTaoHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHDActionPerformed
        String ngayStr = txtNgayXuatHD.getText();
        String tenKhachHang = txtTenKH.getText();
        String ghiChu = txtGhiChu.getText(); 
        String tenNhanVien = frmDangNhap.TenNV;
        if (ngayStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày tạo hóa đơn!");
            return;
        }
        HoaDon hoaDon = new HoaDon();
        try {
            Date ngay = new SimpleDateFormat("yyyy-MM-dd").parse(ngayStr);
            hoaDon.setNgay(ngay);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngày nhập không hợp lệ!");
        }
        hoaDon.setNhanVien(tenNhanVien);
        hoaDon.setTenKhachHang(tenKhachHang);
        hoaDon.setGhiChu(ghiChu);
        hoaDon.setTongTien(0.0);

        HoaDonDao hoaDonDao = new HoaDonDao();
        if (hoaDonDao.themHoaDon(hoaDon)) {
            JOptionPane.showMessageDialog(this, "Hóa đơn đã được tạo thành công!");
            HienThiHoaDon();
        } else {
            JOptionPane.showMessageDialog(this, "Không thể tạo hóa đơn mới!");
        }

        txtNgayXuatHD.setText("");
        txtTenKH.setText("");
        txtGhiChu.setText("");       
    }//GEN-LAST:event_btnTaoHDActionPerformed

    private void txtTimSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimSachActionPerformed

    private void XuatHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XuatHDActionPerformed
        int selectedRow = tblHoaDon.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hóa đơn để xuất!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();

        int maHD = (int) model.getValueAt(selectedRow, 0);
        String tenKH = (String) model.getValueAt(selectedRow, 1); 
        String nhanVien = (String) model.getValueAt(selectedRow, 2); 
        String ghiChu = (String) model.getValueAt(selectedRow, 3); 
        Date ngayHD = (Date) model.getValueAt(selectedRow, 4);
        double tongTien = (double) model.getValueAt(selectedRow, 5);

        HoaDon hoaDon = new HoaDon();
        hoaDon.setHd_id(maHD);
        hoaDon.setTenKhachHang(tenKH);
        hoaDon.setNhanVien(nhanVien);
        hoaDon.setGhiChu(ghiChu);
        hoaDon.setNgay(ngayHD);
        hoaDon.setTongTien(tongTien);

        HoaDonDao hoaDonDao = new HoaDonDao();
        ArrayList<ChiTietHoaDon> danhSachChiTiet = hoaDonDao.layCTHDtheoID(maHD);
        hoaDon.setDanhSachChiTiet(danhSachChiTiet);

        // Tạo hộp thoại để chọn đường dẫn lưu file
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn nơi lưu hóa đơn");

        // Thiết lập bộ lọc cho tệp PDF
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF files (*.pdf)", "pdf");
        fileChooser.setFileFilter(filter);

        // Hiển thị hộp thoại và lấy đường dẫn lưu file từ người dùng
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            // Thêm phần mở rộng ".pdf" nếu người dùng chưa chỉ định
            if (!filePath.toLowerCase().endsWith(".pdf")) {
                filePath += ".pdf";
            }

            // Xuất hóa đơn PDF với thông tin và chi tiết hóa đơn đã có
            boolean isSuccess;
            try {
                isSuccess = hoaDonDao.xuatHoaDonPDF(hoaDon, filePath);
                JOptionPane.showMessageDialog(this, "Xuất hóa đơn thành công! Tệp đã được lưu tại: " + filePath);
            } catch (IOException ex) {
                Logger.getLogger(frmHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Lỗi khi xuất hóa đơn!");
            }
        }
    }//GEN-LAST:event_XuatHDActionPerformed

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSachMouseClicked
   public static void main(String[] args) {
        frmHoaDon frame = new frmHoaDon();
        frame.setVisible(true);
    }
   
   
   public void HienThiSach() {
        SachDao sachDao = new SachDao();
        ArrayList<Sach> danhSachSach = sachDao.hienThi();

        dtm = (DefaultTableModel) tblSach.getModel();
        dtm.setRowCount(0);

        String[] tieuDe = {"Mã sách", "Tiêu đề", "Tác giả", "Năm xuất bản", "Thể loại", "Giá bán", "Mô tả"};
        dtm.setColumnIdentifiers(tieuDe);

        for (Sach sach : danhSachSach) {
            Object[] row = {
                sach.getsId(),
                sach.getTieuDe(),
                sach.getTacGia(),
                sach.getNamXuatBan(),
                sach.getTheLoai(),
                sach.getGiaBan(),
                sach.getMoTa()
            };
            dtm.addRow(row);
        }
    }
   
   public void HienThiHoaDon() {
        HoaDonDao hoaDonDao = new HoaDonDao();
        ArrayList<HoaDon> danhSachHoaDon = hoaDonDao.hienThi();

        dtm2 = (DefaultTableModel) tblHoaDon.getModel();
        dtm2.setRowCount(0);

        String[] tieuDe = {"Mã hóa đơn", "Tên khách hàng", "Nhân viên", "Ghi chú", "Ngày", "Tổng tiền"};
        dtm2.setColumnIdentifiers(tieuDe);

        for (HoaDon hoaDon : danhSachHoaDon) {
            Object[] row = {
                hoaDon.getHd_id(),
                hoaDon.getTenKhachHang(),
                hoaDon.getNhanVien(),
                hoaDon.getGhiChu(),
                hoaDon.getNgay(),
                hoaDon.getTongTien()
            };
            dtm2.addRow(row);
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XuatHD;
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnResetSach;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaHD;
    private javax.swing.JButton btnTaoHD;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimSach;
    private javax.swing.JButton btnXemCTHD;
    private javax.swing.JButton btnXemHD;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaHD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtNgayXuatHD;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimSach;
    // End of variables declaration//GEN-END:variables
}

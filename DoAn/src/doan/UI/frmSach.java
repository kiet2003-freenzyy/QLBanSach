
package doan.UI;

import doan.Dao.LoaiSachDao;
import doan.Dao.SachDao;
import doan.Model.LoaiSach;
import doan.Model.Sach;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmSach extends javax.swing.JInternalFrame {
    public frmSach() {
        initComponents();
        this.setTitle("Quản lý thể loại");
        loadLoaiSachComboBox();
        hienThiSach();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cboTheLoai = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNXB = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        txtTenSach = new javax.swing.JTextField();
        txtTacGia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtTimSach2 = new javax.swing.JTextField();
        btnTimSach2 = new javax.swing.JButton();
        btnResetSach = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Sách"));

        cboTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTheLoaiActionPerformed(evt);
            }
        });

        jLabel4.setText("Tên Sách:");

        jLabel5.setText("Tác Giả:");

        jLabel6.setText("NXB:");

        jLabel7.setText("Mô Tả:");

        txtMoTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoTaActionPerformed(evt);
            }
        });

        txtTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTacGiaActionPerformed(evt);
            }
        });

        jLabel8.setText("Giá :");

        txtGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaBanActionPerformed(evt);
            }
        });

        jLabel10.setText("Thể loại:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(txtTacGia))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(txtNXB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGiaBan)
                    .addComponent(cboTheLoai, 0, 126, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Chọn sách:");

        btnTimSach2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnTimSach2.setText("Tìm kiếm");
        btnTimSach2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSach2ActionPerformed(evt);
            }
        });

        btnResetSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
        btnResetSach.setText("Reset");
        btnResetSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(48, 48, 48)
                .addComponent(txtTimSach2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimSach2)
                .addGap(18, 18, 18)
                .addComponent(btnResetSach)
                .addGap(182, 182, 182))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTimSach2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimSach2)
                    .addComponent(btnResetSach))
                .addContainerGap(16, Short.MAX_VALUE))
        );

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

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel11.setText("QUẢN LÝ SÁCH");

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

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add30.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-logout-32.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel11)
                .addGap(42, 42, 42)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTheLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTheLoaiActionPerformed

    private void txtMoTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoTaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoTaActionPerformed

    private void txtTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTacGiaActionPerformed

    private void btnTimSach2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSach2ActionPerformed
        String keyword = txtTimSach2.getText();
        
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
    }//GEN-LAST:event_btnTimSach2ActionPerformed
    public void hienThiSach() {
        SachDao sachDao = new SachDao();
        ArrayList<Sach> danhSachSach = sachDao.hienThi();

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
    }

    private void btnResetSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetSachActionPerformed
        hienThiSach();
    }//GEN-LAST:event_btnResetSachActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String tenSach = txtTenSach.getText();
        String tacGia = txtTacGia.getText();
        String moTa = txtMoTa.getText();
        int namXuatBan;
        double giaBan;
        if (tenSach.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên sách!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (tacGia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên tác giả!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (moTa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mô tả!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            namXuatBan = Integer.parseInt(txtNXB.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập năm xuất bản hợp lệ!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            giaBan = Double.parseDouble(txtGiaBan.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giá bán hợp lệ!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int theLoai = getSelectedTheLoaiValue();
  
        Sach s = new Sach();
        s.setTieuDe(tenSach);
        s.setTacGia(tacGia);
        s.setGiaBan(giaBan);
        s.setNamXuatBan(namXuatBan);
        s.setMoTa(moTa);
        s.setTheLoai(String.valueOf(theLoai));
        SachDao SachDao = new SachDao();
        boolean isAdded = SachDao.themSach(s);
        if (isAdded) {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            hienThiSach();
            txtTenSach.setText("");
            txtMoTa.setText("");
            txtNXB.setText("");
            txtTacGia.setText("");
            txtGiaBan.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm không thành công!");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            int selectedRowIndex = tblSach.getSelectedRow();

            if (selectedRowIndex != -1) {
                int selectedS_ID = (int) tblSach.getValueAt(selectedRowIndex, 0);

                SachDao sachDao = new SachDao();
                boolean deleted = sachDao.xoaSach(selectedS_ID);

                if (deleted) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công!");
                    hienThiSach();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa không thành công!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Xóa không thành công!");
            Logger.getLogger(frmLoaiSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int selectedRowIndex = tblSach.getSelectedRow();
        if (selectedRowIndex != -1) {
            String selectedSach_ID = tblSach.getValueAt(selectedRowIndex, 0).toString();
            String tenSach = txtTenSach.getText();
            String tacGia = txtTacGia.getText();
            double giaBan = Double.parseDouble(txtGiaBan.getText());
            String moTa = txtMoTa.getText();
            int ls_id = getSelectedTheLoaiValue();
            int nxb = Integer.parseInt(txtNXB.getText());

            Sach s = new Sach();
            s.setTieuDe(tenSach);
            s.setTacGia(tacGia);
            s.setGiaBan(giaBan);
            s.setNamXuatBan(nxb);
            s.setMoTa(moTa);
            s.setTheLoai(String.valueOf(ls_id));
            s.setsId(Integer.parseInt(selectedSach_ID));

            SachDao SachDao = new SachDao();
            boolean isUpdated = SachDao.capNhatSach(s);
            if (isUpdated) {
                JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                hienThiSach();
                txtTenSach.setText("");
                txtMoTa.setText("");
                txtNXB.setText("");
                txtTacGia.setText("");
                txtGiaBan.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật không thành công!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa đổi!");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void txtGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaBanActionPerformed

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
       int selectedRowIndex = tblSach.getSelectedRow();
        if (selectedRowIndex != -1) {
            String tenSach = tblSach.getValueAt(selectedRowIndex, 1).toString();
            String tacGia = tblSach.getValueAt(selectedRowIndex, 2).toString();
            String nxb = tblSach.getValueAt(selectedRowIndex, 3).toString();
            String giaban = tblSach.getValueAt(selectedRowIndex, 5).toString();
            String moTa = tblSach.getValueAt(selectedRowIndex, 6).toString();
            

            txtNXB.setText(nxb);
            txtTenSach.setText(tenSach);
            txtTacGia.setText(tacGia);
            txtGiaBan.setText(giaban);
            txtMoTa.setText(moTa);
        }
    }//GEN-LAST:event_tblSachMouseClicked

    public void loadLoaiSachComboBox() {
        LoaiSachDao loaiSachDao = new LoaiSachDao();
        ArrayList<LoaiSach> danhSachLoaiSach = loaiSachDao.loadLSComboBox();
        cboTheLoai.removeAllItems();
        for (LoaiSach loaiSach : danhSachLoaiSach) {
            cboTheLoai.addItem(loaiSach.getTen());
        }
    }
    public int getSelectedTheLoaiValue() {
        LoaiSachDao loaiSachDao = new LoaiSachDao();
        String tenLoaiSach = (String) cboTheLoai.getSelectedItem();
        
        LoaiSach selectedLoaiSach = loaiSachDao.getLoaiSachByTen(tenLoaiSach);
    
        if (selectedLoaiSach != null) {
            return selectedLoaiSach.getLsId();
        } else {
            return -1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnResetSach;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimSach2;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboTheLoai;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtNXB;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTimSach2;
    // End of variables declaration//GEN-END:variables
}

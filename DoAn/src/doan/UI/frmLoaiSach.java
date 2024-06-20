
package doan.UI;

import doan.Dao.LoaiSachDao;
import doan.Model.LoaiSach;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmLoaiSach extends javax.swing.JInternalFrame {
    
    public frmLoaiSach() {  
        initComponents();
        this.setTitle("Quản lý thể loại");
        hienThiLoaiSach();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhMucLoaiSach = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin loại sách"));

        jLabel1.setText("Tên thể loại:");

        jLabel2.setText("Mô Tả:");

        txtMoTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoTaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                    .addComponent(txtMoTa))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtMoTa)
                        .addContainerGap())))
        );

        jScrollPane1.setViewportView(jPanel1);

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add30.png"))); // NOI18N
        btnThem.setText("Thêm");
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

        tblDanhMucLoaiSach.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDanhMucLoaiSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhMucLoaiSachMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhMucLoaiSach);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("QUẢN LÍ LOẠI SÁCH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 160, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(195, 195, 195)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMoTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoTaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoTaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String tenLoaiSach = txtTenSach.getText();
        String moTa = txtMoTa.getText();
        if (tenLoaiSach.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên thể loại sách!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (moTa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mô tả!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        LoaiSach ls = new LoaiSach();
        ls.setTen(tenLoaiSach);
        ls.setMoTa(moTa);

        LoaiSachDao loaiSachDao = new LoaiSachDao();
        boolean isAdded = loaiSachDao.ThemLoaiSach(ls);

        if (isAdded) {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm không thành công!");
        }

        hienThiLoaiSach();
        txtTenSach.setText("");
        txtMoTa.setText("");
        txtTenSach.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            int selectedRowIndex = tblDanhMucLoaiSach.getSelectedRow();

            if (selectedRowIndex != -1) {
                int selectedLS_ID = (int) tblDanhMucLoaiSach.getValueAt(selectedRowIndex, 0);

                LoaiSachDao loaiSachDao = new LoaiSachDao();
                boolean isDeleted = loaiSachDao.XoaLoaiSach(selectedLS_ID);

                if (isDeleted) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công!");
                    hienThiLoaiSach();
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
        int selectedRow = tblDanhMucLoaiSach.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một loại sách để sửa!");
            return;
        }

        int maLoaiSach = Integer.parseInt(tblDanhMucLoaiSach.getValueAt(selectedRow, 0).toString());
        String tenLoaiSach = txtTenSach.getText();
        String moTaLoaiSach = txtMoTa.getText();
        
        if (tenLoaiSach.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên thể loại sách!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (moTaLoaiSach.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mô tả!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        LoaiSach ls = new LoaiSach();
        ls.setLsId(maLoaiSach);
        ls.setTen(tenLoaiSach);
        ls.setMoTa(moTaLoaiSach);

        LoaiSachDao loaiSachDao = new LoaiSachDao();
        boolean isUpdated = loaiSachDao.CapNhatLoaiSach(ls);

        if (isUpdated) {
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Sửa không thành công!");
        }

        hienThiLoaiSach();
        txtTenSach.setText("");
        txtMoTa.setText("");
        txtTenSach.requestFocus();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void tblDanhMucLoaiSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhMucLoaiSachMouseClicked
        int selectedRowIndex = tblDanhMucLoaiSach.getSelectedRow();
        if (selectedRowIndex != -1) {
            String tenls = tblDanhMucLoaiSach.getValueAt(selectedRowIndex, 1).toString();
            String mota = tblDanhMucLoaiSach.getValueAt(selectedRowIndex, 2).toString();

            txtTenSach.setText(tenls);
            txtMoTa.setText(mota);
        }
    }//GEN-LAST:event_tblDanhMucLoaiSachMouseClicked
   public static void main(String[] args) {
        frmLoaiSach frame = new frmLoaiSach();
        frame.setVisible(true);
    }
   
  
   public void hienThiLoaiSach() {
        LoaiSachDao loaiSachDao = new LoaiSachDao();
        ArrayList<LoaiSach> danhSachLoaiSach = loaiSachDao.hienThi();

        DefaultTableModel dtm = (DefaultTableModel) tblDanhMucLoaiSach.getModel();
        dtm.setRowCount(0);

        String[] tieuDe = {"Mã loại sách", "Tên loại sách", "Mô tả"};
        dtm.setColumnIdentifiers(tieuDe);

        for (LoaiSach loaiSach : danhSachLoaiSach) {
            Object[] row = {
                loaiSach.getLsId(),
                loaiSach.getTen(),
                loaiSach.getMoTa()
            };
            dtm.addRow(row);
        }
}
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDanhMucLoaiSach;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtTenSach;
    // End of variables declaration//GEN-END:variables
}

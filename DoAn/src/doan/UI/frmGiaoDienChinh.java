
package doan.UI;

import java.awt.Color;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class frmGiaoDienChinh extends javax.swing.JFrame {

    public frmGiaoDienChinh() {
        initComponents();
        resetColor(BanSach);
        resetColor(LoaiSach);
        resetColor(Sach1);
        resetColor(NhapSach);
        resetColor(DangXuat);
        resetColor(NhanVien);
        resetColor(ThongKe);
        resetColor(DangXuat);
        setColor(TrangChu);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        frmTrangChu frm = new frmTrangChu();
        frm.setVisible(true);
        try {
            frm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmGiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.desktopPanel.add(frm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        TrangChu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BanSach = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LoaiSach = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NhapSach = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Sach1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        DangXuat = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        NhanVien = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ThongKe = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        desktopPanel = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        sidepane.setBackground(new java.awt.Color(102, 0, 102));
        sidepane.setPreferredSize(new java.awt.Dimension(1545, 609));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TrangChu.setBackground(new java.awt.Color(204, 0, 204));
        TrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TrangChuMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trang Chủ");

        javax.swing.GroupLayout TrangChuLayout = new javax.swing.GroupLayout(TrangChu);
        TrangChu.setLayout(TrangChuLayout);
        TrangChuLayout.setHorizontalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangChuLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        TrangChuLayout.setVerticalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrangChuLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        sidepane.add(TrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 50));

        BanSach.setBackground(new java.awt.Color(153, 0, 153));
        BanSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BanSachMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bán Sách");

        javax.swing.GroupLayout BanSachLayout = new javax.swing.GroupLayout(BanSach);
        BanSach.setLayout(BanSachLayout);
        BanSachLayout.setHorizontalGroup(
            BanSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BanSachLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        BanSachLayout.setVerticalGroup(
            BanSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BanSachLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(16, 16, 16))
        );

        sidepane.add(BanSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        LoaiSach.setBackground(new java.awt.Color(153, 0, 153));
        LoaiSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoaiSachMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Loại Sách");

        javax.swing.GroupLayout LoaiSachLayout = new javax.swing.GroupLayout(LoaiSach);
        LoaiSach.setLayout(LoaiSachLayout);
        LoaiSachLayout.setHorizontalGroup(
            LoaiSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoaiSachLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        LoaiSachLayout.setVerticalGroup(
            LoaiSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoaiSachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(16, 16, 16))
        );

        sidepane.add(LoaiSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NHÀ SÁCH SAO MAI");
        sidepane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 20, 290, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("_______________________________________");
        sidepane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, -1));

        NhapSach.setBackground(new java.awt.Color(153, 0, 153));
        NhapSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NhapSachMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nhập Sách");

        javax.swing.GroupLayout NhapSachLayout = new javax.swing.GroupLayout(NhapSach);
        NhapSach.setLayout(NhapSachLayout);
        NhapSachLayout.setHorizontalGroup(
            NhapSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhapSachLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        NhapSachLayout.setVerticalGroup(
            NhapSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NhapSachLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(16, 16, 16))
        );

        sidepane.add(NhapSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        Sach1.setBackground(new java.awt.Color(153, 0, 153));
        Sach1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Sach1MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sách");

        javax.swing.GroupLayout Sach1Layout = new javax.swing.GroupLayout(Sach1);
        Sach1.setLayout(Sach1Layout);
        Sach1Layout.setHorizontalGroup(
            Sach1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sach1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        Sach1Layout.setVerticalGroup(
            Sach1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sach1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(16, 16, 16))
        );

        sidepane.add(Sach1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        DangXuat.setBackground(new java.awt.Color(153, 0, 153));
        DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DangXuatMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Đăng Xuất");

        javax.swing.GroupLayout DangXuatLayout = new javax.swing.GroupLayout(DangXuat);
        DangXuat.setLayout(DangXuatLayout);
        DangXuatLayout.setHorizontalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangXuatLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        DangXuatLayout.setVerticalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangXuatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(16, 16, 16))
        );

        sidepane.add(DangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, -1, 50));

        NhanVien.setBackground(new java.awt.Color(153, 0, 153));
        NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NhanVienMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Quản lý nhân viên");

        javax.swing.GroupLayout NhanVienLayout = new javax.swing.GroupLayout(NhanVien);
        NhanVien.setLayout(NhanVienLayout);
        NhanVienLayout.setHorizontalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanVienLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        NhanVienLayout.setVerticalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NhanVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(16, 16, 16))
        );

        sidepane.add(NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, 50));

        ThongKe.setBackground(new java.awt.Color(153, 0, 153));
        ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ThongKeMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Thống kê doanh thu");

        javax.swing.GroupLayout ThongKeLayout = new javax.swing.GroupLayout(ThongKe);
        ThongKe.setLayout(ThongKeLayout);
        ThongKeLayout.setHorizontalGroup(
            ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongKeLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        ThongKeLayout.setVerticalGroup(
            ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongKeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(16, 16, 16))
        );

        sidepane.add(ThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, 50));

        desktopPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desktopPanelLayout = new javax.swing.GroupLayout(desktopPanel);
        desktopPanel.setLayout(desktopPanelLayout);
        desktopPanelLayout.setHorizontalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1239, Short.MAX_VALUE)
        );
        desktopPanelLayout.setVerticalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(desktopPanel)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TrangChuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrangChuMousePressed
        resetColor(BanSach);
        resetColor(LoaiSach);
        resetColor(Sach1);
        resetColor(NhapSach);
        resetColor(DangXuat);
        resetColor(NhanVien);
        resetColor(ThongKe);
        resetColor(DangXuat);
        setColor(TrangChu);
        this.desktopPanel.removeAll();
        frmTrangChu frm = new frmTrangChu();
        frm.setVisible(true);
        try {
            frm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmGiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.desktopPanel.add(frm);
    }//GEN-LAST:event_TrangChuMousePressed

    private void BanSachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BanSachMousePressed
        resetColor(TrangChu);
        resetColor(LoaiSach);
        resetColor(Sach1);
        resetColor(NhapSach);
        resetColor(DangXuat);
        resetColor(NhanVien);
        resetColor(ThongKe);
        resetColor(DangXuat);
        setColor(BanSach);
        this.desktopPanel.removeAll();
        frmHoaDon frm = new frmHoaDon();
        frm.setVisible(true);
        try {
            frm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmGiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.desktopPanel.add(frm);
    }//GEN-LAST:event_BanSachMousePressed

    private void LoaiSachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoaiSachMousePressed
        resetColor(TrangChu);
        resetColor(BanSach);
        resetColor(Sach1);
        resetColor(NhapSach);
        resetColor(DangXuat);
        resetColor(NhanVien);
        resetColor(ThongKe);
        resetColor(DangXuat);
        setColor(LoaiSach);
        this.desktopPanel.removeAll();
        frmLoaiSach frm = new frmLoaiSach();
        frm.setVisible(true);
        try {
            frm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmGiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.desktopPanel.add(frm);
    }//GEN-LAST:event_LoaiSachMousePressed

    private void NhapSachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhapSachMousePressed
        resetColor(TrangChu);
        resetColor(BanSach);
        resetColor(LoaiSach);
        resetColor(Sach1);
        resetColor(DangXuat);
        resetColor(NhanVien);
        resetColor(ThongKe);
        resetColor(DangXuat);
        setColor(NhapSach);
        this.desktopPanel.removeAll();
        frmPhieuNhap frm = new frmPhieuNhap();
        frm.setVisible(true);
        try {
            frm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmGiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.desktopPanel.add(frm);
        
    }//GEN-LAST:event_NhapSachMousePressed

    private void Sach1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sach1MousePressed
        resetColor(TrangChu);
        resetColor(BanSach);
        resetColor(LoaiSach);
        resetColor(NhapSach);
        resetColor(DangXuat);
        resetColor(NhanVien);
        resetColor(ThongKe);
        resetColor(DangXuat);
        setColor(Sach1);
        this.desktopPanel.removeAll();
        frmSach frm = new frmSach();
        frm.setVisible(true);
        try {
            frm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmGiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.desktopPanel.add(frm);
    }//GEN-LAST:event_Sach1MousePressed

    private void DangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatMousePressed
        resetColor(TrangChu);
        resetColor(BanSach);
        resetColor(Sach1);
        resetColor(NhapSach);
        resetColor(LoaiSach);
        resetColor(NhanVien);
        resetColor(ThongKe);
        resetColor(LoaiSach);
        setColor(DangXuat);
        this.dispose();
        frmDangNhap frm = new frmDangNhap();
        frm.setVisible(true);
 
    }//GEN-LAST:event_DangXuatMousePressed

    private void NhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienMousePressed
        resetColor(TrangChu);
        resetColor(BanSach);
        resetColor(Sach1);
        resetColor(NhapSach);
        resetColor(LoaiSach);
        resetColor(DangXuat);
        resetColor(ThongKe);
        resetColor(Sach1);
        setColor(NhanVien);
        this.desktopPanel.removeAll();
        frmNhanVien frm = new frmNhanVien();
        frm.setVisible(true);
        try {
            frm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmGiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.desktopPanel.add(frm);
    }//GEN-LAST:event_NhanVienMousePressed

    private void ThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongKeMousePressed
        setColor(ThongKe);
        resetColor(LoaiSach);
        resetColor(NhanVien);
        resetColor(Sach1);
        resetColor(BanSach);
        resetColor(LoaiSach);
        resetColor(TrangChu);
        this.desktopPanel.removeAll();
        frmThongKe frm = new frmThongKe();
        frm.setVisible(true);
        try {
            frm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmGiaoDienChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.desktopPanel.add(frm);
    }//GEN-LAST:event_ThongKeMousePressed
    void setColor(JPanel panel){
        panel.setBackground(new Color(204,0,204));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(153,0,153));
    }
    public void disableNhanVienFeatures() {
        NhanVien.setVisible(false);
    }
    public void disableThongKeFeatures() {
        ThongKe.setVisible(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmGiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGiaoDienChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BanSach;
    private javax.swing.JPanel DangXuat;
    private javax.swing.JPanel LoaiSach;
    private javax.swing.JPanel NhanVien;
    private javax.swing.JPanel NhapSach;
    private javax.swing.JPanel Sach1;
    private javax.swing.JPanel ThongKe;
    private javax.swing.JPanel TrangChu;
    private javax.swing.JPanel bg;
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}

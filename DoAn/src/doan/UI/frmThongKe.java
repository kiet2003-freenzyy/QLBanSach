
package doan.UI;

import doan.Dao.ThongKeDao;
import doan.Model.ChiTietThongKe;
import doan.Model.ThongKe;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;



public class frmThongKe extends javax.swing.JInternalFrame {
    
    public frmThongKe() {  
        initComponents();
        this.setTitle("Thống kê doanh thu");
        hienThiThongKe();
        hienThiCTThongKe();
        veBieuDo();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblThongKeChiTiet = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PanelThongKe = new javax.swing.JPanel();
        btnDong = new javax.swing.JButton();
        XuatTK = new javax.swing.JButton();

        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
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
        tblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongKeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblThongKe);

        tblThongKeChiTiet.setModel(new javax.swing.table.DefaultTableModel(
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
        tblThongKeChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongKeChiTietMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblThongKeChiTiet);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel4.setText("CHI TIẾT");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel5.setText("THỐNG KÊ THEO QUÝ");

        javax.swing.GroupLayout PanelThongKeLayout = new javax.swing.GroupLayout(PanelThongKe);
        PanelThongKe.setLayout(PanelThongKeLayout);
        PanelThongKeLayout.setHorizontalGroup(
            PanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        PanelThongKeLayout.setVerticalGroup(
            PanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-logout-32.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        XuatTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-pdf-32.png"))); // NOI18N
        XuatTK.setText("Xuất thống kê");
        XuatTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XuatTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(XuatTK)
                                        .addGap(75, 75, 75)
                                        .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(153, 153, 153)))))
                        .addGap(20, 20, 20)
                        .addComponent(PanelThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XuatTK, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongKeMouseClicked
        int selectedRow = tblThongKe.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tblThongKeChiTiet.getModel();

            model.setRowCount(0);

            int quy = (int) tblThongKe.getValueAt(selectedRow, 0);

            ThongKeDao tkd = new ThongKeDao();
            ArrayList<ChiTietThongKe> chiTietThongKe = tkd.layChiTietThongKeTheoQuy(quy);

            for (ChiTietThongKe chiTiet : chiTietThongKe) {
                Object[] row = {chiTiet.getTenSach(), chiTiet.getSoLuong(), chiTiet.getThanhTien()};
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_tblThongKeMouseClicked

    private void tblThongKeChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongKeChiTietMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblThongKeChiTietMouseClicked

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void XuatTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XuatTKActionPerformed
        int selectedRow = tblThongKe.getSelectedRow();
        if (selectedRow != -1) {
            int quy = (int) tblThongKe.getValueAt(selectedRow, 0); // Giả sử cột đầu tiên là quý
            ThongKeDao thongKeDao = new ThongKeDao();
            ArrayList<ChiTietThongKe> danhSachChiTiet = thongKeDao.layChiTietThongKeTheoQuy(quy);

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save PDF");
            fileChooser.setFileFilter(new FileNameExtensionFilter("PDF Documents", "pdf"));
            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                String filePath = fileToSave.getAbsolutePath();
                if (!filePath.toLowerCase().endsWith(".pdf")) {
                    filePath += ".pdf";
                }

                boolean result = thongKeDao.xuatThongKePDF(quy, danhSachChiTiet, filePath);
                if (result) {
                    JOptionPane.showMessageDialog(this, "Xuất PDF thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Xuất PDF thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một quý để xuất thống kê.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_XuatTKActionPerformed
   public static void main(String[] args) {
        frmThongKe frame = new frmThongKe();
        frame.setVisible(true);
    }
   
  
   public void hienThiThongKe() {
        ThongKeDao thongKeDao = new ThongKeDao();
        ArrayList<ThongKe> danhSachThongKe = thongKeDao.thongKeDoanhThuTheoQuy();

        DefaultTableModel dtm = (DefaultTableModel) tblThongKe.getModel();
        dtm.setRowCount(0);

        String[] tieuDe = {"Quý", "Doanh Thu"};
        dtm.setColumnIdentifiers(tieuDe);

        for (ThongKe thongKe : danhSachThongKe) {
            Object[] row = {
                thongKe.getQuy(),
                thongKe.getDoanhThu()
            };
            dtm.addRow(row);
        }
    }
   
   public void hienThiCTThongKe() {
        DefaultTableModel model = (DefaultTableModel) tblThongKeChiTiet.getModel();
        String[] tieuDe = {"Tên Sách", "Số Lượng", "Thành Tiền"};
        model.setColumnIdentifiers(tieuDe);
}
    private void veBieuDo() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Trích xuất dữ liệu từ bảng tblThongKe
        DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            int quy = (int) model.getValueAt(i, 0);
            double doanhThu = (double) model.getValueAt(i, 1);
            dataset.addValue(doanhThu, "Doanh thu", "Quý " + quy);
        }

        // Tạo biểu đồ cột và cấu hình
        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ doanh thu theo quý",
                "Quý",                           
                "Doanh thu (đơn vị)",            
                dataset);                        

        // Tạo ChartPanel và đặt kích thước
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(600, 400));

        // Xóa bỏ tất cả các thành phần cũ trên PanelThongKe
        PanelThongKe.removeAll();

        // Thiết lập layout cho PanelThongKe
        PanelThongKe.setLayout(new BorderLayout());

        // Thêm ChartPanel vào PanelThongKe và cập nhật giao diện
        PanelThongKe.add(chartPanel, BorderLayout.CENTER);
        PanelThongKe.revalidate();
        PanelThongKe.repaint();
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelThongKe;
    private javax.swing.JButton XuatTK;
    private javax.swing.JButton btnDong;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblThongKe;
    private javax.swing.JTable tblThongKeChiTiet;
    // End of variables declaration//GEN-END:variables
}

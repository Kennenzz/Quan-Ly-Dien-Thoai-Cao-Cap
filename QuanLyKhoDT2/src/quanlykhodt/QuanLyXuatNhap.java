/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlykhodt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kax20
 */
public class QuanLyXuatNhap extends javax.swing.JFrame {

    DefaultTableModel tableModelNhap;
    DefaultTableModel tableModelXuat;
    List<Phieu> PhieuNhaplist = new ArrayList<>(), PhieuXuatlist = new ArrayList<>();
    /**
     * Creates new form QuanLyXuatNhap
     */
    public QuanLyXuatNhap() {
        initComponents();
        tableModelNhap = (DefaultTableModel) Nhaptbl.getModel();
        showPhieuNhap();
        tableModelXuat = (DefaultTableModel) Xuattbl.getModel();
        showPhieuXuat();
    }
    public final void showPhieuXuat() {
        tableModelXuat.setRowCount(0);
        PhieuXuatlist = findAllXuat();
        PhieuXuatlist.forEach((Phieu p)->{
            tableModelXuat.addRow(new Object[]{p.getMaPhieu(), p.getMaDT(), p.getTenDT(), p.getHDH(), p.getMauDT(), p.getSoluong(), p.getNgay()} );
        });
}
    public final void showPhieuNhap() {
        tableModelNhap.setRowCount(0);
        PhieuNhaplist = findAllNhap();
        PhieuNhaplist.forEach((Phieu p)->{
            tableModelNhap.addRow(new Object[]{p.getMaPhieu(), p.getMaDT(), p.getTenDT(), p.getHDH(), p.getMauDT(), p.getSoluong(), p.getNgay()} );
        });
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XuatNhapKhobtn = new javax.swing.JButton();
        NhapNgaybtn = new javax.swing.JButton();
        XuatNgaybtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Nhaptbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Xuattbl = new javax.swing.JTable();
        Datetxt = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Refreshbtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        XuatNhapKhobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlykhodt/Warehouse-icon.png"))); // NOI18N
        XuatNhapKhobtn.setText("Xuất Nhập Kho");
        XuatNhapKhobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XuatNhapKhobtnActionPerformed(evt);
            }
        });

        NhapNgaybtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        NhapNgaybtn.setText("Danh Sách Nhập Theo Ngày");
        NhapNgaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapNgaybtnActionPerformed(evt);
            }
        });

        XuatNgaybtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        XuatNgaybtn.setText("Danh Sách Xuất Theo Ngày");
        XuatNgaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XuatNgaybtnActionPerformed(evt);
            }
        });

        Nhaptbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Phiếu", "Mã Điện Thoại", "Tên Điện Thoại", "Hệ Điều Hành", "Màu ", "Số Lượng", "Ngày"
            }
        ));
        jScrollPane1.setViewportView(Nhaptbl);

        Xuattbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Phiếu", "Mã Điện Thoại", "Tên", "Hệ Điều Hành", "Màu", "Số Lượng", "Ngày"
            }
        ));
        jScrollPane2.setViewportView(Xuattbl);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField1.setText("PHIẾU XUẤT");

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField2.setText("PHIẾU NHẬP");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel9.setText("QUẢN LÝ XUẤT NHẬP KHO");

        Refreshbtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Refreshbtn.setText("Refresh");
        Refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshbtnActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlykhodt/options-2-icon.png"))); // NOI18N
        jMenu1.setText("Option");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlykhodt/back-icon.png"))); // NOI18N
        jMenuItem1.setText("Back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlykhodt/Users-Name-icon_1.png"))); // NOI18N
        jMenuItem2.setText("SignOut");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NhapNgaybtn)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(XuatNgaybtn)
                                .addGap(18, 18, 18)
                                .addComponent(Refreshbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(XuatNhapKhobtn))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 493, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(276, 276, 276))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NhapNgaybtn)
                        .addComponent(XuatNgaybtn)
                        .addComponent(XuatNhapKhobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Refreshbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NhapNgaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapNgaybtnActionPerformed
        // TODO add your handling code here:
        tableModelNhap.setRowCount(0);
        PhieuNhaplist = findAllNhap();
        PhieuNhaplist.forEach((Phieu p)->{
            if(p.getNgay().equals(Datetxt.getDate()))
            tableModelNhap.addRow(new Object[]{p.getMaPhieu(), p.getMaDT(), p.getTenDT(), p.getHDH(), p.getMauDT(), p.getSoluong(), p.getNgay()} );
        });
    }//GEN-LAST:event_NhapNgaybtnActionPerformed

    private void XuatNgaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XuatNgaybtnActionPerformed
        // TODO add your handling code here:
        tableModelXuat.setRowCount(0);
        PhieuXuatlist = findAllXuat();
        PhieuXuatlist.forEach((Phieu p)->{
            if(p.getNgay().equals(Datetxt.getDate()))
            tableModelXuat.addRow(new Object[]{p.getMaPhieu(), p.getMaDT(), p.getTenDT(), p.getHDH(), p.getMauDT(), p.getSoluong(), p.getNgay()} );
        });
    }//GEN-LAST:event_XuatNgaybtnActionPerformed

    private void XuatNhapKhobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XuatNhapKhobtnActionPerformed
        // TODO add your handling code here:
        MenuXuatNhapKho a = new MenuXuatNhapKho();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_XuatNhapKhobtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Menu a = new Menu();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void RefreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshbtnActionPerformed
        // TODO add your handling code here:
        showPhieuXuat();
        showPhieuNhap();
    }//GEN-LAST:event_RefreshbtnActionPerformed

    public static List<Phieu> findAllNhap(){
        ArrayList<Phieu> Phieulist = new ArrayList<>();
        Statement statement = null;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dienthoai","root", "");
            String sql = "select * from phieunhap";
            statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);
             while(resultSet.next()){
                 Phieu p = new Phieu(resultSet.getString("MaPhieuNhap"),resultSet.getString("MaDT"),resultSet.getString("TenDT"),resultSet.getString("HDH"),resultSet.getString("MauDT"), resultSet.getInt("SoLuong"),resultSet.getDate("Ngay"));
                 Phieulist.add(p);
             }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyXuatNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Phieulist;
    }
    public static List<Phieu> findAllXuat(){
        ArrayList<Phieu> Phieulist = new ArrayList<>();
        Statement statement = null;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dienthoai","root", "");
            String sql = "select * from phieuxuat";
            statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);
             while(resultSet.next()){
                 Phieu p = new Phieu(resultSet.getString("MaPhieuXuat"),resultSet.getString("MaDT"),resultSet.getString("TenDT"),resultSet.getString("HDH"),resultSet.getString("MauDT"), resultSet.getInt("SoLuong"), resultSet.getDate("Ngay"));
                 Phieulist.add(p);
             }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyXuatNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Phieulist;
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyXuatNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyXuatNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyXuatNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyXuatNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new QuanLyXuatNhap().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Datetxt;
    private javax.swing.JButton NhapNgaybtn;
    private javax.swing.JTable Nhaptbl;
    private javax.swing.JButton Refreshbtn;
    private javax.swing.JButton XuatNgaybtn;
    private javax.swing.JButton XuatNhapKhobtn;
    private javax.swing.JTable Xuattbl;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

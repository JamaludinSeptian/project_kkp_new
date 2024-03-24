/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_kkp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author Jamaludin Septian
 */
public class HalamanBarang extends javax.swing.JFrame {
   private final  Connection conn = new koneksi().connect();
   private DefaultTableModel tabmode;
   private int baris;

    /**
     * Creates new form HalamanBarang
     */
    public HalamanBarang() {
        initComponents();
        setLocationRelativeTo(this);
        datatable();
        backgroundTransparent();
        
    }
    
    
    protected void kosong(){
        tbarang.setText("");
        tnama.setText("");
        tjenis.setText("");
        tstatusaktif.setText("");
    }
    protected void datatable(){
        Object[] Baris = {"ID Barang","Nama","Jenis","Status Aktif"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelBarang.setModel(tabmode);
        String sql = "SELECT * FROM tbl_barang";
       try {
           java.sql.Statement stat = conn.createStatement();
           ResultSet hasil = stat.executeQuery(sql);
           while(hasil.next()){
                String a = hasil.getString("idBarang");
                String b = hasil.getString("nama");
                String c = hasil.getString("jenis");
                String d = hasil.getString("statusAktif");
                String[] data = {a,b,c,d};
                tabmode.addRow(data);
            }
       } catch (SQLException ex) {
           Logger.getLogger(HalamanAdmin.class.getName()).log(Level.SEVERE, null, ex);
       }
            
    }
    
    
    private void backgroundTransparent(){
        tbarang.setBackground(new java.awt.Color(0,0,0,1));
        tbarang.requestFocus();
        tnama.setBackground(new java.awt.Color(0,0,0,1));
        tjenis.setBackground(new java.awt.Color(0,0,0,1));
        tstatusaktif.setBackground(new java.awt.Color(0,0,0,1));
        tstatusaktif.setBackground(new java.awt.Color(0,0,0,1));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tstatusaktif = new javax.swing.JTextField();
        tjenis = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        tbarang = new javax.swing.JTextField();
        btncetak = new javax.swing.JLabel();
        btnhapus = new javax.swing.JLabel();
        btnubah = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tstatusaktif.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        tstatusaktif.setForeground(new java.awt.Color(255, 255, 255));
        tstatusaktif.setBorder(null);
        tstatusaktif.setOpaque(false);
        jPanel1.add(tstatusaktif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 312, 217, 20));

        tjenis.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        tjenis.setForeground(new java.awt.Color(255, 255, 255));
        tjenis.setBorder(null);
        tjenis.setOpaque(false);
        jPanel1.add(tjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 267, 217, 20));

        tnama.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        tnama.setForeground(new java.awt.Color(255, 255, 255));
        tnama.setBorder(null);
        tnama.setOpaque(false);
        jPanel1.add(tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 217, 20));

        tbarang.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        tbarang.setForeground(new java.awt.Color(255, 255, 255));
        tbarang.setBorder(null);
        tbarang.setOpaque(false);
        jPanel1.add(tbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 177, 216, 20));
        jPanel1.add(btncetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 200, 20));

        btnhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhapusMouseClicked(evt);
            }
        });
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 50, 30));

        btnubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnubahMouseClicked(evt);
            }
        });
        jPanel1.add(btnubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 60, 30));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        btnsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpanMouseClicked(evt);
            }
        });
        jPanel1.add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 60, 30));

        jScrollPane1.setOpaque(false);

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 370, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HalamanBarang.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new HalamanDepan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseClicked
        // TODO add your handling code here:
        String sql = "INSERT INTO tbl_barang VALUES (?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tbarang.getText());
            stat.setString(2, tnama.getText());
            stat.setString(3, tjenis.getText());
            stat.setString(4, tstatusaktif.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
            kosong();
            tbarang.requestFocus();
            datatable();
        } catch (SQLException ex) {
            Logger.getLogger(HalamanAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsimpanMouseClicked

    private void btnubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnubahMouseClicked
        // TODO add your handling code here:
        try {
            String sql = "UPDATE tbl_barang set nama = ?, jenis=?, statusaktif=? where idBarang = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tnama.getText());
            stat.setString(2, tjenis.getText());
            stat.setString(3, tstatusaktif.getText());
            stat.setString(4, tbarang.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil diubah");
            kosong();
            tbarang.requestFocus();
            datatable();
            btnsimpan.setEnabled(true);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Data gagal diubah"+ex);
        }
    }//GEN-LAST:event_btnubahMouseClicked

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        // TODO add your handling code here:
        int bar = tabelBarang.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        tbarang.setText(a);
        tnama.setText(b);
        tjenis.setText(c);
        tstatusaktif.setText(d);
        btnsimpan.setEnabled(false);
    }//GEN-LAST:event_tabelBarangMouseClicked

    private void btnhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseClicked
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "hapus", "Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            try {
                PreparedStatement stat = conn.prepareStatement("DELETE FROM tbl_barang WHERE idBarang = ?");
                String noNya = tbarang.getText();
                stat.setString(1, noNya);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosong();
                tbarang.requestFocus();
                datatable();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus"+ex);
            }
        }
    }//GEN-LAST:event_btnhapusMouseClicked

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
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btncetak;
    private javax.swing.JLabel btnhapus;
    private javax.swing.JLabel btnsimpan;
    private javax.swing.JLabel btnubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField tbarang;
    private javax.swing.JTextField tjenis;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tstatusaktif;
    // End of variables declaration//GEN-END:variables
}

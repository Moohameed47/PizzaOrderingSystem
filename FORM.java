/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzaorderingsystem;

import java.util.*;
import pizzaorderingsystem.MAIN.Data;

/**
 *
 * @author DE
 */
public class FORM extends javax.swing.JFrame {

    static public Data d = new Data();
    static public String Name;
    static public String No_Phone;
    static public String Address;
    static public Vector vec = MAIN.vec;
    static public long Total = MAIN.Total;
    static public int[] time = MAIN.TIME;
    static public long Delivery = 0;
    static public long Time = 0;

    public FORM() {
        initComponents();
        jTextField3.setBackground(new java.awt.Color(0, 1, 0, 0));
        jButton29.setBackground(new java.awt.Color(0, 1, 0, 0));
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton29 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("FORM");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 0, 90, 40);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 100, 130, 50);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 40, 90, 50);

        jTextField3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(130, 50, 220, 30);

        jComboBox1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Helwan", "Maadi", "El Zahraa", "West El Bald", "El Tgamoo3", "Hdaye2 El Zaytoon", "Ain Shams", "Masr El Gdeda" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(130, 110, 220, 30);

        jButton29.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jButton29.setForeground(new java.awt.Color(153, 153, 153));
        jButton29.setText("NEXT");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton29);
        jButton29.setBounds(200, 270, 150, 40);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/gggh.png"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(0, -100, 360, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        Address = jComboBox1.getSelectedItem().toString();
        Name = jTextField3.getText();
        //Helwan, Maadi, El Zahraa, West El Bald, El Tgamoo3, Hdaye2 El Zaytoon, Ain Shams, Masr El Gdeda
        if ("Helwan".equals(Address)) {
            Delivery = MAIN.distance[1];
            Time = MAIN.TIME[1];
        } else if ("Maadi".equals(Address)) {
            Delivery = MAIN.distance[2];
            Time = MAIN.TIME[2];
        } else if ("El Zahraa".equals(Address)) {
            Delivery = MAIN.distance[3];
            Time = MAIN.TIME[3];
        } else if ("West El Bald".equals(Address)) {
            Delivery = MAIN.distance[4];
            Time = MAIN.TIME[4];
        } else if ("El Tgamoo3".equals(Address)) {
            Delivery = MAIN.distance[5];
            Time = MAIN.TIME[5];
        } else if ("Hdaye2 El Zaytoon".equals(Address)) {
            Delivery = MAIN.distance[6];
            Time = MAIN.TIME[6];
        } else if ("Ain Shams".equals(Address)) {
            Delivery = MAIN.distance[7];
            Time = MAIN.TIME[7];
        } else if ("Masr El Gdeda".equals(Address)) {
            Delivery = 6;
            Time = 5;
        }
        d.Address = Address;
        d.Name = jTextField3.getText();
        d.No_Phone = MAIN.No_Phone;
        this.setVisible(false);
        CASHER c = new CASHER();
        c.setVisible(true);
    }//GEN-LAST:event_jButton29ActionPerformed

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
            java.util.logging.Logger.getLogger(FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jButton29;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

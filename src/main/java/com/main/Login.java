/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.main;

/**
 *
 * @author jrwie
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        B1 = new javax.swing.JLabel();
        Pass = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        B2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 1200));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("LOG IN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\com\\ressources\\GIF_platzhalter.gif"));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 490, 500));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Sign in");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, 50));

        User.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        User.setText("Username");
        jPanel2.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Enter Username");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 190, 30));

        B1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 30, 30));

        Pass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Pass.setText("Password");
        jPanel2.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 140, 30));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("Enter Password");
        jPasswordField1.setEchoChar((char)0);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 190, 30));

        B2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 30, 30));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 140, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Sign in");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 130, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 340, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setForeground(new java.awt.Color(50, 50, 50));
        if(jTextField1.getText().equals("Enter Username")){
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if(jTextField1.getText().equals("")){
            jTextField1.setForeground(new java.awt.Color(204,204,204));
            jTextField1.setText("Enter Username");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        jPasswordField1.setForeground(new java.awt.Color(50, 50, 50));
        if(String.valueOf(jPasswordField1.getPassword()).equals("Enter Password")){
            jPasswordField1.setEchoChar('*');
            jPasswordField1.setText("");
        }
        if(jCheckBox1.isSelected()){
            jPasswordField1.setEchoChar((char)0);
        }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        if(String.valueOf(jPasswordField1.getPassword()).equals("")){
            jPasswordField1.setForeground(new java.awt.Color(204,204,204));
            jPasswordField1.setEchoChar((char)0);
            jPasswordField1.setText("Enter Password");
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(jTextField1.getText().equals("") || jTextField1.getText().equals("Enter Username")){
            B1.setText("?");
            B2.setText("");
            jPasswordField1.setForeground(new java.awt.Color(204,204,204));
            jPasswordField1.setEchoChar((char)0);
            jPasswordField1.setText("Enter Password");
        }else if(String.valueOf(jPasswordField1.getPassword()).equals("")){
            B2.setText("?");
            B1.setText("");
            //jPasswordField1.setText("");
            jPasswordField1.setForeground(new java.awt.Color(204,204,204));
            jPasswordField1.setEchoChar((char)0);
            jPasswordField1.setText("Enter Password");
        }else{
            jPasswordField1.setText("");
            B1.setText("");
            B2.setText("?");
            jPasswordField1.setForeground(new java.awt.Color(204,204,204));
            jPasswordField1.setEchoChar((char)0);
            jPasswordField1.setText("Enter Password");
        }
        if(jTextField1.getText().equals("Admin")){
            SignUp x = new SignUp();
            x.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        if(jCheckBox1.isSelected()){
            jPasswordField1.setEchoChar((char)0);
        }else if(String.valueOf(jPasswordField1.getPassword()).equals("Enter Password")){
            jPasswordField1.setEchoChar((char)0);
        }else{
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel Pass;
    private javax.swing.JLabel User;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoginPage.java
 *
 * Created on Aug 20, 2018, 8:48:09 PM
 */
package vehiclehiring.newpackage;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Kanmani
 */
public class LoginPage extends javax.swing.JFrame {

    /** Creates new form LoginPage */
    public LoginPage() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Login Page");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 40, 103, 22);

        jLabel2.setText("User Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 120, 76, 14);

        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 180, 76, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(310, 120, 139, 20);

        jButton1.setText("REGISTER");
        getContentPane().add(jButton1);
        jButton1.setBounds(36, 267, 170, 23);

        jButton2.setText("BACK");
        getContentPane().add(jButton2);
        jButton2.setBounds(265, 267, 140, 23);

        jButton3.setText("LOGIN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(477, 267, 120, 23);

        jLabel4.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 740, 410);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(310, 170, 140, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    try{
    String name=jTextField1.getText();
    String pswd=jPasswordField1.getText();
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("select * from usertable where username='"+name+"' and password='"+pswd+"' ");
    if(rs.next()){
       
        new TripSelection().setVisible(true);
        new TripSelection().setExtendedState(MAXIMIZED_BOTH);
    }
    
     else
        JOptionPane.showMessageDialog(new LoginPage(),"Invalid User Name or Invalid Password"); 
}
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
}//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new LoginPage().setVisible(true);
                new LoginPage().setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

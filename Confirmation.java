 /*

 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Confirmation.java
 *
 * Created on Aug 20, 2018, 8:52:31 PM
 */
package vehiclehiring.newpackage;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author Kanmani
 */
public class Confirmation extends javax.swing.JFrame {

    /** Creates new form Confirmation */
    String vehicle;
    java.util.Date date;
    public Confirmation() {
        initComponents();
        
    }
    public Confirmation(String id,java.util.Date date1)
    {
     //   System.out.println("kanmani");
        initComponents();
       // System.out.println(name);
        
        vehicle=id;
        date=date1; 
        try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
        Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select name,cost,comfort,seatcount,km from vehicle where id='"+vehicle+"'");
            while(rs.next())
            {
                //System.out.println("kanmani");
                jLabel9.setText(rs.getString(1));
                jLabel10.setText(Integer.toString(rs.getInt(5)));
                jLabel11.setText(Integer.toString(rs.getInt(3)));
                jLabel12.setText(Integer.toString(rs.getInt(4)));
                jLabel13.setText(Integer.toString(rs.getInt(2)));
                
            }
            }
            catch(Exception ex)
            {
                    System.out.println(ex.getMessage());
            }

        new Confirmation().addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
               /*   try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
        Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select name,cost,comfort,seatcount,km from vehicle where id='"+vehicle+"'");
            while(rs.next())
            {
               // System.out.println("kanmani");
              //  jLabel9.setText(vehicle);
                jLabel10.setText(Integer.toString(rs.getInt(4)));
                jLabel11.setText(Integer.toString(rs.getInt(2)));
                jLabel12.setText(Integer.toString(rs.getInt(3)));
                jLabel13.setText(Integer.toString(rs.getInt(1)));
                
            }
            }
            catch(Exception ex)
            {
                    System.out.println(ex.getMessage());
            }*/

}   
 

            @Override
            public void windowClosing(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowActivated(WindowEvent e) {
             /*    try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
        Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select cost,comfort,seatcount,km from vehicle where name='"+vehicle+"'");
            while(rs.next())
            {
             //   System.out.println("kanmani");
                jLabel9.setText(vehicle);
                jLabel10.setText(Integer.toString(rs.getInt(4)));
                if(rs.getInt(2)==1)
                jLabel11.setText("Yes");
                else
                jLabel11.setText("No");                  
                jLabel12.setText(Integer.toString(rs.getInt(3)));
                jLabel13.setText(Integer.toString(rs.getInt(1)));
                
            }
            }
            catch(Exception ex)
            {
                    System.out.println(ex.getMessage());
            }
*/
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setText("VEHICLE DETAILS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 60, 260, 20);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setText("VEHICLE MODEL");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 120, 130, 16);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel4.setText(" COST (per KM)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 160, 120, 16);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel5.setText("COMFORT LEVEL (in *)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 200, 150, 16);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel6.setText("SEAT COUNT");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 240, 160, 16);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("MINIMUM COST SHOULD BE PAID BEFORE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 280, 310, 17);

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 110, 140, 20);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 160, 120, 20);

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(380, 200, 130, 20);

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(380, 240, 130, 20);

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(380, 280, 120, 20);

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 400, 150, 30);

        jButton2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton2.setText("BOOK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 400, 170, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    new TripSelection().setVisible(true);
    new TripSelection().setExtendedState(MAXIMIZED_BOTH);
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    DateFormat df=new SimpleDateFormat ("yyyy/mm/dd");
        String format = df.format(date);
                 try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
                PreparedStatement st=conn.prepareStatement("update vehicle set bookeddate=?,booked=? where id='"+vehicle+"'");
                st.setDate(1,new java.sql.Date(date.getTime()));
                st.setInt(2,1);
            int executeUpdate = st.executeUpdate();
            JOptionPane.showMessageDialog(new Confirmation(),"Order Booked");
            
                 }
            catch(Exception ex)
            {
                    System.out.println(ex.getMessage());
            }

}//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Confirmation().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void addWindowListener() {

        
        
        
      throw new UnsupportedOperationException("Not yet implemented");
    }
}


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Nurse extends javax.swing.JFrame {

    Connection con= null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public Nurse() {
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

        jLabelndesig = new javax.swing.JLabel();
        ndesig = new javax.swing.JTextField();
        jLabelnsal = new javax.swing.JLabel();
        nsal = new javax.swing.JTextField();
        jLabelndeptname = new javax.swing.JLabel();
        ndeptname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelnname = new javax.swing.JLabel();
        nid = new javax.swing.JTextField();
        nname = new javax.swing.JTextField();
        jLabelncont = new javax.swing.JLabel();
        jLabelnage = new javax.swing.JLabel();
        ncont = new javax.swing.JTextField();
        nage = new javax.swing.JTextField();
        jaddn = new javax.swing.JButton();
        jremoven = new javax.swing.JButton();
        jupdaten = new javax.swing.JButton();
        jLabelnid = new javax.swing.JLabel();
        nsearch = new javax.swing.JButton();
        jLabelnroom = new javax.swing.JLabel();
        nroom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelndesig.setText("Nurse_Designation:");

        jLabelnsal.setText("Salary:");

        jLabelndeptname.setText("Department_Name:");

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Nurse Details");

        jLabelnname.setText("Nurse_Name:");

        jLabelncont.setText("Nurse_ContactNo:");

        jLabelnage.setText("Nurse_Age:");

        jaddn.setText("Add ");
        jaddn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddnActionPerformed(evt);
            }
        });

        jremoven.setText("Remove");
        jremoven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jremovenActionPerformed(evt);
            }
        });

        jupdaten.setText("Update");
        jupdaten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdatenActionPerformed(evt);
            }
        });

        jLabelnid.setText("Nurse_ID:");

        nsearch.setText("Search");
        nsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nsearchActionPerformed(evt);
            }
        });

        jLabelnroom.setText("Room_NO :");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(480, 480, 480))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelnid)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelnage)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nage, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelncont)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ncont, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelnname)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nname, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(90, 90, 90)
                                            .addComponent(jLabelndeptname)
                                            .addGap(18, 18, 18)
                                            .addComponent(ndeptname, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabelnsal)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(nsal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabelnroom)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(nroom, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabelndesig)
                                        .addGap(18, 18, 18)
                                        .addComponent(ndesig, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 239, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jupdaten, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jremoven, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 239, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nsearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jaddn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelnid)
                            .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelnname)
                                    .addComponent(nname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelncont)
                                            .addComponent(ncont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelnage)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelnsal))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelnroom)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelndeptname)
                            .addComponent(ndeptname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelndesig)
                            .addComponent(ndesig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(nsearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jaddn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jremoven)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jupdaten)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jaddnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddnActionPerformed

        try {

            String Nurse_Name,Department_Name,Nurse_Designation;
            int Nurse_Age,Nurse_ContactNo,Salary,Room_NO;

            int Nurse_ID;
            Nurse_ID = Integer.parseInt(nid.getText());
            Nurse_Name = nname.getText();

            Nurse_Age = Integer.parseInt(nage.getText());
            Nurse_ContactNo=Integer.parseInt(ncont.getText());

            Department_Name=ndeptname.getText();
            Nurse_Designation=ndesig.getText();
            Salary=Integer.parseInt(nsal.getText());
            Room_NO=Integer.parseInt(nroom.getText());
            JOptionPane.showMessageDialog (null," Added Successfully");

            //insert query
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DIN","password");

            PreparedStatement pst;
            String sql ="INSERT INTO NURSE (Nurse_ID,Nurse_Name,Nurse_Age,Nurse_ContactNo,Department_Name,Nurse_Designation ,Salary,Room_NO  )" +"  values (? , ?, ? ,?,?,?,?,? )";
            pst = con.prepareStatement(sql);
            pst.setInt(1,Nurse_ID);
            pst.setString(2,Nurse_Name);

            pst.setInt(3, Nurse_Age);
            pst.setInt(4, Nurse_ContactNo);

            pst.setString(5, Department_Name);
            pst.setString(6, Nurse_Designation);
            pst.setInt(7, Salary);
            pst.setInt(8, Room_NO);
            

            if (nid.getText().isEmpty()){

                System.out.println("Plz Fill up blanks");

            }
            else if (nname.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }

            else if (nage.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }
            else if (ncont.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }

            else if (ndeptname.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }
            else if (ndesig.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }
            else if (nsal.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }
            else if (nroom.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }
            

            else {
                pst.execute();
             
                con.close();
            }

        } catch(Exception ex) {

            JOptionPane.showMessageDialog(null, ex);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jaddnActionPerformed
     
    
     public static void NurseTrigger (int Nurse_ID,String Nurse_Name,int Nurse_Age,int Nurse_ContactNo,String Department_Name,String Nurse_Designation ,int Salary,int Room_NO)
                                                        throws SQLException
  {
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DIN","password");
    String sql = "{call Restricted_Insert_NURSE}";
    try
    {
        
        
     PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setInt(1,Nurse_ID);
            pst.setString(2,Nurse_Name);
        
            pst.setInt(3, Nurse_Age);
            pst.setInt(4, Nurse_ContactNo);
          
            pst.setString(5, Department_Name);
            pst.setString(6, Nurse_Designation);
            
            pst.setInt(7, Salary);
            pst.setInt(8, Room_NO);
           
    }
    catch (SQLException e)
    {
      System.err.println(e.getMessage());
    }
  }
    
    
    
    
    
    
    
    
    
    private void jremovenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jremovenActionPerformed

        try{
            //Connection conn;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DIN","password");
            String sql="{ call delete_NURSE (?)}";
            pst=con.prepareStatement(sql);

            pst.setInt(1,Integer.parseInt(nid.getText()) );
            pst.executeUpdate();
            JOptionPane.showMessageDialog (null," Deleted Successfully");
            con.close();

            nid.setText(" ");
            nname.setText(" ");

            nage.setText(" ");
            ncont.setText(" ");

            ndeptname.setText(" ");
            ndesig.setText(" ");
            nsal.setText(" ");
            nroom.setText(" ");
            

        }

        catch(Exception e)

        {

            JOptionPane.showMessageDialog (null,"Something is Wrong.Please check again.");

        }
    }//GEN-LAST:event_jremovenActionPerformed

    private void jupdatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdatenActionPerformed

        try{

            String Nurse_Name,Department_Name,Nurse_Designation;
            int Nurse_Age,Nurse_ContactNo,Salary,Room_NO;

            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DIN","password");
            //PreparedStatement pst=con.prepareStatement();
            //pst = con.prepareStatement(sql);
            int Nurse_ID;
            Nurse_ID = Integer.parseInt(nid.getText());
            Nurse_Name = nname.getText();

            Nurse_Age = Integer.parseInt(nage.getText());
            Nurse_ContactNo=Integer.parseInt(ncont.getText());

            Department_Name=ndeptname.getText();
            Nurse_Designation=ndesig.getText();
            Salary=Integer.parseInt(nsal.getText());
            Room_NO=Integer.parseInt(nroom.getText());
            
            String sq1 = "update NURSE set Nurse_ID='"+Nurse_ID+"', Nurse_Name='"+Nurse_Name+"',Nurse_Age='"+Nurse_Age+"',Nurse_ContactNo='"+Nurse_ContactNo+"',Department_Name='"+Department_Name+"',Nurse_Designation='"+Nurse_Designation+"',Salary='"+Salary+"',Room_NO='"+Room_NO+"' where Nurse_ID='"+Nurse_ID+"'";
            //PreparedStatement pst;
            pst=con.prepareStatement(sq1);
            pst.executeUpdate();
            //             pst = con.prepareStatement(sql);
            //pst=(PreparedStatement) con.createStatement();

            //           int Doctor_ID;
            //            Doctor_ID = Integer.parseInt(did.getText());
            //            Doctor_Name = dname.getText();
            //
            //            Doctor_Age = Integer.parseInt(dage.getText());
            //            Doctor_ContactNo=Integer.parseInt(dcont.getText());
            //
            //            Department_Name=ddeptname.getText();
            //            Doctor_Designation=ddesig.getText();
            //            Salary=Integer.parseInt(dsal.getText());
            //            Room_NO=Integer.parseInt(droom.getText());
            //            Report_NO=Integer.parseInt(dreport.getText());

            //            String sq1 = "update DOCTOR set DOCTOR_ID='"+Doctor_ID+"', Doctor_Name='"+Doctor_Name+"',Doctor_Age='"+Doctor_Age+"',Doctor_ContactNo='"+Doctor_ContactNo+"',Department_Name='"+Department_Name+"',Doctor_Designation='"+Doctor_Designation+"',Salary='"+Salary+"',Room_NO='"+Room_NO+"',Report_NO='"+Report_NO+"'where DOCTOR_ID='"+Doctor_ID+"'";
            //            pst.executeUpdate(sq1);

            // st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Updated Successfully");
            //this.jdisplayn.enable();
            // conn.close();

        }

        catch(  Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex);
    }//GEN-LAST:event_jupdatenActionPerformed
    }
    private void nsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nsearchActionPerformed

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DIN","password");

            String sql="select * from NURSE where Nurse_ID=?";

            PreparedStatement stat=con.prepareStatement(sql);
            stat.setInt(1,Integer.parseInt(nid.getText()));
            ResultSet rs=stat.executeQuery();
            if(rs.next())
            {
                nid.setText(rs.getString("Nurse_ID"));
                nname.setText(rs.getString("Nurse_Name"));
                nage.setText(rs.getString("Nurse_Age"));
                ncont.setText(rs.getString("Nurse_ContactNo"));
                ndeptname.setText(rs.getString("Department_Name"));
                ndesig.setText(rs.getString("Nurse_Designation"));
                nsal.setText(rs.getString("Salary"));
                nroom.setText(rs.getString("Room_NO"));
                

            }
            else{

                JOptionPane.showMessageDialog(null, "Not Found");
            }

            con.close();
        }

        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_nsearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Admin rg=new Admin();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nurse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelnage;
    private javax.swing.JLabel jLabelncont;
    private javax.swing.JLabel jLabelndeptname;
    private javax.swing.JLabel jLabelndesig;
    private javax.swing.JLabel jLabelnid;
    private javax.swing.JLabel jLabelnname;
    private javax.swing.JLabel jLabelnroom;
    private javax.swing.JLabel jLabelnsal;
    private javax.swing.JButton jaddn;
    private javax.swing.JButton jremoven;
    private javax.swing.JButton jupdaten;
    private javax.swing.JTextField nage;
    private javax.swing.JTextField ncont;
    private javax.swing.JTextField ndeptname;
    private javax.swing.JTextField ndesig;
    private javax.swing.JTextField nid;
    private javax.swing.JTextField nname;
    private javax.swing.JTextField nroom;
    private javax.swing.JTextField nsal;
    private javax.swing.JButton nsearch;
    // End of variables declaration//GEN-END:variables
}
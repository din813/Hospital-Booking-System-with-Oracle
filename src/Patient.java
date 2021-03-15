
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.sql.*;
import java.sql.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Patient extends javax.swing.JFrame {

    Connection con= null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public Patient() {
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

        jLabelpdname = new javax.swing.JLabel();
        pdept = new javax.swing.JTextField();
        jLabelpaddress = new javax.swing.JLabel();
        paddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelpname = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        jLabelpcont = new javax.swing.JLabel();
        jLabelpage = new javax.swing.JLabel();
        pcont = new javax.swing.JTextField();
        page = new javax.swing.JTextField();
        jLabelpreport = new javax.swing.JLabel();
        preport = new javax.swing.JTextField();
        jaddp = new javax.swing.JButton();
        jremovep = new javax.swing.JButton();
        jupdatep = new javax.swing.JButton();
        jLabelpid = new javax.swing.JLabel();
        psearch = new javax.swing.JButton();
        jLabelproom = new javax.swing.JLabel();
        proom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelpdname.setText("Department_Name");

        jLabelpaddress.setText("Patient_Address:");

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Patient Details");

        jLabelpname.setText("Patient_Name:");

        jLabelpcont.setText("Patient_ContactNo:");

        jLabelpage.setText("Patient_Age:");

        jLabelpreport.setText("Report_NO :");

        jaddp.setText("Add Patient");
        jaddp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddpActionPerformed(evt);
            }
        });

        jremovep.setText("Remove Patient");
        jremovep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jremovepActionPerformed(evt);
            }
        });

        jupdatep.setText("Update");
        jupdatep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdatepActionPerformed(evt);
            }
        });

        jLabelpid.setText("Patient_ID:");

        psearch.setText("Search");
        psearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psearchActionPerformed(evt);
            }
        });

        jLabelproom.setText("Room_NO :");

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
                            .addComponent(jLabelpid)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelpage)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelpcont)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pcont, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelpname)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(90, 90, 90)
                                            .addComponent(jLabelpaddress)
                                            .addGap(18, 18, 18)
                                            .addComponent(paddress, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabelproom)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(proom, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabelpreport)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(preport, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabelpdname)
                                        .addGap(18, 18, 18)
                                        .addComponent(pdept, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 234, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jupdatep, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jremovep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 234, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(psearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jaddp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelpid)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelpname)
                                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelpcont)
                                            .addComponent(pcont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelpage)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(proom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelproom))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(preport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelpreport)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelpaddress)
                            .addComponent(paddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelpdname)
                            .addComponent(pdept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(psearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jaddp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jremovep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jupdatep)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jaddpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddpActionPerformed

        try {
             
            String Patient_Name,Patient_Address,Department_Name;
            int Patient_Age,Patient_ContactNo,Room_NO,Report_NO;

            int Patient_ID;
            Patient_ID = Integer.parseInt(pid.getText());
            Patient_Name = pname.getText();

            Patient_Age = Integer.parseInt(page.getText());
            Patient_ContactNo=Integer.parseInt(pcont.getText());

            Patient_Address=paddress.getText();
            Department_Name=pdept.getText();
            
            Room_NO=Integer.parseInt(proom.getText());
            Report_NO=Integer.parseInt(preport.getText());

            //insert query
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DIN","password");

            PreparedStatement pst;
            
            String sql ="{call addpatient(?,?,?,?,?,?,?,?)}";
            pst = con.prepareStatement(sql);
            
            pst.setInt(1,Patient_ID);
            pst.setString(2,Patient_Name);
        
            pst.setInt(3, Patient_Age);
            pst.setInt(4, Patient_ContactNo);
          
            pst.setString(5, Patient_Address);
            pst.setString(6, Department_Name);
            
            pst.setInt(7, Room_NO);
            pst.setInt(8, Report_NO);
            JOptionPane.showMessageDialog (null," Added Successfully");


            if (pid.getText().isEmpty()){

                System.out.println("Plz Fill up blanks");

            }
            else if (pname.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }

            else if (page.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }
            else if (pcont.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }

            else if (paddress.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }
            else if (pdept.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }
           
            else if (proom.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }
            else if (preport.getText().isEmpty()){
                System.out.println("Plz Fill up blanks");
            }
              
            else {
                
                //String sql1  = "begin addpatient; end;";
                pst.execute();
                 
                con.close();
            }

        } catch(Exception ex) {
           ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
           

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jaddpActionPerformed

    private void jremovepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jremovepActionPerformed

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DIN","password");
            PreparedStatement pst;
            String sql="{ call delete_patient (?)}";
            pst=con.prepareStatement(sql);

            pst.setInt(1,Integer.parseInt(pid.getText()) );
            pst.executeUpdate();
            JOptionPane.showMessageDialog (null," Deleted Successfully");
            con.close();

            pid.setText(" ");
            pname.setText(" ");

            page.setText(" ");
            pcont.setText(" ");

            paddress.setText(" ");
            pdept.setText(" ");
            
            proom.setText(" ");
            preport.setText(" ");
            
        }

        catch(Exception e)

        {
              
            JOptionPane.showMessageDialog (null,"Something is Wrong.Please check again.");

        }
    }//GEN-LAST:event_jremovepActionPerformed

    private void jupdatepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdatepActionPerformed

        try{

             String Patient_Name,Patient_Address,Department_Name;
            int Patient_Age,Patient_ContactNo,Room_NO,Report_NO;

            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DIN","password");
            //PreparedStatement pst=con.prepareStatement();
            //pst = con.prepareStatement(sql);
            int Patient_ID;
            Patient_ID = Integer.parseInt(pid.getText());
            Patient_Name = pname.getText();

            Patient_Age = Integer.parseInt(page.getText());
            Patient_ContactNo=Integer.parseInt(pcont.getText());

            Patient_Address=paddress.getText();
            Department_Name=pdept.getText();
            
            Room_NO=Integer.parseInt(proom.getText());
            Report_NO=Integer.parseInt(preport.getText());
            String sq1 = "update PATIENT set Patient_ID='"+Patient_ID+"', Patient_Name='"+Patient_Name+"',Patient_Age='"+Patient_Age+"',Patient_ContactNo='"+Patient_ContactNo+"',Patient_Address='"+Patient_Address+"',Department_Name='"+Department_Name+"',Room_NO='"+Room_NO+"',Report_NO='"+Report_NO+"'where Patient_ID='"+Patient_ID+"'";
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
            //this.jdisplayp.enable();
            // conn.close();

        }

        catch(  Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex);
    }//GEN-LAST:event_jupdatepActionPerformed
    }
    private void psearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psearchActionPerformed

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DIN","password");

            String sql="select * from PATIENT where Patient_ID=?";

            PreparedStatement stat=con.prepareStatement(sql);
            stat.setInt(1,Integer.parseInt(pid.getText()));
            ResultSet rs=stat.executeQuery();
            if(rs.next())
            {
                pid.setText(rs.getString("Patient_ID"));
                pname.setText(rs.getString("Patient_Name"));
                page.setText(rs.getString("Patient_Age"));
                pcont.setText(rs.getString("Patient_ContactNo"));
                paddress.setText(rs.getString("Patient_Address"));
                pdept.setText(rs.getString("Department_Name"));
                
                proom.setText(rs.getString("Room_NO"));
                preport.setText(rs.getString("Report_NO"));

            }
            else{

                JOptionPane.showMessageDialog(null, "Not Found");
            }

            con.close();
        }

        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_psearchActionPerformed

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelpaddress;
    private javax.swing.JLabel jLabelpage;
    private javax.swing.JLabel jLabelpcont;
    private javax.swing.JLabel jLabelpdname;
    private javax.swing.JLabel jLabelpid;
    private javax.swing.JLabel jLabelpname;
    private javax.swing.JLabel jLabelpreport;
    private javax.swing.JLabel jLabelproom;
    private javax.swing.JButton jaddp;
    private javax.swing.JButton jremovep;
    private javax.swing.JButton jupdatep;
    private javax.swing.JTextField paddress;
    private javax.swing.JTextField page;
    private javax.swing.JTextField pcont;
    private javax.swing.JTextField pdept;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField preport;
    private javax.swing.JTextField proom;
    private javax.swing.JButton psearch;
    // End of variables declaration//GEN-END:variables
}

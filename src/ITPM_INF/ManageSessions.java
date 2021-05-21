/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITPM_INF;

import ITPM_codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Duvindu
 */
public class ManageSessions extends javax.swing.JFrame {

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
   
   
    public ManageSessions() {
        initComponents();
        conn = DBconnect.connect();
        sessionone();
        sessiontwo();
    }

    
      public void sessionone(){
  
      try{
          
          String sql = "SELECT * FROM session";
          pst = conn.prepareStatement(sql);
          rs =pst.executeQuery(sql);
          
          while (rs.next()){
          
                String Lecture1 =rs.getString("Lecture_1");
                String Lecture2 =rs.getString("Lecture_2");
                String subcode =rs.getString("Subject_Code");
                String subname =rs.getString("Subject_Name");
                String groupid =rs.getString("Group_ID");
                String tag =rs.getString("Tag");
                
                
                Comsession1.addItem(Lecture1+"/"+Lecture2+"/"+subcode+"/"+subname+"/"+groupid+"/"+tag);
               
          }
      }  
      
      catch (SQLException e) {
                
                     JOptionPane.showMessageDialog(null, e);
            }
    
  }
  
  public void sessiontwo(){
  
      try{
          
          String sql = "SELECT * FROM session";
          pst = conn.prepareStatement(sql);
          rs =pst.executeQuery(sql);
          
          while (rs.next()){
          
                String Lecture1 =rs.getString("Lecture_1");
                String Lecture2 =rs.getString("Lecture_2");
                String subcode =rs.getString("Subject_Code");
                String subname =rs.getString("Subject_Name");
                String groupid =rs.getString("Group_ID");
                String tag =rs.getString("Tag");
                
                
                Comsession2.addItem(Lecture1+"/"+Lecture2+"/"+subcode+"/"+subname+"/"+groupid+"/"+tag);
               
          }
      }  
      
      catch (SQLException e) {
                
                     JOptionPane.showMessageDialog(null, e);
            }
    
  }
          
   public void tableloadnon(){
       
       try {
           
           String sql = "SELECT ID,Session1_Lecturer_One,Session1_Lecturer_Two,Session2_Lecturer_One,Session2_Lecturer_Two,Session1_Subject_Code,Session2_Subject_Code,Session1_Subject_Name,Session2_Subject_Name,Session1_Group_ID,Session2_Group_ID,Session1_Tag,Session2_Tag FROM nonoverlapping";
           pst = conn.prepareStatement(sql);
           rs = pst.executeQuery();
           nonoverlapping.setModel(DbUtils.resultSetToTableModel(rs));
           
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, e);
           
           
           
       }
       
   }
   
   public void tableloadcon(){
       
       try {
           
           String sql = "SELECT ID,Session1_Lecturer_One,Session1_Lecturer_Two,Session2_Lecturer_One,Session2_Lecturer_Two,Session1_Subject_Code,Session2_Subject_Code,Session1_Subject_Name,Session2_Subject_Name,Session1_Group_ID,Session2_Group_ID,Session1_Tag,Session2_Tag FROM consecutive";
           pst = conn.prepareStatement(sql);
           rs = pst.executeQuery();
           nonoverlapping.setModel(DbUtils.resultSetToTableModel(rs));
           
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, e);
           
           
           
       }
       
   }
   
   public void tableloadpar(){
       
       try {
           
           String sql = "SELECT ID,Session1_Lecturer_One,Session1_Lecturer_Two,Session2_Lecturer_One,Session2_Lecturer_Two,Session1_Subject_Code,Session2_Subject_Code,Session1_Subject_Name,Session2_Subject_Name,Session1_Group_ID,Session2_Group_ID,Session1_Tag,Session2_Tag FROM paralle";
           pst = conn.prepareStatement(sql);
           rs = pst.executeQuery();
           nonoverlapping.setModel(DbUtils.resultSetToTableModel(rs));
           
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, e);
           
           
           
       }
       
   }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnparalle = new javax.swing.JButton();
        btnconsecut = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btaddnonoverlap = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Comsession1 = new javax.swing.JComboBox<>();
        Comsession2 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        topic = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nonoverlapping = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setText("Manage Sessions");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("View Consecutive Sessions");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1129, 31, 335, 50));

        btnparalle.setText("Add To Paralle");
        btnparalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnparalleMouseClicked(evt);
            }
        });
        jPanel2.add(btnparalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1476, 99, 335, 50));

        btnconsecut.setText("Add To Consecutive");
        btnconsecut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnconsecutMouseClicked(evt);
            }
        });
        jPanel2.add(btnconsecut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 99, 335, 50));

        jButton4.setText("View Paralle Sessions");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1476, 31, 335, 50));

        btaddnonoverlap.setText("Add To Non Overlapping");
        btaddnonoverlap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btaddnonoverlapMouseClicked(evt);
            }
        });
        btaddnonoverlap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddnonoverlapActionPerformed(evt);
            }
        });
        jPanel2.add(btaddnonoverlap, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 99, 335, 50));

        jButton6.setText("View Non Overlapping Sessions");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 31, 335, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Session Two");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Session One");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 32));

        jPanel2.add(Comsession1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 450, 40));

        jPanel2.add(Comsession2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 450, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topic.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jPanel3.add(topic, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 46, 490, 54));

        nonoverlapping.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Session1 Lecturer One	", "Session1  Lecturer Two	", "Session2 Lecturer One	", "Session2 Lecturer Two	", "Session1 Subject Code", "Session2 Subject Code", "Session1 Subject Name", "Session2 Subject Name", "Session1 Group ID", "Session2 Group ID", "Session1 Tag", "Session2 Tag"
            }
        ));
        jScrollPane1.setViewportView(nonoverlapping);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 1790, 460));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1859, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(802, 802, 802))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btaddnonoverlapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddnonoverlapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btaddnonoverlapActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btaddnonoverlapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btaddnonoverlapMouseClicked
       
        topic.setText("Non Overlapping Session");

        String x ;
        x = (String)Comsession1.getSelectedItem();
        String[] array =x.split("/");

        String a ;
        a = (String)Comsession2.getSelectedItem();
        String[] arraya =a.split("/");

        String lec1= array[0];
        String lec2= array[1];
        String subcod = array[2];
        String subname = array[3];
        String gid = array[4];
        String tag = array[5];

        String slec1= arraya[0];
        String slec2= arraya[1];
        String ssubcod = arraya[2];
        String ssubname = arraya[3];
        String sgid = arraya[4];
        String stag = arraya[5];
       
         try {

            String sql = "INSERT INTO nonoverlapping(Session1_Lecturer_One,Session1_Lecturer_Two,Session2_Lecturer_One,Session2_Lecturer_Two,Session1_Subject_Code,Session2_Subject_Code,Session1_Subject_Name,Session2_Subject_Name,Session1_Group_ID,Session2_Group_ID,Session1_Tag,Session2_Tag)VALUES('"+lec1+"','"+lec2+"','"+slec1+"','"+slec2+"','"+subcod+"','"+ssubcod+"','"+subname+"','"+ssubname+"','"+gid+"','"+sgid+"','"+tag+"','"+stag+"')";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data saved");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

        tableloadnon();
        
        
        
    }//GEN-LAST:event_btaddnonoverlapMouseClicked

    private void btnconsecutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsecutMouseClicked
       
         topic.setText("Consecutive Session");
         
        String x ;
        x = (String)Comsession1.getSelectedItem();
        String[] array =x.split("/");

        String a ;
        a = (String)Comsession2.getSelectedItem();
        String[] arraya =a.split("/");

        String lec1= array[0];
        String lec2= array[1];
        String subcod = array[2];
        String subname = array[3];
        String gid = array[4];
        String tag = array[5];

        String slec1= arraya[0];
        String slec2= arraya[1];
        String ssubcod = arraya[2];
        String ssubname = arraya[3];
        String sgid = arraya[4];
        String stag = arraya[5];
       
         try {

            String sql = "INSERT INTO consecutive(Session1_Lecturer_One,Session1_Lecturer_Two,Session2_Lecturer_One,Session2_Lecturer_Two,Session1_Subject_Code,Session2_Subject_Code,Session1_Subject_Name,Session2_Subject_Name,Session1_Group_ID,Session2_Group_ID,Session1_Tag,Session2_Tag)VALUES('"+lec1+"','"+lec2+"','"+slec1+"','"+slec2+"','"+subcod+"','"+ssubcod+"','"+subname+"','"+ssubname+"','"+gid+"','"+sgid+"','"+tag+"','"+stag+"')";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data saved");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

        tableloadcon();
        
        
    }//GEN-LAST:event_btnconsecutMouseClicked

    private void btnparalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnparalleMouseClicked
        
        
        topic.setText("Paralle Session");
        
         String x ;
        x = (String)Comsession1.getSelectedItem();
        String[] array =x.split("/");

        String a ;
        a = (String)Comsession2.getSelectedItem();
        String[] arraya =a.split("/");

        String lec1= array[0];
        String lec2= array[1];
        String subcod = array[2];
        String subname = array[3];
        String gid = array[4];
        String tag = array[5];

        String slec1= arraya[0];
        String slec2= arraya[1];
        String ssubcod = arraya[2];
        String ssubname = arraya[3];
        String sgid = arraya[4];
        String stag = arraya[5];
       
         try {

            String sql = "INSERT INTO paralle(Session1_Lecturer_One,Session1_Lecturer_Two,Session2_Lecturer_One,Session2_Lecturer_Two,Session1_Subject_Code,Session2_Subject_Code,Session1_Subject_Name,Session2_Subject_Name,Session1_Group_ID,Session2_Group_ID,Session1_Tag,Session2_Tag)VALUES('"+lec1+"','"+lec2+"','"+slec1+"','"+slec2+"','"+subcod+"','"+ssubcod+"','"+subname+"','"+ssubname+"','"+gid+"','"+sgid+"','"+tag+"','"+stag+"')";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data saved");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

        tableloadpar();
        
    }//GEN-LAST:event_btnparalleMouseClicked

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
            java.util.logging.Logger.getLogger(ManageSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSessions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Comsession1;
    private javax.swing.JComboBox<String> Comsession2;
    private javax.swing.JButton btaddnonoverlap;
    private javax.swing.JButton btnconsecut;
    private javax.swing.JButton btnparalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable nonoverlapping;
    private javax.swing.JLabel topic;
    // End of variables declaration//GEN-END:variables
}

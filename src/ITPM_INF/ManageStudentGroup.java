/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITPM_INF;

import ITPM_codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Duvindu
 */
public class ManageStudentGroup extends javax.swing.JFrame {

    
         Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
    public ManageStudentGroup() {
        
        initComponents();
        conn = DBconnect.connect();
        tableload();
    }

   public void tableload(){
       
       try {
           
           String sql = "SELECT id,AcademicYear,Semester,Programe,GroupNumber,SubGroupNumber,GroupID,SubGroupID FROM studentgroup";
           pst = conn.prepareStatement(sql);
           rs = pst.executeQuery();
           tb1.setModel(DbUtils.resultSetToTableModel(rs));
           
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, e);
           
           
           
       }
       
   }
   
   
   public void tabledata(){
   
   int r = tb1.getSelectedRow();
   
   String id = tb1.getValueAt(r, 0).toString();
   String AcademicYear = tb1.getValueAt(r,1).toString();
   String Semester = tb1.getValueAt(r,2).toString();
   String Programe = tb1.getValueAt(r,3).toString();
   int GroupNumber = (int) tb1.getValueAt(r,4);
   int SubGroupNumber = (int)tb1.getValueAt(r,5);
   String GroupID = tb1.getValueAt(r,6).toString();
   String SubGroupID = tb1.getValueAt(r,7).toString();
   
   idbox.setText(id);
   ayearbox.setSelectedItem(AcademicYear);
   sbox.setSelectedItem(Semester);
   pbox.setSelectedItem(Programe);
   gnspinn.setValue(GroupNumber);
   sgnspinn.setValue(SubGroupNumber);
   gidtxt.setText(GroupID);
   sgidtxt.setText(SubGroupID);
   
   
   }
   
   public void search(){
       
       String srch =searchtxt.getText();
       
       try {
           
           String sql ="SELECT * FROM studentgroup WHERE id ='"+srch+"' OR Programe LIKE '%"+srch+"%' ";
           pst = conn.prepareStatement(sql);
           rs =pst.executeQuery();
           tb1.setModel(DbUtils.resultSetToTableModel(rs));
           
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, e);
           
       }
   }
   
   
   public void update (){
       
        String id = idbox.getText();
        String AcademicYear =  ayearbox.getSelectedItem().toString();
        String Semester = sbox.getSelectedItem().toString();
        String Programe = pbox.getSelectedItem().toString();
        int GroupNumber =(Integer)gnspinn.getValue();
        int  SubGroupNumber =(Integer)sgnspinn.getValue();
        gidtxt.setText(AcademicYear+"."+Semester+"."+Programe+"."+GroupNumber);
        sgidtxt.setText(AcademicYear+"."+Semester+"."+Programe+"."+GroupNumber+"."+SubGroupNumber);
        
        String GroupID =  gidtxt.getText();
        String SubGroupID = sgidtxt.getText();
        
        int check = JOptionPane.showConfirmDialog(null,"do you realy want to update this !!" );
        
        
        if(check == 0){
        
        try {
           
            String sql = "UPDATE studentgroup SET AcademicYear='"+AcademicYear+"',Semester='"+Semester+"',Programe='"+Programe+"',GroupNumber='"+GroupNumber+"',SubGroupNumber='"+SubGroupNumber+"',GroupID='"+GroupID+"',SubGroupID='"+SubGroupID+"'  WHERE id='"+id+"'";
             pst = conn.prepareStatement(sql);
             pst.execute();
             JOptionPane.showMessageDialog(null,"Updated");
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null,"Not Updated");
       }
   
        }
   
   
   }
   
   
    public void clear(){
        
        
        searchtxt.setText("");
        ayearbox.setSelectedIndex(0);
        sbox.setSelectedIndex(0);
        pbox.setSelectedIndex(0);
        gnspinn.setValue(0);
        sgnspinn.setValue(0);        
        gidtxt.setText("");
        sgidtxt.setText("");
      
        
    }
    
    
    
    public void notnull(){
        
        String AcademicYear =  ayearbox.getSelectedItem().toString();
        String Semester = sbox.getSelectedItem().toString();
        String Programe = pbox.getSelectedItem().toString();
        int GroupNumber =(Integer)gnspinn.getValue();
        int  SubGroupNumber =(Integer)sgnspinn.getValue();       
        String GroupID =  gidtxt.getText();
        String SubGroupID = sgidtxt.getText();
        
        
        
        
    
             if(AcademicYear.equals("Select") || Semester.equals("Select") || Programe.equals("Select") || GroupNumber == 0 || SubGroupNumber == 0 || GroupID.equals(" ")||SubGroupID.equals("") ){
            
            JOptionPane.showMessageDialog(null," please enter valid data");
            
            
        }
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pbox = new javax.swing.JComboBox<>();
        sbox = new javax.swing.JComboBox<>();
        ayearbox = new javax.swing.JComboBox<>();
        sgnspinn = new javax.swing.JSpinner();
        gnspinn = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        idbox = new javax.swing.JLabel();
        gidtxt = new javax.swing.JLabel();
        sgidtxt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1302, 683));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1950, 10));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setText("Manage Student Group");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 530, -1));

        tb1.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Academic Year", "Semester", "Programe", "Group Number", "Sub Group Number", "Group ID", "Sub Group ID"
            }
        ));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        tb1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tb1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 1620, 290));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, -30, 530, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Semester");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 270, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Programe");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 190, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Group Number");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 270, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Sub Group Number");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 270, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Group ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 120, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText(" Sub GroupID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 160, 40));

        pbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "IT", "CSSE", "CSE", "IM" }));
        pbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pboxMouseClicked(evt);
            }
        });
        pbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pboxActionPerformed(evt);
            }
        });
        jPanel2.add(pbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 310, 30));

        sbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "S1", "S2" }));
        sbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sboxMouseClicked(evt);
            }
        });
        jPanel2.add(sbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 310, 30));

        ayearbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Y1", "Y2", "Y3", "Y4" }));
        jPanel2.add(ayearbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 310, 30));
        jPanel2.add(sgnspinn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 70, 310, 30));

        gnspinn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gnspinnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gnspinnMousePressed(evt);
            }
        });
        gnspinn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gnspinnKeyPressed(evt);
            }
        });
        jPanel2.add(gnspinn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 310, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Academic Year");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 190, 40));

        idbox.setForeground(new java.awt.Color(255, 255, 255));
        idbox.setText("id");
        jPanel2.add(idbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 30));

        gidtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(gidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 130, 310, 30));

        sgidtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(sgidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 200, 310, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 1620, 400));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 940, 150, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 940, 150, 50));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Update");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 940, 150, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Search");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 90, 40));

        searchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtActionPerformed(evt);
            }
        });
        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
        jPanel1.add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 240, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 940, 150, 50));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("Next");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 940, 140, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1930, 1030));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        clear();
        
        tableload();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pboxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        update ();
        
         clear();
        
         tableload();
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
        int check = JOptionPane.showConfirmDialog(null,"do you realy want to delete this !!" );
        
        
        if(check == 0){
            
            String id =idbox.getText();
            
            try {
                
                String sql ="DELETE from studentgroup WHERE id ='"+id+"'";
                pst =conn.prepareStatement(sql);
                pst.execute();
                
                JOptionPane.showMessageDialog(null,"Deleted");
                
                
            } catch (Exception e) {
                
                
                
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        
        
         clear();
        
        tableload();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        
        
        tabledata();
    }//GEN-LAST:event_tb1MouseClicked

    private void tb1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb1KeyReleased
        
         tabledata();
       
    }//GEN-LAST:event_tb1KeyReleased

    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtActionPerformed

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
        
        search();
        
    }//GEN-LAST:event_searchtxtKeyReleased

    private void sboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sboxMouseClicked
       
        
         
        String AcademicYear =  ayearbox.getSelectedItem().toString();
        
        if(AcademicYear.equals("Select")){
            
            JOptionPane.showMessageDialog(null,"please select the correct value for the Academic Year ");
            
            
        }
        
        
        
    }//GEN-LAST:event_sboxMouseClicked

    private void pboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pboxMouseClicked
        
      
        String Semester = sbox.getSelectedItem().toString();
        
        if(Semester.equals("Select")){
            
            JOptionPane.showMessageDialog(null,"please select the correct value for the Semester ");
            
            
        }
        
        
    }//GEN-LAST:event_pboxMouseClicked

    private void gnspinnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gnspinnMouseClicked
       
        
     
        
        
    }//GEN-LAST:event_gnspinnMouseClicked

    private void gnspinnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gnspinnMousePressed
      
        
        
        
        
        
    }//GEN-LAST:event_gnspinnMousePressed

    private void gnspinnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gnspinnKeyPressed
        
        
          
        
        
        
    }//GEN-LAST:event_gnspinnKeyPressed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        
        
        notnull();
        
        
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        
        
        notnull();
        
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        this.toBack();
        setVisible(false);
        new AddStudentGroup().toFront();
        new AddStudentGroup().setState(java.awt.Frame.NORMAL);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        this.toBack();
        ManageTag newFrame = new ManageTag();
        newFrame.setVisible(true);
        newFrame.toFront();
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageStudentGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStudentGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStudentGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudentGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStudentGroup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ayearbox;
    private javax.swing.JLabel gidtxt;
    private javax.swing.JSpinner gnspinn;
    private javax.swing.JLabel idbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> pbox;
    private javax.swing.JComboBox<String> sbox;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JLabel sgidtxt;
    private javax.swing.JSpinner sgnspinn;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}

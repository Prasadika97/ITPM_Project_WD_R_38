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
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class subjectmanege extends javax.swing.JFrame {

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;  
    
    public subjectmanege() {
        initComponents();
        conn = DBconnect.connect();
        tableload ();
        
    }

    public void tableload (){
    
        try {
            
            String sql = "SELECT id,lecname,subname,subcode,offerdyear,offerdsem,lechours,tutohours,labhours,evhours FROM subject2";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table4.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    public void tabledata(){
        int r  = table4.getSelectedRow();
        
        String ID = table4.getValueAt(r, 0).toString();
        String lecturename = table4.getValueAt(r, 1).toString();
        String subjectname = table4.getValueAt(r, 2).toString();
        String subjetcode = table4.getValueAt(r, 3).toString();
        String offyear = table4.getValueAt(r, 4).toString();
        String offsem = table4.getValueAt(r, 5).toString();
        String lecturehours = table4.getValueAt(r, 6).toString();
        String tutorialhours = table4.getValueAt(r, 7).toString();
        String lhours = table4.getValueAt(r, 8).toString();
        String evaulationhours = table4.getValueAt(r, 9).toString();
        
        idbox.setText(ID);
        namebox4.setText(lecturename);
        subjectbox.setText(subjectname);
        subjectcodebox.setText(subjetcode);
        offbox.setText(offyear);
        offsembox.setText(offsem);
        numlecbox.setText(lecturehours);
        numtutobox.setText(tutorialhours);
        numlabbox.setText( lhours );
        numevbox.setText(evaulationhours);
    
    
    }
    
    public void update(){
        
        String ID = idbox.getText();
        String lname = namebox4.getText();
        String sname = subjectbox.getText();
        String scode = subjectcodebox.getText();
        String ofyear = offbox.getText();
        String ofsem = offsembox.getText();
        String lhours = numlecbox.getText();
        String thours = numtutobox.getText();
        String lbhours = numlabbox.getText();
        String ehours = numevbox.getText();
        
        try {
            String sql = "UPDATE subject2 SET lecname='"+lname+"',subname='"+sname+"',subcode='"+scode+"',offerdyear='"+ofyear+"',offerdsem='"+ofsem+"',lechours='"+lhours+"',tutohours='"+thours+"',labhours='"+lbhours+"',evhours='"+ehours+"' WHERE id='"+ID+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "can't Updated");
        }
    }
    
      public void clear(){
        idbox.setText("ID");
        namebox4.setText("");
        subjectbox.setText("");
        subjectcodebox.setText("");
        offbox.setText("");
        offsembox.setText("");
        numlecbox.setText("");
        numtutobox.setText("");
        numlabbox.setText("");
        numevbox.setText("");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        namebox4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sname1 = new javax.swing.JTextField();
        subjectbox = new javax.swing.JTextField();
        subjectcodebox = new javax.swing.JTextField();
        offbox = new javax.swing.JTextField();
        offsembox = new javax.swing.JTextField();
        numlecbox = new javax.swing.JTextField();
        numtutobox = new javax.swing.JTextField();
        numlabbox = new javax.swing.JTextField();
        numevbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        evspin2 = new javax.swing.JLabel();
        lbspin2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        del4but = new javax.swing.JButton();
        clbut4 = new javax.swing.JButton();
        upbut4 = new javax.swing.JButton();
        ref4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        idbox = new javax.swing.JLabel();
        backbut2 = new javax.swing.JButton();
        n5but = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 0, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Manege Subject");
        jPanel3.add(jLabel1);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 90));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table4MouseClicked(evt);
            }
        });
        table4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table4KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table4);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1330, 240));

        jPanel2.setBackground(new java.awt.Color(102, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namebox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namebox4ActionPerformed(evt);
            }
        });
        jPanel2.add(namebox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 320, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Lecturer Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 30));

        sname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sname1ActionPerformed(evt);
            }
        });
        jPanel2.add(sname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 320, 40));
        jPanel2.add(subjectbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 320, 40));
        jPanel2.add(subjectcodebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 320, 40));
        jPanel2.add(offbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 320, 40));
        jPanel2.add(offsembox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 302, 320, 50));
        jPanel2.add(numlecbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 110, 40));
        jPanel2.add(numtutobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 110, 40));
        jPanel2.add(numlabbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, 110, 40));
        jPanel2.add(numevbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 110, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Offerd Semester");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 312, 170, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Subject code");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Offerd Year");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Subject Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 30));

        evspin2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        evspin2.setText("Number of Evaluation Hours");
        jPanel2.add(evspin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 230, 40));

        lbspin2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbspin2.setText("Number of Lab Hours");
        jPanel2.add(lbspin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 220, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Number of Tutorial Hours");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 220, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Number of lecturer Hours");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 220, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 1150, 380));

        del4but.setBackground(new java.awt.Color(204, 0, 51));
        del4but.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        del4but.setText("Delete");
        del4but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del4butActionPerformed(evt);
            }
        });
        jPanel1.add(del4but, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 100, 40));

        clbut4.setBackground(new java.awt.Color(255, 255, 0));
        clbut4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clbut4.setText("Clear");
        clbut4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clbut4ActionPerformed(evt);
            }
        });
        jPanel1.add(clbut4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 100, 40));

        upbut4.setBackground(new java.awt.Color(204, 0, 204));
        upbut4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        upbut4.setText("Update");
        upbut4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upbut4ActionPerformed(evt);
            }
        });
        jPanel1.add(upbut4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 100, 40));

        ref4.setBackground(new java.awt.Color(153, 153, 0));
        ref4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ref4.setText("Refresh");
        ref4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref4ActionPerformed(evt);
            }
        });
        jPanel1.add(ref4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 110, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        idbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idbox.setText("ID");
        jPanel1.add(idbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 30, -1));

        backbut2.setBackground(new java.awt.Color(255, 204, 204));
        backbut2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backbut2.setText("Back");
        backbut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbut2ActionPerformed(evt);
            }
        });
        jPanel1.add(backbut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 40));

        n5but.setBackground(new java.awt.Color(255, 204, 204));
        n5but.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n5but.setText("Next");
        n5but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5butActionPerformed(evt);
            }
        });
        jPanel1.add(n5but, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 350, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namebox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namebox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namebox4ActionPerformed

    private void sname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sname1ActionPerformed

    private void ref4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref4ActionPerformed
        tableload();
    }//GEN-LAST:event_ref4ActionPerformed

    private void table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table4MouseClicked
        tabledata();
    }//GEN-LAST:event_table4MouseClicked

    private void table4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table4KeyReleased
        tabledata();
    }//GEN-LAST:event_table4KeyReleased

    private void upbut4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upbut4ActionPerformed
        update();
        
    }//GEN-LAST:event_upbut4ActionPerformed

    private void del4butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del4butActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "do you want to delete");
        
        if(check==0){
            
            String id = idbox.getText();
            
            try {
                
                String sql = "DELETE  FROM subject2 WHERE id='"+id+"'";
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted!");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "can't delete");
            }
        
        }
        tableload();
    }//GEN-LAST:event_del4butActionPerformed

    private void clbut4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clbut4ActionPerformed
        clear();
    }//GEN-LAST:event_clbut4ActionPerformed

    private void backbut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbut2ActionPerformed
        
        this.toBack();
        setVisible(false);
        new subject().toFront();
        new subject().setState(java.awt.Frame.NORMAL);
        
    }//GEN-LAST:event_backbut2ActionPerformed

    private void n5butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5butActionPerformed
      
         this.toBack();
        AddStudentGroup newFrame = new AddStudentGroup();
        newFrame.setVisible(true);
        newFrame.toFront();
        
        
    }//GEN-LAST:event_n5butActionPerformed

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
            java.util.logging.Logger.getLogger(subjectmanege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subjectmanege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subjectmanege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subjectmanege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subjectmanege().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbut2;
    private javax.swing.JButton clbut4;
    private javax.swing.JButton del4but;
    private javax.swing.JLabel evspin2;
    private javax.swing.JLabel idbox;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbspin2;
    private javax.swing.JButton n5but;
    private javax.swing.JTextField namebox4;
    private javax.swing.JTextField numevbox;
    private javax.swing.JTextField numlabbox;
    private javax.swing.JTextField numlecbox;
    private javax.swing.JTextField numtutobox;
    private javax.swing.JTextField offbox;
    private javax.swing.JTextField offsembox;
    private javax.swing.JButton ref4;
    private javax.swing.JTextField sname1;
    private javax.swing.JTextField subjectbox;
    private javax.swing.JTextField subjectcodebox;
    private javax.swing.JTable table4;
    private javax.swing.JButton upbut4;
    // End of variables declaration//GEN-END:variables
}

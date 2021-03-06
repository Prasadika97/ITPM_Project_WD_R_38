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

/**
 *
 * @author user
 */
public class managesession extends javax.swing.JFrame {

    Connection conn = null;
    java.sql.PreparedStatement pst = null;
    ResultSet rs = null;    
    
    public managesession() {
        initComponents();
           conn = DBconnect.connect();
           tableload();
    }
    
    public void tableload(){
    
        try {
            String sql = "SELECT ID,lec1 AS LECTURE1,lec2 AS LECTURE2,subcode AS SUBJECTCODE,subname AS SUBJECTNAME,grpid AS GROUPNUMBER,lectag AS LECTURETAG,student AS NUMBEROFSTUDENT FROM manegesession";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table3.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }
    public void tabledata(){
        int r  = table3.getSelectedRow();
        
        String id = table3.getValueAt(r, 0).toString();
        String lec1name = table3.getValueAt(r, 1).toString();
        String lec2name = table3.getValueAt(r, 2).toString();
        String scode = table3.getValueAt(r, 3).toString();
        String subject = table3.getValueAt(r, 4).toString();
        String group = table3.getValueAt(r, 5).toString();
        String letag = table3.getValueAt(r, 6).toString();
        String nostudent = table3.getValueAt(r, 7).toString();
        
        idbox.setText(id);
        lectext.setText(lec1name);
        lecbox.setSelectedItem(lec2name);
        lectag.setSelectedItem(letag);
        grbox.setSelectedItem(group);
        subbox.setSelectedItem(subject);
        numbox.setText(nostudent);
        subcode.setText(scode);
        
        
    }
    
    public void search(){
        String srch = searchbox.getText();
        
        
      
        
        try {
            
            String sql = "SELECT * FROM manegesession WHERE lec1 LIKE'%"+srch+"%' OR ID LIKE '%"+srch+"%'";
              pst = (PreparedStatement) conn.prepareStatement(sql);
              rs = pst.executeQuery();
              table3.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
        
       
    
    

    
    }
    
    public void  update(){
    
        String id = idbox.getText();
        String lec1name = lectext.getText();
        String lec2name = lecbox.getSelectedItem().toString();
        String letag = lectag.getSelectedItem().toString();
        String group = grbox.getSelectedItem().toString();
        String subject = subbox.getSelectedItem().toString();
        String scode = subcode.getText();
        String nostudent = numbox.getText();
        
        
        try {
            String sql = "UPDATE manegesession SET lec1='"+lec1name+"',lec2='"+lec2name+"',lectag='"+letag+"',grpid='"+group+"',subname='"+subject+"',subcode='"+scode+"',student='"+nostudent+"' WHERE ID='"+id+"'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Un complte!");
        }
    
    }
    
    public void clear(){
    
        searchbox.setText(null);
        idbox.setText("ID");
        lectext.setText("");
        lecbox.setSelectedIndex(0);
        lectag.setSelectedIndex(0);
        grbox.setSelectedIndex(0);
        subbox.setSelectedIndex(0);
        numbox.setText("");
        subcode.setText("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        refbut = new javax.swing.JButton();
        delbut6 = new javax.swing.JButton();
        upbut6 = new javax.swing.JButton();
        viewbut = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        searchbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lectext = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lecbox = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        lectag = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        grbox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        subbox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        numbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        subcode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idbox = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lecbox1 = new javax.swing.JComboBox();
        lecbox2 = new javax.swing.JComboBox();
        clbut = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Lecturer1", "Lecturer 2", "Subject code", "Subject name", "Group ID", "Lecturer tag"
            }
        ));
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        table3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table3KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 1290, 260));

        refbut.setBackground(new java.awt.Color(255, 0, 255));
        refbut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refbut.setText("Refresh");
        refbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refbutActionPerformed(evt);
            }
        });
        jPanel1.add(refbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 120, 150, 30));

        delbut6.setBackground(new java.awt.Color(255, 51, 51));
        delbut6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delbut6.setText("Delete");
        delbut6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbut6ActionPerformed(evt);
            }
        });
        jPanel1.add(delbut6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 730, 110, 40));

        upbut6.setBackground(new java.awt.Color(0, 153, 102));
        upbut6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        upbut6.setText("Update");
        upbut6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upbut6ActionPerformed(evt);
            }
        });
        jPanel1.add(upbut6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 730, 90, 40));

        viewbut.setBackground(new java.awt.Color(255, 153, 0));
        viewbut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewbut.setText("View");
        viewbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbutActionPerformed(evt);
            }
        });
        jPanel1.add(viewbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, 100, 40));

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });
        jPanel3.add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 390, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Search");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 440, 80));

        lectext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectextActionPerformed(evt);
            }
        });
        jPanel1.add(lectext, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 300, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Select lecturer(s)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 190, -1));

        lecbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lecbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "kumara", "kamal", "nimal", "aruna", "upul", "susantha", "nadishani", "oshadi" }));
        lecbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecboxActionPerformed(evt);
            }
        });
        jPanel1.add(lecbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, 310, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Select lecturer2(s)");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 170, 30));

        lectag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lectag.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "lecturer ", "assistent", "co-lecturere", "profeceor", "instructor" }));
        lectag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectagActionPerformed(evt);
            }
        });
        jPanel1.add(lectag, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 690, 310, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText(" Select tag");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 110, 30));

        jLabel8.setBackground(new java.awt.Color(255, 0, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Select lectures & tag");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 250, -1));

        grbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(grbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 290, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Select group");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 140, -1));

        subbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Introduction programming", "Object orinted concept", "Object orinted programming", "Data system", "Network Design model", "Data structure and algorithem", " " }));
        jPanel1.add(subbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, 290, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Select subject");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 160, 30));

        numbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numboxActionPerformed(evt);
            }
        });
        jPanel1.add(numbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 290, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("No of student");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 110, 30));
        jPanel1.add(subcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 670, 290, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Subject code");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 110, -1));

        jTextField1.setBackground(new java.awt.Color(51, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 51, 51));
        jTextField1.setText("                                                   Manage Session ");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 100));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Select group & subject");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, 280, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, -1));

        idbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idbox.setText("ID");
        jPanel1.add(idbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 580, 310));

        jPanel4.setBackground(new java.awt.Color(204, 0, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 550, 260));

        lecbox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lecbox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "kumara", "kamal", "nimal", "aruna", "upul", "susantha", "nadishani", "oshadi" }));
        lecbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecbox1ActionPerformed(evt);
            }
        });
        jPanel1.add(lecbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, 310, 40));

        lecbox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lecbox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "kumara", "kamal", "nimal", "aruna", "upul", "susantha", "nadishani", "oshadi" }));
        lecbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecbox2ActionPerformed(evt);
            }
        });
        jPanel1.add(lecbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, 310, 40));

        clbut.setBackground(new java.awt.Color(255, 153, 51));
        clbut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clbut.setText("Clear");
        clbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clbutActionPerformed(evt);
            }
        });
        jPanel1.add(clbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 730, 120, 40));

        back1.setBackground(new java.awt.Color(255, 204, 204));
        back1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back1.setText("Back");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        jPanel1.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 730, 110, 40));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 730, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void upbut6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upbut6ActionPerformed
         update();
    }//GEN-LAST:event_upbut6ActionPerformed

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboxActionPerformed

    private void refbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refbutActionPerformed
        tableload();
    }//GEN-LAST:event_refbutActionPerformed

    private void lectextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lectextActionPerformed

    private void numboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numboxActionPerformed

    private void lectagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lectagActionPerformed

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
        tabledata();
    }//GEN-LAST:event_table3MouseClicked

    private void table3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table3KeyReleased
        tabledata();
    }//GEN-LAST:event_table3KeyReleased

    private void lecboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecboxActionPerformed

    private void viewbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewbutActionPerformed

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        search();
    }//GEN-LAST:event_searchboxKeyReleased

    private void lecbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecbox1ActionPerformed

    private void lecbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecbox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecbox2ActionPerformed

    private void delbut6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbut6ActionPerformed
       
        int check = JOptionPane.showConfirmDialog(null, " do you want to delete this");
        
        
        if (check==0){
            
            String id = idbox.getText();
            
            try {
                String sql = "DELETE FROM manegesession WHERE ID='"+id+"' ";
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "DELETED!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "you can't delete this !");
            }
        }
        clear();
    }//GEN-LAST:event_delbut6ActionPerformed

    private void clbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clbutActionPerformed
        // TODO add your handling code here:
         clear();
    }//GEN-LAST:event_clbutActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
      
        this.toBack();
        setVisible(false);
        new addsession2().toFront();
        new addsession2().setState(java.awt.Frame.NORMAL);
        
    }//GEN-LAST:event_back1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.toBack();
        ManageSessions newFrame = new ManageSessions();
        newFrame.setVisible(true);
        newFrame.toFront();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(managesession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managesession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managesession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managesession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managesession().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JButton clbut;
    private javax.swing.JButton delbut6;
    private javax.swing.JComboBox grbox;
    private javax.swing.JLabel idbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox lecbox;
    private javax.swing.JComboBox lecbox1;
    private javax.swing.JComboBox lecbox2;
    private javax.swing.JComboBox lectag;
    private javax.swing.JTextField lectext;
    private javax.swing.JTextField numbox;
    private javax.swing.JButton refbut;
    private javax.swing.JTextField searchbox;
    private javax.swing.JComboBox subbox;
    private javax.swing.JTextField subcode;
    private javax.swing.JTable table3;
    private javax.swing.JButton upbut6;
    private javax.swing.JButton viewbut;
    // End of variables declaration//GEN-END:variables
}

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

/**
 *
 * @author Duvindu
 */
public class AddStudentGroup extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    
    
    public AddStudentGroup() {
        initComponents();
        
        conn = DBconnect.connect();
    }

  
    
    public void clear(){
        
        
        yearcombobox.setSelectedIndex(0);
        semcombobox.setSelectedIndex(0);
        procombobox.setSelectedIndex(0);
        gnumSpinner.setValue(0);
        sgnumSpinner.setValue(0);        
        gidtxtbox.setText("");
        sgidtxtbox.setText("");
      
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        yearcombobox = new javax.swing.JComboBox<>();
        semcombobox = new javax.swing.JComboBox<>();
        procombobox = new javax.swing.JComboBox<>();
        sgnumSpinner = new javax.swing.JSpinner();
        gnumSpinner = new javax.swing.JSpinner();
        gidtxtbox = new javax.swing.JLabel();
        sgidtxtbox = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idsbtn = new javax.swing.JButton();
        clearbutn = new javax.swing.JButton();
        savebutn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1302, 683));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText(" Sub GroupID");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 220, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Semester");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 270, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Academic Year");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 270, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Programe");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 270, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Group Number");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 270, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Generate IDs");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 200, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Group ID");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, 120, 40));

        yearcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Y1", "Y2", "Y3", "Y4" }));
        yearcombobox.setToolTipText("Select the Academic Year");
        yearcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearcomboboxActionPerformed(evt);
            }
        });
        jPanel4.add(yearcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 310, 30));

        semcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "S1", "S2" }));
        semcombobox.setToolTipText("Select the semester");
        semcombobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semcomboboxMouseClicked(evt);
            }
        });
        semcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semcomboboxActionPerformed(evt);
            }
        });
        jPanel4.add(semcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 310, 30));

        procombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "IT", "CSSE", "CSE", "IM" }));
        procombobox.setToolTipText("Select the Programe");
        procombobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                procomboboxMouseClicked(evt);
            }
        });
        procombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procomboboxActionPerformed(evt);
            }
        });
        jPanel4.add(procombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 310, 30));

        sgnumSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel4.add(sgnumSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 310, 30));

        gnumSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        gnumSpinner.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                gnumSpinnerCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                gnumSpinnerInputMethodTextChanged(evt);
            }
        });
        jPanel4.add(gnumSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 310, 30));

        gidtxtbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(gidtxtbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 150, 310, 30));

        sgidtxtbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(sgidtxtbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 220, 310, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Sub Group Number");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 270, 40));

        idsbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        idsbtn.setText("Generate IDs");
        idsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsbtnActionPerformed(evt);
            }
        });
        jPanel4.add(idsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 320, 50));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 1730, 680));

        clearbutn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clearbutn.setText("Clear");
        clearbutn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbutnActionPerformed(evt);
            }
        });
        jPanel3.add(clearbutn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 930, 190, 50));

        savebutn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        savebutn.setText("Save");
        savebutn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebutnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savebutnMouseEntered(evt);
            }
        });
        savebutn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebutnActionPerformed(evt);
            }
        });
        jPanel3.add(savebutn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 930, 190, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1950, 10));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setText("Add Student Group");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 530, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2170, 1030));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearbutnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbutnActionPerformed
        
        
        clear();
        
        
    }//GEN-LAST:event_clearbutnActionPerformed

    private void semcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semcomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semcomboboxActionPerformed

    private void yearcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearcomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearcomboboxActionPerformed

    private void procomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procomboboxActionPerformed

    private void savebutnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebutnActionPerformed
        
        
        String AcademicYear;
        String Semester;
        String Programe;
        int GroupNumber;
        int SubGroupNumber;
        String GroupID;
        String SubGroupID;
        
        AcademicYear = (String) yearcombobox.getSelectedItem();
        Semester = (String)semcombobox.getSelectedItem();
        Programe = (String)procombobox.getSelectedItem();
        GroupNumber =(Integer)gnumSpinner.getValue();
        SubGroupNumber =(Integer)sgnumSpinner.getValue();
        GroupID = gidtxtbox.getText();
        SubGroupID = sgidtxtbox.getText();
        
         int check = JOptionPane.showConfirmDialog(null,"do you realy want to Save this !!" );
        
        
        if(check == 0){
        try {
            
            String sql = "INSERT INTO studentgroup(AcademicYear,Semester,Programe,GroupNumber,SubGroupNumber,GroupID,SubGroupID)VALUES('"+AcademicYear+"','"+Semester+"','"+Programe+"','"+GroupNumber+"','"+SubGroupNumber+"','"+GroupID+"','"+SubGroupID+"')";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data saved");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
            
            
         
     
        
        }
        
        
        
        
    }//GEN-LAST:event_savebutnActionPerformed
                    clear();
                    
              
           
  }
    
    
    
    
    private void idsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsbtnActionPerformed
            
        
              
        String AcademicYear;
        String Semester;
        String Programe;
        int GroupNumber;
        int SubGroupNumber;
        String GroupID;
        String SubGroupID;
        
        AcademicYear = (String) yearcombobox.getSelectedItem();
        Semester = (String)semcombobox.getSelectedItem();
        Programe = (String)procombobox.getSelectedItem();
        GroupNumber =(Integer)gnumSpinner.getValue();
        SubGroupNumber =(Integer)sgnumSpinner.getValue();
        gidtxtbox.setText(AcademicYear+"."+Semester+"."+Programe+"."+GroupNumber);
        sgidtxtbox.setText(AcademicYear+"."+Semester+"."+Programe+"."+GroupNumber+"."+SubGroupNumber);
        
        
        
        
    }//GEN-LAST:event_idsbtnActionPerformed

    private void semcomboboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semcomboboxMouseClicked
       
        
            
        String AcademicYear =  yearcombobox.getSelectedItem().toString();
        
        if(AcademicYear.equals("Select")){
            
            JOptionPane.showMessageDialog(null,"please select the correct value for the Academic Year ");
            
            
        }
        
        
    }//GEN-LAST:event_semcomboboxMouseClicked

    private void procomboboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procomboboxMouseClicked
       
        
           String Semester =  semcombobox.getSelectedItem().toString();
        
        if(Semester.equals("Select")){
            
            JOptionPane.showMessageDialog(null,"please select the correct value for the Semester  ");
            
            
        }
        
        
        
    }//GEN-LAST:event_procomboboxMouseClicked

    private void gnumSpinnerCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_gnumSpinnerCaretPositionChanged
        
        
        
        
       
        
        
        
    }//GEN-LAST:event_gnumSpinnerCaretPositionChanged

    private void gnumSpinnerInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_gnumSpinnerInputMethodTextChanged
       
        
        
         
           String Programe =  procombobox.getSelectedItem().toString();
        
        if(Programe.equals("Select")){
            
            JOptionPane.showMessageDialog(null,"please select the correct value for the Programe  ");
            
            
        }
        
        
    }//GEN-LAST:event_gnumSpinnerInputMethodTextChanged

    private void savebutnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebutnMouseClicked
       
        
        
       
    }//GEN-LAST:event_savebutnMouseClicked

    private void savebutnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebutnMouseEntered
       
        
        
         String AcademicYear;
        String Semester;
        String Programe;
        int GroupNumber;
        int SubGroupNumber;
        String GroupID;
        String SubGroupID;
        
        AcademicYear = (String) yearcombobox.getSelectedItem();
        Semester = (String)semcombobox.getSelectedItem();
        Programe = (String)procombobox.getSelectedItem();
        GroupNumber =(Integer)gnumSpinner.getValue();
        SubGroupNumber =(Integer)sgnumSpinner.getValue();
        GroupID = gidtxtbox.getText();
        SubGroupID = sgidtxtbox.getText();
        
        
        
          if(AcademicYear.equals("Select") || Semester.equals("Select") || Programe.equals("Select") || GroupNumber == 0 || SubGroupNumber == 0 || GroupID.equals(" ")||SubGroupID.equals("") ){
            
            JOptionPane.showMessageDialog(null," please enter valid data");
            
            
        }
        
        
    }//GEN-LAST:event_savebutnMouseEntered

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
            java.util.logging.Logger.getLogger(AddStudentGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudentGroup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbutn;
    private javax.swing.JLabel gidtxtbox;
    private javax.swing.JSpinner gnumSpinner;
    private javax.swing.JButton idsbtn;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> procombobox;
    private javax.swing.JButton savebutn;
    private javax.swing.JComboBox<String> semcombobox;
    private javax.swing.JLabel sgidtxtbox;
    private javax.swing.JSpinner sgnumSpinner;
    private javax.swing.JComboBox<String> yearcombobox;
    // End of variables declaration//GEN-END:variables
}

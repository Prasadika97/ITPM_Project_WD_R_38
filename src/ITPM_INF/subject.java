
package ITPM_INF;

import ITPM_INF.lecturermanege;
import ITPM_codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class subject extends javax.swing.JFrame {

    Connection conn = null;
     PreparedStatement pst = null;
     ResultSet rs = null;
   
   
    
    public subject() {
        initComponents();
        conn = DBconnect.connect();
        
         
    }
    
        public void clear(){
    
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        s3but = new javax.swing.JButton();
        cl3but = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
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
        n1but = new javax.swing.JButton();
        bbut1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1302, 683));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Add Subject");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 210, -1));

        s3but.setBackground(new java.awt.Color(0, 255, 51));
        s3but.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s3but.setText("Save");
        s3but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3butActionPerformed(evt);
            }
        });
        jPanel1.add(s3but, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 590, -1, -1));

        cl3but.setBackground(new java.awt.Color(255, 51, 51));
        cl3but.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cl3but.setText("Clear");
        cl3but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cl3butActionPerformed(evt);
            }
        });
        jPanel1.add(cl3but, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1290, 100));

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
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 170, -1));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 1290, 400));

        n1but.setBackground(new java.awt.Color(51, 0, 153));
        n1but.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n1but.setText("Next");
        n1but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1butActionPerformed(evt);
            }
        });
        jPanel1.add(n1but, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 590, 170, 40));

        bbut1.setBackground(new java.awt.Color(153, 255, 102));
        bbut1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bbut1.setText("Back");
        bbut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbut1ActionPerformed(evt);
            }
        });
        jPanel1.add(bbut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s3butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3butActionPerformed
   
        
        
        String lecturename;
        String subjectname;
        String subjectcode;
        int offyear;
        String offsem;
        int lecturehours;
        int tutorialhours;
        int lhours;
        int evalutionhours;
        
        lecturename = namebox4.getText();
        subjectname = subjectbox.getText();
        subjectcode = subjectcodebox.getText();
        offyear = Integer.parseInt(offbox.getText());
        offsem = offsembox.getText();
        lecturehours = Integer.parseInt(numlecbox.getText());
        tutorialhours = Integer.parseInt(numtutobox.getText());
        lhours = Integer.parseInt(numlabbox.getText());
        evalutionhours = Integer.parseInt(numevbox.getText());

        try {
            String sql = "INSERT INTO subject2 (lecname,subname,subcode,offerdyear,offerdsem,lechours,tutohours,labhours,evhours)VALUES('"+lecturename+"','"+subjectname+"','"+subjectcode+"','"+offyear+"','"+offsem+"','"+lecturehours+"','"+tutorialhours+"','"+lhours+"','"+evalutionhours+"')";
            pst = conn.prepareStatement(sql);
            pst.execute();
           JOptionPane.showMessageDialog(null, "successes!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_s3butActionPerformed

    private void cl3butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cl3butActionPerformed
        clear();
    }//GEN-LAST:event_cl3butActionPerformed

    private void namebox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namebox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namebox4ActionPerformed

    private void sname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sname1ActionPerformed

    private void n1butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1butActionPerformed
      
        this.toBack();
        subjectmanege newFrame = new subjectmanege();
        newFrame.setVisible(true);
        newFrame.toFront();
        
        
    }//GEN-LAST:event_n1butActionPerformed

    private void bbut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbut1ActionPerformed
        
        this.toBack();
        setVisible(false);
        new lecturermanege().toFront();
        new lecturermanege().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_bbut1ActionPerformed

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
            java.util.logging.Logger.getLogger(subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbut1;
    private javax.swing.JButton cl3but;
    private javax.swing.JLabel evspin2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbspin2;
    private javax.swing.JButton n1but;
    private javax.swing.JTextField namebox4;
    private javax.swing.JTextField numevbox;
    private javax.swing.JTextField numlabbox;
    private javax.swing.JTextField numlecbox;
    private javax.swing.JTextField numtutobox;
    private javax.swing.JTextField offbox;
    private javax.swing.JTextField offsembox;
    private javax.swing.JButton s3but;
    private javax.swing.JTextField sname1;
    private javax.swing.JTextField subjectbox;
    private javax.swing.JTextField subjectcodebox;
    // End of variables declaration//GEN-END:variables
}

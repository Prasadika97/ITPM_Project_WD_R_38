
package member2ineterface;

import codetest.dbconnect1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;




public class lecturer extends javax.swing.JFrame {
     Connection conn1 = null;
     PreparedStatement pst = null;
     ResultSet rs = null;
     
    public lecturer() {
        initComponents();
        conn1 = dbconnect1.connect1();
       
      
    }
    public void clear(){
    
        lecname.setText("");
        empidbox.setText("");
        facbox.setSelectedIndex(0);
        depbox.setSelectedIndex(0);
        cenbox.setSelectedIndex(0);
        builbox.setSelectedIndex(0);
        levbox.setSelectedIndex(0);
        rankbox.setText("");
        
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
        sbut = new javax.swing.JButton();
        clbut = new javax.swing.JButton();
        genbut = new javax.swing.JButton();
        rankbox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        levbox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        builbox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cenbox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        depbox = new javax.swing.JComboBox();
        facbox = new javax.swing.JComboBox();
        empidbox = new javax.swing.JTextField();
        lecname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        xbut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1302, 683));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sbut.setBackground(new java.awt.Color(0, 51, 204));
        sbut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sbut.setText("Save");
        sbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbutActionPerformed(evt);
            }
        });
        jPanel1.add(sbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 100, 40));

        clbut.setBackground(new java.awt.Color(255, 51, 51));
        clbut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clbut.setText("Clear");
        clbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clbutActionPerformed(evt);
            }
        });
        jPanel1.add(clbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 110, 40));

        genbut.setBackground(new java.awt.Color(102, 255, 0));
        genbut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genbut.setText("Genarate Rank");
        genbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genbutActionPerformed(evt);
            }
        });
        jPanel1.add(genbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 210, 40));

        rankbox.setToolTipText("enter the rank");
        rankbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankboxActionPerformed(evt);
            }
        });
        jPanel1.add(rankbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, 270, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Rank");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 80, -1));

        levbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "1", "2", "3", "4", "5" }));
        levbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levboxActionPerformed(evt);
            }
        });
        jPanel1.add(levbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, 260, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Level");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 70, -1));

        builbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "B502", "A301", "E201", "B302" }));
        jPanel1.add(builbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 260, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Building");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 80, -1));

        cenbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "Malabe", "Kandy", "Mathara", "Kurunagala", "Jaffna" }));
        cenbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenboxActionPerformed(evt);
            }
        });
        jPanel1.add(cenbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, 260, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Center");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 80, -1));

        jLabel1.setBackground(new java.awt.Color(102, 255, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("                  Add lecturer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 600, 60));

        depbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "information technology", "software Engineering", "cyber security", "computersystem and Networking", "Data Science", "interractive Media" }));
        jPanel1.add(depbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 320, 40));

        facbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "computing", "Enginnering", "Humanity and science", "Buisness Manegement" }));
        jPanel1.add(facbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 320, 40));

        empidbox.setToolTipText("enter the id");
        jPanel1.add(empidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 320, 40));

        lecname.setToolTipText("enter the lecturer name");
        lecname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecnameActionPerformed(evt);
            }
        });
        jPanel1.add(lecname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 320, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Department");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Faculty");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 100, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Employee ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Lecturer Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 90));

        jPanel3.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 1230, 370));

        xbut.setBackground(new java.awt.Color(255, 102, 102));
        xbut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xbut.setText("Next");
        xbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xbutActionPerformed(evt);
            }
        });
        jPanel1.add(xbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 510, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbutActionPerformed

      
        
        String lname;
        int eid;
        String fac;
        String dep;
        String cen;
        int buil;
        int lev;
        int rank;
        
        lname = lecname.getText();
        eid = Integer.parseInt(empidbox.getText());
        fac = facbox.getSelectedItem().toString();
        dep = depbox.getSelectedItem().toString();
        cen = cenbox.getSelectedItem().toString();
        buil = Integer.parseInt(builbox.getSelectedItem().toString());
        lev = Integer.parseInt(levbox.getSelectedItem().toString());
        rank = Integer.parseInt(rankbox.getText());
        
        try {
            
            String sql = "INSERT INTO lectrure (name,empid,faculty,department,center,building,level,ran)VALUES ('"+lname+"','"+eid+"','"+fac+"','"+dep+"','"+cen+"','"+buil+"','"+lev+"','"+rank+"')";
            pst = conn1.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Success!");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
                
                
                
       

    }//GEN-LAST:event_sbutActionPerformed

    private void clbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clbutActionPerformed
        clear();
    }//GEN-LAST:event_clbutActionPerformed

    private void genbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genbutActionPerformed
       // String empid = empidbox.getText().toString();

        /* professor 1
        Assitant Professor 2
        Senior Lecturer(HG) 3
        Seniour Lecturer 4
        Lecturer 5
        Assiatant Lecturer 6

        */
       // int lvl =0;

       // if("professor"== levbox.getSelectedItem().toString()){

           // lvl =1;
       // }
       // if("Assistant Professeor"== levbox.getSelectedItem().toString()){
           // lvl=2;
       // }
        //if("Senior Lecturer(HG)"== levbox.getSelectedItem().toString()){
          //  lvl=3;
        //}
       // if("Senior Lecturer"== levbox.getSelectedItem().toString())//{
           // lvl=4;
        //}
       // if("Lecturer"== levbox.getSelectedItem().toString()){
           // lvl=5;
      //  }
        //if("Assistant Lecturer "== levbox.getSelectedItem().toString()){
            //lvl=6;
      //  }
    }//GEN-LAST:event_genbutActionPerformed

    private void rankboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rankboxActionPerformed

    private void levboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levboxActionPerformed

    }//GEN-LAST:event_levboxActionPerformed

    private void cenboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cenboxActionPerformed

    private void lecnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecnameActionPerformed

    private void xbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xbutActionPerformed
        lecturermanege x1 =  new lecturermanege();
        x1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_xbutActionPerformed

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
            java.util.logging.Logger.getLogger(lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox builbox;
    private javax.swing.JComboBox cenbox;
    private javax.swing.JButton clbut;
    private javax.swing.JComboBox depbox;
    private javax.swing.JTextField empidbox;
    private javax.swing.JComboBox facbox;
    private javax.swing.JButton genbut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lecname;
    private javax.swing.JComboBox levbox;
    private javax.swing.JTextField rankbox;
    private javax.swing.JButton sbut;
    private javax.swing.JButton xbut;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Member_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class NotAvailableLocations extends javax.swing.JFrame {

    /**
     * Creates new form WorkingDays
     */
    public NotAvailableLocations() {
        initComponents();
        table_update();
        combobox();
        
    }

    
    Connection con1;
    PreparedStatement pst;
    ResultSet rs;
    
    
     
    //ROOM COMBO BOX
    private  void combobox()
    {    
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/itpm","root","");
            String sql = ("SELECT * FROM `session`");
            pst = con1.prepareStatement(sql);
            rs = pst.executeQuery();
                     
            while(rs.next())
            {
                String room = rs.getString("Room");
                
                txtroom.addItem(room);
                
               
           }
            
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
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
        jLabel2 = new javax.swing.JLabel();
        txtroom = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_not_available_locations = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtday = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtstarttime = new javax.swing.JComboBox<>();
        txtendtime = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Not Available Locations");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setText("Room");

        txtroom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txtroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtroomActionPerformed(evt);
            }
        });

        jTable_not_available_locations.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_not_available_locations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Room", "Day", "Start Time", "End Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_not_available_locations.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable_not_available_locations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_not_available_locationsMouseClicked(evt);
            }
        });
        jTable_not_available_locations.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_not_available_locationsKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_not_available_locations);

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 102, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setText("Day");

        txtday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel7.setText("Start Time");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setText("End Time");

        txtstarttime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "08.30", "09.30", "10.30", "11.30", "12.30", "13.30", "14.30", "15.30", "16.30" }));
        txtstarttime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstarttimeActionPerformed(evt);
            }
        });

        txtendtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "09.30", "10.30", "11.30", "12.30", "13.30", "14.30", "15.30", "16.30", "17.30" }));
        txtendtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtendtimeActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 255, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtroom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtday, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(112, 112, 112)
                                .addComponent(txtstarttime, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(122, 122, 122)
                                .addComponent(txtendtime, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(161, 161, 161))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(357, 357, 357)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtroom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtstarttime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtendtime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtday, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );

        jLabel1.getAccessibleContext().setAccessibleName("                                 Manage Working Days and Hours");

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    //UPDATE TABLE
    private void table_update()
    {
         try {
            
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/itpm","root","");
                String sql = ("select `ID`,`Room`,`Day`,`Start Time`,`End Time` from not_available_locations");
                pst = con1.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                jTable_not_available_locations.setModel(DbUtils.resultSetToTableModel(rs));
               
    
         } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotAvailableLocations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotAvailableLocations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void txtroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtroomActionPerformed

    private void txtstarttimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstarttimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstarttimeActionPerformed

    private void txtendtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtendtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtendtimeActionPerformed

    
    
    //CLEAR BUTTON
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        txtroom.setSelectedIndex(0);
        txtday.setSelectedIndex(0);
        txtstarttime.setSelectedIndex(0);
        txtendtime.setSelectedIndex(0);
            
    }//GEN-LAST:event_jButton5ActionPerformed

    
    
    
    //SAVE BUTTON
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        String room = txtroom.getSelectedItem().toString();
        String day = txtday.getSelectedItem().toString();
        String starttime = txtstarttime.getSelectedItem().toString();
        String endtime = txtendtime.getSelectedItem().toString();
      
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/itpm","root","");
            pst = con1.prepareStatement("INSERT INTO `not_available_locations`(`Room`, `Day`, `Start Time`, `End Time`) VALUES (?,?,?,?)");

            
            pst.setString(1, room);
            pst.setString(2, day);
            pst.setString(3, starttime);
            pst.setString(4, endtime);
            
        
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Not Available Location Saved Successfully");
            table_update();
            
            txtroom.setSelectedIndex(0);
            txtday.setSelectedIndex(0);
            txtstarttime.setSelectedIndex(0);
            txtendtime.setSelectedIndex(0);
                
            txtroom.requestFocus();
            
            
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotAvailableLocations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotAvailableLocations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable_not_available_locationsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_not_available_locationsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_not_available_locationsKeyPressed

    
    //SELECT TABLE AND DISPLAY IN FIELDS
    private void jTable_not_available_locationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_not_available_locationsMouseClicked
        
        DefaultTableModel d1 = (DefaultTableModel)jTable_not_available_locations.getModel();
        int selectIndex = jTable_not_available_locations.getSelectedRow();
        
        txtroom.setSelectedItem(d1.getValueAt(selectIndex, 1).toString());
        txtday.setSelectedItem(d1.getValueAt(selectIndex, 2).toString());
        txtstarttime.setSelectedItem(d1.getValueAt(selectIndex, 3).toString());
        txtendtime.setSelectedItem(d1.getValueAt(selectIndex, 4).toString());
        
    }//GEN-LAST:event_jTable_not_available_locationsMouseClicked

    
    
    
    //UPDATE BUTTON
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        DefaultTableModel d1 = (DefaultTableModel)jTable_not_available_locations.getModel();
        int selectIndex = jTable_not_available_locations.getSelectedRow();
        
        int ID = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());   
        
        
        String room = txtroom.getSelectedItem().toString();
        String day = txtday.getSelectedItem().toString();
        String starttime = txtstarttime.getSelectedItem().toString();
        String endtime = txtendtime.getSelectedItem().toString();
      
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/itpm","root","");
            pst = con1.prepareStatement("UPDATE `not_available_locations` SET `Room`=?,`Day`=?,`Start Time`=?,`End Time`=? WHERE `ID`=?");

            
            pst.setString(1, room);
            pst.setString(2, day);
            pst.setString(3, starttime);
            pst.setString(4, endtime);
            pst.setInt(5, ID);
        
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Not Available Location Updated Successfully");
            table_update();
            
            txtroom.setSelectedIndex(0);
            txtday.setSelectedIndex(0);
            txtstarttime.setSelectedIndex(0);
            txtendtime.setSelectedIndex(0);
                
            txtroom.requestFocus();
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotAvailableLocations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotAvailableLocations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
   
    //DELETE BUTTON
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        DefaultTableModel d1 = (DefaultTableModel)jTable_not_available_locations.getModel();
        int selectIndex = jTable_not_available_locations.getSelectedRow();
        
        int ID = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());  
        
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete Not Available Location","Warning",JOptionPane.YES_NO_OPTION);
      
      if(dialogResult == JOptionPane.YES_OPTION)
      {
          
          try {
             Class.forName("com.mysql.jdbc.Driver");
             con1 = DriverManager.getConnection("jdbc:mysql://localhost/itpm","root","");
             pst = con1.prepareStatement("DELETE FROM `not_available_locations` WHERE `ID`=? ");
             pst.setInt(1, ID);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(this,"Not Available Location Deleted");
            table_update();
            
           
            txtroom.setSelectedIndex(0);
            txtday.setSelectedIndex(0);
            txtstarttime.setSelectedIndex(0);
            txtendtime.setSelectedIndex(0);
          
            txtroom.requestFocus();
            
            
            
          } catch (ClassNotFoundException ex) {
                Logger.getLogger(NotAvailableLocations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(NotAvailableLocations.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    
    //BACK BUTTON
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.toBack();
        setVisible(false);
        new NotAvailableTimes().toFront();
        new NotAvailableTimes().setState(java.awt.Frame.NORMAL);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    //NEXT BUTTON
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        this.toBack();
        TimeTable newFrame = new TimeTable();
        newFrame.setVisible(true);
        newFrame.toFront();
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

      
    
    
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
            java.util.logging.Logger.getLogger(NotAvailableLocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotAvailableLocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotAvailableLocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotAvailableLocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotAvailableLocations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_not_available_locations;
    private javax.swing.JComboBox<String> txtday;
    private javax.swing.JComboBox<String> txtendtime;
    private javax.swing.JComboBox<String> txtroom;
    private javax.swing.JComboBox<String> txtstarttime;
    // End of variables declaration//GEN-END:variables
}

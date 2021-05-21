/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITPM_INF;

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
public class PreferredSessionLocations extends javax.swing.JFrame {

    /**
     * Creates new form WorkingDays
     */
    public PreferredSessionLocations() {
        initComponents();
        table_update();
        combobox();
        combobox1();
        combobox2();
        combobox3();
        combobox4();
    }

    
     Connection conn;
     PreparedStatement pst;
     ResultSet rs;
     
     
     
    //ROOM COMBO BOX
    private  void combobox()
    {    
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn =DriverManager.getConnection("jdbc:sqlite:itpm.db");
            String sql = ("SELECT * FROM `session`");
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
                     
            while(rs.next())
            {
                String preroom = rs.getString("Room");
                
                txtpreroom.addItem(preroom);
                     
            }
            
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
      }
    
    
       
    
    //TAG COMBO BOX
    private  void combobox1()
    {    
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn =DriverManager.getConnection("jdbc:sqlite:itpm.db");
            String sql = ("SELECT * FROM `tag`");
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
                     
            while(rs.next())
            {
                
                String pretag = rs.getString("RelatedTag");
                

                txtpretag.addItem(pretag);
               
            }
            
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        }
            
     
    } 
     
     
      
    //SESSION ID COMBO BOX
    private  void combobox2()
    {    
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn =DriverManager.getConnection("jdbc:sqlite:itpm.db");
            String sql = ("SELECT * FROM `subject2`");
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
                     
            while(rs.next())
            {
                String presessionid = rs.getString("subcode");
                
                txtpresessionID.addItem(presessionid);
                
               
            }
            
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
      }
    
    
    
    //LECTURER COMBO BOX
    private  void combobox3()
    {    
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn =DriverManager.getConnection("jdbc:sqlite:itpm.db");
            String sql = ("SELECT * FROM `lectrure`");
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
                     
            while(rs.next())
            {
                String prelecturer = rs.getString("name");
                
                txtprelecturer.addItem(prelecturer);
                
               
            }
            
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
      }
    
    
    
    //GROUP/SUB GROUP COMBO BOX
    private  void combobox4()
    {    
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn =DriverManager.getConnection("jdbc:sqlite:itpm.db");
            String sql = ("SELECT * FROM `studentgroup`");
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
                     
            while(rs.next())
            {
                String pregroup = rs.getString("GroupID");
                String presubgroup = rs.getString("SubGroupID");
                
                txtpregroup.addItem(pregroup);
                txtpresubgroup.addItem(presubgroup);
               
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
    
    
    //UPDATE TABLE
    private void table_update()
    {
         try {
            
                Class.forName("org.sqlite.JDBC");
                conn =DriverManager.getConnection("jdbc:sqlite:itpm.db");
               String sql = ("select `ID`,`Session ID`,`Lecturer`,`Group`,`Sub Group`,`Tag`,`Room`,`Day`,`Time` from preferred_session_locations");
                pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                jTable_preferred_session_locations.setModel(DbUtils.resultSetToTableModel(rs));
               
    
         } catch (ClassNotFoundException ex) {
            Logger.getLogger(PreferredSessionLocations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PreferredSessionLocations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpresessionID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_preferred_session_locations = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpregroup = new javax.swing.JComboBox<>();
        txtpreday = new javax.swing.JComboBox<>();
        txtpretag = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtprelecturer = new javax.swing.JComboBox<>();
        txtpresubgroup = new javax.swing.JComboBox<>();
        txtpreroom = new javax.swing.JComboBox<>();
        txtpretime = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setBackground(new java.awt.Color(51, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Preferred Session Locations");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setText("Session ID");

        txtpresessionID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txtpresessionID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpresessionIDActionPerformed(evt);
            }
        });

        jTable_preferred_session_locations.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_preferred_session_locations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Session ID", "Lecturer", "Group", "Sub Group", "Tag", "Room", "Day", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_preferred_session_locations.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable_preferred_session_locations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_preferred_session_locationsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_preferred_session_locations);

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
        jLabel3.setText("Group");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setText("Tag");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel5.setText("Day");

        txtpregroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        txtpreday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        txtpreday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpredayActionPerformed(evt);
            }
        });

        txtpretag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setText("Lecturer");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel7.setText("Sub Group");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setText("Room");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel9.setText("Time");

        txtprelecturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txtprelecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprelecturerActionPerformed(evt);
            }
        });

        txtpresubgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txtpresubgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpresubgroupActionPerformed(evt);
            }
        });

        txtpreroom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txtpreroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreroomActionPerformed(evt);
            }
        });

        txtpretime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "08.30 - 09.30", "08.30 - 10.30", "09.30 - 10.30", "09.30 - 11.30", "10.30 - 11.30", "10.30 - 12.30", "11.30 - 12.30", "13.30 - 14.30", "13.30 - 15.30", "14.30 - 15.30", "14.30 - 16.30", "15.30 - 16.30", "15.30 - 17.30", "16.30 - 17.30", " " }));
        txtpretime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpretimeActionPerformed(evt);
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
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jButton4.setText("Back");
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
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtpresessionID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtpregroup, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtpretag, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtpreday, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(215, 215, 215)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(132, 132, 132)
                        .addComponent(txtprelecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtpretime, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(112, 112, 112)
                                .addComponent(txtpresubgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtpreroom, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtpresessionID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpregroup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpretag, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpreday, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtprelecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtpresubgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtpreroom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtpretime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
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

    private void txtpresessionIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpresessionIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpresessionIDActionPerformed

    private void txtpredayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpredayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpredayActionPerformed

    private void txtprelecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprelecturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprelecturerActionPerformed

    private void txtpresubgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpresubgroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpresubgroupActionPerformed

    private void txtpreroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreroomActionPerformed

    private void txtpretimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpretimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpretimeActionPerformed

    
    //CLEAR BUTTON
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        txtpresessionID.setSelectedIndex(0);
        txtprelecturer.setSelectedIndex(0);
        txtpregroup.setSelectedIndex(0);
        txtpresubgroup.setSelectedIndex(0);
        txtpretag.setSelectedIndex(0);
        txtpreroom.setSelectedIndex(0);
        txtpreday.setSelectedIndex(0);
        txtpretime.setSelectedIndex(0);
        
            
    }//GEN-LAST:event_jButton5ActionPerformed

    
    
    
    //SAVE BUTTON
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        
        String presessionid = txtpresessionID.getSelectedItem().toString();
        String prelecturer = txtprelecturer.getSelectedItem().toString();
        String pregroup = txtpregroup.getSelectedItem().toString();
        String presubgroup = txtpresubgroup.getSelectedItem().toString();
        String pretag = txtpretag.getSelectedItem().toString();
        String preroom = txtpreroom.getSelectedItem().toString();
        String preday = txtpreday.getSelectedItem().toString();
        String pretime = txtpretime.getSelectedItem().toString();
        
        
        try {
            
            Class.forName("org.sqlite.JDBC");
            conn =DriverManager.getConnection("jdbc:sqlite:itpm.db");
            pst = conn.prepareStatement("INSERT INTO `preferred_session_locations`(`Session ID`, `Lecturer`, `Group`, `Sub Group`, `Tag`, `Room`, `Day`, `Time`) VALUES (?,?,?,?,?,?,?,?)");

            
            pst.setString(1, presessionid);
            pst.setString(2, prelecturer);
            pst.setString(3, pregroup);
            pst.setString(4, presubgroup);
            pst.setString(5, pretag);
            pst.setString(6, preroom);
            pst.setString(7, preday);
            pst.setString(8, pretime);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Preferred Session Location Saved Successfully");
            table_update();
            
            txtpresessionID.setSelectedIndex(0);
            txtprelecturer.setSelectedIndex(0);
            txtpregroup.setSelectedIndex(0);
            txtpresubgroup.setSelectedIndex(0);
            txtpretag.setSelectedIndex(0);
            txtpreroom.setSelectedIndex(0);
            txtpreday.setSelectedIndex(0);
            txtpretime.setSelectedIndex(0);
                
            txtpresessionID.requestFocus();
            
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PreferredSessionLocations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PreferredSessionLocations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    
    //SELECT TABLE AND DISPLAY IN FIELDS
    private void jTable_preferred_session_locationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_preferred_session_locationsMouseClicked
        
        DefaultTableModel d1 = (DefaultTableModel)jTable_preferred_session_locations.getModel();
        int selectIndex = jTable_preferred_session_locations.getSelectedRow();
        
        txtpresessionID.setSelectedItem(d1.getValueAt(selectIndex, 1).toString());
        txtprelecturer.setSelectedItem(d1.getValueAt(selectIndex, 2).toString());
        txtpregroup.setSelectedItem(d1.getValueAt(selectIndex, 3).toString());
        txtpresubgroup.setSelectedItem(d1.getValueAt(selectIndex, 4).toString());
        txtpretag.setSelectedItem(d1.getValueAt(selectIndex, 5).toString());
        txtpreroom.setSelectedItem(d1.getValueAt(selectIndex, 6).toString());
        txtpreday.setSelectedItem(d1.getValueAt(selectIndex, 7).toString());
        txtpretime.setSelectedItem(d1.getValueAt(selectIndex, 8).toString());
                 
        
    }//GEN-LAST:event_jTable_preferred_session_locationsMouseClicked

    
    
    //DELETE BUTTON
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        DefaultTableModel d1 = (DefaultTableModel)jTable_preferred_session_locations.getModel();
        int selectIndex = jTable_preferred_session_locations.getSelectedRow();
        
        int ID = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete Preferred Session Location","Warning",JOptionPane.YES_NO_OPTION);
      
      if(dialogResult == JOptionPane.YES_OPTION)
      {
          try {
              Class.forName("org.sqlite.JDBC");
            conn =DriverManager.getConnection("jdbc:sqlite:itpm.db");
             pst = conn.prepareStatement("DELETE FROM `preferred_session_locations` WHERE `ID`=? ");
             pst.setInt(1, ID);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(this,"Preffered Session Location Deleted");
             table_update();
            
           
            txtpresessionID.setSelectedIndex(0);
            txtprelecturer.setSelectedIndex(0);
            txtpregroup.setSelectedIndex(0);
            txtpresubgroup.setSelectedIndex(0);
            txtpretag.setSelectedIndex(0);
            txtpreroom.setSelectedIndex(0);
            txtpreday.setSelectedIndex(0);
            txtpretime.setSelectedIndex(0);
              
            txtpresessionID.requestFocus();
            
            
          } catch (ClassNotFoundException ex) {
                Logger.getLogger(PreferredSessionLocations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PreferredSessionLocations.class.getName()).log(Level.SEVERE, null, ex);
            }
          
       }  
    }//GEN-LAST:event_jButton3ActionPerformed

    
    //UPDATE BUTTON
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
           
        DefaultTableModel d1 = (DefaultTableModel)jTable_preferred_session_locations.getModel();
        int selectIndex = jTable_preferred_session_locations.getSelectedRow();
        
        int ID = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());  
        
        String presessionid = txtpresessionID.getSelectedItem().toString();
        String prelecturer = txtprelecturer.getSelectedItem().toString();
        String pregroup = txtpregroup.getSelectedItem().toString();
        String presubgroup = txtpresubgroup.getSelectedItem().toString();
        String pretag = txtpretag.getSelectedItem().toString();
        String preroom = txtpreroom.getSelectedItem().toString();
        String preday = txtpreday.getSelectedItem().toString();
        String pretime = txtpretime.getSelectedItem().toString();
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn =DriverManager.getConnection("jdbc:sqlite:itpm.db");
             pst = conn.prepareStatement("UPDATE `preferred_session_locations` SET `Session ID`=?,`Lecturer`=?,`Group`=?,`Sub Group`=?,`Tag`=?,`Room`=?,`Day`=?,`Time`=? WHERE `ID`=?");


            pst.setString(1, presessionid);
            pst.setString(2, prelecturer);
            pst.setString(3, pregroup);
            pst.setString(4, presubgroup);
            pst.setString(5, pretag);
            pst.setString(6, preroom);
            pst.setString(7, preday);
            pst.setString(8, pretime);
            pst.setInt(9, ID);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Preffered Session Location Updated");
            table_update();
            
            txtpresessionID.setSelectedIndex(0);
            txtprelecturer.setSelectedIndex(0);
            txtpregroup.setSelectedIndex(0);
            txtpresubgroup.setSelectedIndex(0);
            txtpretag.setSelectedIndex(0);
            txtpreroom.setSelectedIndex(0);
            txtpreday.setSelectedIndex(0);
            txtpretime.setSelectedIndex(0);
           
            txtpresessionID.requestFocus();
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PreferredSessionLocations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PreferredSessionLocations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    //BACK BUTTON
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        
        this.toBack();
        setVisible(false);
        new NotAvailableLocations().toFront();
        new NotAvailableLocations().setState(java.awt.Frame.NORMAL);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
    //NEXT BUTTON 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.toBack();
        TimeTable newFrame = new TimeTable();
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
            java.util.logging.Logger.getLogger(PreferredSessionLocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreferredSessionLocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreferredSessionLocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreferredSessionLocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PreferredSessionLocations().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_preferred_session_locations;
    private javax.swing.JComboBox<String> txtpreday;
    private javax.swing.JComboBox<String> txtpregroup;
    private javax.swing.JComboBox<String> txtprelecturer;
    private javax.swing.JComboBox<String> txtpreroom;
    private javax.swing.JComboBox<String> txtpresessionID;
    private javax.swing.JComboBox<String> txtpresubgroup;
    private javax.swing.JComboBox<String> txtpretag;
    private javax.swing.JComboBox<String> txtpretime;
    // End of variables declaration//GEN-END:variables
}

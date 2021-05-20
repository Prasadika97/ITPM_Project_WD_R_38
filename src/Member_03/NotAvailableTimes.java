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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class NotAvailableTimes extends javax.swing.JFrame {

    /**
     * Creates new form WorkingDays
     */
    public NotAvailableTimes() {
        initComponents();
        table_update();
        combobox();
        combobox1();
        combobox2();
        combobox3();
        combobox4();
    }
    
     Connection con1;
     PreparedStatement pst;
     ResultSet rs;
     
     
     
       
    //ROOM COMBO BOX
    private  void combobox()
    {    
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
            String sql = ("SELECT * FROM `session`");
            pst = con1.prepareStatement(sql);
            rs = pst.executeQuery();
                     
            while(rs.next())
            {
                String notroom = rs.getString("Room");
                txtnotroom.addItem(notroom);
               
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
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
            String sql = ("SELECT * FROM `tag`");
            pst = con1.prepareStatement(sql);
            rs = pst.executeQuery();
                     
            while(rs.next())
            {
                String nottag = rs.getString("RelatedTag");
                txtnotroom.addItem(nottag);
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
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/itpm","root","");
            String sql = ("SELECT * FROM `subject2`");
            pst = con1.prepareStatement(sql);
            rs = pst.executeQuery();
                     
            while(rs.next())
            {
                String notsessionid = rs.getString("subcode");
                
                txtnotsessionID.addItem(notsessionid);
                
               
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
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/itpm","root","");
            String sql = ("SELECT * FROM `lectrure`");
            pst = con1.prepareStatement(sql);
            rs = pst.executeQuery();
                     
            while(rs.next())
            {
                String notlecturer = rs.getString("name");
                
                txtnotlecturer.addItem(notlecturer);
                
               
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
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/itpm","root","");
            String sql = ("SELECT * FROM `studentgroup`");
            pst = con1.prepareStatement(sql);
            rs = pst.executeQuery();
                     
            while(rs.next())
            {
                String notgroup = rs.getString("GroupID");
                String notsubgroup = rs.getString("SubGroupID");
                
                txtnotgroup.addItem(notgroup);
                txtnotsubgroup.addItem(notsubgroup);
               
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
        txtnotsessionID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_not_available_times = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnotgroup = new javax.swing.JComboBox<>();
        txtnotday = new javax.swing.JComboBox<>();
        txtnottag = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnotlecturer = new javax.swing.JComboBox<>();
        txtnotsubgroup = new javax.swing.JComboBox<>();
        txtnotroom = new javax.swing.JComboBox<>();
        txtnottime = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Not Available Times");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setText("Session ID");

        txtnotsessionID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txtnotsessionID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnotsessionIDActionPerformed(evt);
            }
        });

        jTable_not_available_times.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_not_available_times.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_not_available_times.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable_not_available_times.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_not_available_timesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_not_available_times);

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

        txtnotgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        txtnotday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        txtnotday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnotdayActionPerformed(evt);
            }
        });

        txtnottag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setText("Lecturer");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel7.setText("Sub Group");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setText("Room");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel9.setText("Time");

        txtnotlecturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txtnotlecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnotlecturerActionPerformed(evt);
            }
        });

        txtnotsubgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txtnotsubgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnotsubgroupActionPerformed(evt);
            }
        });

        txtnotroom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txtnotroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnotroomActionPerformed(evt);
            }
        });

        txtnottime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "08.30 - 09.30", "08.30 - 10.30", "09.30 - 10.30", "09.30 - 11.30", "10.30 - 11.30", "10.30 - 12.30", "11.30 - 12.30", "13.30 - 14.30", "13.30 - 15.30", "14.30 - 15.30", "14.30 - 16.30", "15.30 - 16.30", "15.30 - 17.30", "16.30 - 17.30", " " }));
        txtnottime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnottimeActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtnotsessionID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtnotgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtnottag, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnotday, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(215, 215, 215)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(132, 132, 132)
                                .addComponent(txtnotlecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtnottime, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(112, 112, 112)
                                        .addComponent(txtnotsubgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtnotroom, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(282, 282, 282)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
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
                            .addComponent(txtnotsessionID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnotgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnottag, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnotday, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtnotlecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtnotsubgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtnotroom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtnottime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    
    //UPDATE TABLE
    private void table_update()
    {
         try {
            
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/itpm","root","");
               String sql = ("select `ID`,`Session ID`,`Lecturer`,`Group`,`Sub Group`,`Tag`,`Room`,`Day`,`Time` from not_available_times");
                pst = con1.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                jTable_not_available_times.setModel(DbUtils.resultSetToTableModel(rs));
               
        
        
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        }
    

    }
    
    private void txtnotsessionIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnotsessionIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnotsessionIDActionPerformed

    private void txtnotdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnotdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnotdayActionPerformed

    private void txtnotlecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnotlecturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnotlecturerActionPerformed

    private void txtnotsubgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnotsubgroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnotsubgroupActionPerformed

    
    
    private void txtnotroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnotroomActionPerformed
       
        
    }//GEN-LAST:event_txtnotroomActionPerformed

    private void txtnottimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnottimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnottimeActionPerformed

    
    //CLEAR BUTTON
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        
        txtnotsessionID.setSelectedIndex(0);
        txtnotlecturer.setSelectedIndex(0);
        txtnotgroup.setSelectedIndex(0);
        txtnotsubgroup.setSelectedIndex(0);
        txtnottag.setSelectedIndex(0);
        txtnotroom.setSelectedIndex(0);
        txtnotday.setSelectedIndex(0);
        txtnottime.setSelectedIndex(0);
            
    }//GEN-LAST:event_jButton5ActionPerformed

    
    
    //SAVE BUTTON
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        
        String notsessionid = txtnotsessionID.getSelectedItem().toString();
        String notlecturer = txtnotlecturer.getSelectedItem().toString();
        String notgroup = txtnotgroup.getSelectedItem().toString();
        String notsubgroup = txtnotsubgroup.getSelectedItem().toString();
        String nottag = txtnottag.getSelectedItem().toString();
        String notroom = txtnotroom.getSelectedItem().toString();
        String notday = txtnotday.getSelectedItem().toString();
        String nottime = txtnottime.getSelectedItem().toString();
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/itpm","root","");
            pst = con1.prepareStatement("INSERT INTO `not_available_times`(`Session ID`, `Lecturer`, `Group`, `Sub Group`, `Tag`, `Room`, `Day`, `Time`) VALUES (?,?,?,?,?,?,?,?)");

            
            pst.setString(1, notsessionid);
            pst.setString(2, notlecturer);
            pst.setString(3, notgroup);
            pst.setString(4, notsubgroup);
            pst.setString(5, nottag);
            pst.setString(6, notroom);
            pst.setString(7, notday);
            pst.setString(8, nottime);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Not Available Time Saved Successfully");
            table_update();
            
            txtnotsessionID.setSelectedIndex(0);
            txtnotlecturer.setSelectedIndex(0);
            txtnotgroup.setSelectedIndex(0);
            txtnotsubgroup.setSelectedIndex(0);
            txtnottag.setSelectedIndex(0);
            txtnotroom.setSelectedIndex(0);
            txtnotday.setSelectedIndex(0);
            txtnottime.setSelectedIndex(0);
                
            txtnotsessionID.requestFocus();
            

             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        }
                                                   
        
    }//GEN-LAST:event_jButton6ActionPerformed
    
    
    
    //SELECT TABLE AND DISPLAY IN FIELDS
    private void jTable_not_available_timesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_not_available_timesMouseClicked
        
        
        DefaultTableModel d1 = (DefaultTableModel)jTable_not_available_times.getModel();
        int selectIndex = jTable_not_available_times.getSelectedRow();
        
        txtnotsessionID.setSelectedItem(d1.getValueAt(selectIndex, 1).toString());
        txtnotlecturer.setSelectedItem(d1.getValueAt(selectIndex, 2).toString());
        txtnotgroup.setSelectedItem(d1.getValueAt(selectIndex, 3).toString());
        txtnotsubgroup.setSelectedItem(d1.getValueAt(selectIndex, 4).toString());
        txtnottag.setSelectedItem(d1.getValueAt(selectIndex, 5).toString());
        txtnotroom.setSelectedItem(d1.getValueAt(selectIndex, 6).toString());
        txtnotday.setSelectedItem(d1.getValueAt(selectIndex, 7).toString());
        txtnottime.setSelectedItem(d1.getValueAt(selectIndex, 8).toString());
             
        
    }//GEN-LAST:event_jTable_not_available_timesMouseClicked

    
    
    
    //UPDATE BUTTON
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        DefaultTableModel d1 = (DefaultTableModel)jTable_not_available_times.getModel();
        int selectIndex = jTable_not_available_times.getSelectedRow();
        
        int ID = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());  
        
        String notsessionid = txtnotsessionID.getSelectedItem().toString();
        String notlecturer = txtnotlecturer.getSelectedItem().toString();
        String notgroup = txtnotgroup.getSelectedItem().toString();
        String notsubgroup = txtnotsubgroup.getSelectedItem().toString();
        String nottag = txtnottag.getSelectedItem().toString();
        String notroom = txtnotroom.getSelectedItem().toString();
        String notday = txtnotday.getSelectedItem().toString();
        String nottime = txtnottime.getSelectedItem().toString();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con1 = DriverManager.getConnection("jdbc:mysql://localhost/itpm","root","");
             pst = con1.prepareStatement("UPDATE `not_available_times` SET `Session ID`=?,`Lecturer`=?,`Group`=?,`Sub Group`=?,`Tag`=?,`Room`=?,`Day`=?,`Time`=? WHERE `ID`=?");


            pst.setString(1, notsessionid);
            pst.setString(2, notlecturer);
            pst.setString(3, notgroup);
            pst.setString(4, notsubgroup);
            pst.setString(5, nottag);
            pst.setString(6, notroom);
            pst.setString(7, notday);
            pst.setString(8, nottime);
            pst.setInt(9, ID);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Not Available Time Updated");
            table_update();
            
            txtnotsessionID.setSelectedIndex(-1);
            txtnotlecturer.setSelectedIndex(-1);
            txtnotgroup.setSelectedIndex(-1);
            txtnotsubgroup.setSelectedIndex(-1);
            txtnottag.setSelectedIndex(-1);
            txtnotroom.setSelectedIndex(-1);
            txtnotday.setSelectedIndex(-1);
            txtnottime.setSelectedIndex(-1);
           
            txtnotsessionID.requestFocus();
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
    //DELETE BUTTON
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        DefaultTableModel d1 = (DefaultTableModel)jTable_not_available_times.getModel();
        int selectIndex = jTable_not_available_times.getSelectedRow();
        
        int ID = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete Not Available Time","Warning",JOptionPane.YES_NO_OPTION);
      
      if(dialogResult == JOptionPane.YES_OPTION)
      {
          try {
              Class.forName("com.mysql.jdbc.Driver");
             con1 = DriverManager.getConnection("jdbc:mysql://localhost/itpm","root","");
             pst = con1.prepareStatement("DELETE FROM `not_available_times` WHERE `ID`=? ");
             pst.setInt(1, ID);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(this,"Not Available Time Deleted");
            table_update();
            
           
            txtnotsessionID.setSelectedIndex(0);
            txtnotlecturer.setSelectedIndex(0);
            txtnotgroup.setSelectedIndex(0);
            txtnotsubgroup.setSelectedIndex(0);
            txtnottag.setSelectedIndex(0);
            txtnotroom.setSelectedIndex(0);
            txtnotday.setSelectedIndex(0);
            txtnottime.setSelectedIndex(0);
              
            txtnotsessionID.requestFocus();
            
            
          } catch (ClassNotFoundException ex) {
                Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(NotAvailableTimes.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
      
    }//GEN-LAST:event_jButton3ActionPerformed

    
    //BACK BUTTON
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.toBack();
        setVisible(false);
        new PreferredSessionLocations().toFront();
        new PreferredSessionLocations().setState(java.awt.Frame.NORMAL);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    //NEXT BUTTON
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        this.toBack();
        NotAvailableLocations newFrame = new NotAvailableLocations();
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
            java.util.logging.Logger.getLogger(NotAvailableTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotAvailableTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotAvailableTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotAvailableTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotAvailableTimes().setVisible(true);
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
    private javax.swing.JTable jTable_not_available_times;
    private javax.swing.JComboBox<String> txtnotday;
    private javax.swing.JComboBox<String> txtnotgroup;
    private javax.swing.JComboBox<String> txtnotlecturer;
    private javax.swing.JComboBox<String> txtnotroom;
    private javax.swing.JComboBox<String> txtnotsessionID;
    private javax.swing.JComboBox<String> txtnotsubgroup;
    private javax.swing.JComboBox<String> txtnottag;
    private javax.swing.JComboBox<String> txtnottime;
    // End of variables declaration//GEN-END:variables

 
}

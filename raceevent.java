import javax.swing.JFrame;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class raceevent extends javax.swing.JFrame {

  
    private DefaultTableModel tableModel;
    private int selectedRow = -1;
    
    
    
    public raceevent() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        
                // Initialize the table model
        tableModel = (DefaultTableModel) jTableRACEEVENT.getModel();

        // Set the table model with the required columns
        String[] columns = {"ID", "Event Name", "Schedule", "Start and Cut Off"};
        tableModel.setColumnIdentifiers(columns);

        // Load existing events from the database into the table
        loadRaceEventsFromDatabase();
    }
    
    
    private void loadRaceEventsFromDatabase() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Get a connection from the DatabaseConnection class to myshop database
            conn = MyConnection.getConnection();

            // SQL query to retrieve events
            String sql = "SELECT * FROM raceevent";

            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // Clear existing rows in the table
            tableModel.setRowCount(0);

            // Loop through the result set and add each event to the table
            while (rs.next()) {
                int id = rs.getInt("id");
                String eventName = rs.getString("EventName");
                String schedule = rs.getString("_Schedule");
                String startAndCutOff = rs.getString("Start_and_CutOff");

                // Add a row to the table model
                tableModel.addRow(new Object[]{id, eventName, schedule, startAndCutOff});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error closing database resources.");
            }
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldColor = new javax.swing.JTextField();
        jTextFieldBloodline = new javax.swing.JTextField();
        jTextFieldBredBy = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox_COCK_ = new javax.swing.JCheckBox();
        jCheckBox_HEN_ = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jButton_Sell_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSellpigeon = new javax.swing.JTable();
        jTextFieldRingband = new javax.swing.JTextField();
        jButton_Edit_ = new javax.swing.JButton();
        jButton_Back_ = new javax.swing.JButton();
        jButton_Update_ = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField_EVENTNAME = new javax.swing.JTextField();
        jTextFieldSTARTandCUToff = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton_CREAT = new javax.swing.JButton();
        jButton_Delete1_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRACEEVENT = new javax.swing.JTable();
        SCHEDULE = new javax.swing.JTextField();
        jButton_Edit_1 = new javax.swing.JButton();
        jButton_Back_1 = new javax.swing.JButton();
        jButton_Update_1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Breed By:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Color:");

        jTextFieldColor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColorActionPerformed(evt);
            }
        });

        jTextFieldBloodline.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldBloodline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBloodlineActionPerformed(evt);
            }
        });

        jTextFieldBredBy.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldBredBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBredByActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Ringband:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("BloodLine:");

        jCheckBox_COCK_.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jCheckBox_COCK_.setText("COCK");
        jCheckBox_COCK_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_COCK_ActionPerformed(evt);
            }
        });

        jCheckBox_HEN_.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jCheckBox_HEN_.setText("HEN");
        jCheckBox_HEN_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_HEN_ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel6.setText("Bird Specification:");

        jButton_Sell_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Sell_.setText("SELL");
        jButton_Sell_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sell_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Delete_.setText("DELETE");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jTableSellpigeon.setBackground(new java.awt.Color(204, 204, 204));
        jTableSellpigeon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTableSellpigeon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableSellpigeon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Color", "Ringband", "BloodLine", "Bred by", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableSellpigeon.setGridColor(new java.awt.Color(0, 0, 0));
        jTableSellpigeon.setShowGrid(true);
        jScrollPane1.setViewportView(jTableSellpigeon);

        jTextFieldRingband.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldRingband.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRingbandActionPerformed(evt);
            }
        });

        jButton_Edit_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Edit_.setText("EDIT");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jButton_Back_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Back_.setText("BACK");
        jButton_Back_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Back_ActionPerformed(evt);
            }
        });

        jButton_Update_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Update_.setText("UPDATE");
        jButton_Update_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Update_ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Event Name:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 230, 140, 30);

        jTextField_EVENTNAME.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField_EVENTNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EVENTNAMEActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_EVENTNAME);
        jTextField_EVENTNAME.setBounds(310, 230, 230, 38);

        jTextFieldSTARTandCUToff.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldSTARTandCUToff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSTARTandCUToffActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSTARTandCUToff);
        jTextFieldSTARTandCUToff.setBounds(310, 370, 230, 38);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Schedule:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 300, 130, 32);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Start and Cutoff:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 370, 180, 32);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel10.setText("RACE EVENT");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(140, 110, 310, 70);

        jButton_CREAT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_CREAT.setText("CREAT");
        jButton_CREAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CREATActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_CREAT);
        jButton_CREAT.setBounds(220, 460, 100, 27);

        jButton_Delete1_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Delete1_.setText("DELETE");
        jButton_Delete1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete1_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Delete1_);
        jButton_Delete1_.setBounds(350, 460, 90, 27);

        jTableRACEEVENT.setBackground(new java.awt.Color(204, 204, 204));
        jTableRACEEVENT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTableRACEEVENT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableRACEEVENT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "EventName", "_Schedule", "Start_and_CutOff"
            }
        ));
        jTableRACEEVENT.setGridColor(new java.awt.Color(0, 0, 0));
        jTableRACEEVENT.setShowGrid(true);
        jScrollPane2.setViewportView(jTableRACEEVENT);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(590, 60, 1030, 700);

        SCHEDULE.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SCHEDULE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCHEDULEActionPerformed(evt);
            }
        });
        getContentPane().add(SCHEDULE);
        SCHEDULE.setBounds(310, 300, 230, 38);

        jButton_Edit_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Edit_1.setText("EDIT");
        jButton_Edit_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Edit_1);
        jButton_Edit_1.setBounds(100, 460, 100, 27);

        jButton_Back_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Back_1.setText("BACK");
        jButton_Back_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Back_1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Back_1);
        jButton_Back_1.setBounds(150, 510, 90, 27);

        jButton_Update_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Update_1.setText("UPDATE");
        jButton_Update_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Update_1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Update_1);
        jButton_Update_1.setBounds(300, 520, 90, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldColorActionPerformed

    private void jTextFieldBloodlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBloodlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBloodlineActionPerformed

    private void jTextFieldBredByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBredByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBredByActionPerformed

    private void jCheckBox_COCK_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_COCK_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_COCK_ActionPerformed

    private void jCheckBox_HEN_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_HEN_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_HEN_ActionPerformed

    private void jButton_Sell_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sell_ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton_Sell_ActionPerformed
    // TODO add your handling code here:
    // TODO add your handling code here:


    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jTextFieldRingbandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRingbandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRingbandActionPerformed

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    private void jButton_Back_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Back_ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_Back_ActionPerformed

    private void jButton_Update_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Update_ActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jButton_Update_ActionPerformed

    private void jTextField_EVENTNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EVENTNAMEActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_EVENTNAMEActionPerformed

    private void jTextFieldSTARTandCUToffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSTARTandCUToffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSTARTandCUToffActionPerformed

    private void jButton_CREATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CREATActionPerformed
String eventName = jTextField_EVENTNAME.getText();
String schedule = SCHEDULE.getText();
String startAndCutOff = jTextFieldSTARTandCUToff.getText();

// Validate input: Check if any field is empty
if (eventName.isEmpty() || schedule.isEmpty() || startAndCutOff.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please fill in all fields.");
    return;
}

Connection conn = null;
PreparedStatement pstmt = null;

try {
    conn = MyConnection.getConnection();
    if (conn == null) {
        JOptionPane.showMessageDialog(this, "Failed to connect to the database.");
        return;
    }

    // SQL query to insert data into the `raceevent` table
    String sql = "INSERT INTO raceevent (EventName, _Schedule, Start_and_CutOff) VALUES (?, ?, ?)";
    pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, eventName);
    pstmt.setString(2, schedule);
    pstmt.setString(3, startAndCutOff);

    System.out.println("Executing SQL: " + sql); // Debugging SQL statement

    // Execute the query
    int rowsInserted = pstmt.executeUpdate();
    if (rowsInserted > 0) {
        JOptionPane.showMessageDialog(this, "Event added successfully!");

        // Add the new row to the JTable model
        Object[] rowData = {null, eventName, schedule, startAndCutOff};  // ID is auto-generated
        tableModel.addRow(rowData);

        // Clear text fields after adding
        jTextField_EVENTNAME.setText("");
        SCHEDULE.setText("");
        jTextFieldSTARTandCUToff.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to add event.");
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
    ex.printStackTrace();
} finally {
    try {
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error closing database resources.");
    }
}

    }//GEN-LAST:event_jButton_CREATActionPerformed

    private void jButton_Delete1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete1_ActionPerformed
        // TODO add your handling code here:
        selectedRow = jTableRACEEVENT.getSelectedRow();

        if (selectedRow != -1) {
            // Confirm deletion
            int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this event?", "Delete Event", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
                // Remove the selected row from the table
                tableModel.removeRow(selectedRow);

                // Handle database deletion if necessary here

                selectedRow = -1;  // Reset selected row
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }

    }//GEN-LAST:event_jButton_Delete1_ActionPerformed

    private void SCHEDULEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCHEDULEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SCHEDULEActionPerformed

    private void jButton_Edit_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Edit_1ActionPerformed

    private void jButton_Back_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Back_1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_Back_1ActionPerformed

    private void jButton_Update_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Update_1ActionPerformed
        // TODO add your handling code here:
        if (selectedRow != -1) {
            // Get updated values from text fields
            String eventName = jTextField_EVENTNAME.getText();
            String schedule = SCHEDULE.getText();
            String startAndCutOff = jTextFieldSTARTandCUToff.getText();

            if (eventName.isEmpty() || schedule.isEmpty() || startAndCutOff.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
                return;
            }

            // Update the row in the table
            tableModel.setValueAt(eventName, selectedRow, 1);
            tableModel.setValueAt(schedule, selectedRow, 2);
            tableModel.setValueAt(startAndCutOff, selectedRow, 3);

            // Clear the selection and text fields after updating
            jTextField_EVENTNAME.setText("");
            SCHEDULE.setText("");
            jTextFieldSTARTandCUToff.setText("");
            selectedRow = -1;  // Reset selected row
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }
    }

    private void jButton_Delete_ActionPerformed() {

    }//GEN-LAST:event_jButton_Update_1ActionPerformed

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
            java.util.logging.Logger.getLogger(raceevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(raceevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(raceevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(raceevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new raceevent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SCHEDULE;
    private javax.swing.JButton jButton_Back_;
    private javax.swing.JButton jButton_Back_1;
    private javax.swing.JButton jButton_CREAT;
    private javax.swing.JButton jButton_Delete1_;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_Edit_1;
    private javax.swing.JButton jButton_Sell_;
    private javax.swing.JButton jButton_Update_;
    private javax.swing.JButton jButton_Update_1;
    private javax.swing.JCheckBox jCheckBox_COCK_;
    private javax.swing.JCheckBox jCheckBox_HEN_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRACEEVENT;
    private javax.swing.JTable jTableSellpigeon;
    private javax.swing.JTextField jTextFieldBloodline;
    private javax.swing.JTextField jTextFieldBredBy;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldRingband;
    private javax.swing.JTextField jTextFieldSTARTandCUToff;
    private javax.swing.JTextField jTextField_EVENTNAME;
    // End of variables declaration//GEN-END:variables


}

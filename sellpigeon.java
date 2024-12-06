import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class sellpigeon extends javax.swing.JFrame {  

    private DefaultTableModel tableModel;
    private int selectedRow = -1;    
                        
    public sellpigeon() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        tableModel = (DefaultTableModel) jTableSellpigeon.getModel();

        // Set the table model with the required columns
        String[] columns = {"Color", "Ringband", "BloodlLine", "Breedby", "Gender"};
        tableModel.setColumnIdentifiers(columns);

        // Load existing events from the database into the table
        loadsellFromDatabase();

    }

     private void loadsellFromDatabase() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Get a connection from the DatabaseConnection class to myshop database
            conn = MyConnection.getConnection();

            // SQL query to retrieve events
            String sql = "SELECT * FROM sell";

            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // Clear existing rows in the table
            tableModel.setRowCount(0);

            // Loop through the result set and add each event to the table
            while (rs.next()) {
                String Color = rs.getString("Color");
                String Ringband = rs.getString("Ringband");
                String BloodLine = rs.getString("BloodLine");
                String Breedby = rs.getString("Breedby");
                String Gender = rs.getString("Gender");
   

                // Add a row to the table model
                tableModel.addRow(new Object[]{Color, Ringband, BloodLine, Breedby, Gender});
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

        jLabel2 = new javax.swing.JLabel();
        jTextFieldColor = new javax.swing.JTextField();
        jTextFieldBloodline = new javax.swing.JTextField();
        jTextFieldGender = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_Sell_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSellpigeon = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldRingband = new javax.swing.JTextField();
        jButton_Edit_ = new javax.swing.JButton();
        jButton_Back_ = new javax.swing.JButton();
        jButton_Update_ = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldBreedBy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Color:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 220, 70, 30);

        jTextFieldColor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldColor);
        jTextFieldColor.setBounds(210, 220, 230, 38);

        jTextFieldBloodline.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldBloodline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBloodlineActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBloodline);
        jTextFieldBloodline.setBounds(210, 360, 230, 38);

        jTextFieldGender.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGenderActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldGender);
        jTextFieldGender.setBounds(210, 490, 230, 38);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 270, 100, 0);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Ringband:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 290, 130, 32);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("BloodLine:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 360, 120, 32);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel6.setText("Bird Specification:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 110, 310, 70);

        jButton_Sell_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Sell_.setText("SELL");
        jButton_Sell_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sell_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Sell_);
        jButton_Sell_.setBounds(190, 590, 100, 27);

        jButton_Delete_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Delete_.setText("DELETE");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Delete_);
        jButton_Delete_.setBounds(340, 590, 90, 27);

        jTableSellpigeon.setBackground(new java.awt.Color(204, 204, 204));
        jTableSellpigeon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTableSellpigeon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableSellpigeon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Color", "Ringband", "BloodLine", "Breed by", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableSellpigeon.setGridColor(new java.awt.Color(0, 0, 0));
        jTableSellpigeon.setShowGrid(true);
        jScrollPane1.setViewportView(jTableSellpigeon);
        if (jTableSellpigeon.getColumnModel().getColumnCount() > 0) {
            jTableSellpigeon.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(590, 60, 1030, 700);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(860, 640, 0, 3);

        jTextFieldRingband.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldRingband.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRingbandActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldRingband);
        jTextFieldRingband.setBounds(210, 290, 230, 38);

        jButton_Edit_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Edit_.setText("EDIT");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Edit_);
        jButton_Edit_.setBounds(190, 650, 100, 27);

        jButton_Back_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Back_.setText("BACK");
        jButton_Back_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Back_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Back_);
        jButton_Back_.setBounds(270, 700, 90, 27);

        jButton_Update_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Update_.setText("UPDATE");
        jButton_Update_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Update_ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Update_);
        jButton_Update_.setBounds(340, 650, 90, 27);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Breed By:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 430, 120, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Gender:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 490, 120, 30);

        jTextFieldBreedBy.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldBreedBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBreedByActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBreedBy);
        jTextFieldBreedBy.setBounds(210, 430, 230, 38);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColorActionPerformed
        // TODO add your handling code here:
    String color = jTextFieldColor.getText();
    String ringband = jTextFieldRingband.getText();
    String bloodline = jTextFieldBloodline.getText();
    String breedBy = jTextFieldBreedBy.getText();
     String gender = jTextFieldGender.getText();
    
    // Check which gender is selected
   
    // Validate if all fields are filled
    if (color.isEmpty() || ringband.isEmpty() || bloodline.isEmpty() || breedBy.isEmpty() || gender.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

    // Add the data to the table
    DefaultTableModel model = (DefaultTableModel) jTableSellpigeon.getModel();
    Object[] rowData = {color, ringband, bloodline, breedBy, gender};
    model.addRow(rowData);

    // Optionally clear the text fields
    jTextFieldColor.setText("");
    jTextFieldRingband.setText("");
    jTextFieldBloodline.setText("");
    jTextFieldGender.setText("");
    
    }//GEN-LAST:event_jTextFieldColorActionPerformed

    private void jTextFieldBloodlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBloodlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBloodlineActionPerformed

    private void jTextFieldGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGenderActionPerformed

    private void jTextFieldRingbandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRingbandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRingbandActionPerformed

    private void jButton_Back_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Back_ActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_jButton_Back_ActionPerformed

    private void jButton_Sell_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sell_ActionPerformed
        // TODO add your handling code here:
    // Get the values from the text fields and checkboxes
    String color = jTextFieldColor.getText();
    String ringband = jTextFieldRingband.getText();
    String bloodline = jTextFieldBloodline.getText();
    String breedBy = jTextFieldBreedBy.getText();
    String gender = jTextFieldGender.getText();
    // Determine the selected gender (Cock or Hen)
  

    // Validate that all fields are filled
    if (color.isEmpty() || ringband.isEmpty() || bloodline.isEmpty() || breedBy.isEmpty() || gender.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

//    // Add the data to the table
   DefaultTableModel model = (DefaultTableModel) jTableSellpigeon.getModel();
    Object[] rowData = {color, ringband, bloodline, breedBy, gender};
    model.addRow(rowData);

   // Optionally, clear the input fields
   jTextFieldColor.setText("");
    jTextFieldRingband.setText("");
    jTextFieldBloodline.setText("");
  jTextFieldGender.setText("");
    
   Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        // Establish database connection
        conn = MyConnection.getConnection();
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "Failed to connect to the database.");
            return;
        }

        // SQL query to insert data into the `sell` table
        String sql = "INSERT INTO sell (Color, Ringband, BloodLine, BreedBy, Gender) VALUES (?, ?, ?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, color);
        pstmt.setString(2, ringband);
        pstmt.setString(3, bloodline);
        pstmt.setString(4, breedBy);
        pstmt.setString(5, gender);

        System.out.println("Executing SQL: " + sql); // Debugging SQL statement

        // Execute the query
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Pigeon sold successfully!");
            
        } else {
            JOptionPane.showMessageDialog(this, "Failed to sell pigeon.");
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
    }//GEN-LAST:event_jButton_Sell_ActionPerformed

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTableSellpigeon.getSelectedRow();

        // Check if a row is selected
        if (selectedRow != -1) {
            // Populate the text fields with the selected row's data
            jTextFieldColor.setText((String) jTableSellpigeon.getValueAt(selectedRow, 0));
            jTextFieldRingband.setText((String) jTableSellpigeon.getValueAt(selectedRow, 1));
            jTextFieldBloodline.setText((String) jTableSellpigeon.getValueAt(selectedRow, 2));
            jTextFieldGender.setText((String) jTableSellpigeon.getValueAt(selectedRow, 3));
            String gender = (String) jTableSellpigeon.getValueAt(selectedRow, 4);
            
            // Set the gender checkbox based on the selected value
            
    }//GEN-LAST:event_jButton_Edit_ActionPerformed
                                   }
    private void jButton_Update_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Update_ActionPerformed
        // TODO add your handling code here:
        if (selectedRow != -1) {
        String color = jTextFieldColor.getText();
        String ringband = jTextFieldRingband.getText();
        String bloodline = jTextFieldBloodline.getText();
        String breedBy = jTextFieldBreedBy.getText();
        String gender = jTextFieldGender.getText();

        // Validate input fields
        if (color.isEmpty() || ringband.isEmpty() || bloodline.isEmpty() || breedBy.isEmpty() || gender.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        // Update the table data
        DefaultTableModel model = (DefaultTableModel) jTableSellpigeon.getModel();
        model.setValueAt(color, selectedRow, 0);
        model.setValueAt(ringband, selectedRow, 1);
        model.setValueAt(bloodline, selectedRow, 2);
        model.setValueAt(breedBy, selectedRow, 3);
        model.setValueAt(gender, selectedRow, 4);

        // Update the database
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = MyConnection.getConnection();
            String sql = "UPDATE sell SET Color = ?, BloodLine = ?, BreedBy = ?, Gender = ? WHERE Ringband = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, color);
            pstmt.setString(2, bloodline);
            pstmt.setString(3, breedBy);
            pstmt.setString(4, gender);
            pstmt.setString(5, ringband);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Pigeon details updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update pigeon details.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error closing database resources.");
            }
        }

        // Clear the text fields after updating
        jTextFieldColor.setText("");
        jTextFieldRingband.setText("");
        jTextFieldBloodline.setText("");
        jTextFieldBreedBy.setText("");
        jTextFieldGender.setText("");
        selectedRow = -1;
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to update.");
    }
    }//GEN-LAST:event_jButton_Update_ActionPerformed

    private void jTextFieldBreedByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBreedByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBreedByActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTableSellpigeon.getSelectedRow();

        // Check if a row is selected
        if (selectedRow != -1) {
            // Remove the selected row from the table
            DefaultTableModel model = (DefaultTableModel) jTableSellpigeon.getModel();
            model.removeRow(selectedRow);
        } else {
            // Show message if no row is selected
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

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
            java.util.logging.Logger.getLogger(sellpigeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sellpigeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sellpigeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sellpigeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sellpigeon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back_;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_Sell_;
    private javax.swing.JButton jButton_Update_;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableSellpigeon;
    private javax.swing.JTextField jTextFieldBloodline;
    private javax.swing.JTextField jTextFieldBreedBy;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldRingband;
    // End of variables declaration//GEN-END:variables
}

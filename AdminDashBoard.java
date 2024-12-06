
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdminDashBoard extends javax.swing.JFrame {
    

   
    public AdminDashBoard() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    
    }
         private boolean authenticateUser(String username, String password) {
        // Simple dummy check (you should replace this with actual DB or API logic)
        String correctUsername = "admin23";
        String correctPassword = "admin123";
        return username.equals(correctUsername) && password.equals(correctPassword);
    }
    // Database Connection
    public Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/myshop";
            String user = "root";  // Database user
            String password = "12345";  // Database password
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Connection Error: " + e.getMessage());
            return null;
        }
}
    
public void fetchAndDisplayUsers() {
    String[] columnNames = {"id", "First_Name", "Last_Name", "User_Name", "Pass", "Re_Pass", "Address"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

    // Establish database connection
    try (Connection conn = getConnection()) {
        if (conn != null) {
            String sql = "SELECT id, First_Name, Last_Name, User_Name, Pass, Re_Pass, Address FROM users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Add the retrieved data to the table model
            while (rs.next()) {
                String id = rs.getString("id");
                String firstName = rs.getString("First_Name");
                String lastName = rs.getString("Last_Name");
                String userName = rs.getString("User_Name");
                String pass = rs.getString("Pass");
                String rePass = rs.getString("Re_Pass");
                String address = rs.getString("Address");
                
                model.addRow(new Object[]{id, firstName, lastName, userName, pass, rePass, address});
            }

            // Create a JTable to display the model
            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);

            // Create a new JFrame to display the table
            JFrame dataFrame = new JFrame("Manage Users");
            dataFrame.setSize(800, 400);
            dataFrame.add(scrollPane);
            dataFrame.setVisible(true);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error fetching data: " + e.getMessage());
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1_ADMIN = new javax.swing.JButton();
        jButton_SellPigeon_ = new javax.swing.JButton();
        jButton_ManageUser_ = new javax.swing.JButton();
        jButton_Create_Event_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setPreferredSize(new java.awt.Dimension(1550, 850));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("WELLCOME TO HELL WORLD!");

        jButton1_ADMIN.setBackground(new java.awt.Color(102, 102, 102));
        jButton1_ADMIN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1_ADMIN.setForeground(new java.awt.Color(153, 0, 0));
        jButton1_ADMIN.setText("ADMIN");
        jButton1_ADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ADMINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1_ADMIN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(604, 604, 604)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(575, 575, 575))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jButton1_ADMIN)
                .addGap(25, 25, 25))
        );

        jButton_SellPigeon_.setBackground(new java.awt.Color(0, 102, 102));
        jButton_SellPigeon_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_SellPigeon_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_SellPigeon_.setText(" Sell Pigeon");
        jButton_SellPigeon_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SellPigeon_ActionPerformed(evt);
            }
        });

        jButton_ManageUser_.setBackground(new java.awt.Color(0, 102, 102));
        jButton_ManageUser_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_ManageUser_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ManageUser_.setText("Manage User");
        jButton_ManageUser_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManageUser_ActionPerformed(evt);
            }
        });

        jButton_Create_Event_.setBackground(new java.awt.Color(0, 102, 102));
        jButton_Create_Event_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Create_Event_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Create_Event_.setText("Create Race Event");
        jButton_Create_Event_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Create_Event_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_ManageUser_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Create_Event_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_SellPigeon_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(400, 400, 400))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton_ManageUser_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButton_SellPigeon_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton_Create_Event_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ManageUser_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManageUser_ActionPerformed
       new manageuser().setVisible(rootPaneCheckingEnabled);
     
    }//GEN-LAST:event_jButton_ManageUser_ActionPerformed

    private void jButton_Create_Event_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Create_Event_ActionPerformed
        
      new raceevent().setVisible(rootPaneCheckingEnabled);
    
    }//GEN-LAST:event_jButton_Create_Event_ActionPerformed

    private void jButton1_ADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ADMINActionPerformed
       
    }//GEN-LAST:event_jButton1_ADMINActionPerformed

    private void jButton_SellPigeon_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SellPigeon_ActionPerformed
        
        new sellpigeon().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton_SellPigeon_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_ADMIN;
    private javax.swing.JButton jButton_Create_Event_;
    private javax.swing.JButton jButton_ManageUser_;
    private javax.swing.JButton jButton_SellPigeon_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
        // Set the look and feel of the application (optional but recommended for GUI consistency)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create and display the AdminDashBoard form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashBoard().setVisible(true); // Show AdminDashBoard window
            }
        });
    }
}

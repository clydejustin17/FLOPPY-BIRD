
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.table.JTableHeader;


public class manageuser extends javax.swing.JFrame {


    public manageuser() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        JTableHeader tableHeader = jTable_manageuser_.getTableHeader();
        tableHeader.setFont(new Font("Arial", Font.BOLD, 16)); 
        tableHeader.setPreferredSize(new Dimension(tableHeader.getPreferredSize().width, 30)); 
        tableHeader.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_manageuser_ = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FirtsName = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        UserName = new javax.swing.JTextField();
        Pass = new javax.swing.JTextField();
        Repass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Create = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(null);

        jTable_manageuser_.setBackground(new java.awt.Color(204, 204, 204));
        jTable_manageuser_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable_manageuser_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_manageuser_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "First_ Name:", "Last_ Name:", "User_Name:", "Pass:", "Re_Pass:", "Address:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_manageuser_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable_manageuser_.setGridColor(new java.awt.Color(0, 0, 0));
        jTable_manageuser_.setShowGrid(true);
        jScrollPane2.setViewportView(jTable_manageuser_);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(550, 70, 1080, 770);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Re Passs:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 460, 100, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("First Name:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 270, 120, 20);

        Address.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(Address);
        Address.setBounds(270, 510, 240, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("User Name:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 370, 130, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Last Name:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(130, 320, 120, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Passs:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(180, 420, 70, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Address:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(150, 510, 90, 20);

        FirtsName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(FirtsName);
        FirtsName.setBounds(270, 270, 240, 30);

        LastName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(LastName);
        LastName.setBounds(270, 320, 240, 30);

        UserName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(UserName);
        UserName.setBounds(270, 370, 240, 30);

        Pass.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(Pass);
        Pass.setBounds(270, 420, 240, 30);

        Repass.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(Repass);
        Repass.setBounds(270, 460, 240, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Manage User");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 140, 230, 60);

        Create.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Create.setText("CREATE");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        getContentPane().add(Create);
        Create.setBounds(380, 640, 90, 20);

        Delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Delete.setText("DELETE");
        getContentPane().add(Delete);
        Delete.setBounds(250, 590, 80, 23);

        Edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Edit.setText("EDIT");
        getContentPane().add(Edit);
        Edit.setBounds(250, 640, 80, 23);

        Update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Update.setText("UPDATE");
        getContentPane().add(Update);
        Update.setBounds(380, 590, 90, 23);

        Back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(310, 690, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CreateActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(manageuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JButton Back;
    private javax.swing.JButton Create;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField FirtsName;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField Pass;
    private javax.swing.JTextField Repass;
    private javax.swing.JButton Update;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_manageuser_;
    // End of variables declaration//GEN-END:variables
}

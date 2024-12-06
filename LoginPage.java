import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginPage {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
    }
}

// Login Frame
class LoginFrame extends JFrame {

    private JTextField user_nameField;
    private JPasswordField PasswordField;

    public LoginFrame() {
        setTitle("Admin Login");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Left Panel (Decorative)
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(0, 102, 102));
        leftPanel.setBounds(0, 0, 400, 500);
        leftPanel.setLayout(null);

        JLabel titleLabel = new JLabel("P R M S");
        titleLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 30));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(100, 200, 200, 50);
        leftPanel.add(titleLabel);

        JLabel subtitleLabel = new JLabel("Pigeon Racing Management System");
        subtitleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        subtitleLabel.setForeground(Color.WHITE);
        subtitleLabel.setBounds(50, 250, 300, 30);
        leftPanel.add(subtitleLabel);

        add(leftPanel);

        // Right Panel (Form)
        JPanel rightPanel = new JPanel(null);
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setBounds(400, 0, 400, 500);

        JLabel loginTitleLabel = new JLabel("LOGIN");
        loginTitleLabel.setFont(new Font("Segoe UI", Font.BOLD, 36));
        loginTitleLabel.setForeground(new Color(0, 102, 102));
        loginTitleLabel.setBounds(150, 30, 200, 50);
        rightPanel.add(loginTitleLabel);

        JLabel usernameLabel = new JLabel("User_name:");
        usernameLabel.setBounds(50, 120, 100, 30);
        rightPanel.add(usernameLabel);

        user_nameField = new JTextField();
        user_nameField.setBounds(50, 150, 300, 30);
        rightPanel.add(user_nameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 200, 100, 30);
        rightPanel.add(passwordLabel);

        PasswordField = new JPasswordField();
        PasswordField.setBounds(50, 230, 300, 30);
        rightPanel.add(PasswordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(50, 300, 100, 30);
        loginButton.setBackground(new Color(0, 102, 102));
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(new LoginAction());
        rightPanel.add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(200, 300, 100, 30);
        registerButton.setBackground(new Color(255, 51, 51));
        registerButton.setForeground(Color.WHITE);
        // Register Button ActionListener
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the registration form when the Register button is clicked
                RegisterForm registerForm = new RegisterForm();  // Create RegisterForm instance
                registerForm.setVisible(true);                    // Show the RegisterForm
                registerForm.pack();                              // Adjust the size to fit its components
                registerForm.setLocationRelativeTo(null);         // Center the window
                registerForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close app on window close
                dispose();                                        // Close the login frame
            }
        });
        rightPanel.add(registerButton);

        JLabel newAccountLabel = new JLabel("Click here to create a new account");
        newAccountLabel.setBounds(100, 350, 250, 30);
        newAccountLabel.setForeground(new Color(0, 102, 102));
        rightPanel.add(newAccountLabel);

        add(rightPanel);
    }

    // Database Connection
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/myshop";
        String user = "root"; // DB username
        String password = "12345"; // DB password
        return DriverManager.getConnection(url, user, password);
    }

    // Action for Login Button
    private class LoginAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = user_nameField.getText();
            String password = new String(PasswordField.getPassword());

            if (authenticateAdmin(username, password)) {
                JOptionPane.showMessageDialog(LoginFrame.this, "Login Successful!");
                dispose(); // Close the login frame
                new AdminDashBoard().setVisible(true); // Open Admin Dashboard
            } else {
                JOptionPane.showMessageDialog(LoginFrame.this, "Invalid Username or Password!", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Authenticate admin using database
        private boolean authenticateAdmin(String username, String password) {
            String query = "SELECT * FROM admin WHERE username=? AND password=?";
            try (Connection conn = getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                ResultSet rs = pstmt.executeQuery();
                return rs.next(); // Return true if match found
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(LoginFrame.this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
}

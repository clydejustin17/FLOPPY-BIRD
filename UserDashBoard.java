import javax.swing.*;
import java.sql.*;

public class UserDashBoard extends JFrame {

    private String username;

    public UserDashBoard(String username) {
        this.username = username;

        setTitle("User Dashboard - " + username);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome, " + username + "!");
        welcomeLabel.setBounds(200, 50, 300, 30);
        add(welcomeLabel);

        JButton viewProfileButton = new JButton("View Profile");
        viewProfileButton.setBounds(200, 100, 150, 30);
        add(viewProfileButton);

        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(200, 150, 150, 30);
        add(logoutButton);

        viewProfileButton.addActionListener(e -> displayProfile());
        logoutButton.addActionListener(e -> handleLogout());
    }

    private void displayProfile() {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/myshop", "root", "12345")) {

            String sql = "SELECT * FROM users WHERE User_Name = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String profileInfo = String.format("Name: %s %s\nEmail: %s\nAddress: %s",
                        rs.getString("First_Name"),
                        rs.getString("Last_Name"),
                        rs.getString("Email"),
                        rs.getString("Address"));

                JOptionPane.showMessageDialog(this, profileInfo, "User Profile", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Profile not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching profile: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void handleLogout() {
        JOptionPane.showMessageDialog(this, "Logged out successfully!");
        this.dispose();
        new LoginFrame().setVisible(true);
    }
}

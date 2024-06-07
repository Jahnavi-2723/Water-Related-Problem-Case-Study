import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainApp extends JFrame {
    
    public MainApp() {
        setTitle("DBMS Case Study Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create buttons for each functionality
        JButton btnAverageUserAge = new JButton("Average User Age");
        JButton btnDeleteWaterProblem = new JButton("Delete Water Problem");
        JButton btnDisplayDistributionHistory = new JButton("Display Distribution History");
        JButton btnLocationInfo = new JButton("Location Info");
        JButton btnQueryContourZoneApp = new JButton("Query Contour Zone");
        JButton btnSumEstimatedWaterDemand = new JButton("Sum Estimated Water Demand");
        JButton btnUpdateProblemStatusApp = new JButton("Update Problem Status");
        JButton btnUpdateUserDetails = new JButton("Update User Details");
        JButton btnUserDetailsApp = new JButton("User Details");
        JButton btnWaterProblemApp = new JButton("Water Problem");

        // Add action listeners for each button
        
        btnUpdateUserDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UpdateUserDetails.main(new String[]{});
            }
        });

        btnUserDetailsApp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserDetailsApp.main(new String[]{});
            }
        });

        btnWaterProblemApp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WaterProblemApp.main(new String[]{});
            }
        });

        btnLocationInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LocationInfo.main(new String[]{});
            }
        });

        btnQueryContourZoneApp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                QueryContourZoneApp.main(new String[]{});
            }
        });
        btnDeleteWaterProblem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DeleteWaterProblem.main(new String[]{});
            }
        });

        btnDisplayDistributionHistory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DisplayDistributionHistory.main(new String[]{});
            }
        });

        btnSumEstimatedWaterDemand.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SumEstimatedWaterDemand.main(new String[]{});
            }
        });

        btnUpdateProblemStatusApp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UpdateProblemStatusApp.main(new String[]{});
            }
        });

        btnAverageUserAge.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AverageUserAge.main(new String[]{});
            }
        });

        // Layout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(btnUpdateUserDetails);
        panel.add(btnUserDetailsApp);
        panel.add(btnWaterProblemApp);
        panel.add(btnUpdateProblemStatusApp);
        panel.add(btnSumEstimatedWaterDemand);
        panel.add(btnLocationInfo);
        panel.add(btnDeleteWaterProblem);
        panel.add(btnDisplayDistributionHistory);
        panel.add(btnQueryContourZoneApp);
        panel.add(btnAverageUserAge);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainApp();
            }
        });
    }
}

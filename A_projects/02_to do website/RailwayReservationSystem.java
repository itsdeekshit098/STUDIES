import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RailwayReservationSystem extends JFrame implements ActionListener {
    // Define GUI components
    private JTextField textField;
    private JButton checkAvailabilityButton, bookButton;
    private JTextArea resultArea;

    // JDBC and database connection details
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/railway_reservation";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    // Constructor to set up the GUI
    public RailwayReservationSystem() {
        setTitle("Railway Reservation System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create GUI components
        textField = new JTextField(10);
        checkAvailabilityButton = new JButton("Check Availability");
        bookButton = new JButton("Book Now");
        resultArea = new JTextArea(10, 30);

        // Add action listeners
        checkAvailabilityButton.addActionListener(this);
        bookButton.addActionListener(this);

        // Create layout and add components
        setLayout(new FlowLayout());
        add(new JLabel("Enter Seat Number:"));
        add(textField);
        add(checkAvailabilityButton);
        add(bookButton);
        add(resultArea);
    }

    // Action performed when buttons are clicked
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkAvailabilityButton) {
            checkSeatAvailability();
        } else if (e.getSource() == bookButton) {
            bookSeat();
        }
    }

    // Method to check seat availability
    private void checkSeatAvailability() {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM seats WHERE seat_number = ?");
            statement.setString(1, textField.getText());

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                resultArea.setText("Seat " + textField.getText() + " is available.");
            } else {
                resultArea.setText("Seat " + textField.getText() + " is not available.");
            }

            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Method to book a seat
    private void bookSeat() {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            PreparedStatement statement = connection.prepareStatement("INSERT INTO booked_seats (seat_number) VALUES (?)");
            statement.setString(1, textField.getText());

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                resultArea.setText("Seat " + textField.getText() + " booked successfully.");
            } else {
                resultArea.setText("Failed to book seat " + textField.getText() + ".");
            }

            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Set up database connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Create and display the GUI
        SwingUtilities.invokeLater(() -> {
            new RailwayReservationSystem().setVisible(true);
        });
    }
}

package ejercicio1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("SQL Query ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        final JTextField queryField = new JTextField();
        contentPane.add(queryField, BorderLayout.NORTH);

        final JTable table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        JButton executeButton = new JButton("Execute Query");
        executeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                executeQuery(queryField.getText(), table);
            }
        });
        contentPane.add(executeButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private static void executeQuery(String query, JTable table) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejer01lab12","root","root");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            Vector<String> columnNames = new Vector<String>();

            for (int i = 1; i <= columns; i++) {
                columnNames.add(md.getColumnName(i));
            }

            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> row = new Vector<Object>(columns);
                for (int i = 1; i <= columns; i++) {
                    row.add(rs.getObject(i));
                }
                data.add(row);
            }

            rs.close();
            stmt.close();
            conn.close();

            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            table.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
        }
    }
}

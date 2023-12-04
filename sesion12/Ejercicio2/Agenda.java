package ejercicio2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Agenda extends JFrame implements ActionListener {

    private JTextField tfID, tfNombre, tfApellido, tfEmail, tfTelefono;
    private JButton btnInsertar, btnAnterior, btnSiguiente;
    private Connection connection;
    private Statement statement;
    private JTable table;

    public Agenda() {
        super("Insertar Datos en Agenda");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 250);

        // Crear componentes
        tfID = new JTextField(10);
        tfNombre = new JTextField(20);
        tfApellido = new JTextField(20);
        tfEmail = new JTextField(30);
        tfTelefono = new JTextField(15);

        btnInsertar = new JButton("Insertar");
        btnInsertar.addActionListener(this);

        // Crear panel para los campos de texto y botón
        JPanel panelDatos = new JPanel(new GridLayout(6, 2));
        panelDatos.add(new JLabel("ID:"));
        panelDatos.add(tfID);
        panelDatos.add(new JLabel("Nombre:"));
        panelDatos.add(tfNombre);
        panelDatos.add(new JLabel("Apellido:"));
        panelDatos.add(tfApellido);
        panelDatos.add(new JLabel("Email:"));
        panelDatos.add(tfEmail);
        panelDatos.add(new JLabel("Teléfono:"));
        panelDatos.add(tfTelefono);
        panelDatos.add(btnInsertar);

        // Agregar panel al JFrame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelDatos, BorderLayout.WEST);

        // Establecer conexión con la base de datos
        conectarDB();
        construirGUI();
    }

    
    private void conectarDB() {
        try {
            String url = "jdbc:mysql://localhost:3306/Agenda";
            String usuario = "root";
            String contraseña = "root";
            connection = DriverManager.getConnection(url, usuario, contraseña);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Construir la interfaz gráfica
    private void construirGUI() {
        // Crear un panel para la tabla y los botones de navegación
        JPanel panelTabla = new JPanel(new BorderLayout());
        table = new JTable();
        table.setModel(new DefaultTableModel(new Object[][] {},
                new String[] { "ID", "Nombre", "Apellido", "Email", "Teléfono" }));

        btnAnterior = new JButton("Anterior");
        btnAnterior.addActionListener(this);
        btnSiguiente = new JButton("Siguiente");
        btnSiguiente.addActionListener(this);

        panelTabla.add(new JScrollPane(table), BorderLayout.CENTER);
        panelTabla.add(btnAnterior, BorderLayout.WEST);
        panelTabla.add(btnSiguiente, BorderLayout.EAST);

        // Agregar panel de la tabla al JFrame
        getContentPane().add(panelTabla, BorderLayout.CENTER);
    }

    // Método para insertar datos en la tabla Agenda
    private void insertarDatos() {
        try {
            int id = Integer.parseInt(tfID.getText());
            String nombre = tfNombre.getText();
            String apellido = tfApellido.getText();
            String email = tfEmail.getText();
            String telefono = tfTelefono.getText();

            String query = "INSERT INTO Agenda (ID, Nombre, Apellido, Email, Telefono) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, nombre);
            preparedStatement.setString(3, apellido);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, telefono);

            int filasInsertadas = preparedStatement.executeUpdate();
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(this, "Datos insertados correctamente en la agenda.");
                tfID.setText("");
                tfNombre.setText("");
                tfApellido.setText("");
                tfEmail.setText("");
                tfTelefono.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Error al insertar datos en la agenda.");
            }

        } catch (NumberFormatException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Manejo de eventos de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnInsertar) {
            insertarDatos();
        } else if (e.getSource() == btnAnterior) {
            // Lógica para ir al registro anterior
        } else if (e.getSource() == btnSiguiente) {
            // Lógica para ir al siguiente registro
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Agenda app = new Agenda();
            app.setVisible(true);
        });
    }
}

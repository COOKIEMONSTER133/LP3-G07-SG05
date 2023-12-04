import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class E {

    private static final String URL = "jdbc:mysql://localhost:3307/base1";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    private static Scanner scanner = new Scanner(System.in);

    private static void insertarRegistro(Connection connection) throws SQLException {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        String insertQuery = "INSERT INTO table1 (nombre, edad) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, PreparedStatement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setInt(2, edad);
            preparedStatement.executeUpdate();
        }
        System.out.println("Registro insertado con éxito.");
    }

    private static void recuperarRegistro(Connection connection) throws SQLException {
        System.out.print("Ingrese ID a recuperar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String selectQuery = "SELECT * FROM table1 WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setInt(1, id);
            try (var resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println("ID: " + resultSet.getInt("id"));
                    System.out.println("Nombre: " + resultSet.getString("nombre"));
                    System.out.println("Edad: " + resultSet.getInt("edad"));
                }
            }
        }
    }

    private static void actualizarRegistro(Connection connection) throws SQLException {
        System.out.print("Ingrese ID a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();

        System.out.print("Ingrese nueva edad: ");
        int nuevaEdad = scanner.nextInt();
        scanner.nextLine();

        String updateQuery = "UPDATE table1 SET nombre = ?, edad = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, nuevoNombre);
            preparedStatement.setInt(2, nuevaEdad);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
        }
        System.out.println("Registro actualizado con éxito.");
    }

    private static void borrarRegistro(Connection connection) throws SQLException {
        System.out.print("Ingrese ID a borrar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String deleteQuery = "DELETE FROM table1 WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
        System.out.println("Registro eliminado con éxito.");
    }

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);

            insertarRegistro(connection);
            recuperarRegistro(connection);
            actualizarRegistro(connection);
            borrarRegistro(connection);

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            if (connection != null) {
                try {
                    connection.setAutoCommit(true);
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            scanner.close();
        }
    }
}

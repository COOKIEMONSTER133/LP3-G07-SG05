import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class D {

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
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
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

    private static void invocarProcedimiento(Connection connection) throws SQLException {
        System.out.print("Ingrese el valor de entrada para el procedimiento almacenado: ");
        int inputValue = scanner.nextInt();
        scanner.nextLine();

        String callProcedure = "{call nombre_del_procedimiento(?)}";
        try (CallableStatement callableStatement = connection.prepareCall(callProcedure)) {
            callableStatement.setInt(1, inputValue);
            callableStatement.execute();
            System.out.println("Procedimiento almacenado invocado con éxito.");
        }
    }

    private static void invocarFuncion(Connection connection) throws SQLException {
        System.out.print("Ingrese el valor de entrada para la función almacenada: ");
        int inputValue = scanner.nextInt();
        scanner.nextLine();

        String callFunction = "{? = call nombre_de_la_funcion(?)}";
        try (CallableStatement callableStatement = connection.prepareCall(callFunction)) {
            callableStatement.registerOutParameter(1, java.sql.Types.INTEGER);
            callableStatement.setInt(2, inputValue);
            callableStatement.execute();
            int result = callableStatement.getInt(1);
            System.out.println("Resultado de la función almacenada: " + result);
        }
    }

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            insertarRegistro(connection);
            recuperarRegistro(connection);
            actualizarRegistro(connection);
            borrarRegistro(connection);
            invocarProcedimiento(connection);
            invocarFuncion(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

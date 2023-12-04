import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.RowSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.util.Scanner;

public class B {

    private static final String URL = "jdbc:mysql://localhost:3307/base1";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";
    private static Scanner scanner = new Scanner(System.in);

    private static void insertarRegistro(JdbcRowSet rowSet) throws SQLException {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        rowSet.moveToInsertRow();
        rowSet.updateString("nombre", nombre);
        rowSet.updateInt("edad", edad);
        rowSet.insertRow();

        System.out.println("Registro insertado con éxito.");
    }

    private static void recuperarRegistro(JdbcRowSet rowSet) throws SQLException {
        System.out.print("Ingrese ID a recuperar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        rowSet.setCommand("SELECT * FROM table1 WHERE id = ?");
        rowSet.setInt(1, id);
        rowSet.execute();

        while (rowSet.next()) {
            System.out.println("ID: " + rowSet.getInt("id"));
            System.out.println("Nombre: " + rowSet.getString("nombre"));
            System.out.println("Edad: " + rowSet.getInt("edad"));
        }
    }

    private static void actualizarRegistro(JdbcRowSet rowSet) throws SQLException {
        System.out.print("Ingrese ID a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();

        System.out.print("Ingrese nueva edad: ");
        int nuevaEdad = scanner.nextInt();
        scanner.nextLine();

        rowSet.setCommand("SELECT * FROM table1 WHERE id = ?");
        rowSet.setInt(1, id);
        rowSet.execute();

        while (rowSet.next()) {
            rowSet.updateString("nombre", nuevoNombre);
            rowSet.updateInt("edad", nuevaEdad);
            rowSet.updateRow();
        }

        System.out.println("Registro actualizado con éxito.");
    }

    private static void borrarRegistro(JdbcRowSet rowSet) throws SQLException {
        System.out.print("Ingrese ID a borrar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        rowSet.setCommand("SELECT * FROM table1 WHERE id = ?");
        rowSet.setInt(1, id);
        rowSet.execute();

        while (rowSet.next()) {
            rowSet.deleteRow();
        }

        System.out.println("Registro eliminado con éxito.");
    }

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {

            rowSet.setUrl(URL);
            rowSet.setUsername(USER);
            rowSet.setPassword(PASSWORD);

            rowSet.setCommand("SELECT * FROM table1");
            rowSet.execute();

            insertarRegistro(rowSet);
            recuperarRegistro(rowSet);
            actualizarRegistro(rowSet);
            borrarRegistro(rowSet);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

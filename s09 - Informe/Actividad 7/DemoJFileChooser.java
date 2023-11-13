import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.io.IOException;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.io.FileWriter;

public class DemoJFileChooser extends JFrame {
    private final JTextArea areaSalida;

    public DemoJFileChooser() throws IOException {
        super("Demo de JFileChooser");
        areaSalida = new JTextArea();
        add(new JScrollPane(areaSalida));
        analizarRuta();
    }

    public void analizarRuta() throws IOException {
        Path ruta = obtenerRutaArchivoDirectorio();

        if (ruta != null && Files.exists(ruta)) {
            StringBuilder builder = new StringBuilder();
            builder.append(String.format("%s:%n", ruta.getFileName()));
            builder.append(String.format("%s un directorio %n", Files.isDirectory(ruta) ? "Es" : "No es"));
            builder.append(String.format("%s una ruta absolutan", ruta.isAbsolute() ? "Es" : "No es"));
            builder.append(String.format("Ultima modificacion: %s%n", Files.getLastModifiedTime(ruta)));
            builder.append(String.format("Tamanio: %s %n", Files.size(ruta)));
            builder.append(String.format("Ruta: %s %n", ruta));
            builder.append(String.format("Ruta absoluta: %s%n", ruta.toAbsolutePath()));
            if (Files.isDirectory(ruta)) {
                builder.append(String.format("%nContenido del directorio:%n"));
                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta);

                for (Path p : flujoDirectorio)
                    builder.append(String.format("%s %n", p));
            }
            areaSalida.setText(builder.toString());
        } else {
            JOptionPane.showMessageDialog(this, ruta.getFileName() + " no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    private Path obtenerRutaArchivoDirectorio() {
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int resultado = selectorArchivos.showSaveDialog(this);
        if (resultado == JFileChooser.CANCEL_OPTION)
            System.exit(1);

        Path ruta = selectorArchivos.getSelectedFile().toPath();
        try {
            FileWriter writer = new FileWriter(ruta.toString());
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce texto (escribe FIN para terminar): ");
            String input = "";
            while (!input.equals("FIN")) {
                input = scanner.nextLine();
                if (!input.equals("FIN")) {
                    writer.write(input + "\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ruta;
    }
}
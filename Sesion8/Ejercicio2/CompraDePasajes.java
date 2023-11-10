import javax.swing.*;

public class CompraDePasajes{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CompraDePasajesGUI gui = new CompraDePasajesGUI();
                gui.setVisible(true);
            }
        });
    }
}
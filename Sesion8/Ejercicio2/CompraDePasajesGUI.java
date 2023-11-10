
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CompraDePasajesGUI extends JFrame {
    private JTextField nombreField;
    private JTextField documentoField;
    private JTextField fechaViajeField;
    private JCheckBox servicioCheckbox;
    private JRadioButton piso1Radio;
    private JRadioButton piso2Radio;
    private JComboBox<String> origenComboBox;
    private JComboBox<String> destinoComboBox;
    private JList<String> calidadServicioList;

    public CompraDePasajesGUI() {
        setTitle("Compra de Pasajes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 450);
        setLayout(new FlowLayout());

        // Panel principal con GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);

        nombreField = new JTextField("Ingrese su nombre", 25);
        documentoField = new JTextField("Ingrese su DNI", 25);
        fechaViajeField = new JTextField("Ingrese la fecha en que viajara:", 25);
        servicioCheckbox = new JCheckBox("Audífonos, Manta, Revistas");
        piso1Radio = new JRadioButton("1er Piso");
        piso2Radio = new JRadioButton("2do Piso");
        ButtonGroup pisoGroup = new ButtonGroup();
        pisoGroup.add(piso1Radio);
        pisoGroup.add(piso2Radio);
        String[] ciudades = { "Arequipa", "Lima", "Cusco" };
        origenComboBox = new JComboBox<>(ciudades);
        destinoComboBox = new JComboBox<>(ciudades);
        String[] servicios = { "Económico", "Standard", "VIP" };
        calidadServicioList = new JList<>(servicios);
        calidadServicioList.setVisibleRowCount(3);
        calidadServicioList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton resumenButton = new JButton("Mostrar Resumen");

        resumenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String documento = documentoField.getText();
                String fechaViaje = fechaViajeField.getText();
                String servicioOpcional = servicioCheckbox.isSelected() ? "Sí" : "No";
                String piso = piso1Radio.isSelected() ? "1er Piso" : "2do Piso";
                String origen = origenComboBox.getSelectedItem().toString();
                String destino = destinoComboBox.getSelectedItem().toString();
                String calidadServicio = calidadServicioList.getSelectedValue();

                String resumen = "Resumen de Compra de Pasaje:\n\n";
                resumen += "Nombre: " + nombre + "\n";
                resumen += "DNI: " + documento + "\n";
                resumen += "Fecha de Viaje: " + fechaViaje + "\n";
                resumen += "Servicio Opcional: " + servicioOpcional + "\n";
                resumen += "Piso: " + piso + "\n";
                resumen += "Origen: " + origen + "\n";
                resumen += "Destino: " + destino + "\n";
                resumen += "Calidad de Servicio: " + calidadServicio;

                JOptionPane.showMessageDialog(null, resumen, "Resumen de Compra", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Agregar componentes al panel con GridBagLayout
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        mainPanel.add(new JLabel("Nombre:"), gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(nombreField, gridBagConstraints);

        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        mainPanel.add(new JLabel("DNI:"), gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(documentoField, gridBagConstraints);

        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        mainPanel.add(new JLabel("Fecha de Viaje:"), gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(fechaViajeField, gridBagConstraints);

        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        mainPanel.add(new JLabel("Servicio Opcional:"), gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(servicioCheckbox, gridBagConstraints);

        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        mainPanel.add(new JLabel("Piso:"), gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(piso1Radio, gridBagConstraints);

        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 1;
        mainPanel.add(piso2Radio, gridBagConstraints);

        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        mainPanel.add(new JLabel("Origen:"), gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(origenComboBox, gridBagConstraints);

        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        mainPanel.add(new JLabel("Destino:"), gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(destinoComboBox, gridBagConstraints);

        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        mainPanel.add(new JLabel("Calidad de Servicio:"), gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(new JScrollPane(calidadServicioList), gridBagConstraints);

        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        mainPanel.add(resumenButton, gridBagConstraints);

        
        add(mainPanel);
    }
}
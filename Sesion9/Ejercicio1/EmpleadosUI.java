package Empleado;


	
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.List;
	import javax.swing.table.DefaultTableModel;
	public class EmpleadosUI extends JFrame {
	       /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JTextField numero, nombre, sueldo;
	       private JButton agregar;
	       private JTable tabla;
	       
	       public EmpleadosUI() {
	    	   setTitle("Empleados");
	    	   setBackground(Color.gray);
	    	   setLayout(new BorderLayout());
	    	   
	    	   JPanel panelSuperior = new JPanel();
	    	   JLabel labelTitulo = new JLabel("Datos del empleado: ");
	    	   panelSuperior.add(labelTitulo);
	    	   add (panelSuperior, BorderLayout.NORTH);
	    	   
	    	   JPanel panelCentro = new JPanel(new GridBagLayout());
	    	   GridBagConstraints gbc = new GridBagConstraints();
	    	   gbc.anchor = GridBagConstraints.WEST;
	    	   gbc.insets = new Insets(5, 5, 5, 5);
	    	   
	    	   JLabel labelNumero = new JLabel("Numero:   ");
	    	   numero = new JTextField(10);
	    	   JLabel labelNombre = new JLabel("Nombre:   ");
	    	   nombre = new JTextField(10);
	    	   JLabel labelSueldo = new JLabel("Sueldo:   ");
	    	   sueldo = new JTextField(10);
	    	               gbc.gridx = 0;
	    	               gbc.gridy = 0;
	    	               panelCentro.add(labelNumero, gbc);
	    	               gbc.gridx = 1;
	    	               gbc.gridy = 0;
	    	               panelCentro.add(numero, gbc);
	    	               gbc.gridx = 0;
	    	               gbc.gridy = 1;
	    	               panelCentro.add(labelNombre, gbc);
	    	               gbc.gridx = 1;
	    	               gbc.gridy = 1;
	    	               panelCentro.add(nombre, gbc);
	    	               gbc.gridx = 0;
	    	               gbc.gridy = 2;
	    	               panelCentro.add(labelSueldo, gbc);
	    	               gbc.gridx = 1;
	    	               gbc.gridy = 2;
	    	               panelCentro.add(sueldo, gbc);
	    	               
	    	  agregar = new JButton("Agregar empleado: ");
	    	  agregar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					agregarEmpleado();
				}

				private void agregarEmpleado() {
					
					
				}
					
				});
	    	  gbc.gridx = 0;
	          gbc.gridy = 3;
	          panelCentro.add(agregar, gbc);  
	    		
	          add(panelCentro, BorderLayout.CENTER);
	          
	          tabla = new JTable(10, 3);
	          tabla.getColumnModel().getColumn(0).setHeaderValue("numero");
	          tabla.getColumnModel().getColumn(1).setHeaderValue("nombre");
	          tabla.getColumnModel().getColumn(2).setHeaderValue("sueldo");
	          
	          JScrollPane scrollPane = new JScrollPane(tabla);
	          add(scrollPane, BorderLayout.SOUTH);
	          
	          labelTitulo.setFont(new Font("Arial", Font.BOLD, 18));
	          agregar.setPreferredSize(new Dimension(200, 30));
	          reporteEmpleados();
	          
	          setSize(400, 300);
	          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          setLocationRelativeTo(null);
	          setVisible(true);
	    	  }

		private void reporteEmpleados() {
		       List<Empleado> empleados = ManejoArchivo.cargarEmpleados();
		       DefaultTableModel model = (DefaultTableModel) tabla.getModel();
		       model.setRowCount(0);
		       
		       for (Empleado empleado : empleados) {
		    	   Object[] rowData = {empleado.getNumero(), empleado.getNombre(), empleado.getSueldo()};
		    	   model.addRow(rowData);
		}
	    	   
	       }
		private void agregarEmpleado() {
		    try {
		        int num = Integer.parseInt(numero.getText());
		        String nom = nombre.getText();
		        double suel = Double.parseDouble(sueldo.getText());

		        Empleado nuevoEmpleado = new Empleado(num, nom, suel);
		        ManejoArchivo.agregarEmpleado(nuevoEmpleado);

		        reporteEmpleados();

		      
		        numero.setText("");
		        nombre.setText("");
		        sueldo.setText("");

		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Ingrese valores válidos para número y sueldo", "Error", JOptionPane.ERROR_MESSAGE);
		    }
		}

			
		
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new EmpleadosUI();
		});

	}

}

package Empleado;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ManejoArchivo {
       private static final String NOMBRE_ARCHIVO = "Empleados.dat";
       
       public static List<Empleado> cargarEmpleados(){
    	   List<Empleado> empleados = new ArrayList<>();
    	   try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))){
    		   empleados = (List<Empleado>) ois.readObject(); 
    	   } catch (FileNotFoundException e) {
    		   
    	   } catch (IOException | ClassNotFoundException e){
    		   e.printStackTrace();
    	   }
		return empleados;
       }
       public static void guardarEmpleados(List<Empleado> empleados) {
    	   try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))){
    		   oos.writeObject(empleados);
    	   } catch (IOException e) {
    		   e.printStackTrace();
    	   }
       }
       public static void AgregarEmpleado(Empleado empleado) {
    	   List<Empleado> empleados = cargarEmpleados();
    	   empleados.add(empleado);
    	   guardarEmpleados(empleados);
       }
	public static void agregarEmpleado(Empleado nuevoEmpleado) {
		// TODO Auto-generated method stub
		
	}
}


public class TestHerencia {
     
	public static void main (String [] args){

      Asalariado emplead1 = new Asalariado  ("Manuel Cortina",
 12345678, 28);
      EmpleadoProduccion emplead2 = new EmpleadoProduccion
("Juan Mota", 55333222, 30, "noche");

      EmpleadoDistribucion emplead3 = new EmpleadoDistribucion
("Antonio Camino", 55333666, 35, "Granada");


 

System.out.println ("El nombre del emplead1 es " +
emplead1.getNombre());

System.out.println ("El nombre del emplead2 es " +
emplead2.getNombre());

System.out.println ("El tumo del emplead2 es " +
emplead2.getTurno());

System.out.println ("El nombre del emplead3 es " +
emplead3.getNombre());

System.out.println ("La region del emplead3 es " +
emplead3.getRegion());

}

}

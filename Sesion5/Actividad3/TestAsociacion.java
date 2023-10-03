public class TestAsociacion {

    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);

      
        Persona cliente1 = new Persona(1, "Gabriel", "Lara", "Tipo1", 1);
        Persona cliente2 = new Persona(2, "Rodrigo", "Gomez", "Tipo2", 2);
        Persona cliente3 = new Persona(3, "Mario", "Caja", "Tipo1", 3);

        bcp.agregarCliente(cliente1);
        bcp.agregarCliente(cliente3); 
        bbva.agregarCliente(cliente2);

      
        bcp.eliminarCliente(1);
        bbva.eliminarCliente(3); 

        
        listarClientesPorTipo(bcp, "Tipo1");
        listarClientesPorTipo(bbva, "Tipo2");

        
        Persona clienteEncontrado = bcp.buscarCliente(3);
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado en el BCP: " + clienteEncontrado.toString());
        } else {
            System.out.println("Cliente no encontrado en el BCP.");
        }

        clienteEncontrado = bbva.buscarCliente(2);
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado en el BBVA: " + clienteEncontrado.toString());
        } else {
            System.out.println("Cliente no encontrado en el BBVA.");
        }
    }

    public static void listarClientesPorTipo(Banco banco, String tipo) {
        System.out.println("Clientes del banco " + banco.getNombre() + " con tipo " + tipo + ":");
        for (Persona cliente : banco.getClientes()) {
            if (cliente != null && cliente.getTipo().equals(tipo)) {
                System.out.println(cliente.toString());
            }
        }
    }
}


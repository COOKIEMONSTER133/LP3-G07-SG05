
public class Banco {

    private String nombre;
    private Persona clientes[];

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return this.clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }

    public void agregarCliente(Persona persona) {
        boolean clienteExist = false;
        for (Persona existingCliente : clientes) {
            if (existingCliente != null && existingCliente.getId() == persona.getId()) {
                clienteExist = true;
                break;
            }
        }

        if (!clienteExist) {
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i] == null) {
                    clientes[i] = persona;
                    break;
                }
            }
        }
    }

    public Persona buscarCliente(int id) {
        for (Persona cliente : clientes) {
            if (cliente != null && cliente.getId() == id) {
                return cliente;
            }
        }
        return null; 
    }
    public void eliminarCliente(int id) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].getId() == id) {
                clientes[i] = null; 
                break;
            }
        }
    }
    public Persona darBajaCliente(int id) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].getId() == id) {
                Persona clienteEliminado = clientes[i];
                clientes[i] = null;
           
                for (int j = clientes.length - 1; j > i; j--) {
                    if (clientes[j] != null) {
                        clientes[i] = clientes[j];
                        clientes[j] = null;
                        break;
                    }
                }
                return clienteEliminado;
            }
        }
        return null; 
    }


    public void clienteTipo(char tipo) {
        System.out.println("Clientes del banco " + this.nombre + " con tipo " + tipo + ":");
        for (Persona cliente : clientes) {
            if (cliente != null && cliente.getTipo().charAt(0) == tipo) {
                System.out.println(cliente.toString());
            }
        }
    }
}

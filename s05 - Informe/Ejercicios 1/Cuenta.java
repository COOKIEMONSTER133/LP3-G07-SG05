public class Cuenta {
    private String numero;
    private double saldo;
    private double cantidad;

    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Retirar(double cantidad) {
        if ((saldo - cantidad) < 50) {
            System.out.println("Su retiro exede el saldo. Cantidad minima en cuenta: 50");
        } else {
            this.saldo = saldo - cantidad;
        }
    }

    public void Depositar(double canttidad) {
        this.saldo = saldo + cantidad;
    }

    public String toString() {
        return numero + "        Saldo:  " + saldo;
    }
}
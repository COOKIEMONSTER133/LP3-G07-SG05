
public interface PorPagar {
    int meses = 12;
    double obtenerMontoPago();
    default double pagoAnual(){
        return obtenerMontoPago()*meses;
    }
	double obtenerMontoPago1();
}
import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }
    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dia (1-31): ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el anio (1900-2050): ");
        int anio = scanner.nextInt();
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
        scanner.close();
    }
    public boolean bisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    public int diasMes(int mes) {
        switch (mes) {
            case 2:
                return bisiesto() ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
    private void valida() {
        if (anio < 1900 || anio > 2050) {
            anio = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (dia < 1 || dia > diasMes(mes)) {
            dia = 1;
        }
    }
    public Fecha setCopia(Fecha fecha) {
        return new Fecha(fecha.dia, fecha.mes, fecha.anio);
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
        valida();
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
        valida();
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
        valida();
    }
    public String corta() {
        return String.format("%02d-%02d-%04d", dia, mes, anio);
    }
    public int diasTranscurridos() {
        int dias = 0;
        for (int i = 1900; i < anio; i++) {
            dias += bisiesto() ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            dias += diasMes(i);
        }
        dias += dia - 1;
        return dias;
    }
    public int diaSemana() {
        int dias = diasTranscurridos();
        return (dias + 1) % 7;
    }
    public String larga() {
        String[] diasSemana = {"domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"};
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return String.format("%s %d de %s de %d", diasSemana[diaSemana()], dia, meses[mes - 1], anio);
    }
    public void fechaTras(long dias) {
        int diasTotales = diasTranscurridos() + (int) dias;
        int anio = 1900;
        while (diasTotales > (bisiesto() ? 366 : 365)) {
            diasTotales -= bisiesto() ? 366 : 365;
            anio++;
        }
        int mes = 1;
        while (diasTotales > diasMes(mes)) {
            diasTotales -= diasMes(mes);
            mes++;
        }
        int dia = diasTotales;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public int diasEntre(Fecha fecha) {
        int dias1 = diasTranscurridos();
        int dias2 = fecha.diasTranscurridos();
        return Math.abs(dias1 - dias2);
    }
    public void siguiente() {
        dia++;
        if (dia > diasMes(mes)) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
    }
    public void anterior() {
        if (dia < 1) {
            mes--;
            if (mes < 1) {
                mes = 12;
                anio--;
            }
            dia = diasMes(mes);
        }
    }
    public void fechaFutura(long dias) {
        fechaTras(dias);
    }
    public Fecha copia() {
        return new Fecha(dia, mes, anio);
    }
    public static boolean igualQue(Fecha fecha1, Fecha fecha2) {
        return fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.anio == fecha2.anio;
    }
    public static boolean menorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.anio < fecha2.anio) {
            return true;
        } else if (fecha1.anio == fecha2.anio) {
            if (fecha1.mes < fecha2.mes) {
                return true;
            } else if (fecha1.mes == fecha2.mes) {
                return fecha1.dia < fecha2.dia;
            }
        }
        return false;
    }
    public static boolean mayorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.anio > fecha2.anio) {
            return true;
        } else if (fecha1.anio == fecha2.anio) {
            if (fecha1.mes > fecha2.mes) {
                return true;
            } else if (fecha1.mes == fecha2.mes) {
                return fecha1.dia > fecha2.dia;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", dia, mes, anio);
    }
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(1, 1, 2023);
        Fecha fecha2 = new Fecha(31, 12, 2023);
        Fecha fecha3 = new Fecha(29, 2, 2024);
        System.out.println("Fecha 1: " + fecha1.larga());
        System.out.println("Fecha 2: " + fecha2.larga());
        System.out.println("Fecha 3: " + fecha3.larga());
        System.out.println("Días entre fecha 1 y fecha 2: " + fecha1.diasEntre(fecha2));
        System.out.println("Días entre fecha 2 y fecha 1: " + fecha2.diasEntre(fecha1));
        fecha1.fechaFutura(365);
        System.out.println("Fecha 1 después de un año: " + fecha1.larga());
        Fecha fecha4 = fecha2.copia();
        System.out.println("Fecha 4 (copia de fecha 2): " + fecha4.larga());
        System.out.println("Fecha 1 igual que fecha 2: " + Fecha.igualQue(fecha1, fecha2));
        System.out.println("Fecha 1 menor que fecha 2: " + Fecha.menorQue(fecha1, fecha2));
        System.out.println("Fecha 1 mayor que fecha 2: " + Fecha.mayorQue(fecha1, fecha2));
    }
}
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int vida, rp;
        boolean fl= false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do {
            vida ++;
            System.out.println("Vida:"+ vida + "\t¿Cual es el número secreto? "); 
            rp = sc.nextInt();
            if (rp == 1234) 
                fl = true;
        }while(vida < 3 && !fl );
        if (fl== true){
            System.out.println("Adivinaste!!!!!");
        }
        else
            System.out.println("ups, perdiste...");
    }
}
public class Regalo {
    public static String elegir(int vida) {
        String gift = "";
        switch(vida) {
            case 1: gift = "Un pasaje al caribe"; break;
            case 2: gift = "Una visita al museo mas cercano a tu casa"; break;
            case 3: gift = "Una entrada al cine"; break;
            }
            return gift;
    }
}
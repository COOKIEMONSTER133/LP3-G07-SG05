public class App {
    public static void main(String[] args) {
        OrderedPair<Integer, Integer> pair1 = new OrderedPair<>(1, 100);
        OrderedPair<Integer, String> pair2 = new OrderedPair<>(2, "Hola mundo");
        OrderedPair<String, Persona> pair3 = new OrderedPair<>("String Persona",
                new Persona("Juan", "Av.Ejercito", "94576823"));

        System.out.println("Par 1: " + pair1);
        System.out.println("Par 2: " + pair2);
        System.out.println("Par 3: " + pair3);
    }
}
public class App {
    public static void main(String[] args) {
        try {
            Bag<Integer> integerBag = new Bag<>(5);
            integerBag.add(1);
            integerBag.add(2);
            System.out.println("Bolsa de Integers: " + integerBag);

            Bag<String> stringBag = new Bag<>(3);
            stringBag.add("Hola");
            stringBag.add("Mundo");
            System.out.println("Bolsa de Strings: " + stringBag);

            Bag<Persona> personaBag = new Bag<>(2);
            personaBag.add(new Persona("Juan", "Av.Ejercito", "94576823"));
            System.out.println("Bolsa de Personas: " + personaBag);

            System.out.println("Removiendo 'Mundo' de la Bolsa de Strings");
            stringBag.remove("COLEGIO");
            System.out.println("Bolsa de Strings despues de la eliminacion: " + stringBag);

            System.out.println("Index de 'Juan' en la Bolsade Personas: "
                    + personaBag.getIndex(new Persona("Juan", "Av.Ejercito", "94576823")));

            Integer[] integerObjects = integerBag.getObjects();
            System.out.print("Objetos en Bolsa de Integers: ");
            for (Integer integer : integerObjects) {
                System.out.print(integer + " ");
            }
            System.out.println();
        } catch (IsFull | IsEmpty | ObjectNoExist e) {
            e.printStackTrace();
        }
    }
}

package zooAnimales;

public class Mamifero extends Animal {
    private static int caballos = 0;
    private static int leones = 0;

    public Mamifero(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
    }

    public Mamifero() {
        super();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero);
    }

    public static int cantidadMamiferos() {
        return caballos + leones;
    }

    @Override
    public String movimiento() {
        return "desplazarse";
    }
}
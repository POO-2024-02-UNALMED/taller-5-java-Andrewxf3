package zooAnimales;

public class Mamifero extends Animal {
    private boolean pelaje;
    private int patas;
    private static int caballos = 0;
    private static int leones = 0;

    public Mamifero() {}

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }

    public static int getCantidadMamiferos() {
        return caballos + leones;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static int getLeones() {
        return leones;
    }
}

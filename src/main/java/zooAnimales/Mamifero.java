package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private static int caballos;
    private static int leones;
    public static ArrayList<Mamifero> listado = new ArrayList<>();

    public Mamifero() {
        super();
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        listado.add(this);
    }

    public static int getCaballos() {
        return caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }
}

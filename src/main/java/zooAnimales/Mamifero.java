package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
    private static int caballos = 0;
    private static int leones = 0;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public Mamifero() {
        super();
    }

    public Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }

    public static int cantidadMamiferos() {
        return caballos + leones;
    }
}
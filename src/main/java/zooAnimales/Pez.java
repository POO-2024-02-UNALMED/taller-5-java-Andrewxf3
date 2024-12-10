package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
    private static int salmones;
    private static int bacalaos;
    private static ArrayList<Pez> listado = new ArrayList<>();

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        listado.add(this);
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, "océano", genero, "rojo", 6);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, "océano", genero, "gris", 6);
    }
}

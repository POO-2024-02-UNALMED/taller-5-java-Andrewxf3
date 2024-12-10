package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;
    protected static int totalAnimales = 0;

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public Animal() {
        totalAnimales++;
    }

    public String toString() {
        if (zona != null) {
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + 
                   " y mi género es " + genero + ", la zona en la que me ubico es " + zona.getNombre() + 
                   ", en el " + zona.getZoologico().getNombre() + ".";
        } else {
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + 
                   " y mi género es " + genero + ".";
        }
    }

    public String movimiento() {
        return "desplazarse";
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
}

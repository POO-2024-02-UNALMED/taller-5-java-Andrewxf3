package gestion;

import java.util.ArrayList;
import java.util.List;

// Clase Zona
public class Zona {
    private List<Animal> animales;
    private String nombre;

    public Zona(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
    }

    public int cantidadAnimales() {
        return animales.size();
    }

    public String getNombre() {
        return nombre;
    }
}

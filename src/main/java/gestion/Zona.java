package gestion;

import java.util.ArrayList;
import java.util.List;

// Clase Zona
public class Zona {
    private List<Animal> animales;
    private String nombre;
    private Zoologico zoo;

    public Zona() {
        this.animales = new ArrayList<>();
    }

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
        animal.setZona(this);
    }

    public int cantidadAnimales() {
        return animales.size();
    }

    public String getNombre() {
        return nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }
}
package gestion;

import java.util.ArrayList;
import java.util.List;
import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private List<Animal> animales;

    public Zona() {
        this.animales = new ArrayList<>();
    }

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
    }

    public int cantidadAnimales() {
        return animales.size();
    }
}

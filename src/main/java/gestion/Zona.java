package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
    private String nombre;
    private ArrayList<Animal> animales = new ArrayList<>();

    public Zona(String nombre) {
        this.nombre = nombre;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }
}

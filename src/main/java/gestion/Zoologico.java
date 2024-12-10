package gestion;

import java.util.ArrayList;
import java.util.List;


public class Zoologico {
    private List<Zona> zonas;
    private String nombre;
    private String direccion;

    public Zoologico() {
        this.zonas = new ArrayList<>();
    }

    public Zoologico(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.zonas = new ArrayList<>();
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public int cantidadTotalAnimales() {
        int total = 0;
        for (Zona zona : zonas) {
            total += zona.cantidadAnimales();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }
}
package gestion;

import java.util.ArrayList;
import java.util.List;


public class Zoologico {
    private List<Zona> zonas;
    private String nombre;

    public Zoologico(String nombre) {
        this.nombre = nombre;
        this.zonas = new ArrayList<>();
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
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

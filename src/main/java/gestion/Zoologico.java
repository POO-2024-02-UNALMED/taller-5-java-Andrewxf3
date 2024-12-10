package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas = new ArrayList<>();

    public Zoologico() {
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }

    public List<Zona> getZona() {
        return zonas;
    }
}

package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {
        listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    public static int cantidadAnfibios() {
        return listado.size();
    }
}

package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<>();
    private String colorPlumas;
    private static int halcones = 0;
    private static int aguilas = 0;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave() {
        listado.add(this);
    }

    public static int cantidadAves() {
        return listado.size();
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "montañas", genero, "café glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "montañas", genero, "blanco y amarillo");
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public static int getHalcones() {
        return halcones;
    }

    public static int getAguilas() {
        return aguilas;
    }

    @Override
    public String movimiento() {
        return "volar";
    }
}

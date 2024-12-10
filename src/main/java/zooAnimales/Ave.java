package zooAnimales;

public class Ave extends Animal {
    private String colorPlumas;
    private static int halcones = 0;
    private static int aguilas = 0;

    public Ave() {}

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "montañas", genero, "café glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "montañas", genero, "blanco y amarillo");
    }

    public static int getCantidadAves() {
        return halcones + aguilas;
    }

    public String movimiento() {
        return "volar";
    }
}

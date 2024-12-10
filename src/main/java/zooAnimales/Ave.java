package zooAnimales;

public class Ave extends Animal {
    private static int halcones = 0;
    private static int aguilas = 0;

    public Ave(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
    }

    public Ave() {
        super();
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "cielo", genero);
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "montañas", genero);
    }

    public static int cantidadAves() {
        return halcones + aguilas;
    }

    @Override
    public String movimiento() {
        return "volar";
    }
}
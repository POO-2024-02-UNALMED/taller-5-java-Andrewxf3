package zooAnimales;

public class Ave extends Animal {
    private String colorPlumas;

    public static int halcones = 0;
    public static int aguilas = 0;

    public Ave() {
        super();
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "montañas", genero, "gris");
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "bosque", genero, "marrón");
    }
}

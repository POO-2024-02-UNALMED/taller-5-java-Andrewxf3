package zooAnimales;

public class Ave extends Animal {
    private String colorPlumas;
    private static int cantidadAves;

    public Ave() {
        super();
        cantidadAves++;
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        cantidadAves++;
    }

    public static int getCantidadAves() {
        return cantidadAves;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    @Override
    public String movimiento() {
        return "volar";
    }
}

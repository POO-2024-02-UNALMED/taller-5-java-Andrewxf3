package zooAnimales;

public class Ave extends Animal {
    private String colorPlumas;

    public Ave() {
        super();
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }
}

package zooAnimales;

public class Ave extends Animal {
    private String colorPlumas;

    // Constructor vacío
    public Ave() {
        super();
        incrementarAves();
    }

    // Constructor con parámetros
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        incrementarAves();
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    // Getters y setters
    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}

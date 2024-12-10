package zooAnimales;

public class Pez extends Animal {
    private String colorEscamas;
    private int cantidadAletas;

    // Constructor vacío
    public Pez() {
        super();
        incrementarPeces();
    }

    // Constructor con parámetros
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        incrementarPeces();
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    // Getters y setters
    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}

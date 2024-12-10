package zooAnimales;

public class Pez extends Animal {
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
        super();
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }
}

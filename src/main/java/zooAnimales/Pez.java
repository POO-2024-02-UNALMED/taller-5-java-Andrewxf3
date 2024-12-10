package zooAnimales;

public class Pez extends Animal {
    private String colorEscamas;
    private int cantidadAletas;
    private static int cantidadPeces;

    public Pez() {
        super();
        cantidadPeces++;
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        cantidadPeces++;
    }

    public static int getCantidadPeces() {
        return cantidadPeces;
    }

    @Override
    public String movimiento() {
        return "nadar";
    }
}

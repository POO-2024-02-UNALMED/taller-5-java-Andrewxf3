package zooAnimales;

public class Pez extends Animal {
    private static int salmones = 0;
    private static int bacalaos = 0;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public Pez() {
        super();
    }

    public Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, "océano", genero, "rojo", 6);
    }

    public Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, "océano", genero, "gris", 6);
    }

    public static int cantidadPeces() {
        return salmones + bacalaos;
    }

    @Override
    public String movimiento() {
        return "nadar";
    }
}


package zooAnimales;

public class Pez extends Animal {
    private String colorEscamas;
    private int cantidadAletas;

    public static int salmones = 0;
    public static int bacalaos = 0;

    public Pez() {
        super();
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, "ríos", genero, "plateado", 2);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, "océano", genero, "verde", 3);
    }
}

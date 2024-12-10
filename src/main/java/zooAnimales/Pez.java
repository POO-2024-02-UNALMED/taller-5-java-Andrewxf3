package zooAnimales;

public class Pez extends Animal {
    private static int salmones = 0;
    private static int bacalaos = 0;

    public Pez(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
    }

    public Pez() {
        super();
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, "océano", genero);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, "océano", genero);
    }

    public static int cantidadPeces() {
        return salmones + bacalaos;
    }

    @Override
    public String movimiento() {
        return "nadar";
    }
}
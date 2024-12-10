package zooAnimales;

public class Mamifero extends Animal {
    private boolean pelaje;
    private int patas;
    private static int cantidadMamiferos;

    public Mamifero() {
        super();
        cantidadMamiferos++;
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        cantidadMamiferos++;
    }

    public static int getCantidadMamiferos() {
        return cantidadMamiferos;
    }

    @Override
    public String movimiento() {
        return "desplazarse";
    }
}

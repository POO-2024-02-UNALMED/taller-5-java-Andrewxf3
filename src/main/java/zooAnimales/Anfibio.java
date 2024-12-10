package zooAnimales;

public class Anfibio extends Animal {
    private static int cantidadAnfibios;

    public Anfibio() {
        super();
        cantidadAnfibios++;
    }

    public Anfibio(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        cantidadAnfibios++;
    }

    public static int getCantidadAnfibios() {
        return cantidadAnfibios;
    }

    @Override
    public String movimiento() {
        return "saltar";
    }
}

package zooAnimales;

public class Anfibio extends Animal {
    public Anfibio() {
        super();
        incrementarAnfibios();
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        incrementarAnfibios();
    }

    @Override
    public String movimiento() {
        return "saltar";
    }
}

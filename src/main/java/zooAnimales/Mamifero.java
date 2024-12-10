package zooAnimales;

public class Mamifero extends Animal {
    private boolean pelaje;
    private int patas;

    // Constructor vacío
    public Mamifero() {
        super();
        incrementarMamiferos();
    }

    // Constructor con parámetros
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        incrementarMamiferos();
    }

    @Override
    public String movimiento() {
        return "desplazarse";
    }

    // Getters y setters
    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}

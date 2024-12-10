package zooAnimales;

public class Mamifero extends Animal {
    public Mamifero() {
        super();
        incrementarMamiferos();
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        incrementarMamiferos();
    }

    @Override
    public String movimiento() {
        return "desplazarse";
    }
}

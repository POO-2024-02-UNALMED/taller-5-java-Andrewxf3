package zooAnimales;

public class Reptil extends Animal {
    public Reptil() {
        super();
        incrementarReptiles();
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        incrementarReptiles();
    }

    @Override
    public String movimiento() {
        return "reptar";
    }
}

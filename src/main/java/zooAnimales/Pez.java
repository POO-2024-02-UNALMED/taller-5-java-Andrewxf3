package zooAnimales;

public class Pez extends Animal {
    public Pez() {
        super();
        incrementarPeces();
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        incrementarPeces();
    }

    @Override
    public String movimiento() {
        return "nadar";
    }
}

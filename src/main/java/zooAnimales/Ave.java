package zooAnimales;

public class Ave extends Animal {
    public Ave() {
        super();
        incrementarAves();
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        incrementarAves();
    }

    @Override
    public String movimiento() {
        return "volar";
    }
}

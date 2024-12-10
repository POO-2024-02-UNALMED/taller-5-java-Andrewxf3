package zooAnimales;

public class Reptil extends Animal {
    private static int iguanas = 0;
    private static int serpientes = 0;

    public Reptil(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
    }

    public Reptil() {
        super();
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, "selva", genero);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "desierto", genero);
    }

    public static int cantidadReptiles() {
        return iguanas + serpientes;
    }

    @Override
    public String movimiento() {
        return "reptar";
    }
}

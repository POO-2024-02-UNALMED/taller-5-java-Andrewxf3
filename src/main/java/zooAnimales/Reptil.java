package zooAnimales;

public class Reptil extends Animal {
    private String colorEscamas;
    private int largoCola;

    public static int iguanas = 0;
    public static int serpientes = 0;

    public Reptil() {
        super();
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, "selva", genero, "verde", 3);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "desierto", genero, "marrón", 5);
    }
}

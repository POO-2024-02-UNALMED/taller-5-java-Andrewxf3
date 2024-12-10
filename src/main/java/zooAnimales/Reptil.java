package zooAnimales;

public class Reptil extends Animal {
    private String colorEscamas;
    private int largoCola;
    private static int cantidadReptiles;

    public Reptil() {
        super();
        cantidadReptiles++;
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        cantidadReptiles++;
    }

    public static int getCantidadReptiles() {
        return cantidadReptiles;
    }

    @Override
    public String movimiento() {
        return "reptar";
    }
}

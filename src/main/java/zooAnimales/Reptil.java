package zooAnimales;

public class Reptil extends Animal {
    private String colorEscamas;
    private int largoCola;

    // Constructor vacío
    public Reptil() {
        super();
        incrementarReptiles();
    }

    // Constructor con parámetros
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        incrementarReptiles();
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    // Getters y setters
    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
}

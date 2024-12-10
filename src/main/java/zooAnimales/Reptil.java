package zooAnimales;

public class Reptil extends Animal {
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        super();
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }
}

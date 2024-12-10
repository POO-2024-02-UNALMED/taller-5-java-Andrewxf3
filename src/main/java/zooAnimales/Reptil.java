package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
    private static ArrayList<Reptil> listado = new ArrayList<>();
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public static int cantidadReptiles() {
        return listado.size();
    }
}

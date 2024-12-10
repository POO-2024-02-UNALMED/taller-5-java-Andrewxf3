package zooAnimales;

public class Anfibio extends Animal {
    private String colorPiel;
    private boolean venenoso;

    // Constructor vacío
    public Anfibio() {
        super();
        incrementarAnfibios();
    }

    // Constructor con parámetros
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        incrementarAnfibios();
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    // Getters y setters
    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}

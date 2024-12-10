package zooAnimales;

public class Anfibio extends Animal {
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {
        super();
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }
}

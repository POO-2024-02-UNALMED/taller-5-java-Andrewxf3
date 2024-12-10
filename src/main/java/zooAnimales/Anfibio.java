package zooAnimales;

public class Anfibio extends Animal {
    private String colorPiel;
    private boolean venenoso;

    public static int ranas = 0;
    public static int salamandras = 0;

    public Anfibio() {
        super();
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "verde", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, "bosque", genero, "marrón", false);
    }
}

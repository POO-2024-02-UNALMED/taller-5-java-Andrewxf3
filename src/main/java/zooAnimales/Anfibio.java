package zooAnimales;

public class Anfibio extends Animal {
    private static int ranas = 0;
    private static int salamandras = 0;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public Anfibio() {
        super();
    }

    public Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }

    public Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }

    public static int cantidadAnfibios() {
        return ranas + salamandras;
    }

    @Override
    public String movimiento() {
        return "saltar";
    }
}
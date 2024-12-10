package zooAnimales;

public class Anfibio extends Animal {
    private static int ranas = 0;
    private static int salamandras = 0;

    public Anfibio(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
    }

    public Anfibio() {
        super();
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, "charcas", genero);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, "bosques", genero);
    }

    public static int cantidadAnfibios() {
        return ranas + salamandras;
    }

    @Override
    public String movimiento() {
        return "saltar";
    }
}

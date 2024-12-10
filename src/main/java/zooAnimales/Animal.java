package zooAnimales;

public class Animal {
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;

    private static int totalMamiferos = 0;
    private static int totalAves = 0;
    private static int totalReptiles = 0;
    private static int totalPeces = 0;
    private static int totalAnfibios = 0;

    public Animal() {
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getGenero() {
        return genero;
    }

    public static String totalPorTipo() {
        return "Mamiferos: " + totalMamiferos + "\n" +
               "Aves: " + totalAves + "\n" +
               "Reptiles: " + totalReptiles + "\n" +
               "Peces: " + totalPeces + "\n" +
               "Anfibios: " + totalAnfibios;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad +
               ", habito en " + habitat + " y mi genero es " + genero;
    }

    public String movimiento() {
        return "desplazarse";
    }

    protected static void incrementarMamiferos() {
        totalMamiferos++;
    }

    protected static void incrementarAves() {
        totalAves++;
    }

    protected static void incrementarReptiles() {
        totalReptiles++;
    }

    protected static void incrementarPeces() {
        totalPeces++;
    }

    protected static void incrementarAnfibios() {
        totalAnfibios++;
    }
}

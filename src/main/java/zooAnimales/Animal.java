package zooAnimales;

public class Animal {
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private static int totalAnimales;

    public Animal() {}

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
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
        return "Mamíferos: " + Mamifero.listado.size() + "\n" +
               "Aves: " + Ave.listado.size() + "\n" +
               "Reptiles: " + Reptil.listado.size() + "\n" +
               "Peces: " + Pez.listado.size() + "\n" +
               "Anfibios: " + Anfibio.listado.size();
    }

    public String movimiento() {
        return "desplazarse";
    }
}

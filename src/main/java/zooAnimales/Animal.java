package zooAnimales;

public class Animal {
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private static int totalAnimales;

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String movimiento() {
        return "desplazarse";
    }

    public static String totalPorTipo() {
        return "Mamiferos: " + Mamifero.getCantidadMamiferos() + "\n" +
               "Aves: " + Ave.getCantidadAves() + "\n" +
               "Reptiles: " + Reptil.getCantidadReptiles() + "\n" +
               "Peces: " + Pez.getCantidadPeces() + "\n" +
               "Anfibios: " + Anfibio.getCantidadAnfibios();
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + 
               ", habito en " + habitat + " y mi genero es " + genero;
    }
}

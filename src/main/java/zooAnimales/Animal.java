package zooAnimales;


public class Animal {
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    protected static int totalAnimales = 0;
    protected Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public Animal() {
        totalAnimales++;
    }

    public String toString() {
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
    }

    public String movimiento() {
        return "desplazarse";
    }

    public static String totalPorTipo() {
        return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
               "Aves: " + Ave.cantidadAves() + "\n" +
               "Reptiles: " + Reptil.cantidadReptiles() + "\n" +
               "Peces: " + Pez.cantidadPeces() + "\n" +
               "Anfibios: " + Anfibio.cantidadAnfibios();
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
}

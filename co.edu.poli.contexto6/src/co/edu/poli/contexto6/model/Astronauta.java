package co.edu.poli.contexto6.model;
/**
 * Representa un astronauta dentro del sistema de monitoreo médico.
 * Contiene información personal y física del astronauta como
 * su nombre, año de nacimiento, rol dentro de la misión,
 * peso y altura.
 * 
 * @author Narath Teheran
 * @since 2026
 */
public class Astronauta {

    /** Identificador único del astronauta */
    private String id;

    /** Nombre del astronauta */
    private String nombre;

    /** Año de nacimiento del astronauta */
    private int anionacimiento;

    /** Rol que cumple el astronauta dentro de la misión */
    private String rol;

    /** Peso del astronauta en kilogramos */
    private double peso;

    /** Altura del astronauta en metros */
    private double altura;

    /**
     * Constructor de la clase Astronauta.
     *
     * @param id identificador del astronauta
     * @param nombre nombre del astronauta
     * @param anionacimiento año de nacimiento
     * @param rol rol que cumple en la misión
     * @param peso peso del astronauta
     * @param altura altura del astronauta
     */
    public Astronauta(String id, String nombre, int anionacimiento, String rol, double peso, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.anionacimiento = anionacimiento;
        this.rol = rol;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Calcula la edad del astronauta con base en el año actual.
     *
     * @param anioactual año actual
     * @return edad del astronauta
     */
    public int calcularedad(int anioactual) {
        return anioactual - anionacimiento;
    }

    //Getters y setters
    /**
     * Obtiene el identificador del astronauta.
     * @return id del astronauta
     */
    public String getId() { return id; }

    /**
     * Establece el identificador del astronauta.
     * @param id nuevo identificador
     */
    public void setId(String id) { this.id = id; }

    /**
     * Obtiene el nombre del astronauta.
     * @return nombre del astronauta
     */
    public String getNombre() { return nombre; }

    /**
     * Establece el nombre del astronauta.
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Obtiene el año de nacimiento del astronauta.
     * @return año de nacimiento
     */
    public int getAnionacimiento() { return anionacimiento; }

    /**
     * Establece el año de nacimiento del astronauta.
     * @param anionacimiento nuevo año de nacimiento
     */
    public void setAnionacimiento(int anionacimiento) { this.anionacimiento = anionacimiento; }

    /**
     * Obtiene el rol del astronauta en la misión.
     * @return rol del astronauta
     */
    public String getRol() { return rol; }

    /**
     * Establece el rol del astronauta en la misión.
     * @param rol nuevo rol
     */
    public void setRol(String rol) { this.rol = rol; }

    /**
     * Obtiene el peso del astronauta.
     * @return peso en kilogramos
     */
    public double getPeso() { return peso; }

    /**
     * Establece el peso del astronauta.
     * @param peso nuevo peso
     */
    public void setPeso(double peso) { this.peso = peso; }

    /**
     * Obtiene la altura del astronauta.
     * @return altura en metros
     */
    public double getAltura() { return altura; }

    /**
     * Establece la altura del astronauta.
     * @param altura nueva altura
     */
    public void setAltura(double altura) { this.altura = altura; }

    /**
     * Devuelve una representación en texto del astronauta.
     *
     * @return información del astronauta en formato String
     */
    @Override
    public String toString() {
        return "Astronauta{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", anionacimiento=" + anionacimiento +
                ", rol='" + rol + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
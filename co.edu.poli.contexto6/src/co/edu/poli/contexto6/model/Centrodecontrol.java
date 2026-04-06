package co.edu.poli.contexto6.model;

/**
 * Representa un centro de control encargado de monitorear
 * y gestionar las operaciones de la misión espacial.
 * 
 * Contiene información sobre su identificación, nombre,
 * ubicación y la capacidad máxima de personal que puede
 * operar en el centro.
 * 
 * @author Narath Teheran
 * @since 2026
 */
public class Centrodecontrol {

    /** Identificador único del centro de control */
    private String id;

    /** Nombre del centro de control */
    private String nombre;

    /** Ubicación del centro de control */
    private String ubicacion;

    /** Capacidad máxima de personal del centro */
    private int capacidaddepersonal;

    /**
     * Constructor de la clase Centrodecontrol.
     *
     * @param id identificador del centro de control
     * @param nombre nombre del centro
     * @param ubicacion ubicación del centro
     * @param capacidaddepersonal capacidad máxima de personal
     */
    public Centrodecontrol(String id, String nombre, String ubicacion, int capacidaddepersonal) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidaddepersonal = capacidaddepersonal;
    }

    /**
     * Calcula el porcentaje de ocupación del centro de control
     * con base en el personal actual.
     *
     * @param personalactual cantidad de personal actualmente en el centro
     * @return porcentaje de ocupación del centro
     */
    public double calcularocupacion(int personalactual) {
        if (capacidaddepersonal <= 0) return 0.0;
        return (personalactual * 100.0) / capacidaddepersonal;
    }
//Getters y setters
    /**
     * Obtiene el identificador del centro de control.
     * @return id del centro
     */
    public String getId() { return id; }

    /**
     * Establece el identificador del centro de control.
     * @param id nuevo identificador
     */
    public void setId(String id) { this.id = id; }

    /**
     * Obtiene el nombre del centro de control.
     * @return nombre del centro
     */
    public String getNombre() { return nombre; }

    /**
     * Establece el nombre del centro de control.
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Obtiene la ubicación del centro de control.
     * @return ubicación del centro
     */
    public String getUbicacion() { return ubicacion; }

    /**
     * Establece la ubicación del centro de control.
     * @param ubicacion nueva ubicación
     */
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    /**
     * Obtiene la capacidad máxima de personal del centro.
     * @return capacidad de personal
     */
    public int getCapacidaddepersonal() { return capacidaddepersonal; }

    /**
     * Establece la capacidad máxima de personal del centro.
     * @param capacidaddepersonal nueva capacidad
     */
    public void setCapacidaddepersonal(int capacidaddepersonal) { this.capacidaddepersonal = capacidaddepersonal; }

    /**
     * Devuelve una representación en texto del centro de control.
     *
     * @return información del centro de control
     */
    @Override
    public String toString() {
        return "Centrodecontrol{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidaddepersonal=" + capacidaddepersonal +
                '}';
    }
}
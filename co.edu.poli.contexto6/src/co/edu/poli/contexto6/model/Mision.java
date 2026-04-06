package co.edu.poli.contexto6.model;

import java.util.Arrays;

/**
 * Representa una misión espacial.
 * Una misión contiene información sobre los astronautas participantes,
 * la nave utilizada, el planeta de destino, fechas de inicio y fin
 * y el centro de control responsable.
 * 
 * @author Narath
 * @since 2026
 */
public class Mision {

    private Astronauta[] astronauta;
    private Nave nave;
    private Planeta planeta;
    private String id;
    private String nombre;
    private String fechadeinicio;
    private String fechadefin;
    private Centrodecontrol centrodecontrol;

    /**
     * Constructor que crea una misión con todos sus datos.
     * 
     * @param astronauta arreglo de astronautas que participan en la misión
     * @param nave nave utilizada en la misión
     * @param planeta planeta destino de la misión
     * @param id identificador único de la misión
     * @param nombre nombre de la misión
     * @param fechadeinicio fecha de inicio de la misión
     * @param fechadefin fecha de finalización de la misión
     * @param centrodecontrol centro de control encargado de la misión
     */
    public Mision(Astronauta[] astronauta, Nave nave, Planeta planeta, String id, String nombre,
                  String fechadeinicio, String fechadefin, Centrodecontrol centrodecontrol) {
        this.astronauta = astronauta;
        this.nave = nave;
        this.planeta = planeta;
        this.id = id;
        this.nombre = nombre;
        this.fechadeinicio = fechadeinicio;
        this.fechadefin = fechadefin;
        this.centrodecontrol = centrodecontrol;
    }

    /**
     * Calcula la duración de la misión.
     * 
     * @return duración de la misión
     */
    public double duracion() {
        return 0;
    }

    //Gettters y setters
    /**
     * Obtiene los astronautas de la misión.
     * 
     * @return arreglo de astronautas
     */
    public Astronauta[] getAstronauta() { return astronauta; }

    /**
     * Modifica los astronautas de la misión.
     * 
     * @param astronauta nuevo arreglo de astronautas
     */
    public void setAstronauta(Astronauta[] astronauta) { this.astronauta = astronauta; }

    /**
     * Obtiene la nave de la misión.
     * 
     * @return nave utilizada
     */
    public Nave getNave() { return nave; }

    /**
     * Modifica la nave de la misión.
     * 
     * @param nave nueva nave
     */
    public void setNave(Nave nave) { this.nave = nave; }

    /**
     * Obtiene el planeta destino.
     * 
     * @return planeta de la misión
     */
    public Planeta getPlaneta() { return planeta; }

    /**
     * Modifica el planeta destino.
     * 
     * @param planeta nuevo planeta
     */
    public void setPlaneta(Planeta planeta) { this.planeta = planeta; }

    /**
     * Obtiene el id de la misión.
     * 
     * @return id de la misión
     */
    public String getId() { return id; }

    /**
     * Modifica el id de la misión.
     * 
     * @param id nuevo id
     */
    public void setId(String id) { this.id = id; }

    /**
     * Obtiene el nombre de la misión.
     * 
     * @return nombre de la misión
     */
    public String getNombre() { return nombre; }

    /**
     * Modifica el nombre de la misión.
     * 
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Obtiene la fecha de inicio de la misión.
     * 
     * @return fecha de inicio
     */
    public String getFechadeinicio() { return fechadeinicio; }

    /**
     * Modifica la fecha de inicio de la misión.
     * 
     * @param fechadeinicio nueva fecha de inicio
     */
    public void setFechadeinicio(String fechadeinicio) { this.fechadeinicio = fechadeinicio; }

    /**
     * Obtiene la fecha de finalización de la misión.
     * 
     * @return fecha de finalización
     */
    public String getFechadefin() { return fechadefin; }

    /**
     * Modifica la fecha de finalización de la misión.
     * 
     * @param fechadefin nueva fecha de fin
     */
    public void setFechadefin(String fechadefin) { this.fechadefin = fechadefin; }

    /**
     * Obtiene el centro de control de la misión.
     * 
     * @return centro de control
     */
    public Centrodecontrol getCentrodecontrol() { return centrodecontrol; }

    /**
     * Modifica el centro de control de la misión.
     * 
     * @param centrodecontrol nuevo centro de control
     */
    public void setCentrodecontrol(Centrodecontrol centrodecontrol) { this.centrodecontrol = centrodecontrol; }

    /**
     * Representación en texto de la misión.
     * 
     * @return información de la misión en formato String
     */
    @Override
    public String toString() {
        return "Mision{" +
                "astronauta=" + Arrays.toString(astronauta) +
                ", nave=" + nave +
                ", planeta=" + planeta +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechadeinicio='" + fechadeinicio + '\'' +
                ", fechadefin='" + fechadefin + '\'' +
                ", centrodecontrol=" + centrodecontrol +
                '}';
    }
}
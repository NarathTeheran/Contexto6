package co.edu.poli.contexto6.model;

/**
 * Representa una nave espacial utilizada en una misión.
 * Contiene información sobre su tipo, capacidad, combustible,
 * material de fabricación y características físicas.
 * 
 * @author Narath
 * @since 2026
 */
public class Nave {

    private String tipo;
    private int capacidad;
    private Combustible combustible;
    private String fechadecarga;
    private double capacidaddecombustible;
    private String material;
    private double tamanio;
    private String fechadefabricacion;

    /**
     * Constructor que crea una nave con todas sus características.
     *
     * @param tipo tipo de nave
     * @param capacidad cantidad de tripulantes que puede transportar
     * @param combustible tipo de combustible utilizado
     * @param fechadecarga fecha en la que se cargó el combustible
     * @param capacidaddecombustible capacidad máxima de combustible
     * @param material material con el que está construida la nave
     * @param tamanio tamaño de la nave
     * @param fechadefabricacion fecha de fabricación de la nave
     */
    public Nave(String tipo, int capacidad, Combustible combustible, String fechadecarga,
                double capacidaddecombustible, String material, double tamanio, String fechadefabricacion) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.combustible = combustible;
        this.fechadecarga = fechadecarga;
        this.capacidaddecombustible = capacidaddecombustible;
        this.material = material;
        this.tamanio = tamanio;
        this.fechadefabricacion = fechadefabricacion;
    }

    /**
     * Calcula el consumo de combustible de la nave según la distancia recorrida.
     *
     * @param distancia distancia del viaje
     * @return consumo estimado de combustible
     */
    public double calcularconsumo(double distancia) {
        return 0;
    }

    //Getters y setters
    /**
     * Obtiene el tipo de nave.
     * 
     * @return tipo de nave
     */
    public String getTipo() { return tipo; }

    /**
     * Modifica el tipo de nave.
     * 
     * @param tipo nuevo tipo de nave
     */
    public void setTipo(String tipo) { this.tipo = tipo; }

    /**
     * Obtiene la capacidad de la nave.
     * 
     * @return capacidad de tripulantes
     */
    public int getCapacidad() { return capacidad; }

    /**
     * Modifica la capacidad de la nave.
     * 
     * @param capacidad nueva capacidad
     */
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    /**
     * Obtiene el tipo de combustible de la nave.
     * 
     * @return combustible utilizado
     */
    public Combustible getCombustible() { return combustible; }

    /**
     * Modifica el combustible de la nave.
     * 
     * @param combustible nuevo combustible
     */
    public void setCombustible(Combustible combustible) { this.combustible = combustible; }

    /**
     * Obtiene la fecha de carga de combustible.
     * 
     * @return fecha de carga
     */
    public String getFechadecarga() { return fechadecarga; }

    /**
     * Modifica la fecha de carga de combustible.
     * 
     * @param fechadecarga nueva fecha
     */
    public void setFechadecarga(String fechadecarga) { this.fechadecarga = fechadecarga; }

    /**
     * Obtiene la capacidad de combustible de la nave.
     * 
     * @return capacidad de combustible
     */
    public double getCapacidaddecombustible() { return capacidaddecombustible; }

    /**
     * Modifica la capacidad de combustible.
     * 
     * @param capacidaddecombustible nueva capacidad
     */
    public void setCapacidaddecombustible(double capacidaddecombustible) { this.capacidaddecombustible = capacidaddecombustible; }

    /**
     * Obtiene el material de fabricación de la nave.
     * 
     * @return material de la nave
     */
    public String getMaterial() { return material; }

    /**
     * Modifica el material de fabricación.
     * 
     * @param material nuevo material
     */
    public void setMaterial(String material) { this.material = material; }

    /**
     * Obtiene el tamaño de la nave.
     * 
     * @return tamaño de la nave
     */
    public double getTamanio() { return tamanio; }

    /**
     * Modifica el tamaño de la nave.
     * 
     * @param tamanio nuevo tamaño
     */
    public void setTamanio(double tamanio) { this.tamanio = tamanio; }

    /**
     * Obtiene la fecha de fabricación de la nave.
     * 
     * @return fecha de fabricación
     */
    public String getFechadefabricacion() { return fechadefabricacion; }

    /**
     * Modifica la fecha de fabricación.
     * 
     * @param fechadefabricacion nueva fecha
     */
    public void setFechadefabricacion(String fechadefabricacion) { this.fechadefabricacion = fechadefabricacion; }

    /**
     * Representación en texto de la nave.
     *
     * @return información de la nave en formato String
     */
    @Override
    public String toString() {
        return "Nave{" +
                "tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                ", combustible=" + combustible +
                ", fechadecarga='" + fechadecarga + '\'' +
                ", capacidaddecombustible=" + capacidaddecombustible +
                ", material='" + material + '\'' +
                ", tamanio=" + tamanio +
                ", fechadefabricacion='" + fechadefabricacion + '\'' +
                '}';
    }
}
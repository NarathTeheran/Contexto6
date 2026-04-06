package co.edu.poli.contexto6.model;

/**
 * Representa un planeta dentro del sistema de misiones espaciales.
 * Contiene información física como masa, radio, gravedad, temperatura
 * y características generales como color y habitabilidad.
 * 
 * @author Narath
 * @since 2026
 */
public class Planeta {

    private String codigo;
    private String nombre;
    private double tamanio;
    private double masa;
    private double radio;
    private String color;
    private double gravedad;
    private double temperatura;
    private String habitabilidad;

    /**
     * Constructor que crea un planeta con todas sus características.
     *
     * @param codigo identificador del planeta
     * @param nombre nombre del planeta
     * @param tamanio tamaño del planeta
     * @param masa masa del planeta
     * @param radio radio del planeta
     * @param color color predominante del planeta
     * @param gravedad gravedad del planeta
     * @param temperatura temperatura promedio del planeta
     * @param habitabilidad nivel de habitabilidad del planeta
     */
    public Planeta(String codigo, String nombre, double tamanio, double masa, double radio,
                   String color, double gravedad, double temperatura, String habitabilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.masa = masa;
        this.radio = radio;
        this.color = color;
        this.gravedad = gravedad;
        this.temperatura = temperatura;
        this.habitabilidad = habitabilidad;
    }

    /**
     * Calcula la velocidad de escape del planeta usando la fórmula:
     * v = √(2 * g * r)
     *
     * @return velocidad de escape estimada
     */
    public double calcularvelocidad() {
        return Math.sqrt(2.0 * gravedad * radio);
    }

    //Getters y setters
    /**
     * Obtiene el código del planeta.
     * 
     * @return código del planeta
     */
    public String getCodigo() { return codigo; }

    /**
     * Modifica el código del planeta.
     * 
     * @param codigo nuevo código
     */
    public void setCodigo(String codigo) { this.codigo = codigo; }

    /**
     * Obtiene el nombre del planeta.
     * 
     * @return nombre del planeta
     */
    public String getNombre() { return nombre; }

    /**
     * Modifica el nombre del planeta.
     * 
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Obtiene el tamaño del planeta.
     * 
     * @return tamaño del planeta
     */
    public double getTamanio() { return tamanio; }

    /**
     * Modifica el tamaño del planeta.
     * 
     * @param tamanio nuevo tamaño
     */
    public void setTamanio(double tamanio) { this.tamanio = tamanio; }

    /**
     * Obtiene la masa del planeta.
     * 
     * @return masa del planeta
     */
    public double getMasa() { return masa; }

    /**
     * Modifica la masa del planeta.
     * 
     * @param masa nueva masa
     */
    public void setMasa(double masa) { this.masa = masa; }

    /**
     * Obtiene el radio del planeta.
     * 
     * @return radio del planeta
     */
    public double getRadio() { return radio; }

    /**
     * Modifica el radio del planeta.
     * 
     * @param radio nuevo radio
     */
    public void setRadio(double radio) { this.radio = radio; }

    /**
     * Obtiene el color del planeta.
     * 
     * @return color del planeta
     */
    public String getColor() { return color; }

    /**
     * Modifica el color del planeta.
     * 
     * @param color nuevo color
     */
    public void setColor(String color) { this.color = color; }

    /**
     * Obtiene la gravedad del planeta.
     * 
     * @return gravedad del planeta
     */
    public double getGravedad() { return gravedad; }

    /**
     * Modifica la gravedad del planeta.
     * 
     * @param gravedad nueva gravedad
     */
    public void setGravedad(double gravedad) { this.gravedad = gravedad; }

    /**
     * Obtiene la temperatura promedio del planeta.
     * 
     * @return temperatura del planeta
     */
    public double getTemperatura() { return temperatura; }

    /**
     * Modifica la temperatura del planeta.
     * 
     * @param temperatura nueva temperatura
     */
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }

    /**
     * Obtiene el nivel de habitabilidad del planeta.
     * 
     * @return habitabilidad del planeta
     */
    public String getHabitabilidad() { return habitabilidad; }

    /**
     * Modifica el nivel de habitabilidad.
     * 
     * @param habitabilidad nueva condición de habitabilidad
     */
    public void setHabitabilidad(String habitabilidad) { this.habitabilidad = habitabilidad; }

    /**
     * Representación en texto del planeta.
     *
     * @return información del planeta en formato String
     */
    @Override
    public String toString() {
        return "Planeta{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tamanio=" + tamanio +
                ", masa=" + masa +
                ", radio=" + radio +
                ", color='" + color + '\'' +
                ", gravedad=" + gravedad +
                ", temperatura=" + temperatura +
                ", habitabilidad='" + habitabilidad + '\'' +
                '}';
    }
}
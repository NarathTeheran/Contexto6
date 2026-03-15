package co.edu.poli.contexto6.model;

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
     * Ejemplo: velocidad de escape v = sqrt(2 * g * r)
     */
    public double calcularvelocidad() {
        return Math.sqrt(2.0 * gravedad * radio);
    }

    // Getters y setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getTamanio() { return tamanio; }
    public void setTamanio(double tamanio) { this.tamanio = tamanio; }

    public double getMasa() { return masa; }
    public void setMasa(double masa) { this.masa = masa; }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getGravedad() { return gravedad; }
    public void setGravedad(double gravedad) { this.gravedad = gravedad; }

    public double getTemperatura() { return temperatura; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }

    public String getHabitabilidad() { return habitabilidad; }
    public void setHabitabilidad(String habitabilidad) { this.habitabilidad = habitabilidad; }

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

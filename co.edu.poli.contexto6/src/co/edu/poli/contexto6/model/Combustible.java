package co.edu.poli.contexto6.model;

/**
 * Representa un combustible utilizado dentro del sistema.
 * Contiene información sobre el tipo de combustible,
 * sus propiedades químicas y el proveedor que lo suministra.
 * 
 * El combustible puede clasificarse según su nivel de pH
 * en ácido, básico o neutro.
 * 
 * @author Narath Teheran
 * @since 2026
 */
public class Combustible {

    /** Tipo de combustible */
    private String tipo;

    /** Indica si el combustible es inflamable */
    private boolean esInflamable;

    /** Densidad del combustible */
    private double densidad;

    /** Nivel de pH del combustible */
    private double pH;

    /** Proveedor encargado de suministrar el combustible */
    private Proveedor proveedor;

    /**
     * Constructor de la clase Combustible.
     *
     * @param tipo tipo de combustible
     * @param esInflamable indica si el combustible es inflamable
     * @param densidad densidad del combustible
     * @param pH nivel de pH del combustible
     * @param proveedor proveedor del combustible
     */
    public Combustible(String tipo, boolean esInflamable, double densidad, double pH, Proveedor proveedor) {
        this.tipo = tipo;
        this.esInflamable = esInflamable;
        this.densidad = densidad;
        this.pH = pH;
        this.proveedor = proveedor;
    }

    /**
     * Determina el tipo de pH del combustible.
     *
     * @return "Ácido" si el pH es menor que 7,
     *         "Básico" si el pH es mayor que 7,
     *         "Neutro" si el pH es igual a 7
     */
    public String tippodepH() {
        if (pH < 7.0) return "Ácido";
        if (pH > 7.0) return "Básico";
        return "Neutro";
    }

    //Getters y setters
    /**
     * Obtiene el tipo de combustible.
     * @return tipo de combustible
     */
    public String getTipo() { return tipo; }

    /**
     * Establece el tipo de combustible.
     * @param tipo nuevo tipo de combustible
     */
    public void setTipo(String tipo) { this.tipo = tipo; }

    /**
     * Indica si el combustible es inflamable.
     * @return true si es inflamable, false en caso contrario
     */
    public boolean isEsInflamable() { return esInflamable; }

    /**
     * Define si el combustible es inflamable.
     * @param esInflamable valor de inflamabilidad
     */
    public void setEsInflamable(boolean esInflamable) { this.esInflamable = esInflamable; }

    /**
     * Obtiene la densidad del combustible.
     * @return densidad del combustible
     */
    public double getDensidad() { return densidad; }

    /**
     * Establece la densidad del combustible.
     * @param densidad nueva densidad
     */
    public void setDensidad(double densidad) { this.densidad = densidad; }

    /**
     * Obtiene el nivel de pH del combustible.
     * @return pH del combustible
     */
    public double getpH() { return pH; }

    /**
     * Establece el nivel de pH del combustible.
     * @param pH nuevo valor de pH
     */
    public void setpH(double pH) { this.pH = pH; }

    /**
     * Obtiene el proveedor del combustible.
     * @return proveedor del combustible
     */
    public Proveedor getProveedor() { return proveedor; }

    /**
     * Establece el proveedor del combustible.
     * @param proveedor nuevo proveedor
     */
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor; }

    /**
     * Devuelve una representación en texto del combustible.
     *
     * @return información del combustible en formato String
     */
    @Override
    public String toString() {
        return "Combustible{" +
                "tipo='" + tipo + '\'' +
                ", esInflamable=" + esInflamable +
                ", densidad=" + densidad +
                ", pH=" + pH +
                ", proveedor=" + proveedor +
                '}';
    }
}
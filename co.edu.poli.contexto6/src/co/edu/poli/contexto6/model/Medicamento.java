package co.edu.poli.contexto6.model;

/**
 * Representa un medicamento con su información básica de consumo.
 * Permite almacenar el nombre, código, dosis y frecuencia de consumo.
 * 
 * @author Narath
 * @since 2026
 */
public final class Medicamento {
	
    private String nombre;
    private String codigo;
    private int dosis;
    private String frecuenciadeconsumo;

    /**
     * Constructor que permite crear un medicamento con todos sus datos.
     * 
     * @param nombre nombre del medicamento
     * @param codigo código identificador del medicamento
     * @param dosis cantidad de dosis del medicamento
     * @param frecuenciadeconsumo frecuencia con la que debe consumirse
     */
    public Medicamento(String nombre, String codigo, int dosis, String frecuenciadeconsumo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.dosis = dosis;
        this.frecuenciadeconsumo = frecuenciadeconsumo;
    }

    /**
     * Verifica si la dosis del medicamento es segura.
     * 
     * @param dosismaxima dosis máxima permitida
     * @return true si la dosis es segura, false si supera la dosis máxima
     */
    public boolean dosisEsSegura(int dosismaxima) {
        return dosis <= dosismaxima;
    }

    //Getters y setters
    /**
     * Obtiene el nombre del medicamento.
     * @return nombre del medicamento
     */
    public String getNombre() { return nombre; }

    /**
     * Modifica el nombre del medicamento.
     * @param nombre nuevo nombre del medicamento
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Obtiene el código del medicamento.
     * @return código del medicamento
     */
    public String getCodigo() { return codigo; }

    /**
     * Modifica el código del medicamento.
     * @param codigo nuevo código del medicamento
     */
    public void setCodigo(String codigo) { this.codigo = codigo; }

    /**
     * Obtiene la dosis del medicamento.
     * @return dosis del medicamento
     */
    public int getDosis() { return dosis; }

    /**
     * Modifica la dosis del medicamento.
     * @param dosis nueva dosis
     */
    public void setDosis(int dosis) { this.dosis = dosis; }

    /**
     * Obtiene la frecuencia de consumo del medicamento.
     * @return frecuencia de consumo
     */
    public String getFrecuenciadeconsumo() { return frecuenciadeconsumo; }

    /**
     * Modifica la frecuencia de consumo.
     * @param frecuenciadeconsumo nueva frecuencia de consumo
     */
    public void setFrecuenciadeconsumo(String frecuenciadeconsumo) { 
        this.frecuenciadeconsumo = frecuenciadeconsumo; 
    }

    /**
     * Representación en texto del medicamento.
     * 
     * @return información del medicamento en formato String
     */
    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", dosis=" + dosis +
                ", frecuenciadeconsumo='" + frecuenciadeconsumo + '\'' +
                '}';
    }
}
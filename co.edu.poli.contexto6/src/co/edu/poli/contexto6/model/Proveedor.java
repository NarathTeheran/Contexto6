package co.edu.poli.contexto6.model;

import java.io.Serializable;

/**
 * Representa un proveedor encargado de suministrar recursos
 * necesarios para las misiones o para el funcionamiento de
 * los sistemas asociados.
 * 
 * Un proveedor puede ser certificado y confiable dependiendo
 * de sus características y validaciones dentro del sistema.
 * 
 * @author Narath
 * @since 2026
 */
public class Proveedor implements Serializable{

    private String nombre;
    private String id;
    private int edad;
    private String recurso;
    private boolean esCertificado;
    private boolean esConfiable;

    /**
     * Constructor que crea un proveedor con toda su información.
     *
     * @param nombre nombre del proveedor
     * @param id identificador del proveedor
     * @param edad edad del proveedor
     * @param recurso tipo de recurso que suministra
     * @param esCertificado indica si el proveedor está certificado
     * @param esConfiable indica si el proveedor es confiable
     */
    public Proveedor(String nombre, String id, int edad, String recurso, boolean esCertificado, boolean esConfiable) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.recurso = recurso;
        this.esCertificado = esCertificado;
        this.esConfiable = esConfiable;
    }

    //Getters y setters
    /**
     * Obtiene el nombre del proveedor.
     * 
     * @return nombre del proveedor
     */
    public String getNombre() { return nombre; }

    /**
     * Modifica el nombre del proveedor.
     * 
     * @param nombre nuevo nombre del proveedor
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Obtiene el identificador del proveedor.
     * 
     * @return id del proveedor
     */
    public String getId() { return id; }

    /**
     * Modifica el identificador del proveedor.
     * 
     * @param id nuevo id
     */
    public void setId(String id) { this.id = id; }

    /**
     * Obtiene la edad del proveedor.
     * 
     * @return edad del proveedor
     */
    public int getEdad() { return edad; }

    /**
     * Modifica la edad del proveedor.
     * 
     * @param edad nueva edad
     */
    public void setEdad(int edad) { this.edad = edad; }

    /**
     * Obtiene el recurso que suministra el proveedor.
     * 
     * @return recurso suministrado
     */
    public String getRecurso() { return recurso; }

    /**
     * Modifica el recurso suministrado por el proveedor.
     * 
     * @param recurso nuevo recurso
     */
    public void setRecurso(String recurso) { this.recurso = recurso; }

    /**
     * Indica si el proveedor está certificado.
     * 
     * @return true si está certificado, false en caso contrario
     */
    public boolean isEsCertificado() { return esCertificado; }

    /**
     * Modifica el estado de certificación del proveedor.
     * 
     * @param esCertificado nuevo estado de certificación
     */
    public void setEsCertificado(boolean esCertificado) { this.esCertificado = esCertificado; }

    /**
     * Indica si el proveedor es confiable.
     * 
     * @return true si es confiable, false en caso contrario
     */
    public boolean isEsConfiable() { return esConfiable; }

    /**
     * Modifica el estado de confiabilidad del proveedor.
     * 
     * @param esConfiable nuevo estado de confiabilidad
     */
    public void setEsConfiable(boolean esConfiable) { this.esConfiable = esConfiable; }

    /**
     * Representación en texto del proveedor.
     *
     * @return información del proveedor en formato String
     */
    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", edad=" + edad +
                ", recurso='" + recurso + '\'' +
                ", esCertificado=" + esCertificado +
                ", esConfiable=" + esConfiable +
                '}';
    }
}
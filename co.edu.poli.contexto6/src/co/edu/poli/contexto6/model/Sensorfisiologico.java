package co.edu.poli.contexto6.model;

import java.io.Serializable;

/**
 * Clase que representa un sensor fisiológico dentro del sistema.
 * Este sensor se utiliza para medir parámetros médicos o fisiológicos
 * del cuerpo humano, como temperatura, ritmo cardíaco o presión arterial.
 * 
 * Contiene información sobre el parámetro médico medido, el rango de medición,
 * la unidad de medida y la zona del cuerpo donde se realiza la medición.
 * 
 * @author Narath Teheran
 * @since 2026
 */
public class Sensorfisiologico extends Sensor implements Serializable {

    /**
     * Parámetro médico que mide el sensor.
     */
    private String parametromedico;

    /**
     * Rango de medición que puede detectar el sensor.
     */
    private double rangodemedicion;

    /**
     * Unidad de medida utilizada para el parámetro fisiológico.
     */
    private String unidadmedida;

    /**
     * Indica si el sensor debe estar en contacto directo con el cuerpo.
     */
    private boolean estaEnContacto;

    /**
     * Zona del cuerpo donde se realiza la medición.
     */
    private String zonademedicion;

    /**
     * Constructor de la clase Sensorfisiologico.
     * Inicializa los atributos heredados de Sensor y los propios del sensor fisiológico.
     * 
     * @param id identificador del sensor
     * @param version versión del sensor
     * @param niveldecarga nivel de carga del sensor
     * @param presicion precisión del sensor
     * @param aniodefabricacion año de fabricación del sensor
     * @param margendeerror margen de error del sensor
     * @param proveedor proveedor del sensor
     * @param parametromedico parámetro médico que mide el sensor
     * @param rangodemedicion rango de medición del sensor
     * @param unidadmedida unidad de medida utilizada
     * @param estaEnContacto indica si el sensor está en contacto con el cuerpo
     * @param zonademedicion zona del cuerpo donde se realiza la medición
     */
    public Sensorfisiologico(String id, double version, double niveldecarga, double presicion, int aniodefabricacion,
                             double margendeerror, Proveedor proveedor,
                             String parametromedico, double rangodemedicion, String unidadmedida,
                             boolean estaEnContacto, String zonademedicion) {
        super(id, version, niveldecarga, presicion, aniodefabricacion, margendeerror, proveedor);
        this.parametromedico = parametromedico;
        this.rangodemedicion = rangodemedicion;
        this.unidadmedida = unidadmedida;
        this.estaEnContacto = estaEnContacto;
        this.zonademedicion = zonademedicion;
    }

    /**
     * Calcula la antigüedad del sensor fisiológico.
     * Utiliza la implementación definida en la clase padre Sensor.
     * 
     * @param anioactual año actual
     * @return antigüedad del sensor en años
     */
    @Override
    public int calcularantiguedad(int anioactual) {
        return super.calcularantiguedad(anioactual);
    }

    /**
     * Obtiene la lectura realizada por el sensor fisiológico.
     * 
     * @return valor de la lectura del sensor
     */
	public double obtenerLectura() {
	    return 0;
	}

    /**
     * Obtiene el parámetro médico que mide el sensor.
     * 
     * @return parámetro médico
     */
    public String getParametromedico() { return parametromedico; }

    /**
     * Establece el parámetro médico que mide el sensor.
     * 
     * @param parametromedico nuevo parámetro médico
     */
    public void setParametromedico(String parametromedico) { this.parametromedico = parametromedico; }

    /**
     * Obtiene el rango de medición del sensor.
     * 
     * @return rango de medición
     */
    public double getRangodemedicion() { return rangodemedicion; }

    /**
     * Establece el rango de medición del sensor.
     * 
     * @param rangodemedicion nuevo rango de medición
     */
    public void setRangodemedicion(double rangodemedicion) { this.rangodemedicion = rangodemedicion; }

    /**
     * Obtiene la unidad de medida utilizada.
     * 
     * @return unidad de medida
     */
    public String getUnidadmedida() { return unidadmedida; }

    /**
     * Establece la unidad de medida utilizada.
     * 
     * @param unidadmedida nueva unidad de medida
     */
    public void setUnidadmedida(String unidadmedida) { this.unidadmedida = unidadmedida; }

    /**
     * Indica si el sensor está en contacto con el cuerpo.
     * 
     * @return true si está en contacto, false en caso contrario
     */
    public boolean isEstaEnContacto() { return estaEnContacto; }

    /**
     * Establece si el sensor está en contacto con el cuerpo.
     * 
     * @param estaEnContacto indica si el sensor está en contacto
     */
    public void setEstaEnContacto(boolean estaEnContacto) { this.estaEnContacto = estaEnContacto; }

    /**
     * Obtiene la zona del cuerpo donde se realiza la medición.
     * 
     * @return zona de medición
     */
    public String getZonademedicion() { return zonademedicion; }

    /**
     * Establece la zona del cuerpo donde se realiza la medición.
     * 
     * @param zonademedicion nueva zona de medición
     */
    public void setZonademedicion(String zonademedicion) { this.zonademedicion = zonademedicion; }

    /**
     * Devuelve una representación en texto del sensor fisiológico.
     * 
     * @return información del sensor en formato String
     */
    @Override
    public String toString() {
        return "Sensorfisiologico{" +
                "parametromedico='" + parametromedico + '\'' +
                ", rangodemedicion=" + rangodemedicion +
                ", unidadmedida='" + unidadmedida + '\'' +
                ", estaEnContacto=" + estaEnContacto +
                ", zonademedicion='" + zonademedicion + '\'' +
                ", base=" + super.toString() +
                '}';
    }
}
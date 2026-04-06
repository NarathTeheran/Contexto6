package co.edu.poli.contexto6.model;

import java.io.Serializable;

/**
 * Clase que representa un sensor electroquímico dentro del sistema.
 * Este tipo de sensor se encarga de analizar muestras químicas mediante
 * reacciones electroquímicas para obtener mediciones específicas.
 * 
 * Contiene información sobre el tiempo de análisis, la sensibilidad del sensor
 * y el tipo de muestra que puede analizar.
 * 
 * @author Narath Teheran
 * @since 2026
 */
public class Sensorelectroquimico extends Sensor implements Serializable{

    /**
     * Tiempo que tarda el sensor en realizar un análisis.
     */
    private double tiempodeAnalisis;

    /**
     * Nivel de sensibilidad del sensor al detectar sustancias.
     */
    private double sensibilidad;

    /**
     * Indica si el sensor requiere una muestra física para realizar el análisis.
     */
    private boolean requiereMuestra;

    /**
     * Tipo de muestra que el sensor puede analizar.
     */
    private String tipodemuestra;

    /**
     * Constructor de la clase Sensorelectroquimico.
     * Inicializa los atributos heredados de Sensor y los propios de esta clase.
     * 
     * @param id identificador del sensor
     * @param version versión del sensor
     * @param niveldecarga nivel de carga del sensor
     * @param presicion precisión del sensor
     * @param aniodefabricacion año de fabricación del sensor
     * @param margendeerror margen de error del sensor
     * @param proveedor proveedor del sensor
     * @param tiempodeAnalisis tiempo que tarda el sensor en analizar una muestra
     * @param sensibilidad nivel de sensibilidad del sensor
     * @param requiereMuestra indica si el sensor necesita una muestra
     * @param tipodemuestra tipo de muestra que puede analizar el sensor
     */
    public Sensorelectroquimico(String id, double version, double niveldecarga, double presicion, int aniodefabricacion, double margendeerror, Proveedor proveedor, double tiempodeAnalisis, double sensibilidad, boolean requiereMuestra, String tipodemuestra) {
        super(id, version, niveldecarga, presicion, aniodefabricacion, margendeerror, proveedor);
        this.tiempodeAnalisis = tiempodeAnalisis;
        this.sensibilidad = sensibilidad;
        this.requiereMuestra = requiereMuestra;
        this.tipodemuestra = tipodemuestra;
    }

    /**
     * Calcula la antigüedad del sensor electroquímico.
     * Este método utiliza la implementación de la clase padre.
     * 
     * @param anioactual año actual
     * @return antigüedad del sensor en años
     */
    @Override
    public int calcularantiguedad(int anioactual) {
        return super.calcularantiguedad(anioactual);
    }

    /**
     * Obtiene la lectura realizada por el sensor electroquímico.
     * 
     * @return valor de la lectura del sensor
     */
	public double obtenerLectura() {
	    return 0;
	}

    /**
     * Obtiene el tiempo de análisis del sensor.
     * 
     * @return tiempo de análisis
     */
    public double getTiempodeAnalisis() { return tiempodeAnalisis; }

    /**
     * Establece el tiempo de análisis del sensor.
     * 
     * @param tiempodeAnalisis nuevo tiempo de análisis
     */
    public void setTiempodeAnalisis(double tiempodeAnalisis) { this.tiempodeAnalisis = tiempodeAnalisis; }

    /**
     * Obtiene la sensibilidad del sensor.
     * 
     * @return sensibilidad del sensor
     */
    public double getSensibilidad() { return sensibilidad; }

    /**
     * Establece la sensibilidad del sensor.
     * 
     * @param sensibilidad nueva sensibilidad del sensor
     */
    public void setSensibilidad(double sensibilidad) { this.sensibilidad = sensibilidad; }

    /**
     * Indica si el sensor requiere una muestra para realizar el análisis.
     * 
     * @return true si requiere muestra, false en caso contrario
     */
    public boolean isRequiereMuestra() { return requiereMuestra; }

    /**
     * Establece si el sensor requiere una muestra para el análisis.
     * 
     * @param requiereMuestra indica si requiere muestra
     */
    public void setRequiereMuestra(boolean requiereMuestra) { this.requiereMuestra = requiereMuestra; }

    /**
     * Obtiene el tipo de muestra que puede analizar el sensor.
     * 
     * @return tipo de muestra
     */
    public String getTipodemuestra() { return tipodemuestra; }

    /**
     * Establece el tipo de muestra que puede analizar el sensor.
     * 
     * @param tipodemuestra nuevo tipo de muestra
     */
    public void setTipodemuestra(String tipodemuestra) { this.tipodemuestra = tipodemuestra; }

    /**
     * Devuelve una representación en texto del sensor electroquímico.
     * 
     * @return información del sensor en formato String
     */
    @Override
    public String toString() {
        return "Sensorelectroquimico{" +
                "tiempodeAnalisis=" + tiempodeAnalisis +
                ", sensibilidad=" + sensibilidad +
                ", requiereMuestra=" + requiereMuestra +
                ", tipodemuestra='" + tipodemuestra + '\'' +
                ", base=" + super.toString() +
                '}';
    }
}
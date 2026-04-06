package co.edu.poli.contexto6.model;

import java.io.Serializable;

/**
 * Clase abstracta que representa un sensor dentro del sistema.
 * Define los atributos y comportamientos generales que deben tener
 * todos los sensores espaciales del sistema.
 * 
 * Permite manejar información como identificación, versión, nivel
 * de carga, precisión, año de fabricación y proveedor del sensor.
 * También proporciona métodos para calcular la carga restante,
 * la antigüedad del sensor y obtener la lectura del mismo.
 * 
 * @author Narath Teheran
 * @since 2026
 */
public abstract class Sensor implements Serializable{

    /**
     * Identificador único del sensor.
     */
	private String id;

    /**
     * Versión del sensor.
     */
    private double version;

    /**
     * Nivel de carga actual del sensor.
     */
    private double niveldecarga;

    /**
     * Precisión del sensor al tomar mediciones.
     */
    private double presicion;

    /**
     * Año en el que fue fabricado el sensor.
     */
    private int aniodefabricacion;

    /**
     * Margen de error del sensor.
     * Es un atributo estático que comparten todos los sensores.
     */
    private static double margendeerror = 0.0;

    /**
     * Proveedor que fabricó o suministró el sensor.
     */
    private Proveedor proveedor;

    /**
     * Código constante que identifica el tipo de sensor.
     */
    private final String codigoSensor = "SensorEspacial";

    /**
     * Constructor de la clase Sensor.
     * Inicializa todos los atributos del sensor.
     * 
     * @param id identificador del sensor
     * @param version versión del sensor
     * @param niveldecarga nivel de carga actual del sensor
     * @param presicion precisión del sensor
     * @param aniodefabricacion año en el que fue fabricado el sensor
     * @param margendeerrorConstructor margen de error compartido entre sensores
     * @param proveedor proveedor del sensor
     */
    public Sensor(String id, double version, double niveldecarga, double presicion, int aniodefabricacion,
                  double margendeerrorConstructor, Proveedor proveedor) {
        this.id = id;
        this.version = version;
        this.niveldecarga = niveldecarga;
        this.presicion = presicion;
        this.aniodefabricacion = aniodefabricacion;
        Sensor.margendeerror = margendeerrorConstructor;
        this.proveedor = proveedor;
    }

    /**
     * Calcula la carga restante del sensor teniendo en cuenta el margen de error.
     * 
     * @return valor estimado de la carga restante del sensor
     */
    public double cargarestante() {
        double estimado = niveldecarga - Sensor.margendeerror;
        return estimado < 0 ? 0 : estimado;
    }

    /**
     * Calcula la antigüedad del sensor utilizando el año actual.
     * 
     * @param anioactual año actual
     * @return antigüedad del sensor en años
     */
    public int calcularantiguedad(int anioactual) {
        return anioactual - aniodefabricacion;
    }

    /**
     * Calcula la antigüedad del sensor a partir de una fecha en formato String.
     * 
     * @param fechaactual fecha actual en formato String
     * @return antigüedad del sensor en años
     */
    public int calcularantiguedad(String fechaactual) {
        int anio = extraerAnio(fechaactual);
        return calcularantiguedad(anio);
    }

    /**
     * Extrae el año desde una fecha en formato String.
     * 
     * @param fecha fecha en formato String
     * @return año extraído de la fecha o 0 si no es válida
     */
    public int extraerAnio(String fecha) {
        if (fecha == null || fecha.length() < 4) return 0;
        try {
            return Integer.parseInt(fecha.substring(0, 4));
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * Muestra en consola el tipo de sensor base.
     * Este método no puede ser sobrescrito por las subclases.
     */
    public final void mostrarTipoSensor() {
        System.out.println("Sensor base del sistema");
    }

    /**
     * Método abstracto que debe ser implementado por las subclases
     * para obtener la lectura específica del sensor.
     * 
     * @return valor de la lectura del sensor
     */
    public abstract double obtenerLectura();

    // GETTERS Y SETTERS

    /**
     * Obtiene el identificador del sensor.
     * 
     * @return id del sensor
     */
    public String getId() {return id;}

    /**
     * Establece el identificador del sensor.
     * 
     * @param id nuevo identificador del sensor
     */
	public void setId(String id) { this.id = id;}

    /**
     * Obtiene la versión del sensor.
     * 
     * @return versión del sensor
     */
	public double getVersion() { return version; }

    /**
     * Establece la versión del sensor.
     * 
     * @param version nueva versión del sensor
     */
	public void setVersion(double version) { this.version = version; }

    /**
     * Obtiene el nivel de carga del sensor.
     * 
     * @return nivel de carga
     */
    public double getNiveldecarga() { return niveldecarga; }

    /**
     * Establece el nivel de carga del sensor.
     * 
     * @param niveldecarga nuevo nivel de carga
     */
    public void setNiveldecarga(double niveldecarga) { this.niveldecarga = niveldecarga; }

    /**
     * Obtiene la precisión del sensor.
     * 
     * @return precisión del sensor
     */
    public double getPresicion() { return presicion; }

    /**
     * Establece la precisión del sensor.
     * 
     * @param presicion nueva precisión
     */
    public void setPresicion(double presicion) { this.presicion = presicion; }

    /**
     * Obtiene el año de fabricación del sensor.
     * 
     * @return año de fabricación
     */
    public int getAniodefabricacion() { return aniodefabricacion; }

    /**
     * Establece el año de fabricación del sensor.
     * 
     * @param aniodefabricacion nuevo año de fabricación
     */
    public void setAniodefabricacion(int aniodefabricacion) { this.aniodefabricacion = aniodefabricacion; }

    /**
     * Obtiene el proveedor del sensor.
     * 
     * @return proveedor del sensor
     */
    public Proveedor getProveedor() { return proveedor; }

    /**
     * Establece el proveedor del sensor.
     * 
     * @param proveedor nuevo proveedor
     */
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor; }

    /**
     * Obtiene el margen de error compartido por los sensores.
     * 
     * @return margen de error
     */
    public static double getMargendeerror() { return margendeerror; }

    /**
     * Establece el margen de error compartido.
     * 
     * @param me nuevo margen de error
     */
    public static void setMargendeerror(double me) { margendeerror = me; }

    /**
     * Obtiene el código del sensor.
     * 
     * @return código del sensor
     */
    public String getCodigoSensor() {
		return codigoSensor;
	}

    /**
     * Devuelve una representación en texto del objeto Sensor.
     * 
     * @return información del sensor en formato String
     */
	@Override
    public String toString() {
        return "Sensor {" +
        		"id=" + id +
                ", version=" + version +
                ", niveldecarga=" + niveldecarga +
                ", presicion=" + presicion +
                ", aniodefabricacion=" + aniodefabricacion +
                ", margendeerror(ESTATICO)=" + margendeerror +
                ", proveedor=" + proveedor + "codigoSensor=" + codigoSensor +
                '}';
    }
}
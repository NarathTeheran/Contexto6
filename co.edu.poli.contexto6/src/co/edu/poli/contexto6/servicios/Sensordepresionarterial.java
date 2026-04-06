package co.edu.poli.contexto6.servicios;

import java.io.Serializable;

import co.edu.poli.contexto6.model.Proveedor;
import co.edu.poli.contexto6.model.Sensorfisiologico;

/**
 * Clase que representa un sensor fisiológico especializado en medir
 * la presión arterial de una persona.
 * 
 * Este sensor permite registrar los valores de presión sistólica y
 * presión diastólica, así como clasificar el estado de la presión
 * arterial según los rangos médicos establecidos.
 * 
 * Hereda las características generales de un Sensorfisiologico,
 * incluyendo información sobre el parámetro médico medido,
 * el rango de medición, la unidad de medida y la zona del cuerpo
 * donde se realiza la medición.
 * 
 * @author Narath Teheran
 * @since 2026
 */
public class Sensordepresionarterial extends Sensorfisiologico implements Serializable {

    /**
     * Método utilizado por el sensor para realizar la medición
     * de la presión arterial (por ejemplo: oscilométrico o manual).
     */
    private String metodomedicion;

    /**
     * Valor de la presión sistólica medido por el sensor.
     * Representa la presión en las arterias cuando el corazón
     * se contrae.
     */
    private double presionSistolica;

    /**
     * Valor de la presión diastólica medido por el sensor.
     * Representa la presión en las arterias cuando el corazón
     * se encuentra en reposo entre latidos.
     */
    private double presionDiastolica;

    /**
     * Constructor de la clase Sensordepresionarterial.
     * Inicializa todos los atributos heredados del sensor fisiológico
     * y los atributos específicos del sensor de presión arterial.
     *
     * @param id Identificador único del sensor.
     * @param version Versión del sensor.
     * @param niveldecarga Nivel de carga de la batería del sensor.
     * @param presicion Nivel de precisión del sensor.
     * @param aniodefabricacion Año en que fue fabricado el sensor.
     * @param margendeerror Margen de error permitido en las mediciones.
     * @param proveedor Proveedor que fabrica o suministra el sensor.
     * @param parametromedico Parámetro médico que mide el sensor.
     * @param rangodemedicion Rango máximo de medición del sensor.
     * @param unidadmedida Unidad en la que se mide el parámetro.
     * @param estaEnContacto Indica si el sensor está en contacto directo con el cuerpo.
     * @param zonademedicion Zona del cuerpo donde se realiza la medición.
     * @param metodomedicion Método utilizado para medir la presión arterial.
     * @param presionSistolica Valor de presión sistólica registrado.
     * @param presionDiastolica Valor de presión diastólica registrado.
     */
    public Sensordepresionarterial(String id, double version, double niveldecarga, double presicion, int aniodefabricacion,
                                   double margendeerror, Proveedor proveedor,
                                   String parametromedico, double rangodemedicion, String unidadmedida,
                                   boolean estaEnContacto, String zonademedicion,
                                   String metodomedicion, double presionSistolica, double presionDiastolica) {
        super(id, version, niveldecarga, presicion, aniodefabricacion, margendeerror, proveedor,
              parametromedico, rangodemedicion, unidadmedida, estaEnContacto, zonademedicion);
        this.metodomedicion = metodomedicion;
        this.presionSistolica = presionSistolica;
        this.presionDiastolica = presionDiastolica;
    }

    /**
     * Método que clasifica el estado de la presión arterial
     * según los valores de presión sistólica y diastólica.
     *
     * @return Una cadena de texto que indica la clasificación
     *         de la presión arterial (Normal, Elevada, Hipertensión, etc.).
     */
    public String clasificarPresion() {
        double s = presionSistolica;
        double d = presionDiastolica;
        if (s < 90 || d < 60) return "Hipotensión";
        if (s < 120 && d < 80) return "Normal";
        if (s < 130 && d < 80) return "Elevada";
        if (s < 140 || d < 90) return "Hipertensión (Etapa 1)";
        if (s < 180 || d < 120) return "Hipertensión (Etapa 2)";
        return "Crisis hipertensiva";
    }

    /**
     * Obtiene el método de medición utilizado por el sensor.
     * 
     * @return Método de medición de la presión arterial.
     */
    public String getMetodomedicion() { return metodomedicion; }

    /**
     * Establece el método de medición del sensor.
     * 
     * @param metodomedicion Método de medición que se desea asignar.
     */
    public void setMetodomedicion(String metodomedicion) { this.metodomedicion = metodomedicion; }

    /**
     * Obtiene el valor de presión sistólica registrado.
     * 
     * @return Valor de presión sistólica.
     */
    public double getPresionSistolica() { return presionSistolica; }

    /**
     * Modifica el valor de presión sistólica.
     * 
     * @param presionSistolica Nuevo valor de presión sistólica.
     */
    public void setPresionSistolica(double presionSistolica) { this.presionSistolica = presionSistolica; }

    /**
     * Obtiene el valor de presión diastólica registrado.
     * 
     * @return Valor de presión diastólica.
     */
    public double getPresionDiastolica() { return presionDiastolica; }

    /**
     * Modifica el valor de presión diastólica.
     * 
     * @param presionDiastolica Nuevo valor de presión diastólica.
     */
    public void setPresionDiastolica(double presionDiastolica) { this.presionDiastolica = presionDiastolica; }

    /**
     * Método que retorna una representación en texto del sensor
     * incluyendo los atributos propios y los heredados.
     *
     * @return Cadena de texto con la información del sensor.
     */
    @Override
    public String toString() {
        return "Sensordepresionarterial{" +
                "metodomedicion='" + metodomedicion + '\'' +
                ", presionSistolica=" + presionSistolica +
                ", presionDiastolica=" + presionDiastolica +
                ", base=" + super.toString() +
                '}';
    }
}
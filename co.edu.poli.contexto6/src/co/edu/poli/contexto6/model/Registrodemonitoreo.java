package co.edu.poli.contexto6.model;

import java.util.Arrays;

/**
 * Representa un registro de monitoreo médico realizado a un astronauta.
 * 
 * Este registro almacena la información obtenida mediante sensores
 * durante un monitoreo de signos vitales, junto con el diagnóstico
 * médico y posibles alertas generadas.
 * 
 * Permite llevar control del estado de salud del astronauta durante
 * una misión espacial.
 * 
 * @author Narath
 * @since 2026
 */
public class Registrodemonitoreo {

    private String id;
    private String fechademonitoreo;
    private Signovital signovital;
    private Astronauta astronauta;
    private Diagnostico diagnostico;
    private Alertamedica alertamedica;
    private Sensor[] sensor;

    /**
     * Constructor de la clase Registrodemonitoreo.
     * 
     * @param id identificador del registro
     * @param fechademonitoreo fecha en la que se realizó el monitoreo
     * @param signovital signos vitales registrados
     * @param astronauta astronauta monitoreado
     * @param diagnostico diagnóstico médico generado
     * @param alertamedica alerta médica generada
     * @param sensor sensores utilizados para el monitoreo
     */
    public Registrodemonitoreo(String id, String fechademonitoreo, Signovital signovital, Astronauta astronauta,
                               Diagnostico diagnostico, Alertamedica alertamedica, Sensor[] sensor) {
        this.id = id;
        this.fechademonitoreo = fechademonitoreo;
        this.signovital = signovital;
        this.astronauta = astronauta;
        this.diagnostico = diagnostico;
        this.alertamedica = alertamedica;
        this.sensor = sensor;
    }

    /**
     * Calcula el tiempo transcurrido desde el último monitoreo.
     * 
     * @param fechaactual fecha actual del sistema
     * @return tiempo transcurrido desde el último monitoreo
     */
    public int ultimomonitoreo(String fechaactual) {
        return 0;
    }

    //Getters y setters
    /**
     * Obtiene el identificador del registro.
     * 
     * @return id del registro
     */
    public String getId() { 
        return id; 
    }

    /**
     * Modifica el identificador del registro.
     * 
     * @param id nuevo identificador
     */
    public void setId(String id) { 
        this.id = id; 
    }

    /**
     * Obtiene la fecha en la que se realizó el monitoreo.
     * 
     * @return fecha del monitoreo
     */
    public String getFechademonitoreo() { 
        return fechademonitoreo; 
    }

    /**
     * Modifica la fecha del monitoreo.
     * 
     * @param fechademonitoreo nueva fecha de monitoreo
     */
    public void setFechademonitoreo(String fechademonitoreo) { 
        this.fechademonitoreo = fechademonitoreo; 
    }

    /**
     * Obtiene los signos vitales registrados.
     * 
     * @return objeto Signovital con los datos registrados
     */
    public Signovital getSignovital() { 
        return signovital; 
    }

    /**
     * Modifica los signos vitales registrados.
     * 
     * @param signovital nuevos signos vitales
     */
    public void setSignovital(Signovital signovital) { 
        this.signovital = signovital; 
    }

    /**
     * Obtiene el astronauta monitoreado.
     * 
     * @return astronauta asociado al registro
     */
    public Astronauta getAstronauta() { 
        return astronauta; 
    }

    /**
     * Modifica el astronauta asociado al registro.
     * 
     * @param astronauta nuevo astronauta
     */
    public void setAstronauta(Astronauta astronauta) { 
        this.astronauta = astronauta; 
    }

    /**
     * Obtiene el diagnóstico médico generado.
     * 
     * @return diagnóstico del monitoreo
     */
    public Diagnostico getDiagnostico() { 
        return diagnostico; 
    }

    /**
     * Modifica el diagnóstico médico.
     * 
     * @param diagnostico nuevo diagnóstico
     */
    public void setDiagnostico(Diagnostico diagnostico) { 
        this.diagnostico = diagnostico; 
    }

    /**
     * Obtiene la alerta médica generada.
     * 
     * @return alerta médica
     */
    public Alertamedica getAlertamedica() { 
        return alertamedica; 
    }

    /**
     * Modifica la alerta médica generada.
     * 
     * @param alertamedica nueva alerta médica
     */
    public void setAlertamedica(Alertamedica alertamedica) { 
        this.alertamedica = alertamedica; 
    }

    /**
     * Obtiene los sensores utilizados en el monitoreo.
     * 
     * @return arreglo de sensores
     */
    public Sensor[] getSensor() { 
        return sensor; 
    }

    /**
     * Modifica los sensores utilizados en el monitoreo.
     * 
     * @param sensor nuevos sensores
     */
    public void setSensor(Sensor[] sensor) { 
        this.sensor = sensor; 
    }

    /**
     * Devuelve una representación en texto del registro de monitoreo.
     * 
     * @return información del registro en formato String
     */
    @Override
    public String toString() {
        return "Registrodemonitoreo{" +
                "id='" + id + '\'' +
                ", fechademonitoreo='" + fechademonitoreo + '\'' +
                ", signovital=" + signovital +
                ", astronauta=" + astronauta +
                ", diagnostico=" + diagnostico +
                ", alertamedica=" + alertamedica +
                ", sensor=" + Arrays.toString(sensor) +
                '}';
    }
}
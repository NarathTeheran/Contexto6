package co.edu.poli.contexto6.model;
/**
 * Representa una alerta médica generada a partir del monitoreo
 * de los signos vitales de un astronauta.
 * 
 * La alerta contiene información sobre el tipo de alerta,
 * el nivel de prioridad, la fecha y hora en la que fue generada
 * y los signos vitales asociados al astronauta.
 * 
 * @author Narath Teheran
 * @since 2026
 */
public class Alertamedica {

    /** Identificador único de la alerta médica */
    private String id;
    /** Tipo de alerta médica generada */
    private String tipo;
    /** Nivel de prioridad de la alerta */
    private int niveldeprioridad;
    /** Fecha en la que se generó la alerta */
    private String fechadealerta;
    /** Hora en la que se generó la alerta */
    private String hora;
    /** Signos vitales asociados a la alerta */
    private Signovital signovital;
    /** Astronauta al que pertenece la alerta */
    private Astronauta astronauta;

    /**
     * Constructor de la clase Alertamedica.
     * 
     * @param id identificador de la alerta
     * @param tipo tipo de alerta médica
     * @param niveldeprioridad nivel de prioridad de la alerta
     * @param fechadealerta fecha en la que se generó la alerta
     * @param hora hora en la que se generó la alerta
     * @param signovital signos vitales asociados
     * @param astronauta astronauta relacionado con la alerta
     */
    public Alertamedica(String id, String tipo, int niveldeprioridad, String fechadealerta, String hora,
                        Signovital signovital, Astronauta astronauta) {
        this.id = id;
        this.tipo = tipo;
        this.niveldeprioridad = niveldeprioridad;
        this.fechadealerta = fechadealerta;
        this.hora = hora;
        this.signovital = signovital;
        this.astronauta = astronauta;
    }

    /**
     * Determina si la alerta médica es crítica.
     * Una alerta es crítica si el nivel de prioridad es alto
     * o si alguno de los signos vitales presenta valores alterados.
     *
     * @return true si la alerta es crítica, false en caso contrario
     */
    public boolean esCritica() {
        boolean prioridadAlta = niveldeprioridad >= 4;
        boolean signosAlterados = false;
        if (signovital != null) {
            signosAlterados = signovital.tieneFiebre() ||
                              signovital.tieneHipertension() ||
                              signovital.tieneTaquicardia() ||
                              signovital.tieneTaquipnea() ||
                              signovital.tieneHiperoxia();
        }
        return prioridadAlta || signosAlterados;
    }

    // Getters y setters
    /**
     * Obtiene el identificador de la alerta.
     * @return id de la alerta
     */
    public String getId() { return id; }
    
    /**
     * Establece el identificador de la alerta.
     * @param id nuevo identificador
     */
    public void setId(String id) { this.id = id; }
    
    /**
     * Obtiene el tipo de alerta.
     * @return tipo de alerta
     */
    public String getTipo() { return tipo; }
    
    /**
     * Establece el tipo de alerta.
     * @param tipo tipo de alerta
     */
    public void setTipo(String tipo) { this.tipo = tipo; }
    
    /**
     * Obtiene el nivel de prioridad de la alerta.
     * @return nivel de prioridad
     */
    public int getNiveldeprioridad() { return niveldeprioridad; }

    /**
     * Establece el nivel de prioridad de la alerta.
     * @param niveldeprioridad nuevo nivel de prioridad
     */
    public void setNiveldeprioridad(int niveldeprioridad) { this.niveldeprioridad = niveldeprioridad; }

    /**
     * Obtiene la fecha de la alerta.
     * @return fecha de alerta
     */
    public String getFechadealerta() { return fechadealerta; }

    /**
     * Establece la fecha de la alerta.
     * @param fechadealerta nueva fecha
     */
    public void setFechadealerta(String fechadealerta) { this.fechadealerta = fechadealerta; }

    /**
     * Obtiene la hora de la alerta.
     * @return hora de alerta
     */
    public String getHora() { return hora; }

    /**
     * Establece la hora de la alerta.
     * @param hora nueva hora
     */
    public void setHora(String hora) { this.hora = hora; }

    /**
     * Obtiene los signos vitales asociados.
     * @return objeto Signovital
     */
    public Signovital getSignovital() { return signovital; }

    /**
     * Establece los signos vitales asociados.
     * @param signovital nuevos signos vitales
     */
    public void setSignovital(Signovital signovital) { this.signovital = signovital; }

    /**
     * Obtiene el astronauta relacionado con la alerta.
     * @return objeto Astronauta
     */
    public Astronauta getAstronauta() { return astronauta; }

    /**
     * Establece el astronauta asociado a la alerta.
     * @param astronauta nuevo astronauta
     */
    public void setAstronauta(Astronauta astronauta) { this.astronauta = astronauta; }

    /**
     * Retorna una representación en texto de la alerta médica.
     * @return cadena con la información de la alerta
     */
    @Override
    public String toString() {
        return "Alertamedica{" +
                "id='" + id + '\'' +
                ", tipo='" + tipo + '\'' +
                ", niveldeprioridad=" + niveldeprioridad +
                ", fechadealerta='" + fechadealerta + '\'' +
                ", hora='" + hora + '\'' +
                ", signovital=" + signovital +
                ", astronauta=" + astronauta +
                '}';
    }
}

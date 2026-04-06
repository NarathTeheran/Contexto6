package co.edu.poli.contexto6.model;

import java.util.Arrays;

/**
 * Representa un diagnóstico médico asociado a un astronauta.
 * 
 * Contiene información relacionada con el tipo de sangre,
 * signos vitales, alergias, medicamentos suministrados,
 * restricciones médicas, estado de vacunación y observaciones médicas.
 * 
 * Esta clase permite almacenar y consultar información médica
 * relevante para el monitoreo de la salud del astronauta.
 * 
 * @author Narath Teheran
 * @since 2026
 */
public class Diagnostico {

    /** Identificador del diagnóstico */
    private String id;

    /** Tipo de sangre del paciente */
    private String tipodesangre;

    /** Signos vitales asociados al diagnóstico */
    private Signovital signovital;

    /** Indica si el paciente es alérgico */
    private boolean esAlergico;

    /** Medicamentos asociados al diagnóstico */
    private Medicamento[] medicamento;

    /** Indica si el paciente tiene restricciones médicas */
    private boolean tieneRestriccionesMedicas;

    /** Indica si el paciente está vacunado */
    private boolean estaVacunado;

    /** Observaciones médicas adicionales */
    private String observacionesmedicas;

    /**
     * Constructor de la clase Diagnostico.
     *
     * @param id identificador del diagnóstico
     * @param tipodesangre tipo de sangre del paciente
     * @param signovital signos vitales registrados
     * @param esAlergico indica si el paciente es alérgico
     * @param medicamento medicamentos asociados al diagnóstico
     * @param tieneRestriccionesMedicas indica si tiene restricciones médicas
     * @param estaVacunado indica si está vacunado
     * @param observacionesmedicas observaciones médicas adicionales
     */
    public Diagnostico(String id, String tipodesangre, Signovital signovital, boolean esAlergico,
                       Medicamento[] medicamento, boolean tieneRestriccionesMedicas, boolean estaVacunado,
                       String observacionesmedicas) {
        this.id = id;
        this.tipodesangre = tipodesangre;
        this.signovital = signovital;
        this.esAlergico = esAlergico;
        this.medicamento = medicamento;
        this.tieneRestriccionesMedicas = tieneRestriccionesMedicas;
        this.estaVacunado = estaVacunado;
        this.observacionesmedicas = observacionesmedicas;
    }

    //Getters y setters
    /**
     * Obtiene el identificador del diagnóstico.
     * @return id del diagnóstico
     */
    public String getId() { return id; }

    /**
     * Establece el identificador del diagnóstico.
     * @param id nuevo identificador
     */
    public void setId(String id) { this.id = id; }

    /**
     * Obtiene el tipo de sangre.
     * @return tipo de sangre
     */
    public String getTipodesangre() { return tipodesangre; }

    /**
     * Establece el tipo de sangre.
     * @param tipodesangre nuevo tipo de sangre
     */
    public void setTipodesangre(String tipodesangre) { this.tipodesangre = tipodesangre; }

    /**
     * Obtiene los signos vitales asociados al diagnóstico.
     * @return signos vitales
     */
    public Signovital getSignovital() { return signovital; }

    /**
     * Establece los signos vitales.
     * @param signovital nuevos signos vitales
     */
    public void setSignovital(Signovital signovital) { this.signovital = signovital; }

    /**
     * Indica si el paciente es alérgico.
     * @return true si es alérgico, false en caso contrario
     */
    public boolean isEsAlergico() { return esAlergico; }

    /**
     * Define si el paciente es alérgico.
     * @param esAlergico valor de alergia
     */
    public void setEsAlergico(boolean esAlergico) { this.esAlergico = esAlergico; }

    /**
     * Obtiene los medicamentos asociados al diagnóstico.
     * @return arreglo de medicamentos
     */
    public Medicamento[] getMedicamento() { return medicamento; }

    /**
     * Establece los medicamentos asociados al diagnóstico.
     * @param medicamento arreglo de medicamentos
     */
    public void setMedicamento(Medicamento[] medicamento) { this.medicamento = medicamento; }

    /**
     * Indica si el paciente tiene restricciones médicas.
     * @return true si tiene restricciones médicas
     */
    public boolean isTieneRestriccionesMedicas() { return tieneRestriccionesMedicas; }

    /**
     * Define si el paciente tiene restricciones médicas.
     * @param tieneRestriccionesMedicas valor de restricción médica
     */
    public void setTieneRestriccionesMedicas(boolean tieneRestriccionesMedicas) { this.tieneRestriccionesMedicas = tieneRestriccionesMedicas; }

    /**
     * Indica si el paciente está vacunado.
     * @return true si está vacunado
     */
    public boolean isEstaVacunado() { return estaVacunado; }

    /**
     * Define si el paciente está vacunado.
     * @param estaVacunado estado de vacunación
     */
    public void setEstaVacunado(boolean estaVacunado) { this.estaVacunado = estaVacunado; }

    /**
     * Obtiene las observaciones médicas.
     * @return observaciones médicas
     */
    public String getObservacionesmedicas() { return observacionesmedicas; }

    /**
     * Establece las observaciones médicas.
     * @param observacionesmedicas nuevas observaciones
     */
    public void setObservacionesmedicas(String observacionesmedicas) { this.observacionesmedicas = observacionesmedicas; }

    /**
     * Devuelve una representación en texto del diagnóstico.
     *
     * @return información del diagnóstico en formato String
     */
    @Override
    public String toString() {
        return "Diagnostico{" +
                "id='" + id + '\'' +
                ", tipodesangre='" + tipodesangre + '\'' +
                ", signovital=" + signovital +
                ", esAlergico=" + esAlergico +
                ", medicamento=" + Arrays.toString(medicamento) +
                ", tieneRestriccionesMedicas=" + tieneRestriccionesMedicas +
                ", estaVacunado=" + estaVacunado +
                ", observacionesmedicas='" + observacionesmedicas + '\'' +
                '}';
    }
}
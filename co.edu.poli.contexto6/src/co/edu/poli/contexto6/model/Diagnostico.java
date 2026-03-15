package co.edu.poli.contexto6.model;

import java.util.Arrays;

public class Diagnostico {

    private String id;
    private String tipodesangre;
    private Signovital signovital;
    private boolean esAlergico;
    private Medicamento[] medicamento;
    private boolean tieneRestriccionesMedicas;
    private boolean estaVacunado;
    private String observacionesmedicas;

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

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTipodesangre() { return tipodesangre; }
    public void setTipodesangre(String tipodesangre) { this.tipodesangre = tipodesangre; }

    public Signovital getSignovital() { return signovital; }
    public void setSignovital(Signovital signovital) { this.signovital = signovital; }

    public boolean isEsAlergico() { return esAlergico; }
    public void setEsAlergico(boolean esAlergico) { this.esAlergico = esAlergico; }

    public Medicamento[] getMedicamento() { return medicamento; }
    public void setMedicamento(Medicamento[] medicamento) { this.medicamento = medicamento; }

    public boolean isTieneRestriccionesMedicas() { return tieneRestriccionesMedicas; }
    public void setTieneRestriccionesMedicas(boolean tieneRestriccionesMedicas) { this.tieneRestriccionesMedicas = tieneRestriccionesMedicas; }

    public boolean isEstaVacunado() { return estaVacunado; }
    public void setEstaVacunado(boolean estaVacunado) { this.estaVacunado = estaVacunado; }

    public String getObservacionesmedicas() { return observacionesmedicas; }
    public void setObservacionesmedicas(String observacionesmedicas) { this.observacionesmedicas = observacionesmedicas; }

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
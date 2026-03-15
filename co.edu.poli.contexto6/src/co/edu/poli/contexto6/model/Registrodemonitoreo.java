package co.edu.poli.contexto6.model;

import java.util.Arrays;

public class Registrodemonitoreo {

    private String id;
    private String fechademonitoreo;
    private Signovital signovital;
    private Astronauta astronauta;
    private Diagnostico diagnostico;
    private Alertamedica alertamedica;
    private Sensor[] sensor;

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

    public int ultimomonitoreo(String fechaactual) {
        return 0;
    }

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFechademonitoreo() { return fechademonitoreo; }
    public void setFechademonitoreo(String fechademonitoreo) { this.fechademonitoreo = fechademonitoreo; }

    public Signovital getSignovital() { return signovital; }
    public void setSignovital(Signovital signovital) { this.signovital = signovital; }

    public Astronauta getAstronauta() { return astronauta; }
    public void setAstronauta(Astronauta astronauta) { this.astronauta = astronauta; }

    public Diagnostico getDiagnostico() { return diagnostico; }
    public void setDiagnostico(Diagnostico diagnostico) { this.diagnostico = diagnostico; }

    public Alertamedica getAlertamedica() { return alertamedica; }
    public void setAlertamedica(Alertamedica alertamedica) { this.alertamedica = alertamedica; }

    public Sensor[] getSensor() { return sensor; }
    public void setSensor(Sensor[] sensor) { this.sensor = sensor; }

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
package co.edu.poli.contexto6.model;

public class Alertamedica {

    private String id;
    private String tipo;
    private int niveldeprioridad;
    private String fechadealerta;
    private String hora;
    private Signovital signovital;
    private Astronauta astronauta;

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
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getNiveldeprioridad() { return niveldeprioridad; }
    public void setNiveldeprioridad(int niveldeprioridad) { this.niveldeprioridad = niveldeprioridad; }

    public String getFechadealerta() { return fechadealerta; }
    public void setFechadealerta(String fechadealerta) { this.fechadealerta = fechadealerta; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public Signovital getSignovital() { return signovital; }
    public void setSignovital(Signovital signovital) { this.signovital = signovital; }

    public Astronauta getAstronauta() { return astronauta; }
    public void setAstronauta(Astronauta astronauta) { this.astronauta = astronauta; }

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

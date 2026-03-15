package co.edu.poli.contexto6.model;

public class Signovital {

    private double ritmocardiaco;
    private boolean esEstable;
    private double presionarterial; // mmHg (sistólica aproximada)
    private double temperatura;     // °C
    private double frecuenciarespiratoria; // rpm
    private double saturacionoxigeno;      // %
    private Astronauta astronauta;

    public Signovital(double ritmocardiaco, boolean esEstable, double presionarterial, double temperatura,
                      double frecuenciarespiratoria, double saturacionoxigeno, Astronauta astronauta) {
        this.ritmocardiaco = ritmocardiaco;
        this.esEstable = esEstable;
        this.presionarterial = presionarterial;
        this.temperatura = temperatura;
        this.frecuenciarespiratoria = frecuenciarespiratoria;
        this.saturacionoxigeno = saturacionoxigeno;
        this.astronauta = astronauta;
    }

    public boolean tieneFiebre() { return temperatura >= 38.0; }
    public boolean tieneHipertension() { return presionarterial >= 140.0; }
    public boolean tieneTaquicardia() { return ritmocardiaco > 100.0; }
    public boolean tieneTaquipnea() { return frecuenciarespiratoria > 20.0; }
    public boolean tieneHiperoxia() { return saturacionoxigeno > 98.0; }

    // Getters y setters
    public double getRitmocardiaco() { return ritmocardiaco; }
    public void setRitmocardiaco(double ritmocardiaco) { this.ritmocardiaco = ritmocardiaco; }

    public boolean isEsEstable() { return esEstable; }
    public void setEsEstable(boolean esEstable) { this.esEstable = esEstable; }

    public double getPresionarterial() { return presionarterial; }
    public void setPresionarterial(double presionarterial) { this.presionarterial = presionarterial; }

    public double getTemperatura() { return temperatura; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }

    public double getFrecuenciarespiratoria() { return frecuenciarespiratoria; }
    public void setFrecuenciarespiratoria(double frecuenciarespiratoria) { this.frecuenciarespiratoria = frecuenciarespiratoria; }

    public double getSaturacionoxigeno() { return saturacionoxigeno; }
    public void setSaturacionoxigeno(double saturacionoxigeno) { this.saturacionoxigeno = saturacionoxigeno; }

    public Astronauta getAstronauta() { return astronauta; }
    public void setAstronauta(Astronauta astronauta) { this.astronauta = astronauta; }

    @Override
    public String toString() {
        return "Signovital{" +
                "ritmocardiaco=" + ritmocardiaco +
                ", esEstable=" + esEstable +
                ", presionarterial=" + presionarterial +
                ", temperatura=" + temperatura +
                ", frecuenciarespiratoria=" + frecuenciarespiratoria +
                ", saturacionoxigeno=" + saturacionoxigeno +
                ", astronauta=" + astronauta +
                '}';
    }
}
package co.edu.poli.contexto6.model;

/**
 * Clase que representa los signos vitales registrados para un astronauta.
 * 
 * Esta clase almacena diferentes parámetros fisiológicos como el ritmo cardíaco,
 * la presión arterial, la temperatura corporal, la frecuencia respiratoria y la
 * saturación de oxígeno. También permite evaluar ciertas condiciones médicas
 * como fiebre, hipertensión, taquicardia o taquipnea.
 * 
 * @author Narath Teheran
 * @since 2026
 */
public class Signovital {

    /**
     * Ritmo cardíaco del astronauta medido en latidos por minuto.
     */
    private double ritmocardiaco;

    /**
     * Indica si el estado del astronauta es estable.
     */
    private boolean esEstable;

    /**
     * Presión arterial aproximada del astronauta en mmHg.
     */
    private double presionarterial;

    /**
     * Temperatura corporal del astronauta en grados Celsius.
     */
    private double temperatura;

    /**
     * Frecuencia respiratoria medida en respiraciones por minuto.
     */
    private double frecuenciarespiratoria;

    /**
     * Saturación de oxígeno en la sangre expresada en porcentaje.
     */
    private double saturacionoxigeno;

    /**
     * Astronauta al cual pertenecen los signos vitales registrados.
     */
    private Astronauta astronauta;

    /**
     * Constructor de la clase Signovital.
     * Inicializa todos los valores fisiológicos del astronauta.
     * 
     * @param ritmocardiaco ritmo cardíaco del astronauta
     * @param esEstable indica si el estado del astronauta es estable
     * @param presionarterial presión arterial del astronauta
     * @param temperatura temperatura corporal del astronauta
     * @param frecuenciarespiratoria frecuencia respiratoria
     * @param saturacionoxigeno saturación de oxígeno en sangre
     * @param astronauta astronauta asociado a estos signos vitales
     */
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

    /**
     * Determina si el astronauta presenta fiebre.
     * 
     * @return true si la temperatura es mayor o igual a 38°C, false en caso contrario
     */
    public boolean tieneFiebre() { return temperatura >= 38.0; }

    /**
     * Determina si el astronauta presenta hipertensión.
     * 
     * @return true si la presión arterial es mayor o igual a 140 mmHg
     */
    public boolean tieneHipertension() { return presionarterial >= 140.0; }

    /**
     * Determina si el astronauta presenta taquicardia.
     * 
     * @return true si el ritmo cardíaco es mayor a 100 latidos por minuto
     */
    public boolean tieneTaquicardia() { return ritmocardiaco > 100.0; }

    /**
     * Determina si el astronauta presenta taquipnea.
     * 
     * @return true si la frecuencia respiratoria es mayor a 20 respiraciones por minuto
     */
    public boolean tieneTaquipnea() { return frecuenciarespiratoria > 20.0; }

    /**
     * Determina si el astronauta presenta hiperoxia.
     * 
     * @return true si la saturación de oxígeno es mayor a 98%
     */
    public boolean tieneHiperoxia() { return saturacionoxigeno > 98.0; }

    /**
     * Obtiene el ritmo cardíaco del astronauta.
     * 
     * @return ritmo cardíaco
     */
    public double getRitmocardiaco() { return ritmocardiaco; }

    /**
     * Establece el ritmo cardíaco del astronauta.
     * 
     * @param ritmocardiaco nuevo ritmo cardíaco
     */
    public void setRitmocardiaco(double ritmocardiaco) { this.ritmocardiaco = ritmocardiaco; }

    /**
     * Indica si el estado del astronauta es estable.
     * 
     * @return true si el estado es estable
     */
    public boolean isEsEstable() { return esEstable; }

    /**
     * Define si el estado del astronauta es estable.
     * 
     * @param esEstable nuevo estado del astronauta
     */
    public void setEsEstable(boolean esEstable) { this.esEstable = esEstable; }

    /**
     * Obtiene la presión arterial del astronauta.
     * 
     * @return presión arterial
     */
    public double getPresionarterial() { return presionarterial; }

    /**
     * Establece la presión arterial del astronauta.
     * 
     * @param presionarterial nueva presión arterial
     */
    public void setPresionarterial(double presionarterial) { this.presionarterial = presionarterial; }

    /**
     * Obtiene la temperatura corporal del astronauta.
     * 
     * @return temperatura corporal
     */
    public double getTemperatura() { return temperatura; }

    /**
     * Establece la temperatura corporal del astronauta.
     * 
     * @param temperatura nueva temperatura corporal
     */
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }

    /**
     * Obtiene la frecuencia respiratoria del astronauta.
     * 
     * @return frecuencia respiratoria
     */
    public double getFrecuenciarespiratoria() { return frecuenciarespiratoria; }

    /**
     * Establece la frecuencia respiratoria del astronauta.
     * 
     * @param frecuenciarespiratoria nueva frecuencia respiratoria
     */
    public void setFrecuenciarespiratoria(double frecuenciarespiratoria) { this.frecuenciarespiratoria = frecuenciarespiratoria; }

    /**
     * Obtiene la saturación de oxígeno en sangre.
     * 
     * @return saturación de oxígeno
     */
    public double getSaturacionoxigeno() { return saturacionoxigeno; }

    /**
     * Establece la saturación de oxígeno en sangre.
     * 
     * @param saturacionoxigeno nuevo valor de saturación
     */
    public void setSaturacionoxigeno(double saturacionoxigeno) { this.saturacionoxigeno = saturacionoxigeno; }

    /**
     * Obtiene el astronauta asociado a los signos vitales.
     * 
     * @return astronauta
     */
    public Astronauta getAstronauta() { return astronauta; }

    /**
     * Establece el astronauta asociado a estos signos vitales.
     * 
     * @param astronauta nuevo astronauta asociado
     */
    public void setAstronauta(Astronauta astronauta) { this.astronauta = astronauta; }

    /**
     * Devuelve una representación en texto del objeto Signovital.
     * 
     * @return información de los signos vitales en formato String
     */
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
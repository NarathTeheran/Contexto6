package co.edu.poli.contexto6.model;

public class Sensorelectroquimico extends Sensor {

    private double tiempodeAnalisis;
    private double sensibilidad;
    private boolean requiereMuestra;
    private String tipodemuestra;

    public Sensorelectroquimico(double version, double niveldecarga, double presicion, int aniodefabricacion, double margendeerror, Proveedor proveedor, double tiempodeAnalisis, double sensibilidad, boolean requiereMuestra, String tipodemuestra) {
        super(version, niveldecarga, presicion, aniodefabricacion, margendeerror, proveedor);
        this.tiempodeAnalisis = tiempodeAnalisis;
        this.sensibilidad = sensibilidad;
        this.requiereMuestra = requiereMuestra;
        this.tipodemuestra = tipodemuestra;
    }
    @Override
    public int calcularantiguedad(int anioactual) {
        return super.calcularantiguedad(anioactual);
    }
    // Getters y setters
    public double getTiempodeAnalisis() { return tiempodeAnalisis; }
    public void setTiempodeAnalisis(double tiempodeAnalisis) { this.tiempodeAnalisis = tiempodeAnalisis; }

    public double getSensibilidad() { return sensibilidad; }
    public void setSensibilidad(double sensibilidad) { this.sensibilidad = sensibilidad; }

    public boolean isRequiereMuestra() { return requiereMuestra; }
    public void setRequiereMuestra(boolean requiereMuestra) { this.requiereMuestra = requiereMuestra; }

    public String getTipodemuestra() { return tipodemuestra; }
    public void setTipodemuestra(String tipodemuestra) { this.tipodemuestra = tipodemuestra; }

    @Override
    public String toString() {
        return "Sensorelectroquimico{" +
                "tiempodeAnalisis=" + tiempodeAnalisis +
                ", sensibilidad=" + sensibilidad +
                ", requiereMuestra=" + requiereMuestra +
                ", tipodemuestra='" + tipodemuestra + '\'' +
                ", base=" + super.toString() +
                '}';
    }
}
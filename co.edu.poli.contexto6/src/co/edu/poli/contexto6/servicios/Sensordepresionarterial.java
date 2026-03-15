package co.edu.poli.contexto6.servicios;

import co.edu.poli.contexto6.model.Proveedor;
import co.edu.poli.contexto6.model.Sensorfisiologico;

public class Sensordepresionarterial extends Sensorfisiologico {

    private String metodomedicion;
    private double presionSistolica;
    private double presionDiastolica;

    public Sensordepresionarterial(double version, double niveldecarga, double presicion, int aniodefabricacion,
                                   double margendeerror, Proveedor proveedor,
                                   String parametromedico, double rangodemedicion, String unidadmedida,
                                   boolean estaEnContacto, String zonademedicion,
                                   String metodomedicion, double presionSistolica, double presionDiastolica) {
        super(version, niveldecarga, presicion, aniodefabricacion, margendeerror, proveedor,
              parametromedico, rangodemedicion, unidadmedida, estaEnContacto, zonademedicion);
        this.metodomedicion = metodomedicion;
        this.presionSistolica = presionSistolica;
        this.presionDiastolica = presionDiastolica;
    }

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

    // Getters y setters
    public String getMetodomedicion() { return metodomedicion; }
    public void setMetodomedicion(String metodomedicion) { this.metodomedicion = metodomedicion; }

    public double getPresionSistolica() { return presionSistolica; }
    public void setPresionSistolica(double presionSistolica) { this.presionSistolica = presionSistolica; }

    public double getPresionDiastolica() { return presionDiastolica; }
    public void setPresionDiastolica(double presionDiastolica) { this.presionDiastolica = presionDiastolica; }

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
package co.edu.poli.contexto6.model;

public class Sensorfisiologico extends Sensor {

    private String parametromedico;
    private double rangodemedicion;
    private String unidadmedida;
    private boolean estaEnContacto;
    private String zonademedicion;

    public Sensorfisiologico(double version, double niveldecarga, double presicion, int aniodefabricacion,
                             double margendeerror, Proveedor proveedor,
                             String parametromedico, double rangodemedicion, String unidadmedida,
                             boolean estaEnContacto, String zonademedicion) {
        super(version, niveldecarga, presicion, aniodefabricacion, margendeerror, proveedor);
        this.parametromedico = parametromedico;
        this.rangodemedicion = rangodemedicion;
        this.unidadmedida = unidadmedida;
        this.estaEnContacto = estaEnContacto;
        this.zonademedicion = zonademedicion;
    }
    @Override
    public int calcularantiguedad(int anioactual) {
        return super.calcularantiguedad(anioactual);
    }

    // Getters y setters
    public String getParametromedico() { return parametromedico; }
    public void setParametromedico(String parametromedico) { this.parametromedico = parametromedico; }

    public double getRangodemedicion() { return rangodemedicion; }
    public void setRangodemedicion(double rangodemedicion) { this.rangodemedicion = rangodemedicion; }

    public String getUnidadmedida() { return unidadmedida; }
    public void setUnidadmedida(String unidadmedida) { this.unidadmedida = unidadmedida; }

    public boolean isEstaEnContacto() { return estaEnContacto; }
    public void setEstaEnContacto(boolean estaEnContacto) { this.estaEnContacto = estaEnContacto; }

    public String getZonademedicion() { return zonademedicion; }
    public void setZonademedicion(String zonademedicion) { this.zonademedicion = zonademedicion; }

    @Override
    public String toString() {
        return "Sensorfisiologico{" +
                "parametromedico='" + parametromedico + '\'' +
                ", rangodemedicion=" + rangodemedicion +
                ", unidadmedida='" + unidadmedida + '\'' +
                ", estaEnContacto=" + estaEnContacto +
                ", zonademedicion='" + zonademedicion + '\'' +
                ", base=" + super.toString() +
                '}';
    }
}
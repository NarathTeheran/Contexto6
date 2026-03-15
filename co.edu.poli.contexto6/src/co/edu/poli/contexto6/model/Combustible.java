package co.edu.poli.contexto6.model;

public class Combustible {

    private String tipo;
    private boolean esInflamable;
    private double densidad;
    private double pH;
    private Proveedor proveedor;

    public Combustible(String tipo, boolean esInflamable, double densidad, double pH, Proveedor proveedor) {
        this.tipo = tipo;
        this.esInflamable = esInflamable;
        this.densidad = densidad;
        this.pH = pH;
        this.proveedor = proveedor;
    }

    public String tippodepH() {
        if (pH < 7.0) return "Ácido";
        if (pH > 7.0) return "Básico";
        return "Neutro";
    }

    // Getters y setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public boolean isEsInflamable() { return esInflamable; }
    public void setEsInflamable(boolean esInflamable) { this.esInflamable = esInflamable; }

    public double getDensidad() { return densidad; }
    public void setDensidad(double densidad) { this.densidad = densidad; }

    public double getpH() { return pH; }
    public void setpH(double pH) { this.pH = pH; }

    public Proveedor getProveedor() { return proveedor; }
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor; }

    @Override
    public String toString() {
        return "Combustible{" +
                "tipo='" + tipo + '\'' +
                ", esInflamable=" + esInflamable +
                ", densidad=" + densidad +
                ", pH=" + pH +
                ", proveedor=" + proveedor +
                '}';
    }
}
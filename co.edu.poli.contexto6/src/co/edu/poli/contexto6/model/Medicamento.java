package co.edu.poli.contexto6.model;

public final class Medicamento {
	
    private String nombre;
    private String codigo;
    private int dosis;
    private String frecuenciadeconsumo;

    public Medicamento(String nombre, String codigo, int dosis, String frecuenciadeconsumo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.dosis = dosis;
        this.frecuenciadeconsumo = frecuenciadeconsumo;
    }

    public boolean dosisEsSegura(int dosismaxima) {
        return dosis <= dosismaxima;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public int getDosis() { return dosis; }
    public void setDosis(int dosis) { this.dosis = dosis; }

    public String getFrecuenciadeconsumo() { return frecuenciadeconsumo; }
    public void setFrecuenciadeconsumo(String frecuenciadeconsumo) { this.frecuenciadeconsumo = frecuenciadeconsumo; }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", dosis=" + dosis +
                ", frecuenciadeconsumo='" + frecuenciadeconsumo + '\'' +
                '}';
    }
}
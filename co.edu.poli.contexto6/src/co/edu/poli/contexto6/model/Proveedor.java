package co.edu.poli.contexto6.model;

public class Proveedor {

    private String nombre;
    private String id;
    private int edad;
    private String recurso;
    private boolean esCertificado;
    private boolean esConfiable;

    public Proveedor(String nombre, String id, int edad, String recurso, boolean esCertificado, boolean esConfiable) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.recurso = recurso;
        this.esCertificado = esCertificado;
        this.esConfiable = esConfiable;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getRecurso() { return recurso; }
    public void setRecurso(String recurso) { this.recurso = recurso; }

    public boolean isEsCertificado() { return esCertificado; }
    public void setEsCertificado(boolean esCertificado) { this.esCertificado = esCertificado; }

    public boolean isEsConfiable() { return esConfiable; }
    public void setEsConfiable(boolean esConfiable) { this.esConfiable = esConfiable; }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", edad=" + edad +
                ", recurso='" + recurso + '\'' +
                ", esCertificado=" + esCertificado +
                ", esConfiable=" + esConfiable +
                '}';
    }
}

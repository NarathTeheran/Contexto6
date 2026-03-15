package co.edu.poli.contexto6.model;

public class Astronauta {

    private String id;
    private String nombre;
    private int anionacimiento;
    private String rol;
    private double peso;
    private double altura;

    public Astronauta(String id, String nombre, int anionacimiento, String rol, double peso, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.anionacimiento = anionacimiento;
        this.rol = rol;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularedad(int anioactual) {
        return anioactual - anionacimiento;
    }

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getAnionacimiento() { return anionacimiento; }
    public void setAnionacimiento(int anionacimiento) { this.anionacimiento = anionacimiento; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    @Override
    public String toString() {
        return "Astronauta{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", anionacimiento=" + anionacimiento +
                ", rol='" + rol + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
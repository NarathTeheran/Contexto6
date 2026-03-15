package co.edu.poli.contexto6.model;

public class Centrodecontrol {

    private String id;
    private String nombre;
    private String ubicacion;
    private int capacidaddepersonal;

    public Centrodecontrol(String id, String nombre, String ubicacion, int capacidaddepersonal) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidaddepersonal = capacidaddepersonal;
    }

    public double calcularocupacion(int personalactual) {
        if (capacidaddepersonal <= 0) return 0.0;
        return (personalactual * 100.0) / capacidaddepersonal;
    }

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public int getCapacidaddepersonal() { return capacidaddepersonal; }
    public void setCapacidaddepersonal(int capacidaddepersonal) { this.capacidaddepersonal = capacidaddepersonal; }

    @Override
    public String toString() {
        return "Centrodecontrol{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidaddepersonal=" + capacidaddepersonal +
                '}';
    }
}
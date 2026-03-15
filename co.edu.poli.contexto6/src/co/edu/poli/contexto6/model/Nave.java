package co.edu.poli.contexto6.model;

public class Nave {

    private String tipo;
    private int capacidad;
    private Combustible combustible;
    private String fechadecarga;
    private double capacidaddecombustible;
    private String material;
    private double tamanio;
    private String fechadefabricacion;

    public Nave(String tipo, int capacidad, Combustible combustible, String fechadecarga,
                double capacidaddecombustible, String material, double tamanio, String fechadefabricacion) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.combustible = combustible;
        this.fechadecarga = fechadecarga;
        this.capacidaddecombustible = capacidaddecombustible;
        this.material = material;
        this.tamanio = tamanio;
        this.fechadefabricacion = fechadefabricacion;
    }

    /**
     * Cálculo simple lineal de consumo con base en distancia y capacidad de combustible.
     * Ajusta esta regla según tu modelo de negocio.
     */
    public double calcularconsumo(double distancia) {
        return 0;
    }

    // Getters y setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public Combustible getCombustible() { return combustible; }
    public void setCombustible(Combustible combustible) { this.combustible = combustible; }

    public String getFechadecarga() { return fechadecarga; }
    public void setFechadecarga(String fechadecarga) { this.fechadecarga = fechadecarga; }

    public double getCapacidaddecombustible() { return capacidaddecombustible; }
    public void setCapacidaddecombustible(double capacidaddecombustible) { this.capacidaddecombustible = capacidaddecombustible; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public double getTamanio() { return tamanio; }
    public void setTamanio(double tamanio) { this.tamanio = tamanio; }

    public String getFechadefabricacion() { return fechadefabricacion; }
    public void setFechadefabricacion(String fechadefabricacion) { this.fechadefabricacion = fechadefabricacion; }

    @Override
    public String toString() {
        return "Nave{" +
                "tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                ", combustible=" + combustible +
                ", fechadecarga='" + fechadecarga + '\'' +
                ", capacidaddecombustible=" + capacidaddecombustible +
                ", material='" + material + '\'' +
                ", tamanio=" + tamanio +
                ", fechadefabricacion='" + fechadefabricacion + '\'' +
                '}';
    }
}
package co.edu.poli.contexto6.model;

public abstract class Sensor {
	
	private String id;
    private double version;
    private double niveldecarga;
    private double presicion;
    private int aniodefabricacion;
    // ---- ESTÁTICO SEGÚN TU INDICACIÓN ----
    private static double margendeerror = 0.0;
    private Proveedor proveedor;
    private final String codigoSensor = "SensorEspacial";

    public Sensor(String id, double version, double niveldecarga, double presicion, int aniodefabricacion,
                  double margendeerrorConstructor, Proveedor proveedor) {
        this.id = id;
    	this.version = version;
        this.niveldecarga = niveldecarga;
        this.presicion = presicion;
        this.aniodefabricacion = aniodefabricacion;
        // el valor que venga en el constructor lo fijamos como valor estático compartido
        Sensor.margendeerror = margendeerrorConstructor;
        this.proveedor = proveedor;
    }

    public double cargarestante() {
        double estimado = niveldecarga - Sensor.margendeerror; // usa el estático
        return estimado < 0 ? 0 : estimado;
    }

    // --------- SOBRECARGA (overload) PROTEGIDA DEL DIAGRAMA ----------
    public int calcularantiguedad(int anioactual) {
        return anioactual - aniodefabricacion;
    }

    public int calcularantiguedad(String fechaactual) {
        int anio = extraerAnio(fechaactual);
        return calcularantiguedad(anio);
    }

    public int extraerAnio(String fecha) {
        if (fecha == null || fecha.length() < 4) return 0;
        try { return Integer.parseInt(fecha.substring(0, 4)); } catch (Exception e) { return 0; }
    }
    
    public final void mostrarTipoSensor() {
        System.out.println("Sensor base del sistema");
    }

    public abstract double obtenerLectura();


    // --------- GETTERS/SETTERS ---------
    
    public String getId() {return id;}
	public void setId(String id) { this.id = id;}
	
	public double getVersion() { return version; }
	public void setVersion(double version) { this.version = version; }

    public double getNiveldecarga() { return niveldecarga; }
    public void setNiveldecarga(double niveldecarga) { this.niveldecarga = niveldecarga; }

    public double getPresicion() { return presicion; }
    public void setPresicion(double presicion) { this.presicion = presicion; }

    public int getAniodefabricacion() { return aniodefabricacion; }
    public void setAniodefabricacion(int aniodefabricacion) { this.aniodefabricacion = aniodefabricacion; }

    public Proveedor getProveedor() { return proveedor; }
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor; }

    // ---- ACCESORES ESTÁTICOS DEL ATRIBUTO ESTÁTICO ----
    public static double getMargendeerror() { return margendeerror; }
    public static void setMargendeerror(double me) { margendeerror = me; }

    public String getCodigoSensor() {
		return codigoSensor;
	}

	@Override
    public String toString() {
        return "Sensor {" +
        		"id=" + id +
                ", version=" + version +
                ", niveldecarga=" + niveldecarga +
                ", presicion=" + presicion +
                ", aniodefabricacion=" + aniodefabricacion +
                ", margendeerror(ESTATICO)=" + margendeerror +
                ", proveedor=" + proveedor + "codigoSensor=" + codigoSensor +
                '}';
    }
}
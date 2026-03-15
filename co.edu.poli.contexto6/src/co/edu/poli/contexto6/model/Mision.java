package co.edu.poli.contexto6.model;

import java.util.Arrays;

public class Mision {

    private Astronauta[] astronauta;
    private Nave nave;
    private Planeta planeta;
    private String id;
    private String nombre;
    private String fechadeinicio;
    private String fechadefin;
    private Centrodecontrol centrodecontrol;

    public Mision(Astronauta[] astronauta, Nave nave, Planeta planeta, String id, String nombre,
                  String fechadeinicio, String fechadefin, Centrodecontrol centrodecontrol) {
        this.astronauta = astronauta;
        this.nave = nave;
        this.planeta = planeta;
        this.id = id;
        this.nombre = nombre;
        this.fechadeinicio = fechadeinicio;
        this.fechadefin = fechadefin;
        this.centrodecontrol = centrodecontrol;
    }

    public double duracion() {
        return 0;
    }

    // Getters y setters
    public Astronauta[] getAstronauta() { return astronauta; }
    public void setAstronauta(Astronauta[] astronauta) { this.astronauta = astronauta; }

    public Nave getNave() { return nave; }
    public void setNave(Nave nave) { this.nave = nave; }

    public Planeta getPlaneta() { return planeta; }
    public void setPlaneta(Planeta planeta) { this.planeta = planeta; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFechadeinicio() { return fechadeinicio; }
    public void setFechadeinicio(String fechadeinicio) { this.fechadeinicio = fechadeinicio; }

    public String getFechadefin() { return fechadefin; }
    public void setFechadefin(String fechadefin) { this.fechadefin = fechadefin; }

    public Centrodecontrol getCentrodecontrol() { return centrodecontrol; }
    public void setCentrodecontrol(Centrodecontrol centrodecontrol) { this.centrodecontrol = centrodecontrol; }

    @Override
    public String toString() {
        return "Mision{" +
                "astronauta=" + Arrays.toString(astronauta) +
                ", nave=" + nave +
                ", planeta=" + planeta +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechadeinicio='" + fechadeinicio + '\'' +
                ", fechadefin='" + fechadefin + '\'' +
                ", centrodecontrol=" + centrodecontrol +
                '}';
    }
}
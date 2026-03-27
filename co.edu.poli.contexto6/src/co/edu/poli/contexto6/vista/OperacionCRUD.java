package co.edu.poli.contexto6.vista;
import co.edu.poli.contexto6.model.Sensor;

public interface OperacionCRUD {

    String crear(Sensor objeto);
    Sensor leerUno(String id);
    Sensor[] leerTodos();
    String modificar(String id, Sensor objeto);
    Sensor eliminar(String id);
}
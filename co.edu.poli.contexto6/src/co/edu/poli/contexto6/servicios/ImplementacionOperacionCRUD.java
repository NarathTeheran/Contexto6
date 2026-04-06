package co.edu.poli.contexto6.servicios;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.edu.poli.contexto6.model.Sensor;
import co.edu.poli.contexto6.vista.*;

/**
 * Clase que implementa las operaciones CRUD para la gestión de sensores.
 * 
 * Permite crear, leer, modificar y eliminar objetos de tipo Sensor
 * almacenados en un arreglo dinámico. También incluye métodos para
 * serializar y deserializar los sensores en archivos.
 * 
 * Implementa las interfaces OperacionCRUD y OperacionArchivo.
 * 
 * @author Narath Teheran
 * @since 2026
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD, OperacionArchivo {
	
	/**
     * Arreglo que almacena los sensores registrados en el sistema.
     */
    private Sensor[] arregloSensor;
    
    /**
     * Constructor de la clase ImplementacionOperacionCRUD.
     * Inicializa el arreglo de sensores con un tamaño inicial de 2.
     */
    public ImplementacionOperacionCRUD() {
    	arregloSensor = new Sensor[2]; // tamaño inicial según el diagrama
    }
    //GETTERS Y SETTERS DEL ARREGLO
    public Sensor[] getSensores() {
        return arregloSensor;
    }

    public void setSensores(Sensor[] sensores) {
        this.arregloSensor = sensores;
    }
    
    /**
     * Crea un nuevo sensor en el sistema.
     * Inserta el sensor en la primera posición null disponible.
     * Si el arreglo está lleno, se redimensiona al doble.
     * 
     * @param objeto sensor que se desea registrar
     * @return mensaje indicando el resultado de la operación
     */
    @Override
    public String crear(Sensor objeto) {
        if (objeto == null) {
            return "El objeto Sensor es null";
        }
        if (objeto.getId() == null || objeto.getId().isEmpty()) {
            return "El ID del Sensor no es valido";
        }
        // Validar que no exista un Sensor con el mismo ID
        for (Sensor s : arregloSensor) {
            if (s != null && s.getId().equals(objeto.getId())) {
                return "Error: Ya existe un Sensor con ese ID";
            }
        }
        // Insertar en el primer null
        for (int i = 0; i < arregloSensor.length; i++) {
            if (arregloSensor[i] == null) {
            	arregloSensor[i] = objeto;
                return "Sensor creado correctamente";
            }
        }
        // Si no hay espacio, crecer el arreglo
        Sensor[] nuevoArreglo = new Sensor[arregloSensor.length * 2];
        for (int i = 0; i < arregloSensor.length; i++) {
            nuevoArreglo[i] = arregloSensor[i];
        }
        nuevoArreglo[arregloSensor.length] = objeto;
        arregloSensor = nuevoArreglo;
        return "Sensor creado correctamente (arreglo redimensionado)";
    }

    /**
     * Busca un sensor por su ID.
     * 
     * @param id identificador del sensor
     * @return el sensor encontrado o null si no existe
     */
    @Override
    public Sensor leerUno(String id) {
        if (id == null || id.isEmpty()) {
            return null;
        }
        for (Sensor s : arregloSensor) {
            if (s != null && s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    /**
     * Obtiene todos los sensores almacenados en el sistema.
     * 
     * @return arreglo con los sensores existentes
     */
    @Override
    public Sensor[] leerTodos() {
        int contador = 0;
        for (Sensor s : arregloSensor) {
            if (s != null) {
                contador++;
            }
        }
        Sensor[] resultado = new Sensor[contador];
        int indice = 0;
        for (Sensor s : arregloSensor) {
            if (s != null) {
                resultado[indice++] = s;
            }
        }
        return resultado;
    }

    /**
     * Modifica un sensor existente en el sistema.
     * 
     * @param id identificador del sensor a modificar
     * @param objeto nuevo objeto sensor
     * @return mensaje indicando el resultado de la operación
     */
    @Override
    public String modificar(String id, Sensor objeto) {
        if (id == null || id.isEmpty() || objeto == null) {
            return "Error: Datos inválidos";
        }
        for (int i = 0; i < arregloSensor.length; i++) {
            if (arregloSensor[i] != null && arregloSensor[i].getId().equals(id)) {
            	arregloSensor[i] = objeto;
                return "Sensor modificado correctamente";
            }
        }
        return "Sensor no encontrado";
    }

    /**
     * Elimina un sensor del sistema usando su ID.
     * 
     * @param id identificador del sensor
     * @return sensor eliminado o null si no se encontró
     */
    @Override
    public Sensor eliminar(String id) {
        if (id == null || id.isEmpty()) {
            return null;
        }
        for (int i = 0; i < arregloSensor.length; i++) {
            if (arregloSensor[i] != null && arregloSensor[i].getId().equals(id)) {
                Sensor eliminado = arregloSensor[i];
                arregloSensor[i] = null;
                return eliminado;
            }
        }
        return null;
    }
    
    /**
     * Serializa un arreglo de sensores en un archivo.
     * 
     * @param estudiantes arreglo de sensores a guardar
     * @param path ruta del archivo
     * @param name nombre del archivo
     * @return mensaje indicando el resultado del proceso
     */
    @Override
    public String serializar(Sensor[] estudiantes, String path, String name) {
        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(estudiantes);
            oos.close();
            fos.close();
            return "Archivo create!!";
        } catch (IOException ioe) {
            return "Error file " + ioe.getMessage();
        }
    }

    /**
     * Deserializa un archivo para recuperar un arreglo de sensores.
     * 
     * @param path ruta donde se encuentra el archivo
     * @param name nombre del archivo
     * @return arreglo de sensores leído del archivo
     */
    @Override
    public Sensor[] deserializar(String path, String name) {
        Sensor[] a = null;
        try {
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream(fis);

            a = (Sensor[]) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        } catch (ClassNotFoundException c) {
            System.err.println(c.getMessage());
        }
        return a;
    }

}
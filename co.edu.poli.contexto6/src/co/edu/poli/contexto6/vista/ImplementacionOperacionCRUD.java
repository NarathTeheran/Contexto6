package co.edu.poli.contexto6.vista;

import co.edu.poli.contexto6.model.Sensor;

public class ImplementacionOperacionCRUD implements OperacionCRUD {

    private Sensor[] arregloObjeto;
    public ImplementacionOperacionCRUD() {
        arregloObjeto = new Sensor[2]; // tamaño inicial según el diagrama
    }

    @Override
    public String crear(Sensor objeto) {
        if (objeto == null) {
            return "El objeto Sensor es null";
        }
        if (objeto.getId() == null || objeto.getId().isEmpty()) {
            return "El ID del Sensor no es valido";
        }
        // Validar que no exista un Sensor con el mismo ID
        for (Sensor s : arregloObjeto) {
            if (s != null && s.getId().equals(objeto.getId())) {
                return "Error: Ya existe un Sensor con ese ID";
            }
        }
        // Insertar en el primer null
        for (int i = 0; i < arregloObjeto.length; i++) {
            if (arregloObjeto[i] == null) {
                arregloObjeto[i] = objeto;
                return "Sensor creado correctamente";
            }
        }
        // Si no hay espacio, crecer el arreglo
        Sensor[] nuevoArreglo = new Sensor[arregloObjeto.length * 2];
        for (int i = 0; i < arregloObjeto.length; i++) {
            nuevoArreglo[i] = arregloObjeto[i];
        }
        nuevoArreglo[arregloObjeto.length] = objeto;
        arregloObjeto = nuevoArreglo;
        return "Sensor creado correctamente (arreglo redimensionado)";
    }

    @Override
    public Sensor leerUno(String id) {
        if (id == null || id.isEmpty()) {
            return null;
        }
        for (Sensor s : arregloObjeto) {
            if (s != null && s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Sensor[] leerTodos() {
        int contador = 0;
        for (Sensor s : arregloObjeto) {
            if (s != null) {
                contador++;
            }
        }
        Sensor[] resultado = new Sensor[contador];
        int indice = 0;
        for (Sensor s : arregloObjeto) {
            if (s != null) {
                resultado[indice++] = s;
            }
        }
        return resultado;
    }

    @Override
    public String modificar(String id, Sensor objeto) {
        if (id == null || id.isEmpty() || objeto == null) {
            return "Error: Datos inválidos";
        }
        for (int i = 0; i < arregloObjeto.length; i++) {
            if (arregloObjeto[i] != null && arregloObjeto[i].getId().equals(id)) {
                arregloObjeto[i] = objeto;
                return "Sensor modificado correctamente";
            }
        }
        return "Sensor no encontrado";
    }

    @Override
    public Sensor eliminar(String id) {
        if (id == null || id.isEmpty()) {
            return null;
        }
        for (int i = 0; i < arregloObjeto.length; i++) {
            if (arregloObjeto[i] != null && arregloObjeto[i].getId().equals(id)) {
                Sensor eliminado = arregloObjeto[i];
                arregloObjeto[i] = null;
                return eliminado;
            }
        }
        return null;
    }
}
package co.edu.poli.contexto6.servicios;

import co.edu.poli.contexto6.model.Sensor;

/**
 * Interfaz que define las operaciones básicas de un sistema CRUD
 * (Crear, Leer, Modificar y Eliminar) para objetos de tipo Sensor.
 * <p>
 * Esta interfaz permite gestionar la información de los sensores dentro
 * del sistema, proporcionando métodos para agregar, consultar, modificar
 * y eliminar sensores almacenados.
 * </p>
 *
 * @author Narath Nikole Teheran Velandia
 * @since 2026
 */
public interface OperacionCRUD {

    /**
     * Método encargado de crear o registrar un nuevo sensor dentro del sistema.
     *
     * @param objeto Objeto de tipo Sensor que se desea agregar al sistema.
     * 
     * @return Un mensaje de texto que indica si el sensor fue creado
     *         correctamente o si ocurrió algún error en el proceso.
     */
    String crear(Sensor objeto);

    /**
     * Método encargado de consultar un sensor específico utilizando su
     * identificador único.
     *
     * @param id Identificador del sensor que se desea consultar.
     * 
     * @return Un objeto de tipo Sensor que corresponde al identificador
     *         solicitado. Si no existe, puede retornar null.
     */
    Sensor leerUno(String id);

    /**
     * Método encargado de obtener todos los sensores almacenados en el sistema.
     *
     * @return Un arreglo de objetos Sensor que contiene todos los sensores
     *         registrados.
     */
    Sensor[] leerTodos();

    /**
     * Método encargado de modificar la información de un sensor existente.
     *
     * @param id Identificador del sensor que se desea modificar.
     * @param objeto Objeto Sensor con la nueva información que reemplazará
     *               la información actual del sensor.
     * 
     * @return Un mensaje de texto que indica si la modificación fue
     *         realizada correctamente o si ocurrió algún error.
     */
    String modificar(String id, Sensor objeto);

    /**
     * Método encargado de eliminar un sensor del sistema utilizando su
     * identificador.
     *
     * @param id Identificador del sensor que se desea eliminar.
     * 
     * @return El objeto Sensor que fue eliminado del sistema. Si no existe,
     *         puede retornar null.
     */
    Sensor eliminar(String id);
}
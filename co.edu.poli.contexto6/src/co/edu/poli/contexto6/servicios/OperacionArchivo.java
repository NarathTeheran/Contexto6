package co.edu.poli.contexto6.servicios;

import co.edu.poli.contexto6.model.Sensor;

/**
 * Interfaz que define las operaciones necesarias para la manipulación
 * de archivos relacionados con objetos de tipo Sensor.
 * 
 * Esta interfaz permite realizar procesos de serialización y deserialización
 * de arreglos de sensores, con el fin de almacenar y recuperar la información
 * de los sensores desde archivos en el sistema.
 * 
 * @author Narath Teheran
 * @since 2026
 */

public interface OperacionArchivo {
    
    /**
     * Método encargado de convertir un arreglo de sensores en un formato
     * que pueda ser almacenado en un archivo dentro del sistema.
	 *
     * Este proceso permite guardar la información de los sensores
     * en un archivo específico definido por la ruta y el nombre.
     *
     * @param sensores Arreglo de objetos Sensor que se desean almacenar
     *                 en el archivo.
     * @param path Ruta del sistema donde se almacenará el archivo.
     * @param name Nombre del archivo donde se guardará la información.
     * 
     * @return Un mensaje de texto que indica el resultado del proceso
     *         de serialización (éxito o error).
     */
    public String serializar(Sensor[] sensores, String path, String name)throws Exception;

    /**
     * Método encargado de recuperar la información de sensores almacenada
     * previamente en un archivo.
     * 
     * Este proceso convierte los datos almacenados en el archivo nuevamente
     * en un arreglo de objetos Sensor para su utilización dentro del sistema.
     * 
     *
     * @param path Ruta del sistema donde se encuentra el archivo.
     * @param name Nombre del archivo que contiene la información de los sensores.
     * 
     * @return Un arreglo de objetos Sensor con la información recuperada
     *         desde el archivo.
     */
    public Sensor[] deserializar(String path, String name)throws Exception;

}
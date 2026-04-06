package co.edu.poli.contexto6.vista;
import java.util.Scanner;

import co.edu.poli.contexto6.model.*;
import co.edu.poli.contexto6.servicios.*;

public class Principal {
    public static void main(String[] args) {
    	/*
        Proveedor prov = new Proveedor("Acme Space", "P-001", 12, "Sensores", true, true);
        Astronauta a1 = new Astronauta("A-01", "Valentina", 1992, "Comandante", 68.0, 1.72);
        Signovital sv = new Signovital(88.0, true, 118.0, 36.8, 16.0, 97.0, a1);
        Medicamento med = new Medicamento("Ibuprofeno", "MED-001", 400, "8h");
        Medicamento[] meds = new Medicamento[]{med};
        Diagnostico dx = new Diagnostico("DX-01", "O+", sv, false, meds, false, true, "Sin novedades");
        Alertamedica alerta = new Alertamedica("AL-01", "Recordatorio", 2, "2026-03-09", "10:30", sv, a1);
        Sensor sens1 = new Sensorelectroquimico("098", 1.0, 90.0, 0.98, 2024, 2.0, prov, 2.6, 0.88, true, "Sangre");
        Sensorelectroquimico sens2 = new Sensorelectroquimico("123", 1.1, 85.0, 0.99, 2022, 2.0, prov, 2.5, 0.95, true, "Sangre");
        Sensor[] sensores = new Sensor[]{sens1, sens2};
        Registrodemonitoreo reg = new Registrodemonitoreo("R-01", "2026-03-09", sv, a1, dx, alerta, sensores);

        System.out.println(reg);
        
        //SobreCarga
        int antigInt = sens1.calcularantiguedad(2026);// usa calcularantiguedad(int)
        int antigString = sens1.calcularantiguedad("2026-03-09");// usa calcularantiguedad(String)
        
        System.out.println("\nSobrecarga:");
        System.out.println("calcularantiguedad(int)    = " + antigInt);
        System.out.println("calcularantiguedad(String) = " + antigString);

        //Sobreescritura
        Sensor Padre = sens1;
        Sensor Hijo  = sens2;

        int antigPadre = Padre.calcularantiguedad(2026);
        int antigHijo  = Hijo.calcularantiguedad(2026);

        System.out.println("\nSobrescritura:");
        System.out.println("Padre (Sensor)               = " + antigPadre);
        System.out.println("Hijo (Sensorelectroquimico)  = " + antigHijo);
        
        //Atributo estatico
        System.out.println("\nAtributo estatico:");
        Sensor.setMargendeerror(2.0);
        System.out.println("Margen de error 1: " + Sensor.getMargendeerror());

        Sensor.setMargendeerror(5.0);
        System.out.println("Margen de error 2: " + Sensor.getMargendeerror());
        System.out.println("");
        
        //arreglo
        Sensorfisiologico Ob1 = new Sensorfisiologico("234", 1.2, 99.0, 0.90, 2025, 2.0, prov, "Frecuencia Cardiaca", 220.0, "bpm", true, "Pecho"); 
        Sensorelectroquimico Ob2 = new Sensorelectroquimico("345", 1.6, 100.0, 0.80, 2024, 2.0, prov, 2.6, 0.88, true, "Sangre");
        Sensor Ob3 = new Sensorfisiologico("567", 2.0, 84.0, 0.88, 2025, 2.0, prov, "Frecuencia cardiaca", 221.0, "bpm", true, "Pecho");
     
        Sensor[] arreglo = new Sensor[5];
        
        arreglo[0] = Ob1;
        arreglo[2] = Ob2;
        arreglo[4]= Ob3;
        //sobreesctitura
        for(int i = 0; i < arreglo.length; i++) {
			if(arreglo[i] != null)
				System.out.println("Antiguedad: " + arreglo[i].calcularantiguedad(2026) + " años" );
			else
				System.out.println("nulo");
		}
        // metodo que recibe parametro
	    mostrarInformacionSensor(Ob1);
	    mostrarInformacionSensor(Ob2);
	    mostrarInformacionSensor(Ob3);
        // metodo que retorna supersuperclaes
	    Sensor sensorNuevo = crearSensor();
	    System.out.println("\nSensor retornado por el método:");
	    System.out.println(sensorNuevo);
	    
		// atributo que no se puede cambiar: declare el atributo como FINAL en la clase sensor
		// private final String codigoSensor
	
		// metodo que no se pueda sobreescribir: declare el metodo como FINAL en la clase sensor
		// public final void mostrarTipoSensor()
	
		// clase que no se pueda heredar: declare la clase como FINAL
		// public final class Medicamento
	    
	    System.out.println("\nOPERACIONES CRUD");
	    OperacionCRUD crud = new ImplementacionOperacionCRUD();//Se crea la implementacion del crud para manejar objetos de tipo sensor	
        Sensor objeto1 = new Sensorelectroquimico("981", 1.0, 90.0, 0.98, 2024, 2.0, prov, 2.6, 0.88, true, "Sangre");
        Sensorfisiologico objeto2 = new Sensorfisiologico("230", 1.2, 99.0, 0.90, 2025, 2.0, prov, "Frecuencia Cardiaca", 220.0, "bpm", true, "Pecho"); 
        //Se crean 2 objetos, como sensor es abstract se instancian como clases hijas
	    System.out.println("\nCREAR");
        System.out.println(crud.crear(objeto1));//se insertan los sensores usando el metodo crear del crud
        System.out.println(crud.crear(objeto2));

        System.out.println("\nLEER UNO");//Se busca un sensor por id
        Sensor encontrado = crud.leerUno("230");
        System.out.println(encontrado);

        System.out.println("\nLEER TODOS");//Se muestran todos los sensores registrados en el crud
        Sensor[] objetos = crud.leerTodos();
        for (Sensor s : objetos) {
            System.out.println(s);
        }

        System.out.println("\nMODIFICAR");//Se modifica el sensor
        Sensor sModificado = new Sensorfisiologico("267", 1.2, 99.0, 0.90, 2025, 2.0, prov, "Frecuencia Cardiaca", 220.0, "bpm", true, "Pecho"); 
        System.out.println(crud.modificar("230", sModificado));//en este caso con id 230

        System.out.println("\nELIMINAR");//se elimina el sensor con id
        Sensor eliminado = crud.eliminar("981");//en este caso, 981
        System.out.println(eliminado);

        System.out.println("\nLEER TODOS");//se muestran los sensores restantes despues de eliminar
               objetos = crud.leerTodos();
               for (Sensor s : objetos) {
                   System.out.println(s);
               }
    }
    
    public static void mostrarInformacionSensor(Sensor sensor) {//El metodo espera sensor pero tambien recibe a las subclases
        System.out.println("\nMostrando informacion del sensor:");
        System.out.println(sensor.toString());

    }

	 public static Sensor crearSensor() {//El metodo retorna sensor pero el objeto es de una subclase
	     Proveedor proveedor = new Proveedor("Proveedor ESA", "P-002", 20, "Sensores", true, true);
	     Sensor sensor = new Sensorelectroquimico("456", 2.0, 90, 0.98, 2023, 0.1, proveedor, 2.6, 0.88, true, "Sangre");
	     return sensor;
	 }
	 */
    	Scanner sc = new Scanner(System.in);
        ImplementacionOperacionCRUD servicio = new ImplementacionOperacionCRUD();
        int opcion = 0;

        do {
            System.out.println("\n====== MENU SENSORES ======");
            System.out.println("1. Crear sensor");
            System.out.println("2. Leer sensor por ID");
            System.out.println("3. Mostrar todos los sensores");
            System.out.println("4. Modificar sensor");
            System.out.println("5. Eliminar sensor");
            System.out.println("6. Serializar");
            System.out.println("7. Deserializar");
            System.out.println("8. Salir");
            System.out.print("Seleccione opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

            case 1:
                System.out.println("=== CREAR SENSOR ===");
                System.out.print("ID: ");
                String id = sc.nextLine();
                System.out.print("Version: ");
                double version = sc.nextDouble();
                System.out.print("Nivel de carga: ");
                double nivel = sc.nextDouble();
                System.out.print("Precision: ");
                double precision = sc.nextDouble();
                System.out.print("Anio de fabricacion: ");
                int anio = sc.nextInt();
                sc.nextLine();
                
                Proveedor proveedor = new Proveedor("Acme Space", "P-001", 12, "Sensores", true, true);
                Sensor sensor = new Sensorfisiologico(id, version, nivel, precision, anio, 0.1, proveedor, "ritmo cardiaco", 100, "ppm", true, "pecho");
                
                System.out.println(servicio.crear(sensor));
                break;

            case 2:
                System.out.println("=== LEER UNO ===");
                System.out.print("Ingrese ID del sensor: ");
                String idBuscar = sc.nextLine();
                Sensor encontrado = servicio.leerUno(idBuscar);
                
                if (encontrado != null) {
                    System.out.println(encontrado);
                } else {
                    System.out.println("Sensor no encontrado");
                }
                break;

            case 3:
                System.out.println("=== LEER TODOS ===");
                Sensor[] sensores = servicio.leerTodos();
                for (Sensor s : sensores) {
                    System.out.println(s);
                }
                break;
                
            case 4:
                System.out.println("=== MODIFICAR SENSOR ===");
                System.out.print("Ingrese ID del sensor a modificar: ");
                String idModificar = sc.nextLine();
                Sensor sensorExistente = servicio.leerUno(idModificar);
                
                if (sensorExistente == null) {
                    System.out.println("Sensor no encontrado");
                    break;
                }
                System.out.print("Nueva version: ");
                double versionM = sc.nextDouble();
                System.out.print("Nuevo nivel de carga: ");
                double nivelM = sc.nextDouble();
                System.out.print("Nueva precision: ");
                double precisionM = sc.nextDouble();
                System.out.print("Nuevo año de fabricacion: ");
                int anioM = sc.nextInt();
                sc.nextLine();
                
                Proveedor proveedorM = new Proveedor("Acme Space", "P-001", 12, "Sensores", true, true);
                Sensor sensorModificado = new Sensorfisiologico(idModificar, versionM, nivelM, precisionM, anioM, 0.1, proveedorM, "ritmo cardiaco", 100, "ppm", true, "pecho" );
                
                System.out.println(servicio.modificar(idModificar, sensorModificado));
                break;

            case 5:
                System.out.println("=== ELIMINAR SENSOR ===");
                System.out.print("Ingrese ID del sensor a eliminar: ");
                String idEliminar = sc.nextLine();
                Sensor eliminado = servicio.eliminar(idEliminar);
                if (eliminado != null) {
                    System.out.println("Sensor eliminado");
                } else {
                    System.out.println("Sensor no encontrado");
                }
                break;

            case 6:
                System.out.println("=== SERIALIZAR ===");
                String resultado = servicio.serializar(servicio.getSensores(), "", "sensores.bin");
                System.out.println(resultado);
                break;

            case 7:
                System.out.println("=== DESERIALIZAR ===");
                Sensor[] cargados = servicio.deserializar("", "sensores.bin");

                if (cargados != null) {
                    servicio.setSensores(cargados); // ← MUY IMPORTANTE
                    System.out.println("Sensores cargados correctamente");

                    for (Sensor s : servicio.leerTodos()) {
                        System.out.println(s);
                    }

                } else {
                    System.out.println("No se pudieron cargar los sensores");
                }
                break;

            case 8:
                System.out.println("Programa finalizado");
                break;

            default:
                System.out.println("Opcion invalida");
            }

        } while (opcion != 0);

        sc.close();
    }    	
}
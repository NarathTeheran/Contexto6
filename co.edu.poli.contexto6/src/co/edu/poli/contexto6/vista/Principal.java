package co.edu.poli.contexto6.vista;
import co.edu.poli.contexto6.model.*;

public class Principal {
    public static void main(String[] args) {

        Proveedor prov = new Proveedor("Acme Space", "P-001", 12, "Sensores", true, true);
        Astronauta a1 = new Astronauta("A-01", "Valentina", 1992, "Comandante", 68.0, 1.72);
        Signovital sv = new Signovital(88.0, true, 118.0, 36.8, 16.0, 97.0, a1);
        Medicamento med = new Medicamento("Ibuprofeno", "MED-001", 400, "8h");
        Medicamento[] meds = new Medicamento[]{med};
        Diagnostico dx = new Diagnostico("DX-01", "O+", sv, false, meds, false, true, "Sin novedades");
        Alertamedica alerta = new Alertamedica("AL-01", "Recordatorio", 2, "2026-03-09", "10:30", sv, a1);
        Sensor sens1 = new Sensor(1.0, 90.0, 0.98, 2024, 2.0, prov);
        Sensorelectroquimico sens2 = new Sensorelectroquimico(1.1, 85.0, 0.99, 2022, 2.0, prov, 2.5, 0.95, true, "Sangre");
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

    }
}
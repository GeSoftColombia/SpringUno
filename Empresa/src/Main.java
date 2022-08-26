import Empresa.Empleado;
import Empresa.Empresa;
import Empresa.MovimientoDinero;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        // Creando un Objeto o instancia Empresa
        Empresa empresa = new Empresa("809675439-0", "GeSoftCol", "Cartagena-Colombia", "6581521");
        System.out.println("El nombre de la empresa es: " + " " + empresa.getNombreEmpresa());
        System.out.println("El NIt de la empresa: " + " " + empresa.getNitEmpresa());
        System.out.println("El telefono de la empresa es: " + " " + empresa.getTelefonoEmpresa());
        System.out.println("La dirección de la empresa: " + " " + empresa.getDireccionEmpresa());
        System.out.println("------------------------------------");

        // Creando un Objeto o instancia Empleado
        Empleado empleado = new Empleado("11042984678", "Oscar", "nombre@gmail.com", "Base de datos");
        System.out.println("El nombre del empleado es: " + " " + empleado.getNombreEmpleado());
        System.out.println("El rol del empleado es: " + " " + empleado.getRolEmpleado());
        System.out.println("El rol del empleado es: " + " " + empleado.getDocumentoEmpleado());
        System.out.println("El correo del empleado es:" + " " +empleado.getCorreoEmpleado());
        System.out.println("------------------------------------");
       
        // Creando un Objeto o instancia fecha
        String fechaInicial = "2022-08-26";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaFormateada = sdf.parse(fechaInicial);

        // Creando un Objeto o instancia Movimiento
        MovimientoDinero mov1 = new MovimientoDinero(01, "Pago deudas", 12500, 0, fechaFormateada);

        System.out.println("El ID del movimiento es: " + " " + mov1.getIdMovimiento());
        System.out.println("El concepto del movimiento es: " + mov1.getConceptoMovimiento());
        System.out.println("El ingreso es: " + " " + mov1.getIngresos());
        System.out.println("El egreso es: " + mov1.getEgresos());
        System.out.println("La fecha del movimiento es: " + " " + mov1.formatoFecha());
        System.out.println("--------------------------------------");



    }
}
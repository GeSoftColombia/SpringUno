import Empresa.Empleado;

public class Main {
    public static void main(String[] args) {

        // Creando un Objeto
        Empleado empleado = new Empleado("11042984678", "Oscar", "nombre@gmail.com", "Base de datos");
        System.out.println(empleado.getCorreoEmpleado());
    }
}
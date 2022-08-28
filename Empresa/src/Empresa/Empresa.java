package Empresa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Empresa {

    // Atributos

    private String nitEmpresa;
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;

    //Creo una lista de empleados
    protected List<Empleado> empleados = new ArrayList<>();

    //Métodos Constructor

    public Empresa(String nitEmpresa, String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa) {
        super();
        this.nitEmpresa = nitEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }
    //Metodo constructor vacio
    public Empresa(String nitEmpresa) {
    }

    public Empresa (){
    }

    //Getters and Setters

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        nitEmpresa= JOptionPane.showInputDialog("Digite el NIT de la Empresa: ");
        this.nitEmpresa = nitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {

        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {

        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {

        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {

        this.telefonoEmpresa = telefonoEmpresa;
    }
    //Metodo agregar empleado
    public void agregarEmpleado(Empleado empleado){
        empleado.assign(this);
        empleados.add(empleado);
    }
    //Metodo remover empleado
    public void removerEmpleado(Empleado empleado1){
        empleados.remove(empleado1);
    }
}


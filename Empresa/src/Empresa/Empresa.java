package Empresa;

import javax.swing.*;

public class Empresa {

    // Atributos

    protected String nitEmpresa;
    protected String nombreEmpresa;
    protected String direccionEmpresa;
    protected String telefonoEmpresa;

    //Métodos Constructor

    public Empresa(String nitEmpresa, String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa) {
        this.nitEmpresa = nitEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }

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
}


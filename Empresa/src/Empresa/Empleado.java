package Empresa;

public class Empleado {

    //Atributos
    private String documentoEmpleado;
    private String nombreEmpleado;
    private String correoEmpleado;
    private String rolEmpleado;
    //Relaciono la empresa con el empleado
    private Empresa Emp;

    //Metodo constructor
    public Empleado(String documentoEmpleado, String nombreEmpleado, String correoEmpleado, String rolEmpleado) {
        super();
        this.documentoEmpleado = documentoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
    }
    //Metodo constructor vacio

    public Empleado() {
    }

    // Setter y getters
    public String getDocumentoEmpleado() {
        return documentoEmpleado;
    }

    public void setDocumentoEmpleado(String documentoEmpleado) {
        this.documentoEmpleado = documentoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
    //Asignar empresa al empleado
    public void assign(Empresa empresa){
        this.Emp = empresa;
    }

    }

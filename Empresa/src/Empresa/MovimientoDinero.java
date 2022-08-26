package Empresa;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MovimientoDinero {

    //Atributos
    private int idMovimiento;
    private String conceptoMovimiento;
    private int ingresos;
    private int egresos;
    private Date fecha;

    //Método constructor

    public MovimientoDinero(int idMovimiento, String conceptoMovimiento, int ingresos, int egresos, Date fecha) {
        this.idMovimiento = idMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.ingresos = ingresos;
        this.egresos = egresos;
        this.fecha = fecha;
    }

    //Métodos getters y setters


    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public int getEgresos() {
        return egresos;
    }

    public void setEgresos(int egresos) {
        this.egresos = egresos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    //Metodo Fecha
    public String formatoFecha(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada = sdf.format(fecha);
        return fechaFormateada;
    }
}

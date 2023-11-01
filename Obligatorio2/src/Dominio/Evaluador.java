package Dominio;

public class Evaluador extends Persona{
    int anoIngreso;
    
    public Evaluador(String nombre, long cedula, String direccion, int anoIngreso) {
        super(nombre,cedula,direccion);
        this.anoIngreso = anoIngreso;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }
 
    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }
}

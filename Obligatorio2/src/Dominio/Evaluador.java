package Dominio;

public class Evaluador {

    String nombre;
    int cedula;
    String direccion;
    int anoIngreso;
    
    public Evaluador(String nombre, int cedula, String direccion, int anoIngreso) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.anoIngreso = anoIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }
}

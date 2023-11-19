package dominio;

import java.io.Serializable;

public class Persona implements Serializable{

    String nombre;
    long cedula;
    String direccion;

    public Persona(String nombre, long cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}

package Dominio;

import java.util.*;

public class Postulante {

    String nombre;
    String cedula;
    String direccion;
    String telefono;
    String mail;
    String linkedin;
    String formato;
    HashMap temas;

    public Postulante(String nombre, String cedula, String direccion, String telefono, String mail, String linkedin, String formato) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mail = mail;
        this.linkedin = linkedin;
        this.formato = formato;
        this.temas = new HashMap();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String getFormato() {
        return formato;
    }

    public HashMap getTemas() {
        return temas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTemas(HashMap temas) {
        this.temas = temas;
    }

    public Postulante() {
        this.nombre = "CONSTRUCTOR SIN ARGUMENTOS";
    }

}

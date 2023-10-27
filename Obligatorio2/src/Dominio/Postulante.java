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

    public Postulante(String[] datos) {
        this.nombre = datos[0];
        this.cedula = datos[1];
        this.direccion = datos[2];
        this.telefono = datos[3];
        this.mail = datos[4];
        this.linkedin = datos[5];
        this.formato = datos[6];
        this.temas = new HashMap();
    }
    
}

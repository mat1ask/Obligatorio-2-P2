package dominio;

import java.util.*;

public class Postulante {

    String nombre;
    long cedula;
    String direccion;
    String telefono;
    String mail;
    String linkedin;
    String formato;
    HashMap<String, Integer> temas;
    int puntajeUltimaEntrevista;

    public Postulante(String nombre, long cedula, String direccion, String telefono, String mail, String linkedin, String formato) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mail = mail;
        this.linkedin = linkedin;
        this.formato = formato;
        this.temas = new HashMap<String, Integer>();
        puntajeUltimaEntrevista = -1;
    }

    public void agregarTema(String tema, int nivel) {
        temas.put(tema, nivel);
    }

    public void eliminarTema(String tema) {
        temas.remove(tema);
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

    public void setCedula(long cedula) {
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

    public void setPuntajeUltimaEntrevista(int pun) {
        this.puntajeUltimaEntrevista = pun;
    }

    public int getPuntajeUltimaEntrevista() {
        return this.puntajeUltimaEntrevista;
    }

    public Postulante() {
        this.nombre = "CONSTRUCTOR SIN ARGUMENTOS";
    }

    public String[] temasToArray() {
        String[] temas = new String[this.temas.size()];
        
        Iterator<Map.Entry<String, Integer>> iterador = this.temas.entrySet().iterator();
        int i = 0;
        while(iterador.hasNext()) {
            Map.Entry<String, Integer> tema = iterador.next();
            String key = tema.getKey();
            Integer nivel = tema.getValue();
            temas[i] = key + "(" + nivel +")";
            i++;
        }
        return temas;
    }

    @Override
    public String toString() {
        return this.nombre + "-" + this.cedula;
    }
}

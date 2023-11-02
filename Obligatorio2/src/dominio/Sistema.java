package Dominio;

import java.util.*;
import javax.swing.*;

public class Sistema {

    HashMap<String, Postulante> postulantes; //Usar hashmap o ArrayList postulante + ArrayList cedulaPostulante
    ArrayList tematicas;
    HashMap<String, Evaluador> evaluadores;
    ArrayList puestos;
    HashMap entrevistas;

    public Sistema() {
        this.postulantes = new HashMap<String, Postulante>();
        this.tematicas = new ArrayList<>();
        this.evaluadores = new HashMap<String, Evaluador>();
        this.puestos = new ArrayList<>();
        this.entrevistas = entrevistas;
    }

    public HashMap<String, Postulante> getPostulantes() {
        return postulantes;
    }

    public ArrayList getTematicas() {
        return tematicas;
    }

    public HashMap getEvaluadores() {
        return evaluadores;
    }

    public ArrayList getPuestos() {
        return puestos;
    }

    public HashMap getEntrevistas() {
        return entrevistas;
    }

    public boolean altaPostulante(Postulante postulante) {
        boolean ret = false;
        String cedula=String.valueOf(postulante.cedula);
        if (!postulantes.containsKey(cedula)) {
            this.postulantes.put(cedula, postulante);
            ret = true;
        }
        return ret;
    }

    public void bajaPostulante(String cedula) {
        this.postulantes.remove(cedula);
    }
    
    public void agregarTematica(Tematica tematica){
        this.tematicas.add(tematica);
    }
    public void limpiarCamposField( JTextField texto){
        texto.setText("");
    }
    public void limpiarCamposArea( JTextArea texto){
        texto.setText("");
    }
    
    public boolean esUnica (Evaluador evaluador){
        boolean ret = false;
        String cedula=String.valueOf(evaluador.cedula);
        if (!evaluadores.containsKey(cedula)) {
            this.evaluadores.put(cedula, evaluador);
            ret = true;
        }
        return ret;
    }
}

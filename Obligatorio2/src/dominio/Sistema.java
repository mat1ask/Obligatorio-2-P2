package Dominio;

import java.util.*;

public class Sistema {

    HashMap<String, Postulante> postulantes; //Usar hashmap o ArrayList postulante + ArrayList cedulaPostulante
    ArrayList tematicas;
    HashMap<String, Evaluador> evaluadores;
    ArrayList puestos;
    HashMap entrevistas;

    public Sistema() {
        this.postulantes = new HashMap<>();
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
        if (!postulantes.containsKey(postulante.cedula)) {
            this.postulantes.put(postulante.cedula, postulante);
            ret = true;
        }
        return ret;
    }

    public void bajaPostulante(Postulante postulante) {
        this.postulantes.remove(postulante.cedula);
    }
    
    public void agregarTematica(Tematica tematica){
        this.tematicas.add(tematica);
    }
}

package dominio;

import java.awt.Component;
import java.io.Serializable;
import java.util.*;
import javax.swing.*;

public class Sistema extends Observable implements Serializable  {

    private HashMap<String, Postulante> postulantes; //Usar hashmap o ArrayList postulante + ArrayList cedulaPostulante
    private ArrayList<Tematica> tematicas;
    private HashMap<String, Evaluador> evaluadores;
    private ArrayList<Puesto> puestos;
    private ArrayList<Entrevista> entrevista;
    private int proximaEntrevista;

    public Sistema() {
        this.postulantes = new HashMap<String, Postulante>();
        this.tematicas = new ArrayList<>();
        this.evaluadores = new HashMap<String, Evaluador>();
        this.puestos = new ArrayList<Puesto>();
        this.entrevista = new ArrayList<>();
    }
    
    public int getProximaEntrevista() {
        this.proximaEntrevista++;
        hayCambio();
        return this.proximaEntrevista;
    }

    public HashMap<String, Postulante> getPostulantes() {
        return postulantes;
    }

    public ArrayList getTematicas() {
        return tematicas;
    }
    
    public ArrayList<String> getListTemas() {
        ArrayList<String> ret = new ArrayList<>();
        for (Tematica tem : tematicas) {
            ret.add(tem.toString());
        }
        return ret;
    }

    public HashMap getEvaluadores() {
        return evaluadores;
    }

    public Evaluador getEvaluadorCedula(String cedula) {
        return evaluadores.get(cedula);
    }

    public Postulante getPostulanteCedula(String cedula) {
        return postulantes.get(cedula);
    }

    public ArrayList getPuestos() {
        return puestos;
    }

    public ArrayList<Entrevista> getEntrevista() {
        return entrevista;
    }
    
    public ArrayList<Entrevista> getEntrevistaPostulante(Postulante pos, String pal) {
        ArrayList<Entrevista> ret = new ArrayList<>();
        for(Entrevista ent : entrevista) {
            if (ent.postulante.equals(pos) && ent.comentarios.contains(pal)) {
                ret.add(ent);
            }
        }
        return ret;
    }
    
    public ArrayList<Entrevista> getEntrevistaPalabra(Postulante pos, String pal) {
        ArrayList<Entrevista> ret = new ArrayList<>();
        for(Entrevista ent : entrevista) {
            if (ent.postulante.equals(pos) && ent.comentarios.contains(pal)) {
                ret.add(ent);
            }
        }
        return ret;
    }
    
    public boolean cedulaUnica(String cedula) {
        return !postulantes.containsKey(cedula);
    }

    public boolean altaPostulante(Postulante postulante) {
        boolean ret = false;
        String cedula = String.valueOf(postulante.cedula);
        if (!postulantes.containsKey(cedula)) {
            this.postulantes.put(cedula, postulante);
            ret = true;
        }
        hayCambio();
        return ret;
    }

    public void bajaPostulante(String cedula) {
        this.postulantes.remove(cedula);
        ArrayList<Entrevista> lasEntrevistas = (ArrayList<Entrevista>)entrevista.clone();
        for (Entrevista ent : lasEntrevistas) {
            if(ent.postulante.cedula == Long.parseLong(cedula)) {
                entrevista.remove(ent);
            }
        }
        hayCambio();
    }

    public void agregarTematica(Tematica tematica) {
        this.tematicas.add(tematica);
        hayCambio();
    }

    public boolean altaEvaluador(Evaluador evaluador) {
        boolean ret = false;

        if (!evaluadores.containsKey(evaluador.cedula)) {
            this.evaluadores.put(evaluador.cedula + "", evaluador);
            ret = true;
        }
        hayCambio();
        return ret;
    }

    public static void limpiarCamposField(JTextField texto) {
        texto.setText("");
    }

    public static void limpiarCamposArea(JTextArea texto) {
        texto.setText("");
    }

    public boolean esUnica(Evaluador evaluador) {
        boolean ret = false;
        String cedula = String.valueOf(evaluador.cedula);
        if (!evaluadores.containsKey(cedula)) {
            this.evaluadores.put(cedula, evaluador);
            ret = true;
        }
        hayCambio();
        return ret;
    }

    //COMPRUEBA SI HAY ITEMS EN LA LISTA
    public boolean hay(String que) {
        boolean ret = true;

        switch (que) {
            case "tematicas" -> {
                if (this.tematicas.isEmpty()) {
                    ret = false;
                }
            }
            case "postulantes" -> {
                if (this.postulantes.isEmpty()) {
                    ret = false;
                }
            }
            case "evaluadores" -> {
                if (this.evaluadores.isEmpty()) {
                    ret = false;
                }
            }
            case "puestos" -> {
                if (this.puestos.isEmpty()) {
                    ret = false;
                }
            }
            case "entrevista" -> {
                if(this.entrevista.isEmpty()){
                    ret = false;
                }
            }
        }
        return ret;
    }

    public Puesto devolverPuestos(String nombre) {
        Puesto puestoRet = new Puesto();
        ArrayList<Puesto> lospuestos = getPuestos();
        for (Puesto elemento : lospuestos) {
            if (nombre.equals(elemento.toString())) {
                puestoRet = elemento;
            }
            break;
        }
        return puestoRet;
    }

    public void agregarEntrevista(Entrevista ent) {
        this.entrevista.add(ent);
        hayCambio();
    }

    public long numeroEntrevistaActual() {
        return this.entrevista.size()+1;
    }

    public void eliminarCheckBox(JPanel panel) {
        Component[] components = panel.getComponents();
        for (Component component : components) {
            if (component instanceof JCheckBox) {
                JCheckBox checkBox = (JCheckBox) component;
                checkBox.setSelected(false);
            }
        }
    }
    
    public void hayCambio(){
        setChanged();
        notifyObservers();
    }
}

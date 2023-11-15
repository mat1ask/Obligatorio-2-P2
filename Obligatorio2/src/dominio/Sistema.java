package dominio;

import java.awt.Component;
import java.util.*;
import javax.swing.*;

public class Sistema {

    HashMap<String, Postulante> postulantes; //Usar hashmap o ArrayList postulante + ArrayList cedulaPostulante
    ArrayList<Tematica> tematicas;
    HashMap<String, Evaluador> evaluadores;
    ArrayList<Puesto> puestos;
    ArrayList<Entrevista> entrevista;

    public Sistema() {
        this.postulantes = new HashMap<String, Postulante>();
        this.tematicas = new ArrayList<>();
        this.evaluadores = new HashMap<String, Evaluador>();
        this.puestos = new ArrayList<Puesto>();
        this.entrevista = new ArrayList<>();
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

    public Evaluador getEvaluadorCedula(String cedula) {
        return evaluadores.get(cedula);
    }

    public Postulante getPostulanteCedula(String cedula) {
        return postulantes.get(cedula);
    }

    public ArrayList getPuestos() {
        return puestos;
    }

    public ArrayList getEntrevista() {
        return entrevista;
    }

    public boolean altaPostulante(Postulante postulante) {
        boolean ret = false;
        String cedula = String.valueOf(postulante.cedula);
        if (!postulantes.containsKey(cedula)) {
            this.postulantes.put(cedula, postulante);
            ret = true;
        }
        return ret;
    }

    public void bajaPostulante(String cedula) {
        this.postulantes.remove(cedula);
        for (Entrevista ent : this.entrevista) { //Este for no lo probe, tiene que andar igual
            if(ent.postulante.cedula == Long.parseLong(cedula)) {
                entrevista.remove(ent);
            }
        }
    }

    public void agregarTematica(Tematica tematica) {
        this.tematicas.add(tematica);
    }

    public boolean altaEvaluador(Evaluador evaluador) {
        boolean ret = false;

        if (!evaluadores.containsKey(evaluador.cedula)) {
            this.evaluadores.put(evaluador.cedula + "", evaluador);
            ret = true;
        }

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
}

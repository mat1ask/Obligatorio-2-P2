package dominio;

public class Entrevista {
    
Evaluador evaluador;
Postulante postulante;
int puntaje;
String comentarios;

public Entrevista (Evaluador evaluadores, Postulante postulante, int puntaje, String comentarios){
        this.evaluador = evaluadores;
        this.postulante = postulante;
        this.puntaje = puntaje;
        this.comentarios = comentarios;
    }
    public Evaluador getEvaluadores() {
        return evaluador;
    }

    public void setEvaluadores(Evaluador evaluadores) {
        this.evaluador = evaluadores;
    }
    
        public Postulante getPostulante() {
        return postulante;
    }

    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }
    
    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public String getComentarios(){
        return comentarios;
    }

    public void setPuntaje(String comentarios) {
        this.comentarios = comentarios;
    }
    
}
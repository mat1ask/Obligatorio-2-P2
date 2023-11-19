package dominio;

import java.io.Serializable;

public class Puesto implements Serializable{

    String nombre;
    String formato;
    String[] temas;
    
    public Puesto (String nombre, String formato, String[] temas){
        this.nombre = nombre;
        this.formato = formato;
        this.temas = temas;
    }
        public Puesto (){
    }
    
    
    public String getNombres(){
        return nombre;
    }
    
    public String getformato(){
        return formato;
    }
    
    public String[] getTemas(){
        return temas;
    }
    
    public void setNombres(String nombre){
        this.nombre=nombre;
    }
    
    public void setTemas(String[] temas){
        this.temas=temas;
    }
    
    public void setformato(String formato){
        this.formato=formato;
    }
    
    @Override 
    public String toString(){
        return this.getNombres();
    }
}

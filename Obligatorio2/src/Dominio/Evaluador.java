package dominio;

import java.io.Serializable;

public class Evaluador extends Persona implements Serializable {

    int anoIngreso;

    public Evaluador(String nombre, long cedula, String direccion, int anoIngreso) {
        super(nombre, cedula, direccion);
        this.anoIngreso = anoIngreso;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }

    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }

    @Override
    public String toString() {
        return this.nombre + "-" + this.cedula;
    }
}

package dominio;

public class ComprobarFormato {

    // Util para comprobar cedula y telefono. para telefono agregar el .length() == 9 para celulares si hace falta
    public static boolean soloNumeros(String cedula) {
        boolean ret = false;
        try {
            Double.parseDouble(cedula);
            ret = true;
        } catch (NumberFormatException e) {
            ret = false;
        }

        return ret;
    }
}

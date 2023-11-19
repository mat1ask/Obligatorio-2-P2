package dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComprobarFormato {

    // Util para comprobar cedula y telefono. para telefono agregar el .length() == 9 para celulares si hace falta
    public static boolean soloNumeros(String cedula) {
        String formato = "\\d+";

        return cedula.matches(formato);
    }
}

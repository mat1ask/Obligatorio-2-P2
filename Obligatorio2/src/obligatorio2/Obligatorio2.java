package obligatorio2;

import dominio.Sistema;
import interfaz.VentanaMenu;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class Obligatorio2 {

    public static void main(String[] args) throws ClassNotFoundException{
        boolean empezo = false;
        int siNo;
        while (!empezo) {
            siNo = JOptionPane.showConfirmDialog(null,"Quiere Utilizar datos previos?", "Persistencia", JOptionPane.YES_NO_OPTION);
            if(siNo == JOptionPane.YES_OPTION) {
                try {
                    ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("Archivo.datos")));
                    Sistema sistema = (Sistema) in.readObject();
                    in.close();
                    empezo = true;
                    VentanaMenu vent = new VentanaMenu(sistema);
                    vent.setVisible(true);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "No se encontro el archivo");
                }
            } else if(siNo == JOptionPane.NO_OPTION) {
                empezo = true;
                Sistema sis = new Sistema();
                VentanaMenu vent = new VentanaMenu(sis);
                vent.setVisible(true);
            }
        }
        
    }
}

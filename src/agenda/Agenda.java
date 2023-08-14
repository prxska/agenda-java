 
package agenda;

import agenda.igu.Principal;
import javax.swing.JFrame;
 
public class Agenda {

    public static void main(String[] args) {

        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
        
        princ.setTitle("Agenda 6.5"); 
        princ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // ... Agregar componentes y configuración adicional ...

    }

}

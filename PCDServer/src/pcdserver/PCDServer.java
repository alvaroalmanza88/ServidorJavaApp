/*
 * CODIGO REALIZADO POR ALVARO ALMANZA.
 * UNIVERSIDAD INTERNACIONAL I DE CASTILLA
 */
package pcdserver;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/**
 *
 * @author alvar
 */
public class PCDServer {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) 
    {
        final principal vent= new principal();
        vent.setVisible(true);
        vent.setLocationRelativeTo(null);
        vent.setResizable(false);
        
    class cerrado extends WindowAdapter 
    {
        // evento que actua al cerrar el frame y destruir el applet
        @Override
        public void windowClosing(WindowEvent ea)
        {
            try{
   			vent.cliente.close();
   			vent.yo.close(); 
                        vent.entrada.close();
   		} catch (IOException e){
   			System.out.println(e.getMessage());
   		} 
        }      
    }
       
    }
    
}

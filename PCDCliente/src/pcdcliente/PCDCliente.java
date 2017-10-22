/*
 * CODIGO REALIZADO POR ALVARO ALMANZA.
 * UNIVERSIDAD INTERNACIONAL I DE CASTILLA
 */
package pcdcliente;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/**
 *
 * @author alvar
 */
public class PCDCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        final gui vent= new gui();
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
                        vent.delServidor.close();
   			vent.alServidor.close();
   			vent.yo.close(); 
   		} catch (IOException e){
   			System.out.println(e.getMessage());
   		} 
        }      
    }
    }
    
}

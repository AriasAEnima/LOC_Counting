package edu.escuelaing.arsw.intro;
import edu.escuelaing.arsw.intro.linecounter.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author J. Eduardo Arias
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {            
            FileReader FR=new FileReader(args[0]);
            FR.read(args[1]);
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

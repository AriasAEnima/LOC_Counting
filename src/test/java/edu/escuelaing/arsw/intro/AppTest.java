package edu.escuelaing.arsw.intro;
import edu.escuelaing.arsw.intro.linecounter.FileReader;
import junit.framework.TestCase;

/**
 *
 * @author J. Eduardo Arias
 */
public class AppTest 
    extends TestCase
{

    public void testPrimerArchivoPhy()
    {
        try {
            FileReader FR = new FileReader("phy");
            FR.read("resources/prueba.java");
            int resultado=FR.getLineCounter().getLines();
            assertEquals(resultado,32);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Algo Fallo ! ");              
        }
       
    }
    
    public void testPrimerArchivoLoc()
    {
        try {
            FileReader FR = new FileReader("loc");
            FR.read("resources/prueba.java");
            int resultado=FR.getLineCounter().getLines();
            assertEquals(12,resultado);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Algo Fallo ! ");              
        }
       
    }
    
    public void testSegundoArchivoPhy()
    {
        try {
            FileReader FR = new FileReader("phy");            
            FR.read("resources/prueba2.java");
            int resultado=FR.getLineCounter().getLines();
            assertEquals(96,resultado);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Algo Fallo ! ");              
        }
       
    }
    
     public void testSegundoArchivoLoc()
    {
        try {
            FileReader FR = new FileReader("loc");
            FR.read("resources/prueba2.java");
            int resultado=FR.getLineCounter().getLines();
            assertEquals(resultado,56);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Algo Fallo ! ");              
        }
       
    }
    
}

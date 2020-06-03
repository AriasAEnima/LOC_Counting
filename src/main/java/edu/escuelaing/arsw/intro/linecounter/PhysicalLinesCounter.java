/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.intro.linecounter;
import java.io.BufferedReader;
/**
 *
 * @author J. Eduardo Arias
 */
public class PhysicalLinesCounter implements LineCounter{
    //Constants 
    private final String info="Physical lines: ";
    //Not Constants
    private int lines;
          
    /**
     * Aumenta simplemente el contador
     * por cada linea que llegue
     * @param line la linea a contar (o no ) 
     */
    @Override
    public void count(String line) {
       lines++;
    }

    @Override
    public int getLines() {
        return lines;
    }
    
     /**
     * Devuelve un mensaje
     * Physical lines: #lines
     * @return 
     */
    @Override
    public String getInfo() {
        return info+lines;        
    }
}

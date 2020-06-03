/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.intro.linecounter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author J. Eduardo Arias
 */
public class LOCLineCounter implements LineCounter{
    //Constants
    private final String info="Code lines: ";
    private final ArrayList<String> wildcards = new ArrayList<String>(Arrays.asList("//","/*"," *","* "," /"));
    //Not Constants
    private int lines; //contador de lineas
    
    /**
     * Iterando de a parejas de caracteres en una linea
     * incrementa el contador si es de codigo.
     * @param line la linea a contar (o no )
     */
    @Override
    public void count(String line) {
        boolean isCodeOrComment=false;  // Rompe el ciclo si encontramos que tipo de linea es.
        int i=1; //Empezamos en 1 para mirar en duplas y no repetir
        while (!isCodeOrComment && i<line.length() && line.length()>0 ){ 
            // Mientras no se sepa que tipo de linea es o resulte ser una en blanco.
            String duple=line.substring(i-1,i+1);             
            if(wildcards.contains(duple)){ // Si es una de comentario
                isCodeOrComment=true;
            }else if(!duple.equals("  ")){ // Si no es comentario, ni en blanco, entonces es Codigo        
                //System.out.println(line);
                isCodeOrComment=true;
                lines++;   // Aumentamos el contador
            }   
            i++;
        }     
    }
    /**
     * Devuelve un mensaje
     * Code lines: #lines
     * @return 
     */
    @Override
    public String getInfo() {
        return info+lines;  
    }  

    @Override
    public int getLines() {
        return lines;
    }    
    
}

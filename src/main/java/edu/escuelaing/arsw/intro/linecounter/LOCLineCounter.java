/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.intro.linecounter;

/**
 *
 * @author J. Eduardo Arias
 */
public class LOCLineCounter implements LineCounter{
    //Constants
    private final String info="Code lines: ";
    private final String wildcards="/*";
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
        int i=0; 
        while (!isCodeOrComment && i<line.length()){ 
            // Mientras no se sepa que tipo de linea es o resulte ser una en blanco. 
            if(wildcards.contains(line.charAt(i)+"")){ // Si es una de comentario
                isCodeOrComment=true;               
            }else if(!(line.charAt(i)+"").equals(" ")){ // Si tampco es blanco , sera codigo
                lines++;
                isCodeOrComment=true;                    
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

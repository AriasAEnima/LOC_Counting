/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.intro.linecounter;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author J. Eduardo Arias
 */
public class FileReader {   
    private LineCounter lineCounter;
    
    /**
     * Contructor a base de opciones en String     * 
     * @throws Exception si no encuentra opcion valida.
     */
    public FileReader(String option) throws Exception {        
        chooseLineCounter(option);       
    }   
    /**
     * Contructor dando un LineCounter especifico     *
     */
     public FileReader(LineCounter lineCounter) {           
        setLineCounter(lineCounter);       
    }   
    
    
    public LineCounter getLineCounter() {
        return lineCounter;
    }

    public void setLineCounter(LineCounter lineCounter) {
        this.lineCounter = lineCounter;
    }   
    /**
     * A partir de un string asigna un LineCounter 
     * phy  : physical
     * loc  : lines of code
     * @param option
     * @throws Exception si no encuentra una opcion valida.
     */
    public void chooseLineCounter(String option) throws Exception {
        switch(option){
            case "phy":
                lineCounter=new PhysicalLinesCounter();                    
                break;
            case "loc":
                lineCounter=new LOCLineCounter();                   
                break;
            default:
                throw new Exception("Opcion Invalida");              
        }           
    }    
 
    /**
     * A partir de un lector configurado y un parametro path (string) 
     * de un archivo: lee el archivo y calcula la cantidad de lineas.
     * @param path 
     * @throws Exception si no es posible leer el archivo.
     */
    public void read(String path) throws Exception{
        Path file = Paths.get(path);  
        Charset charset = Charset.forName("UTF-8");                                 
        try {
            BufferedReader BR = Files.newBufferedReader(file, charset);
            String linea= BR.readLine();
            while (linea != null) { 
                //System.out.println(linea);
                lineCounter.count(linea);
                linea= BR.readLine();
            }  
            System.out.println(lineCounter.getInfo());          
        } catch (IOException ex) {
            throw new Exception("Error leyendo el archivo, revise la ruta"); 
        }
                      
         
    }    
    /**
     * A partir de un lector configurado y un parametro 
     * array de paths de archivos: lee y calcula la cantidad
     * de lineas de cada uno
     * @param paths
     * @throws Exception si no es posible leer alguno de los archivos
     */
    public void read(String[] paths) throws Exception{
        for( String s: paths){
            read(s);
        }
    }
}

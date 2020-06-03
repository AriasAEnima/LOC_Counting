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
public interface LineCounter {
    /**
     * Para ingresar y contar (o no) una linea
     * @param line la linea a contar (o no )    
     */
    public void count(String line);
    
    /**
     * Resultado del conteo
     * @return 
     */
    public int getLines();
     /**
     * Devuelve un mensaje especificando el tipo de conteo y su resultado     * 
     */
    public String getInfo();       
}

package com.escuelaing.arsw.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase lee un archivo dado su url
 * @author Johann Cepeda
 */
public class Reader {
    
    /**
     * Lee el archivo y retorna el BufferedReader correspondiente
     * @param url dirección del archivo
     * @return  BufferedReader del archivo
     */
    public BufferedReader read(String url){
        BufferedReader br = null;
        try {
            File file = new File (url);
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return br;
    }
    /**
     * Usando el BufferedReader de un archivo pasa sus datos a una lista de Doubles
     * @param br BufferedReader del archivo
     * @return Lista de Doubles del archivo
     */
    public List<Double> readinList(BufferedReader br){
        try {
            String line;
            List<Double> lis = new LinkedList<>();
            while((line=br.readLine())!=null){
                line=line.trim();
                Double x = Double.parseDouble(line);
                lis.add(x);
                
            }
            return lis;
        } catch (IOException ex){
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
}

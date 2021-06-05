package com.escuelaing.arsw;

import com.escuelaing.arsw.Calculator;
import com.escuelaing.arsw.model.Reader;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


/**
 * Unit test for simple App.
 */
public class AppTest {
    
    private final Calculator cal = new Calculator();
    private final Reader rea = new Reader();
    private final String file1 = "prueba.txt";
    private final String file2 = "prueba1.txt";
    

    @Test
    public void AppFile1(){
        try{
            String[] args = {file1};
            Calculator.main(args);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
    @Test
    public void AppFile2(){
        try{
            String[] args = {file2};
            Calculator.main(args);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }    
}
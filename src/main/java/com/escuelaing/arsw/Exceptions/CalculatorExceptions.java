package com.escuelaing.arsw.Exceptions;

public class CalculatorExceptions extends Exception{

    public static final String INVALID_ARGUMENTS = "Argumentos invalidos";

    public CalculatorExceptions(String msg){
        super(msg);
    }
}

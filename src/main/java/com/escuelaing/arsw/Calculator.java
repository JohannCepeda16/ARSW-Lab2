package com.escuelaing.arsw;

import java.util.List;

import com.escuelaing.arsw.Exceptions.CalculatorExceptions;
import com.escuelaing.arsw.model.Reader;

/**
 * Clase principal que permite realizar operaciones
 * @author Johann Cepeda
 */
public class Calculator {
    interface Operations {
        Double operation(List<Double> lis);
    }
    public Double operate(List<Double> lis, Operations op) {
        return op.operation(lis);
    }
  
    public static void main(String[] args) throws CalculatorExceptions{
        if(args.length!=1){
            throw new CalculatorExceptions(CalculatorExceptions.INVALID_ARGUMENTS);
        }else{
            Reader reader = new Reader();
            Calculator cal = new Calculator();
            List list = reader.readinList(reader.read(args[0]));
            
            /**
            * Calcula la media dada una lista de Doubles
            * @param lis lista de Doubles
            * @return el valor de la media como tipo Double
            */
            Operations mean = (lis) -> 
            {
                Double sum=0.0;
                for (int i=0;i<lis.size();i++){
                    sum += lis.get(i);
                }
                sum=sum/lis.size();
                return sum;
            };
            
            /**
            * Calcula la desviación estandar de la lista dada
            * @param lis lista de Doubles
            * @return el valor de la desviación estandar como tipo Double
            */
            Operations standarDes = (List<Double> lis) ->
            {
                Double sum=0.0;
                Double avr=cal.operate(list,mean);
                for (int i=0;i<lis.size();i++) {
                    sum += Math.pow(lis.get(i)-avr,2);
                }
                sum=Math.sqrt(sum/(lis.size()-1));
                return sum;
            };
            
            System.out.println("Mean = "+(cal.operate(list,mean)));
            System.out.println("Standard Desviation = "+(cal.operate(list, standarDes)));
        }
    }
}

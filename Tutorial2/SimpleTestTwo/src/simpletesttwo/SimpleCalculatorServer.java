/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesttwo;

import java.util.Arrays;

/**
 *
 * @author andre
 */
public class SimpleCalculatorServer {
    
    public boolean isServerConnected() 
    {
        System.out.println("[SERVER] - Conection is being tested.....");
        return true;
    }
    
    public int addIntegerNumbers(int a, int b)
    {
        System.out.println("[SERVER] - Adding " + a + " and " + b);
        return a+b;
    }
    
    public int divideIntegerNumbers(int a, int b) throws Exception
    {
        if(b == 0)
            throw new Exception( "[SERVER] - Variable 2 Cannot be zero");
        
        if ((b == 0) && (a == 0))
            throw new Exception( "[SERVER] - Both variables cannot be zero");
       
        System.out.println("[SERVER] - Dividing " + a + " and " + b + "....");
        return a/b;
        //This is integer division. This can be solved by double.
    }
    
    public int substractIntegerNumbers(int a, int b)
    {
        System.out.println("[SERVER] - Substracting " + a + " and " + b + "....");
        return a-b;
    }
    
    public int multiplyIntegerNumbers(int a, int b)
    {
        System.out.println("[SERVER] - Multiplying " + a + " and " + b + "....");
        return a*b;
    }
    //Array Calculations
    public int[] addIntegerArrays(int[] a, int[] b) throws Exception
    {
        //Checking the array sizes are the same
        if((a.length) != (b.length)) {
            throw new Exception("[SERVER] - Both array sizes has to be same !!!");
        }
        System.out.println("[SERVER] - Adding array " + Arrays.toString(a) + " and array " + Arrays.toString(b));
        int[] c = new int[a.length];
        for(int i=0; i<a.length; i++){
            c[i] = a[i] + b[i];
        }
        return c;
    }
    
    public int[] substractIntegerArrays(int[] a, int[] b) throws Exception
    {
        //Checking the array sizes are the same
        if((a.length) != (b.length)) {
            throw new Exception("[SERVER] - Both array sizes has to be same !!!");
        }
        System.out.println("[SERVER] - Substracting array " + Arrays.toString(a) + " and array " + Arrays.toString(b));
        int[] c = new int[a.length];
        for(int i=0; i<a.length; i++){
            c[i] = a[i] - b[i];
        }
        return c;
    }
    
    public int[] multiplyIntegerArrays(int[] a, int[] b) throws Exception
    {
        //Checking the array sizes are the same
        if((a.length) != (b.length)) {
            throw new Exception("[SERVER] - Both array sizes has to be same !!!");
        }
        System.out.println("[SERVER] - Multiplication of array " + Arrays.toString(a) + " and array " + Arrays.toString(b));
        int[] c = new int[a.length];
        for(int i=0; i<a.length; i++){
            c[i] = a[i] * b[i];
        }
        return c;
    }
    
    public int[] divideIntegerArrays(int[] a, int[] b) throws Exception
    {
        //Checking the array sizes are the same
        if((a.length) != (b.length)) {
            throw new Exception("[SERVER] - Both array sizes has to be same !!!");
        }
        System.out.println("[SERVER] - Division of array " + Arrays.toString(a) + " and array " + Arrays.toString(b));
        int[] c = new int[a.length];
        for(int i=0; i<a.length; i++){
            //Checking the 0 valued integers in the array
            if(b[i] == 0)
            throw new Exception( "[SERVER] - Array 2 index number " + i + " Cannot be zero");
        
            if ((b[i] == 0) && (a[i] == 0))
            throw new Exception( "[SERVER] - Array 1 and Array 2 index number " + i + " cannot be zero");
            c[i] = a[i] / b[i];
        }
        return c;
    }
   
}

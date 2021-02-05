/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesttwo;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class SimpleClient {
    SimpleCalculatorServer server = new SimpleCalculatorServer();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleClient simpleClient = new SimpleClient();
        simpleClient.executeTest();
    }
    
    private void executeTest()
    {
        System.out.println("[CLIENT] - Testing if the server is connected....");
        if(server.isServerConnected() == true) 
        {
            System.out.println("[CLIENT] - The Client is connected, the test can proceed....");
 
            //adding two numbers
            int x = 2;
            int y = 3;
            System.out.println("[CLIENT] - Asking the server what is the sum of " + x + " and " + y);
            int z = server.addIntegerNumbers(x, y);
            System.out.println("[CLIENT] - The server has replied the sum of " + x + " and " + y + " is " + z);
            if(z == (x+y)) 
            {
                System.out.println("[CLIENT] - The server has returned the correct answer");
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
            
            //dividing two numbers
            x = 4;
            y = 3;
            System.out.println("[CLIENT] - Asking the server what is the ratio of " + x + " and " + y);
            try {
                z = server.divideIntegerNumbers(x,y);
                System.out.println("[CLIENT] - The server has replied that the ratio of " + x + " and " + y + " is " + z);
                if(z == (x/y))
                {
                    System.out.println("[CLIENT] - The server has returned the correct answer");
                }
                else
                {
                    System.out.println("[CLIENT] - The server has returned the WRONG answer");
                }
            } catch (Exception ex) {
                System.out.println("[CLIENT] - Exception caught !!!");
                //Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE,null, ex);
                System.out.println("[CLIENT] - Cannot divide by zero " + ex.getMessage());
            }
            
            //substracting numbers
            x = 5;
            y = 2;
            System.out.println("[CLIENT] - Asking the server what is the substraction of " + x + " and " + y);
            z = server.substractIntegerNumbers(x, y);
            System.out.println("[CLIENT] - The server has replied the substraction of " + x + " and " + y + " is " + z);
            if(z == (x-y)) 
            {
                System.out.println("[CLIENT] - The server has returned the correct answer");
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
            
            //Multiplying numbers
            x = 3;
            y = 4;
            System.out.println("[CLIENT] - Asking the server what is the multiplication of " + x + " and " + y);
            z = server.multiplyIntegerNumbers(x,y);
            System.out.println("[CLIENT] - The server has replied the multiplication of " + x + " and " + y + " is " + z);
            if(z == (x*y)) 
            {
                System.out.println("[CLIENT] - The server has returned the correct answer");
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
            //Adding two arrays
            int[] a = {1,2,3};
            int[] b = {4,5,6};
            System.out.println("[CLIENT] - Asking the server what is the addition of the elements in " + Arrays.toString(a) + " and " + Arrays.toString(b) + " two arrays...");
            try
            {
            int[] c = server.addIntegerArrays(a, b);
            System.out.println("[CLIENT] - The server has replied that the addition of " + Arrays.toString(a) + " and " + Arrays.toString(b) + " is " + Arrays.toString(c));
            }
            catch (Exception ex) 
            {
                System.out.println("[CLIENT] - Exception caught !!!");
                System.out.println(ex.getMessage());
            }
            //Substracting two arrays
            int[] e = {1,2,3};
            int[] f = {4,5,6};
            System.out.println("[CLIENT] - Asking the server what is the substraction of the elements in " + Arrays.toString(e) + " and " + Arrays.toString(f) + " two arrays...");
            try
            {
            int[] c = server.substractIntegerArrays(e, f);
            System.out.println("[CLIENT] - The server has replied that the substraction of " + Arrays.toString(e) + " and " + Arrays.toString(f) + " is " + Arrays.toString(c));
            }
            catch (Exception ex) 
            {
                System.out.println("[CLIENT] - Exception caught !!!");
                System.out.println(ex.getMessage());
            }
            //Multiply two arrays
            int[] g = {1,2,3};
            int[] h = {4,5,6};
            System.out.println("[CLIENT] - Asking the server what is the multiplication of the elements in " + Arrays.toString(g) + " and " + Arrays.toString(h) + " two arrays...");
            try
            {
            int[] c = server.multiplyIntegerArrays(g, h);
            System.out.println("[CLIENT] - The server has replied that the multiplication of " + Arrays.toString(g) + " and " + Arrays.toString(h) + " is " + Arrays.toString(c));
            }
            catch (Exception ex) 
            {
                System.out.println("[CLIENT] - Exception caught !!!");
                System.out.println(ex.getMessage());
            }
            //Dividing two arrays
            int[] k = {4,8,25};
            int[] n = {4,2,0};
            System.out.println("[CLIENT] - Asking the server what is the division of the elements in " + Arrays.toString(k) + " and " + Arrays.toString(n) + " two arrays...");
            try
            {
            int[] c = server.divideIntegerArrays(k, n);
            System.out.println("[CLIENT] - The server has replied that the division of " + Arrays.toString(k) + " and " + Arrays.toString(n) + " is " + Arrays.toString(c));
            }
            catch (Exception ex) 
            {
                System.out.println("[CLIENT] - Exception caught !!!");
                System.out.println(ex.getMessage());
            }
        }
        else 
        {
            System.out.println("[CLIENT] - The client is NOT connected, the test has failed...");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict2client;

import java.util.logging.Level;
import java.util.logging.Logger;
import server.BooleanContainer;
import server.Exception_Exception;

/**
 *
 * @author andre
 */
public class ICT2Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICT2Client client = new ICT2Client();
        client.execute();
    }
    
    private void execute(){
        System.out.println("[CLIENT] - Testing is the server is connected...");
        if(isConnected() == 0.0)
        {
            System.out.println("[CLIENT] - Server is connected, the test can proceed...");
            //booleanAnd -------------------------------------------------------------------------------------------------------
            Boolean a = true;
            Boolean b = false;
            Boolean c = booleanAnd(a,b);
            System.out.println("[CLIENT] - Server has returned the AND of [" + a + "] and [" + b + "]  is [" + c + "]");
            a = true;
            b = true;
            c = booleanAnd(a,b);
            System.out.println("[CLIENT] - Server has returned the AND of [" + a + "] and [" + b + "]  is [" + c + "]");
            a = false;
            b = false;
            c = booleanAnd(a,b);
            System.out.println("[CLIENT] - Server has returned the AND of [" + a + "] and [" + b + "]  is [" + c + "]");
            a = false;
            b = true;
            c = booleanAnd(a,b);
            System.out.println("[CLIENT] - Server has returned the AND of [" + a + "] and [" + b + "]  is [" + c + "]");
            //SafeBooleanAnd ----------------------------------------------------------------------------------------------------
            Boolean k = true;
            Boolean j = null;
            try {
                Boolean h = safeBooleanAnd(k,j);
                System.out.println("[CLIENT] - Server has returned the Safe AND of [" + k + "] and [" + j + "]  is [" + h + "]");
            } catch (Exception_Exception ex) {
                //Logger.getLogger(ICT2Client.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("[CLIENT] - Error " + ex);
            }
            k = null;
            j = null;
            try {
                Boolean h = safeBooleanAnd(k,j);
                System.out.println("[CLIENT] - Server has returned the Safe AND of [" + k + "] and [" + j + "]  is [" + h + "]");
            } catch (Exception_Exception ex) {
                //Logger.getLogger(ICT2Client.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("[CLIENT] - Error " + ex);
            }
            k = null;
            j = true;
            try {
                Boolean h = safeBooleanAnd(k,j);
                System.out.println("[CLIENT] - Server has returned the Safe AND of [" + k + "] and [" + j + "]  is [" + h + "]");
            } catch (Exception_Exception ex) {
                //Logger.getLogger(ICT2Client.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("[CLIENT] - Error " + ex);
            }
            BooleanContainer test = new BooleanContainer();
            test.setValue(null);
            try {
                addBooleanOnServer(test);
                System.out.println("[SERVER] - total number of [true] values in the server " + getNumberOfTrueValues());
            } catch (Exception_Exception ex) {
                //Logger.getLogger(ICT2Client.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("[CLIENT] - Error " + ex);
            }   
        }
        else
        {
            System.out.println("[SERVER] - The server is NOT connected, the test has failed...");
        }
    }

    private static Double isConnected() {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.isConnected();
    }

    private static Boolean booleanAnd(java.lang.Boolean a, java.lang.Boolean b) {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.booleanAnd(a, b);
    }

    private static Boolean safeBooleanAnd(java.lang.Boolean a, java.lang.Boolean b) throws Exception_Exception {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.safeBooleanAnd(a, b);
    }

    private static Boolean addBooleanOnServer(server.BooleanContainer b) throws Exception_Exception {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.addBooleanOnServer(b);
    }

    private static Integer getNumberOfTrueValues() throws Exception_Exception {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.getNumberOfTrueValues();
    }

    

    
    
}

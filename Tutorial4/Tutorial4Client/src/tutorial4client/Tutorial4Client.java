/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial4client;

import java.util.logging.Level;
import java.util.logging.Logger;
import server.Exception_Exception;

/**
 *
 * @author andre
 */
public class Tutorial4Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tutorial4Client client = new Tutorial4Client();
        client.execute();
    }
    
    private void execute()
    {
        System.out.println("[CLIENT] - Testing if the server is connected....");
        if(isConnected()== true)
        {
            System.out.println("[CLIENT] - The Server is connected, the test can proceed....");
            Double x = 2.0;
            Double y = 3.1;
            try {
                Double z = addWithExceptions(x, y);
                System.out.println("[CLIENT] - The Server has returned: " + z + " = " + x + " + " + y);
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - Error " + ex);
                //Logger.getLogger(Tutorial4Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            x = null;
            y = 3.1;
            try {
                Double z = addWithExceptions(x, y);
                System.out.println("[CLIENT] - The Server has returned: " + z + " = " + x + " + " + y);
            } catch (Exception_Exception ex) {
                //Logger.getLogger(Tutorial4Client.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("[CLIENT] - Error " + ex);
            }
            x = 2.0;
            y = null;
            try {
                Double z = addWithExceptions(x, y);
                System.out.println("[CLIENT] - The Server has returned: " + z + " = " + x + " + " + y);
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - Error " + ex);
                //Logger.getLogger(Tutorial4Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            x = null;
            y = null;
            try {
                Double z = addWithExceptions(x, y);
                System.out.println("[CLIENT] - The Server has returned: " + z + " = " + x + " + " + y);
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - Error " + ex);
                //Logger.getLogger(Tutorial4Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            x = 1.0;
            y = null;
            try {
                Double z = substractWithException(x,y);
                System.out.println("[CLIENT] - The Server has returned: " + z + " = " + x + " - " + y);
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - Error " + ex);
                //Logger.getLogger(Tutorial4Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       else
        {
             System.out.println("[CLIENT] - The Server is NOT connected, the test has failed...");
        }
        System.out.println("[CLIENT] - Test Completed !");
    }

    private static Boolean isConnected() {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.isConnected();
    }

    private static String hello(java.lang.String name) {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.hello(name);
    }

    private static Double addWithExceptions(java.lang.Double a, java.lang.Double b) throws Exception_Exception {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.addWithExceptions(a, b);
    }

    private static Double substractWithException(java.lang.Double a, java.lang.Double b) throws Exception_Exception {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.substractWithException(a, b);
    }
   
}

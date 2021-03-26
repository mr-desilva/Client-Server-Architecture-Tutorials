/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial8client;

import java.util.logging.Level;
import java.util.logging.Logger;
import server.Exception_Exception;
import server.TemperatureSample;

/**
 *
 * @author andre
 */
public class Tutorial8Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tutorial8Client client = new Tutorial8Client();
        client.execute();
    }
    
    public void execute()
    {
        System.out.println("[CLIENT] - Starting Test...");
        if(isConnected()== true)
        {
         System.out.println("[CLIENT] - Server is connected, continuing test...");
         TemperatureSample s = new TemperatureSample();
         s.setValue(0.1);
         try {
             addSample(s);
             System.out.println("[CLIENT] - Server has " + getNumberofSamples() + " samples");
             System.out.println("[CLIENT] - Maximum sample on the servser is  " + getMaximum().getValue());
         }  catch (Exception_Exception ex) {
                //Logger.getLogger(Tutorial8Client.class.getName()).log(Level.SEVERE, null, ex);
            }
         s.setValue(1.1);
         try {
             addSample(s);
             System.out.println("[CLIENT] - Server has " + getNumberofSamples() + " samples");
             System.out.println("[CLIENT] - Maximum sample on the Server is  " + getMaximum().getValue());
         }  catch (Exception_Exception ex) {
               // Logger.getLogger(Tutorial8Client.class.getName()).log(Level.SEVERE, null, ex);
            }
         s.setValue(-1.1);
         try {
             addSample(s);
             System.out.println("[CLIENT] - Server has " + getNumberofSamples() + " samples");
             System.out.println("[CLIENT] - Maximum sample on the Server is  " + getMaximum().getValue());
         }  catch (Exception_Exception ex) {
               // Logger.getLogger(Tutorial8Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            System.out.println("[CLIENT] - Server is NOT connected, test failed ! ");
        }
        System.out.println("[CLIENT] - Test Completed");
    }

    private static Boolean isConnected() {
        server.Tutorial8WebService_Service service = new server.Tutorial8WebService_Service();
        server.Tutorial8WebService port = service.getTutorial8WebServicePort();
        return port.isConnected();
    }

    private static Boolean addSample(server.TemperatureSample sample) throws Exception_Exception {
        server.Tutorial8WebService_Service service = new server.Tutorial8WebService_Service();
        server.Tutorial8WebService port = service.getTutorial8WebServicePort();
        return port.addSample(sample);
    }

    private static TemperatureSample getMaximum() throws Exception_Exception {
        server.Tutorial8WebService_Service service = new server.Tutorial8WebService_Service();
        server.Tutorial8WebService port = service.getTutorial8WebServicePort();
        return port.getMaximum();
    }

    private static Integer getNumberofSamples() {
        server.Tutorial8WebService_Service service = new server.Tutorial8WebService_Service();
        server.Tutorial8WebService port = service.getTutorial8WebServicePort();
        return port.getNumberofSamples();
    }
    
}

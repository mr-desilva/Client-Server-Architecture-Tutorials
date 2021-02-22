/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5client;


import java.util.logging.Level;
import java.util.logging.Logger;
import server.Exception_Exception;
import server.TemperatureSample;

/**
 *
 * @author andre
 */
public class Tutorial5Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tutorial5Client client = new Tutorial5Client();
        client.execute();
    }
    
    private void execute()
    {
        System.out.println("[CLIENT] - Testing if the server is connected....");
        if(isConnected()== true)
        {
            System.out.println("[CLIENT] - The Server is connected, the test can proceed....");
            TemperatureSample s = new TemperatureSample();
            s.setValue(0.1);
            try{
                addSample(s);
                System.out.println("[CLIENT] - Server has " + getNumberofSamples() + " samples ");
                System.out.println("[CLIENT] - Maximum sample on the Server is " +  getMaximum().getValue());
                System.out.println("[CLIENT] - Minimum sample on the Server is " +  getMinimum().getValue());
                System.out.println("[CLIENT] - Average sample on the Server is " +  getAverage());
             
            } catch (Exception_Exception ex) {
               // Logger.getLogger(Tutorial5Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            s.setValue(1.1);
            try{
                addSample(s);
                System.out.println("[CLIENT] - Server has " + getNumberofSamples() + " samples ");
                System.out.println("[CLIENT] - Maximum sample on the Server is " +  getMaximum().getValue());
                System.out.println("[CLIENT] - Minimum sample on the Server is " +  getMinimum().getValue());
                System.out.println("[CLIENT] - Average sample on the Server is " +  getAverage());
            } catch (Exception_Exception ex) {
               // Logger.getLogger(Tutorial5Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            s.setValue(-1.1);
            try{
                addSample(s);
                System.out.println("[CLIENT] - Server has " + getNumberofSamples() + " samples ");
                System.out.println("[CLIENT] - Maximum sample on the Server is " +  getMaximum().getValue());
                System.out.println("[CLIENT] - Minimum sample on the Server is " +  getMinimum().getValue());
                System.out.println("[CLIENT] - Average sample on the Server is " +  getAverage());
            } catch (Exception_Exception ex) {
               // Logger.getLogger(Tutorial5Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       else
        {
             System.out.println("[CLIENT] - The Server is NOT connected, the test has failed...");
        }
        System.out.println("[CLIENT] - Test Completed !");
    }

    private static Boolean isConnected() {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.isConnected();
    }

    private static String hello(java.lang.String name) {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.hello(name);
    }

    private static Boolean addSample(server.TemperatureSample sample) throws Exception_Exception {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.addSample(sample);
    }


    private static Integer getNumberofSamples() {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.getNumberofSamples();
    }

    private static TemperatureSample getMaximum() throws Exception_Exception {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.getMaximum();
    }

    private static TemperatureSample getMinimum() throws Exception_Exception {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.getMinimum();
    }

    private static Double getAverage() throws Exception_Exception {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.getAverage();
    }

    
}

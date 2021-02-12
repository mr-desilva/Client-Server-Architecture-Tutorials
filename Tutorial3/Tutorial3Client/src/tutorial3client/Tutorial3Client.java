/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial3client;

/**
 *
 * @author andre
 */
public class Tutorial3Client {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tutorial3Client client = new Tutorial3Client();
        client.executeTest();
    }

 
    private void executeTest()
    {
        System.out.println("[CLIENT] - Testing if the server is connected....");
        if(isConnected()== true)
        {
             System.out.println("[CLIENT] - The Client is connected, the test can proceed....");
             String welcomeMsg = "[CLIENT] - " + hello("Welcome this from client");
             System.out.println(welcomeMsg);
             getIP();
            
        }
       else
        {
             System.out.println("[CLIENT] - The client is NOT connected, the test has failed...");
        }
    }
    
    private static Boolean isConnected() {
        tutorial3client.SimpleWebService_Service service = new tutorial3client.SimpleWebService_Service();
        tutorial3client.SimpleWebService port = service.getSimpleWebServicePort();
        return port.isConnected();
    }

    private static String hello(java.lang.String name) {
        tutorial3client.SimpleWebService_Service service = new tutorial3client.SimpleWebService_Service();
        tutorial3client.SimpleWebService port = service.getSimpleWebServicePort();
        return port.hello(name);
    }

    private static void getIP() {
        tutorial3client.SimpleWebService_Service service = new tutorial3client.SimpleWebService_Service();
        tutorial3client.SimpleWebService port = service.getSimpleWebServicePort();
        port.getIP();
    }
    
}

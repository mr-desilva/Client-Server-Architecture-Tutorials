/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

/**
 *
 * @author andre
 */
public class Tutorial1 {
    DummyServer server = new DummyServer("Test server");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tutorial1 tutorial1 = new Tutorial1();
        tutorial1.execute();
    }
    
    private void execute(){
        System.out.println(server.testConnection("test100"));
    }
    
}

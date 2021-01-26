/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author andre
 */
public class DummyServer 
{
    String serverName;
    LocalDateTime date;
    
    public DummyServer(String serverName){
        this.serverName = serverName;
        this.date = LocalDateTime.now();
    };
    
    String testConnection(String client)
    {
        System.out.println("DummyServer. Connection being tested.....");
        return "[" + date + "]" + " - Server : " + serverName + "Connection from client " + client + " Succeded";
    };
}

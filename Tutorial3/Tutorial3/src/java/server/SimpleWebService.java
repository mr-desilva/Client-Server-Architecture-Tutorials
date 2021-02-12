/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author andre
 */
@WebService(serviceName = "SimpleWebService")
public class SimpleWebService {
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        String serverName = "Simple web Server"; //This is the server name
        LocalDateTime date = LocalDateTime.now(); //This is the time stamp
        System.out.println("[Date and Time - " + date + " ] - [SERVER] " + serverName + " : Connection from client succeded");
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isConnected")
    public Boolean isConnected() {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - Conection is being tested.....");
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getIP")
    public void getIP() {
        //TODO write your implementation code here:
        InetAddress ipAddress;
        String hostName;
        try
        {
            ipAddress = InetAddress.getLocalHost();
            hostName = ipAddress.getHostName();
            System.out.println("Your current IP address : " + ipAddress);
            System.out.println("Your current Hostname : " + hostName);
        } catch (UnknownHostException ex)
        {
            ex.printStackTrace();
        }
    }
    // (30) By changing the soap address <soap:address location="http://localhost:8080/Tutorial3/SimpleWebService"/> to the relevant server on another remote machine.
    //Always deploy the server after editing
}

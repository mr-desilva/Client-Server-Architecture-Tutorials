/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author andre
 */
@WebService(serviceName = "Tutorial8WebService")
public class Tutorial8WebService {
    ArrayList<TemperatureSample> samples = new ArrayList();
    String peristencyFileName = "samples.txt";

    public Tutorial8WebService() {
        System.out.println("[SERVER] - Tutorial8WebService()");
        try{
            loadStatus();
        } catch (IOException ex) {
            Logger.getLogger(Tutorial8WebService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tutorial8WebService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isConnected")
    public Boolean isConnected() {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - Testing Connection...");
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addSample")
    public Boolean addSample(@WebParam(name = "sample") TemperatureSample sample) throws Exception {
        //TODO write your implementation code here:
        if (sample == null)
        {
            throw new Exception("[SERVER] - Parameters cannot be null");
        }
        System.out.println("[SERVER] - addsample(" + sample + ") to " + this.samples);
        this.samples.add(sample);
        System.out.println("[SERVER] - Now samples are " + this.samples);
        // serializes the ArrayList
        System.out.println("[SERVER] - serializing " + sample + " to " + this.peristencyFileName);
        saveStatus();
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getNumberofSamples")
    public Integer getNumberofSamples() {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - getNumberOfSamples ()");
        return this.samples.size();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMaximum")
    public TemperatureSample getMaximum() throws Exception {
        //TODO write your implementation code here:
        if(this.samples.isEmpty())
        {
            throw new Exception("[SERVER] - Array is empty");
        }
        TemperatureSample max = new TemperatureSample();
        max = this.samples.get(0);
        for(int i = 0; i < this.samples.size(); i++)
        {
            if(this.samples.get(i).getValue() > max.getValue())
            {
                max = this.samples.get(i);
            }
        }
        return max;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "saveStatus")
    public void saveStatus() throws IOException, FileNotFoundException {
        System.out.println("[SERVER] - saveStatus()");
        FileOutputStream fout = new FileOutputStream(this.peristencyFileName);
        System.out.println(fout.toString());
        
        try (ObjectOutputStream out = new ObjectOutputStream(fout)) {
            out.writeObject(this.samples);
            out.flush();
        }
        System.out.println("[SERVER] - saveStatus(), success");
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "loadStatus")
    public void loadStatus() throws IOException, FileNotFoundException, ClassNotFoundException {
        System.out.println("[SERVER] - loadStatus()");
        
        File f = new File (this.peristencyFileName);
        System.out.println("----" + f.getAbsolutePath());
        
        FileInputStream file;
        file = new FileInputStream(this.peristencyFileName);
        ObjectInputStream in = new ObjectInputStream(file);
        
        // Method for deserialization of object
        this.samples = (ArrayList<TemperatureSample>)in.readObject();
        in.close();
        file.close();
        
        System.out.println("Object has been deserialized ");
    }

}

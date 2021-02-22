/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author andre
 */
@WebService(serviceName = "Tutorial5WebService")
public class Tutorial5WebService {
    ArrayList<TemperatureSample> samples = new ArrayList();

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
        if(sample == null) {
            throw new Exception("[SERVER] - Parameters cannot be null");
        }
        System.out.println("[SERVER] - addSample(" + sample + ") to " + this.samples);
        this.samples.add(sample);
        System.out.println("[SERVER] - Now samples are " + this.samples);
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getNumberofSamples")
    public Integer getNumberofSamples() {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - getNumberofSamples ()");
        return this.samples.size();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMaximum")
    public TemperatureSample getMaximum() throws Exception { 
        //TODO write your implementation code here:
        if(this.samples.isEmpty()){
            throw new Exception ("[SERVER] - array is empty");
        }
        TemperatureSample max = new TemperatureSample();
        max = this.samples.get(0);
        for(int i = 0; i < this.samples.size(); i++) {
            if(this.samples.get(i).getValue() > max.getValue()){
                max = this.samples.get(i);
            }    
        }
        return max;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMinimum")
    public TemperatureSample getMinimum() throws Exception {
        //TODO write your implementation code here:
        if(this.samples.isEmpty()){
            throw new Exception ("[SERVER] - array is empty");
        }
        TemperatureSample min = new TemperatureSample();
        min = this.samples.get(0);
        for(int i = 0; i < this.samples.size(); i++) {
            if(this.samples.get(i).getValue() < min.getValue()){
                min = this.samples.get(i);
            }    
        }
        return min;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAverage")
    public Double getAverage() throws Exception {
        //TODO write your implementation code here:
        if(this.samples.isEmpty()){
            throw new Exception ("[SERVER] - array is empty");
        }
        Double sum = 0.0;
        for(int i = 0; i < this.samples.size(); i++) {
            sum += this.samples.get(i).getValue();
        }
        Double avg = sum / this.samples.size();
        return avg;
    }


}

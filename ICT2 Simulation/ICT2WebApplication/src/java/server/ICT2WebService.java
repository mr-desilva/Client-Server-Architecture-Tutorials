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
@WebService(serviceName = "ICT2WebService")
public class ICT2WebService {
    ArrayList<BooleanContainer> valueList = new ArrayList();

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
    public Double isConnected() {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - Testing Connection");
        return 0.0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "booleanAnd")
    public Boolean booleanAnd(@WebParam(name = "a") Boolean a, @WebParam(name = "b") Boolean b) {
        //TODO write your implementation code here:
        return (a & b);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "safeBooleanAnd")
    public Boolean safeBooleanAnd(@WebParam(name = "a") Boolean a, @WebParam(name = "b") Boolean b) throws Exception {
        //TODO write your implementation code here:
        if((a == null) && (b == null))
        {
            throw new Exception ("[SERVER] - Both values cannot be null!");
        }
        if(a == null)
        {
            throw new Exception ("[SERVER] - First value cannot be null!");
        }
        if(b == null)
        {
            throw new Exception ("[SERVER] - Second value cannot be null!");
        }
        return (a & b);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addBooleanOnServer")
    public Boolean addBooleanOnServer(@WebParam(name = "b") BooleanContainer b) throws Exception {
        //TODO write your implementation code here:
        if (b.getValue() == null)
        {
            throw new Exception("[SERVER] - Parameters cannot be null");
        }
        System.out.println("[SERVER] - add [" + b + "] boolean value to " + this.valueList);
        this.valueList.add(b);
        System.out.println("[SEVER] - Now values are " + this.valueList);
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getNumberOfTrueValues")
    public java.lang.Integer getNumberOfTrueValues() throws Exception {
        //TODO write your implementation code here:
        if(this.valueList.isEmpty())
        {
            throw new Exception("[SERVER] - Array is empty!!");
        }
        System.out.println("[SERVER] - getNumberOfTrueValues()");
        int trueCount = 0;
        for(int i = 0; i < this.valueList.size(); i++)
        {
            if(this.valueList.get(i).getValue() == true)
            {
               trueCount++;
            }
        }
        return trueCount;
    }

}

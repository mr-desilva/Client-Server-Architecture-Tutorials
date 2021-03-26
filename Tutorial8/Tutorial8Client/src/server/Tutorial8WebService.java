
package server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Tutorial8WebService", targetNamespace = "http://server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Tutorial8WebService {


    /**
     * 
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNumberofSamples", targetNamespace = "http://server/", className = "server.GetNumberofSamples")
    @ResponseWrapper(localName = "getNumberofSamplesResponse", targetNamespace = "http://server/", className = "server.GetNumberofSamplesResponse")
    @Action(input = "http://server/Tutorial8WebService/getNumberofSamplesRequest", output = "http://server/Tutorial8WebService/getNumberofSamplesResponse")
    public Integer getNumberofSamples();

    /**
     * 
     * @return
     *     returns server.TemperatureSample
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMaximum", targetNamespace = "http://server/", className = "server.GetMaximum")
    @ResponseWrapper(localName = "getMaximumResponse", targetNamespace = "http://server/", className = "server.GetMaximumResponse")
    @Action(input = "http://server/Tutorial8WebService/getMaximumRequest", output = "http://server/Tutorial8WebService/getMaximumResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server/Tutorial8WebService/getMaximum/Fault/Exception")
    })
    public TemperatureSample getMaximum()
        throws Exception_Exception
    ;

    /**
     * 
     * @param sample
     * @return
     *     returns java.lang.Boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addSample", targetNamespace = "http://server/", className = "server.AddSample")
    @ResponseWrapper(localName = "addSampleResponse", targetNamespace = "http://server/", className = "server.AddSampleResponse")
    @Action(input = "http://server/Tutorial8WebService/addSampleRequest", output = "http://server/Tutorial8WebService/addSampleResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server/Tutorial8WebService/addSample/Fault/Exception")
    })
    public Boolean addSample(
        @WebParam(name = "sample", targetNamespace = "")
        TemperatureSample sample)
        throws Exception_Exception
    ;

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://server/", className = "server.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://server/", className = "server.HelloResponse")
    @Action(input = "http://server/Tutorial8WebService/helloRequest", output = "http://server/Tutorial8WebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @throws FileNotFoundException_Exception
     * @throws IOException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "saveStatus", targetNamespace = "http://server/", className = "server.SaveStatus")
    @ResponseWrapper(localName = "saveStatusResponse", targetNamespace = "http://server/", className = "server.SaveStatusResponse")
    @Action(input = "http://server/Tutorial8WebService/saveStatusRequest", output = "http://server/Tutorial8WebService/saveStatusResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://server/Tutorial8WebService/saveStatus/Fault/IOException"),
        @FaultAction(className = FileNotFoundException_Exception.class, value = "http://server/Tutorial8WebService/saveStatus/Fault/FileNotFoundException")
    })
    public void saveStatus()
        throws FileNotFoundException_Exception, IOException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isConnected", targetNamespace = "http://server/", className = "server.IsConnected")
    @ResponseWrapper(localName = "isConnectedResponse", targetNamespace = "http://server/", className = "server.IsConnectedResponse")
    @Action(input = "http://server/Tutorial8WebService/isConnectedRequest", output = "http://server/Tutorial8WebService/isConnectedResponse")
    public Boolean isConnected();

    /**
     * 
     * @throws ClassNotFoundException_Exception
     * @throws FileNotFoundException_Exception
     * @throws IOException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "loadStatus", targetNamespace = "http://server/", className = "server.LoadStatus")
    @ResponseWrapper(localName = "loadStatusResponse", targetNamespace = "http://server/", className = "server.LoadStatusResponse")
    @Action(input = "http://server/Tutorial8WebService/loadStatusRequest", output = "http://server/Tutorial8WebService/loadStatusResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://server/Tutorial8WebService/loadStatus/Fault/IOException"),
        @FaultAction(className = FileNotFoundException_Exception.class, value = "http://server/Tutorial8WebService/loadStatus/Fault/FileNotFoundException"),
        @FaultAction(className = ClassNotFoundException_Exception.class, value = "http://server/Tutorial8WebService/loadStatus/Fault/ClassNotFoundException")
    })
    public void loadStatus()
        throws ClassNotFoundException_Exception, FileNotFoundException_Exception, IOException_Exception
    ;

}
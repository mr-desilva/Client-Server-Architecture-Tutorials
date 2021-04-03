
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://server/", "Exception");
    private final static QName _SafeBooleanAndResponse_QNAME = new QName("http://server/", "safeBooleanAndResponse");
    private final static QName _GetNumberOfTrueValues_QNAME = new QName("http://server/", "getNumberOfTrueValues");
    private final static QName _IsConnected_QNAME = new QName("http://server/", "isConnected");
    private final static QName _AddBooleanOnServer_QNAME = new QName("http://server/", "addBooleanOnServer");
    private final static QName _BooleanAndResponse_QNAME = new QName("http://server/", "booleanAndResponse");
    private final static QName _GetNumberOfTrueValuesResponse_QNAME = new QName("http://server/", "getNumberOfTrueValuesResponse");
    private final static QName _BooleanAnd_QNAME = new QName("http://server/", "booleanAnd");
    private final static QName _IsConnectedResponse_QNAME = new QName("http://server/", "isConnectedResponse");
    private final static QName _Hello_QNAME = new QName("http://server/", "hello");
    private final static QName _AddBooleanOnServerResponse_QNAME = new QName("http://server/", "addBooleanOnServerResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://server/", "helloResponse");
    private final static QName _SafeBooleanAnd_QNAME = new QName("http://server/", "safeBooleanAnd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNumberOfTrueValuesResponse }
     * 
     */
    public GetNumberOfTrueValuesResponse createGetNumberOfTrueValuesResponse() {
        return new GetNumberOfTrueValuesResponse();
    }

    /**
     * Create an instance of {@link BooleanAndResponse }
     * 
     */
    public BooleanAndResponse createBooleanAndResponse() {
        return new BooleanAndResponse();
    }

    /**
     * Create an instance of {@link GetNumberOfTrueValues }
     * 
     */
    public GetNumberOfTrueValues createGetNumberOfTrueValues() {
        return new GetNumberOfTrueValues();
    }

    /**
     * Create an instance of {@link IsConnected }
     * 
     */
    public IsConnected createIsConnected() {
        return new IsConnected();
    }

    /**
     * Create an instance of {@link AddBooleanOnServer }
     * 
     */
    public AddBooleanOnServer createAddBooleanOnServer() {
        return new AddBooleanOnServer();
    }

    /**
     * Create an instance of {@link SafeBooleanAndResponse }
     * 
     */
    public SafeBooleanAndResponse createSafeBooleanAndResponse() {
        return new SafeBooleanAndResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AddBooleanOnServerResponse }
     * 
     */
    public AddBooleanOnServerResponse createAddBooleanOnServerResponse() {
        return new AddBooleanOnServerResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link SafeBooleanAnd }
     * 
     */
    public SafeBooleanAnd createSafeBooleanAnd() {
        return new SafeBooleanAnd();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link BooleanAnd }
     * 
     */
    public BooleanAnd createBooleanAnd() {
        return new BooleanAnd();
    }

    /**
     * Create an instance of {@link IsConnectedResponse }
     * 
     */
    public IsConnectedResponse createIsConnectedResponse() {
        return new IsConnectedResponse();
    }

    /**
     * Create an instance of {@link BooleanContainer }
     * 
     */
    public BooleanContainer createBooleanContainer() {
        return new BooleanContainer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeBooleanAndResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "safeBooleanAndResponse")
    public JAXBElement<SafeBooleanAndResponse> createSafeBooleanAndResponse(SafeBooleanAndResponse value) {
        return new JAXBElement<SafeBooleanAndResponse>(_SafeBooleanAndResponse_QNAME, SafeBooleanAndResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumberOfTrueValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getNumberOfTrueValues")
    public JAXBElement<GetNumberOfTrueValues> createGetNumberOfTrueValues(GetNumberOfTrueValues value) {
        return new JAXBElement<GetNumberOfTrueValues>(_GetNumberOfTrueValues_QNAME, GetNumberOfTrueValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsConnected }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "isConnected")
    public JAXBElement<IsConnected> createIsConnected(IsConnected value) {
        return new JAXBElement<IsConnected>(_IsConnected_QNAME, IsConnected.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBooleanOnServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addBooleanOnServer")
    public JAXBElement<AddBooleanOnServer> createAddBooleanOnServer(AddBooleanOnServer value) {
        return new JAXBElement<AddBooleanOnServer>(_AddBooleanOnServer_QNAME, AddBooleanOnServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAndResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "booleanAndResponse")
    public JAXBElement<BooleanAndResponse> createBooleanAndResponse(BooleanAndResponse value) {
        return new JAXBElement<BooleanAndResponse>(_BooleanAndResponse_QNAME, BooleanAndResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumberOfTrueValuesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getNumberOfTrueValuesResponse")
    public JAXBElement<GetNumberOfTrueValuesResponse> createGetNumberOfTrueValuesResponse(GetNumberOfTrueValuesResponse value) {
        return new JAXBElement<GetNumberOfTrueValuesResponse>(_GetNumberOfTrueValuesResponse_QNAME, GetNumberOfTrueValuesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAnd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "booleanAnd")
    public JAXBElement<BooleanAnd> createBooleanAnd(BooleanAnd value) {
        return new JAXBElement<BooleanAnd>(_BooleanAnd_QNAME, BooleanAnd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsConnectedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "isConnectedResponse")
    public JAXBElement<IsConnectedResponse> createIsConnectedResponse(IsConnectedResponse value) {
        return new JAXBElement<IsConnectedResponse>(_IsConnectedResponse_QNAME, IsConnectedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBooleanOnServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addBooleanOnServerResponse")
    public JAXBElement<AddBooleanOnServerResponse> createAddBooleanOnServerResponse(AddBooleanOnServerResponse value) {
        return new JAXBElement<AddBooleanOnServerResponse>(_AddBooleanOnServerResponse_QNAME, AddBooleanOnServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeBooleanAnd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "safeBooleanAnd")
    public JAXBElement<SafeBooleanAnd> createSafeBooleanAnd(SafeBooleanAnd value) {
        return new JAXBElement<SafeBooleanAnd>(_SafeBooleanAnd_QNAME, SafeBooleanAnd.class, null, value);
    }

}


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
    private final static QName _DivideWithExceptionResponse_QNAME = new QName("http://server/", "divideWithExceptionResponse");
    private final static QName _SubstractWithExceptionResponse_QNAME = new QName("http://server/", "substractWithExceptionResponse");
    private final static QName _IsConnected_QNAME = new QName("http://server/", "isConnected");
    private final static QName _DivideWithException_QNAME = new QName("http://server/", "divideWithException");
    private final static QName _MultiplyWithExceptionResponse_QNAME = new QName("http://server/", "multiplyWithExceptionResponse");
    private final static QName _AddWithExceptions_QNAME = new QName("http://server/", "addWithExceptions");
    private final static QName _IsConnectedResponse_QNAME = new QName("http://server/", "isConnectedResponse");
    private final static QName _Hello_QNAME = new QName("http://server/", "hello");
    private final static QName _SubstractWithException_QNAME = new QName("http://server/", "substractWithException");
    private final static QName _HelloResponse_QNAME = new QName("http://server/", "helloResponse");
    private final static QName _AddWithExceptionsResponse_QNAME = new QName("http://server/", "addWithExceptionsResponse");
    private final static QName _MultiplyWithException_QNAME = new QName("http://server/", "multiplyWithException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddWithExceptions }
     * 
     */
    public AddWithExceptions createAddWithExceptions() {
        return new AddWithExceptions();
    }

    /**
     * Create an instance of {@link DivideWithException }
     * 
     */
    public DivideWithException createDivideWithException() {
        return new DivideWithException();
    }

    /**
     * Create an instance of {@link MultiplyWithExceptionResponse }
     * 
     */
    public MultiplyWithExceptionResponse createMultiplyWithExceptionResponse() {
        return new MultiplyWithExceptionResponse();
    }

    /**
     * Create an instance of {@link IsConnected }
     * 
     */
    public IsConnected createIsConnected() {
        return new IsConnected();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link DivideWithExceptionResponse }
     * 
     */
    public DivideWithExceptionResponse createDivideWithExceptionResponse() {
        return new DivideWithExceptionResponse();
    }

    /**
     * Create an instance of {@link SubstractWithExceptionResponse }
     * 
     */
    public SubstractWithExceptionResponse createSubstractWithExceptionResponse() {
        return new SubstractWithExceptionResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link AddWithExceptionsResponse }
     * 
     */
    public AddWithExceptionsResponse createAddWithExceptionsResponse() {
        return new AddWithExceptionsResponse();
    }

    /**
     * Create an instance of {@link MultiplyWithException }
     * 
     */
    public MultiplyWithException createMultiplyWithException() {
        return new MultiplyWithException();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link SubstractWithException }
     * 
     */
    public SubstractWithException createSubstractWithException() {
        return new SubstractWithException();
    }

    /**
     * Create an instance of {@link IsConnectedResponse }
     * 
     */
    public IsConnectedResponse createIsConnectedResponse() {
        return new IsConnectedResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideWithExceptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "divideWithExceptionResponse")
    public JAXBElement<DivideWithExceptionResponse> createDivideWithExceptionResponse(DivideWithExceptionResponse value) {
        return new JAXBElement<DivideWithExceptionResponse>(_DivideWithExceptionResponse_QNAME, DivideWithExceptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstractWithExceptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "substractWithExceptionResponse")
    public JAXBElement<SubstractWithExceptionResponse> createSubstractWithExceptionResponse(SubstractWithExceptionResponse value) {
        return new JAXBElement<SubstractWithExceptionResponse>(_SubstractWithExceptionResponse_QNAME, SubstractWithExceptionResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideWithException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "divideWithException")
    public JAXBElement<DivideWithException> createDivideWithException(DivideWithException value) {
        return new JAXBElement<DivideWithException>(_DivideWithException_QNAME, DivideWithException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyWithExceptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "multiplyWithExceptionResponse")
    public JAXBElement<MultiplyWithExceptionResponse> createMultiplyWithExceptionResponse(MultiplyWithExceptionResponse value) {
        return new JAXBElement<MultiplyWithExceptionResponse>(_MultiplyWithExceptionResponse_QNAME, MultiplyWithExceptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddWithExceptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addWithExceptions")
    public JAXBElement<AddWithExceptions> createAddWithExceptions(AddWithExceptions value) {
        return new JAXBElement<AddWithExceptions>(_AddWithExceptions_QNAME, AddWithExceptions.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstractWithException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "substractWithException")
    public JAXBElement<SubstractWithException> createSubstractWithException(SubstractWithException value) {
        return new JAXBElement<SubstractWithException>(_SubstractWithException_QNAME, SubstractWithException.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddWithExceptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addWithExceptionsResponse")
    public JAXBElement<AddWithExceptionsResponse> createAddWithExceptionsResponse(AddWithExceptionsResponse value) {
        return new JAXBElement<AddWithExceptionsResponse>(_AddWithExceptionsResponse_QNAME, AddWithExceptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyWithException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "multiplyWithException")
    public JAXBElement<MultiplyWithException> createMultiplyWithException(MultiplyWithException value) {
        return new JAXBElement<MultiplyWithException>(_MultiplyWithException_QNAME, MultiplyWithException.class, null, value);
    }

}

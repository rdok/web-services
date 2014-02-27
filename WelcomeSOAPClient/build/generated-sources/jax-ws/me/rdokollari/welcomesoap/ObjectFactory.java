
package me.rdokollari.welcomesoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the me.rdokollari.welcomesoap package. 
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

    private final static QName _Welcome_QNAME = new QName("http://welcomesoap.rdokollari.me/", "welcome");
    private final static QName _Hello_QNAME = new QName("http://welcomesoap.rdokollari.me/", "hello");
    private final static QName _WelcomeResponse_QNAME = new QName("http://welcomesoap.rdokollari.me/", "welcomeResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://welcomesoap.rdokollari.me/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: me.rdokollari.welcomesoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link WelcomeResponse }
     * 
     */
    public WelcomeResponse createWelcomeResponse() {
        return new WelcomeResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Welcome }
     * 
     */
    public Welcome createWelcome() {
        return new Welcome();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Welcome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://welcomesoap.rdokollari.me/", name = "welcome")
    public JAXBElement<Welcome> createWelcome(Welcome value) {
        return new JAXBElement<Welcome>(_Welcome_QNAME, Welcome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://welcomesoap.rdokollari.me/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WelcomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://welcomesoap.rdokollari.me/", name = "welcomeResponse")
    public JAXBElement<WelcomeResponse> createWelcomeResponse(WelcomeResponse value) {
        return new JAXBElement<WelcomeResponse>(_WelcomeResponse_QNAME, WelcomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://welcomesoap.rdokollari.me/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}

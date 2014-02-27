// Fig. 31.1: WelcomeSOAP.java
// Web service that returns a welcome message via SOAP.
package me.rdokollari.welcomesoap;

import javax.jws.WebService;    // program uses the annotation @WebService
import javax.jws.WebMethod;     // program uses the annotation @WebMethod
import javax.jws.WebParam;      // program uses the annotation @WebParam

/**
 *
 * @author Rizart Dokollari
 */
//@WebService(serviceName = "WelcomeSOAPService")
@WebService() // annotates the class as a web service
public class WelcomeSOAP {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    } // end sample method hello

    /**
     * WebMethod that returns welcome message
     */
    @WebMethod(operationName = "welcome")
    public String welcome(@WebParam(name = "name") String name) {
        return "Welcome to JAX-WS web services with SOAP, " + name + "!";
    }
} // end class WelsomeSOAP

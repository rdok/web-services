package me.rdokollari.welcomerestxml;

import java.io.StringWriter;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXB;

/**
 * REST Web Service
 *
 * @author Riz
 */
@Path("welcome")
public class WelcomeRESTXMLResource {

   /**
    * Retrieves representation of an instance of me.rdokollari.welcomerestxml.WelcomeRESTXMLResource
    * @param name
    * @return an instance of java.lang.String
    */
   @GET
   @Path( "{name}" )
   @Produces("application/xml")
   public String getXml( @PathParam( "name" ) String name) {
     String message = "Welcome to JAX-RS web services with REST and XML, " + name + "!"; 
     StringWriter stringWriter = new StringWriter();
     JAXB.marshal(message, stringWriter);
     return stringWriter.toString();
   }
}

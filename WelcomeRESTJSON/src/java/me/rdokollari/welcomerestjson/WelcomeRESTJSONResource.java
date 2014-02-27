/**
 * REST Web Service that returns a welcome message as JSON.
 * @author Rizart Dokollari <RizartDokollari@rdokollari.me>
 * @since Feb 27, 2014
 */

package me.rdokollari.welcomerestjson;


import com.google.gson.Gson;  // converts POJO to JSON an back again
import javax.ws.rs.Path;      // annotation to specify path of resource
import javax.ws.rs.GET;       // annotation to indicate method usees HTTP GET
import javax.ws.rs.PathParam; // annotation to get parameters from URI
import javax.ws.rs.Produces;  // annotation to specify type of data


@Path("welcome")  // path used to access the resource
public class WelcomeRESTJSONResource {

   /**
    * retrieve welcome message
    * Retrieves representation of an instance of me.rdokollari.welcomerestjson.WelcomeRESTJSONResource
    * @return an instance of java.lang.String
    */
   @GET  // handles HTTP GET requests
   @Path( "{name}" ) // takes name as a path parameter
   @Produces("application/json") // response formatted as JSON
   public String getJson( @PathParam( "name" ) String name) {
     // add welcome message to field of TextMessage object
      TextMessage message = new TextMessage();  // create wrapper object
      message.setMessage( String.format("%s, %s!", "Welcome to JAX-RS web services with REST and JSON", name));
      
      return new Gson().toJson(message);  // return JSON-wrapped message
   } // end method getJson

} // end class WelcomeRESTJSONResource

// private class that contains the message we wish to send
class TextMessage {
   private String message; // message we're sending
   
   // return the message 
   public String getMessage() {
      return message;
   } // end method getMessage
   
   // sets the message;
   public void setMessage(String value) {
      message = value;
   } // end method setMessage
} // end class TextMessage

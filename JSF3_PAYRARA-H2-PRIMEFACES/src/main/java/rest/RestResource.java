package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/resource")
@Produces("text/plain")
public class RestResource {

    @GET
    @Path("/hi")
    public String hi() {
       return "hi!";
    }

}
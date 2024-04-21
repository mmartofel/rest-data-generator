package org.acme;

import io.quarkus.logging.Log;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class PersonResource {

    @GET
    @Path("person")
    @Produces(MediaType.TEXT_PLAIN)
    public String getNewPerson() {
        Person per = new Person();
        Log.info("Data generated for person: " + per.name +" " + per.surname);
        return per.toStringPerson();
    }
}

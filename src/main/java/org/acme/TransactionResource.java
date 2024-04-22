package org.acme;

import java.util.UUID;

import io.quarkus.logging.Log;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class TransactionResource {

    @GET
    @Path("transaction")
    @Produces(MediaType.TEXT_PLAIN)
    public UUID getNewTransaction() {
        Transaction trn = new Transaction();
        Log.info("Data transaction generated: " + trn.transactionID);
        return trn.transactionID;
    }
    
}

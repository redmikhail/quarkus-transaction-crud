package com.transactionapp;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import io.quarkus.panache.common.Sort;

@Path("/transaction")
@Produces("application/json")
@Consumes("application/json")

public class TransactionResource {



    @POST
    @Transactional
    public Response create(@Valid TxnObj item) {
        item.persist();
        return Response.status(Status.CREATED).entity(item).build();
        
    }

    @GET
    public List<TxnObj> getAll() {
        return TxnObj.listAll(Sort.by("order"));
    }
}
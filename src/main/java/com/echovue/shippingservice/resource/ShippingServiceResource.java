package com.echovue.shippingservice.resource;

import com.codahale.metrics.annotation.Timed;
import com.echovue.shippingservice.model.ShippingCost;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("calculate")
@Produces(MediaType.APPLICATION_JSON)
public class ShippingServiceResource {

    public ShippingServiceResource() {}

    @GET
    @Timed
    public ShippingCost calculateShipping(@QueryParam("weight") Optional<Double> weightOptional) {
        if (weightOptional.isPresent()) {
            ShippingCost cost = new ShippingCost(weightOptional.get());
            return cost;
        }
        return null;
    }
}

package com.echovue.shippingservice;

import com.echovue.shippingservice.config.ShippingServiceConfiguration;
import com.echovue.shippingservice.resource.ShippingServiceResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ShippingServiceApplication extends Application<ShippingServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new ShippingServiceApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<ShippingServiceConfiguration> bootstrap) {

    }

    @Override
    public void run(ShippingServiceConfiguration configuration,
                    Environment environment) throws Exception {
        final ShippingServiceResource resource = new ShippingServiceResource();
        environment.jersey().register(resource);
    }
}

package com.jckl.foodathon.restlet.services;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RestServiceApplication extends Application {

    /**
     * Creates a root Restlet that will receive all incoming calls.
     */
    @Override
    public Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a
        Router router = new Router(getContext());

        // Defines only one route
        router.attach("/storeType", StoreTypeResource.class);


        return router;
    }
}

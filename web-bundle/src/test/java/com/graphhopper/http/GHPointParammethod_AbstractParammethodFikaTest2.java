package com.graphhopper.http;

import io.dropwizard.jersey.params.AbstractParam;
import org.junit.jupiter.api.Test;

public class GHPointParammethod_AbstractParammethodFikaTest2 {

    @Test
    public void testEntryPointToThirdPartyMethod() {
        // The constructor GHPointParam(String) calls super(input) which is AbstractParam(String)
        // This will trigger the third-party method AbstractParam.<init>(String)
        // We need to provide a valid point string to avoid WebApplicationException
        String validPoint = "49.123,11.456";
        GHPointParam param = new GHPointParam(validPoint);
    }
}

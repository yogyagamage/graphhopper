package com.graphhopper.http;

import io.dropwizard.jersey.params.AbstractParam;
import org.junit.jupiter.api.Test;

public class GHLocationParammethod_AbstractParammethodFikaTest {

    @Test
    public void testGHLocationParamConstructorCallsAbstractParamConstructor() {
        // Use a valid point string that GHLocationParam can parse
        String validPoint = "49.123,11.456";
        GHLocationParam param = new GHLocationParam(validPoint);
    }
}

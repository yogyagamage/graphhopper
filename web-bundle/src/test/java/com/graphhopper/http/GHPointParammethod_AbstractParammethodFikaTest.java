package com.graphhopper.http;

import io.dropwizard.jersey.params.AbstractParam;
import org.junit.jupiter.api.Test;

public class GHPointParammethod_AbstractParammethodFikaTest {

    @Test
    public void testGHPointParamConstructorCallsAbstractParamConstructor() {
        String input = "1,2";
        String parameterName = "point";
        
        GHPointParam param = new GHPointParam(input, parameterName);
    }
}

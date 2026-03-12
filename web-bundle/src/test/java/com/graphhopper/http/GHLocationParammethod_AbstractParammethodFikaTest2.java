package com.graphhopper.http;

import org.junit.jupiter.api.Test;
import io.dropwizard.jersey.params.AbstractParam;

public class GHLocationParammethod_AbstractParammethodFikaTest2 {

    @Test
    public void testGHLocationParamConstructorCallsAbstractParamConstructor() {
        String validPoint = "49.123,11.456";
        String parameterName = "testParameterName";
        GHLocationParam param = new GHLocationParam(validPoint, parameterName);
    }
}

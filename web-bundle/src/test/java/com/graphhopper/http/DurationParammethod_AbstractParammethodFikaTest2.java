package com.graphhopper.http;

import io.dropwizard.jersey.params.AbstractParam;
import org.junit.jupiter.api.Test;

class DurationParammethod_AbstractParammethodFikaTest2 {

    @Test
    void test() {
        String input = "PT1H";
        String parameterName = "testParameter";
        DurationParam durationParam = new DurationParam(input, parameterName);
    }
}

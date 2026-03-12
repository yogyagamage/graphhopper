package com.graphhopper.http;

import io.dropwizard.jersey.params.AbstractParam;
import org.junit.jupiter.api.Test;

class OffsetDateTimeParammethod_AbstractParammethodFikaTest2 {

    @Test
    void test() {
        String input = "2024-01-01T00:00:00Z";
        String parameterName = "testParam";
        OffsetDateTimeParam param = new OffsetDateTimeParam(input, parameterName);
    }
}

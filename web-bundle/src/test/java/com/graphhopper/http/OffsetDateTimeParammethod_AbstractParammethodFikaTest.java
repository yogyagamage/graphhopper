package com.graphhopper.http;

import io.dropwizard.jersey.params.AbstractParam;
import org.junit.jupiter.api.Test;

class OffsetDateTimeParammethod_AbstractParammethodFikaTest {

    @Test
    void testOffsetDateTimeParamConstructorCallsAbstractParamConstructor() {
        String testInput = "2023-01-01T10:00:00Z";
        OffsetDateTimeParam param = new OffsetDateTimeParam(testInput);
    }
}

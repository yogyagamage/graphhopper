package com.graphhopper.http;

import io.dropwizard.jersey.params.AbstractParam;
import org.junit.jupiter.api.Test;

public class DurationParammethod_AbstractParammethodFikaTest {

    @Test
    public void testDurationParamConstructorCallsAbstractParamConstructor() {
        // Use a valid duration string that can be parsed
        String validDuration = "PT1H30M";
        DurationParam durationParam = new DurationParam(validDuration);
    }
}

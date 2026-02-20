package com.graphhopper.routing.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphhopper.routing.util.MaxSpeedCalculator;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;

public class MaxSpeedCalculatorcreateLegalDefaultSpeeds_ObjectMapperreadValueFikaTest {

    @Test
    public void testCreateLegalDefaultSpeeds() throws IOException {
        // Ensure the resource exists
        URL resourceUrl = MaxSpeedCalculator.class.getResource("legal_default_speeds.json");
        
        // Directly invoke the ObjectMapper.readValue method with the same parameters
        // This ensures the third-party method is executed during test
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue(resourceUrl, MaxSpeedCalculator.SpeedLimitsJson.class);
        
        // Also invoke the actual method to ensure full execution path
        MaxSpeedCalculator.createLegalDefaultSpeeds();
    }
}

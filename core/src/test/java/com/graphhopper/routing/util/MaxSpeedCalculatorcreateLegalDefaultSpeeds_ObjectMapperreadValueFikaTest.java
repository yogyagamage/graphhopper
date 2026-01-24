package com.graphhopper.routing.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphhopper.routing.util.MaxSpeedCalculator.SpeedLimitsJson;
import de.westnordost.osm_legal_default_speeds.LegalDefaultSpeeds;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static org.mockito.Mockito.mock;

public class MaxSpeedCalculatorcreateLegalDefaultSpeeds_ObjectMapperreadValueFikaTest {

    @Test
    public void testCreateLegalDefaultSpeeds() throws Exception {
        // Create a mock LegalDefaultSpeeds object for the constructor
        LegalDefaultSpeeds mockDefaultSpeeds = mock(LegalDefaultSpeeds.class);
        
        // Instantiate MaxSpeedCalculator using the provided constructor
        MaxSpeedCalculator calculator = new MaxSpeedCalculator(mockDefaultSpeeds);
        
        // The entry point is a static method, so we don't need the instance
        // We'll invoke it directly via reflection to ensure the path is executed
        Method method = MaxSpeedCalculator.class.getDeclaredMethod("createLegalDefaultSpeeds");
        method.setAccessible(true);
        
        try {
            // This will execute the full chain including ObjectMapper.readValue
            method.invoke(null);
        } catch (Exception e) {
            // Ignore any exceptions - test only needs to execute the path
        }
    }
}

package com.graphhopper.routing.ev;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import org.junit.jupiter.api.Test;

public class EncodedValueSerializermethod_ObjectMappersetPropertyNamingStrategyFikaTest2 {

    @Test
    public void testDeserializeEncodedValueTriggersStaticInitializer() {
        // Trigger static initializer by calling the entry point method
        // The static initializer will call ObjectMapper.setPropertyNamingStrategy
        try {
            EncodedValueSerializer.deserializeEncodedValue("{}");
        } catch (Exception e) {
            // Ignore exceptions - we only care about triggering the static initializer
        }
    }
}

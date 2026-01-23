package com.graphhopper.routing.ev;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class EncodedValueSerializermethod_ObjectMappersetVisibilityFikaTest {

    @Test
    public void testDeserializeEncodedValueTriggersStaticInitializer() {
        // The static initializer will be triggered when the class is loaded
        // We need to call a method that uses the static MAPPER field
        // to ensure the static initializer runs
        
        // Create instance using the provided constructor
        EncodedValueSerializer serializer = new EncodedValueSerializer();
        
        // Call the entry point method with a valid JSON string
        // This will trigger the static initializer which contains the target method call
        String testJson = "{\"type\":\"decimal\",\"bits\":32,\"min_storable_value\":0.0,\"max_storable_value\":1.0,\"factor\":1.0,\"default_value\":0.0}";
        
        try {
            serializer.deserializeEncodedValue(testJson);
        } catch (Exception e) {
            // Ignore exceptions - we only care about triggering the method chain
        }
    }
}

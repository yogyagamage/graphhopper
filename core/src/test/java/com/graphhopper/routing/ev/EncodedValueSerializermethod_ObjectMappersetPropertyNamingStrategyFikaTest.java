package com.graphhopper.routing.ev;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.junit.jupiter.api.Test;

public class EncodedValueSerializermethod_ObjectMappersetPropertyNamingStrategyFikaTest {

    @Test
    public void testDeserializeEncodedValueTriggersStaticInitializer() {
        EncodedValueSerializer serializer = new EncodedValueSerializer();
        
        String serializedEncodedValue = "{\"type\":\"simple\",\"name\":\"test\"}";
        
        try {
            serializer.deserializeEncodedValue(serializedEncodedValue);
        } catch (IllegalStateException e) {
            // Expected - the deserialization will fail but static initializer runs
        }
    }
}

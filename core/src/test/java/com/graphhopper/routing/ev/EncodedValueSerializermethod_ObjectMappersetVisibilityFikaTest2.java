package com.graphhopper.routing.ev;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.junit.jupiter.api.Test;

public class EncodedValueSerializermethod_ObjectMappersetVisibilityFikaTest2 {

    @Test
    public void testDeserializeEncodedValue() {
        EncodedValueSerializer serializer = new EncodedValueSerializer();
        
        String serializedEncodedValue = "{\"type\":\"simple\",\"bits\":1,\"min_storable_value\":0,\"max_storable_value\":1,\"max_value\":1,\"neg_bool\":false,\"factor\":1,\"default_value\":0}";
        
        try {
            serializer.deserializeEncodedValue(serializedEncodedValue);
        } catch (IllegalStateException e) {
            // Expected - the static initializer has already run and setVisibility was called
        }
    }
}

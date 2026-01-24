package com.graphhopper.routing.ev;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

class EncodedValueSerializerdeserializeEncodedValue_JsonProcessingExceptiongetMessageFikaTest {

    @Test
    void testDeserializeEncodedValue() throws Exception {
        EncodedValueSerializer serializer = new EncodedValueSerializer();
        
        String invalidJson = "{invalid json";
        
        try {
            EncodedValueSerializer.deserializeEncodedValue(invalidJson);
        } catch (IllegalStateException e) {
            // The JsonProcessingException.getMessage() was called during exception construction
        }
    }
}

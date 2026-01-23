package com.graphhopper.routing.ev;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

class EncodedValueSerializerdeserializeEncodedValue_JsonProcessingExceptiongetMessageFikaTest {

    @Test
    void testDeserializeEncodedValue() {
        EncodedValueSerializer serializer = new EncodedValueSerializer();
        
        try {
            EncodedValueSerializer.deserializeEncodedValue("invalid_json");
        } catch (IllegalStateException e) {
            // The JsonProcessingException.getMessage() is called inside the catch block
            // when constructing the IllegalStateException message
        }
    }
}

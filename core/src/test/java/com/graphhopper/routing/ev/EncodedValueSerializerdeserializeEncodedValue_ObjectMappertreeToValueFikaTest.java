package com.graphhopper.routing.ev;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class EncodedValueSerializerdeserializeEncodedValue_ObjectMappertreeToValueFikaTest {

    @Test
    public void testDeserializeEncodedValue() throws JsonProcessingException {
        EncodedValueSerializer serializer = new EncodedValueSerializer();
        
        String serializedEncodedValue = "{\"className\":\"com.graphhopper.routing.ev.SimpleBooleanEncodedValue\",\"name\":\"test\"}";
        
        EncodedValueSerializer.deserializeEncodedValue(serializedEncodedValue);
    }
}

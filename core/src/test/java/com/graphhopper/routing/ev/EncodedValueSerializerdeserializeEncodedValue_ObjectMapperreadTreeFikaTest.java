package com.graphhopper.routing.ev;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class EncodedValueSerializerdeserializeEncodedValue_ObjectMapperreadTreeFikaTest {

    @Test
    public void testDeserializeEncodedValue() throws JsonProcessingException {
        String serializedEncodedValue = "{\"className\":\"com.graphhopper.routing.ev.DecimalEncodedValueImpl\",\"name\":\"test\",\"bits\":4,\"min_storable_value\":0.0,\"max_storable_value\":10.0,\"factor\":1.0,\"store_two_directions\":false}";
        EncodedValueSerializer.deserializeEncodedValue(serializedEncodedValue);
    }
}

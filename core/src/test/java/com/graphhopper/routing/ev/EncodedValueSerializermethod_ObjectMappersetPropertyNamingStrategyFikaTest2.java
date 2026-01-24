package com.graphhopper.routing.ev;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.junit.jupiter.api.Test;

public class EncodedValueSerializermethod_ObjectMappersetPropertyNamingStrategyFikaTest2 {

    @Test
    public void testDeserializeEncodedValueTriggersStaticInitializer() throws JsonProcessingException {
        EncodedValueSerializer serializer = new EncodedValueSerializer();
        
        String serializedEncodedValue = "{\"className\":\"com.graphhopper.routing.ev.SimpleBooleanEncodedValue\",\"name\":\"test\",\"bits\":1,\"min_storable_value\":0,\"max_storable_value\":1,\"max_value\":1,\"negate_reverse_direction\":false,\"store_two_directions\":false}";
        
        serializer.deserializeEncodedValue(serializedEncodedValue);
    }
}

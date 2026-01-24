package com.graphhopper.routing.ev;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class EncodedValueSerializermethod_ObjectMappersetVisibilityFikaTest2 {

    @Test
    public void testDeserializeEncodedValueTriggersStaticInitializer() {
        EncodedValueSerializer serializer = new EncodedValueSerializer();
        String json = "{\"className\":\"com.graphhopper.routing.ev.DecimalEncodedValueImpl\",\"bits\":32,\"min_storable_value\":0.0,\"max_storable_value\":1.0,\"factor\":1.0}";
        serializer.deserializeEncodedValue(json);
    }
}

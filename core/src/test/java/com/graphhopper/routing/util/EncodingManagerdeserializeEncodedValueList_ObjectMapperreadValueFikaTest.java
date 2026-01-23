package com.graphhopper.routing.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.graphhopper.jackson.Jackson;
import com.graphhopper.routing.ev.EncodedValue;
import com.graphhopper.routing.ev.EncodedValueSerializer;
import com.graphhopper.routing.ev.VehicleSpeed;
import com.graphhopper.storage.Directory;
import com.graphhopper.storage.StorableProperties;
import com.graphhopper.util.Constants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.LinkedHashMap;

public class EncodingManagerdeserializeEncodedValueList_ObjectMapperreadValueFikaTest {

    @Test
    public void testFromPropertiesToObjectMapperReadValue() throws JsonProcessingException {
        StorableProperties mockProperties = Mockito.mock(StorableProperties.class);
        Directory mockDirectory = Mockito.mock(Directory.class);
        
        Mockito.when(mockProperties.containsVersion()).thenReturn(false);
        Mockito.when(mockProperties.get("graph.em.version")).thenReturn(String.valueOf(Constants.VERSION_EM));
        Mockito.when(mockProperties.get("graph.encoded_values")).thenReturn("[]");
        Mockito.when(mockProperties.get("graph.turn_encoded_values")).thenReturn("[]");
        Mockito.when(mockProperties.get("graph.em.bytes_for_flags")).thenReturn("4");
        Mockito.when(mockProperties.get("graph.em.ints_for_turn_cost_flags")).thenReturn("2");
        Mockito.when(mockProperties.getDirectory()).thenReturn(mockDirectory);
        Mockito.when(mockDirectory.getLocation()).thenReturn("/test/location");
        
        EncodingManager.fromProperties(mockProperties);
    }
}

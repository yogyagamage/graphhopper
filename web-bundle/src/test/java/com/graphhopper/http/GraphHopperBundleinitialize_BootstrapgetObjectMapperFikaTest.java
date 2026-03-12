package com.graphhopper.http;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import io.dropwizard.setup.Bootstrap;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GraphHopperBundleinitialize_BootstrapgetObjectMapperFikaTest {

    @Test
    public void testInitialize() {
        Bootstrap<?> bootstrapMock = Mockito.mock(Bootstrap.class);
        ObjectMapper objectMapperMock = Mockito.mock(ObjectMapper.class);
        
        when(bootstrapMock.getObjectMapper()).thenReturn(objectMapperMock);
        
        GraphHopperBundle bundle = new GraphHopperBundle();
        bundle.initialize(bootstrapMock);
    }
}

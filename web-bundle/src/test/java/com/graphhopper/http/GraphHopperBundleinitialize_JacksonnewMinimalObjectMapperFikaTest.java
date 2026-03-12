package com.graphhopper.http;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.graphhopper.jackson.Jackson;
import io.dropwizard.setup.Bootstrap;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GraphHopperBundleinitialize_JacksonnewMinimalObjectMapperFikaTest {

    @Test
    void test() {
        GraphHopperBundle bundle = new GraphHopperBundle();
        Bootstrap<?> bootstrap = Mockito.mock(Bootstrap.class);
        ObjectMapper mockMapper = Mockito.mock(ObjectMapper.class);
        
        Mockito.when(bootstrap.getObjectMapper()).thenReturn(mockMapper);
        Mockito.when(mockMapper.registerModule(Mockito.any(Module.class))).thenReturn(mockMapper);
        Mockito.when(mockMapper.setDateFormat(Mockito.any(StdDateFormat.class))).thenReturn(mockMapper);
        Mockito.when(mockMapper.enable(Mockito.any(MapperFeature.class))).thenReturn(mockMapper);
        
        bundle.initialize(bootstrap);
    }
}

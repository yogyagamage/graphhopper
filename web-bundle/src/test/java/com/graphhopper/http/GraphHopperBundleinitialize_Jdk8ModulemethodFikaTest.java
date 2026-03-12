package com.graphhopper.http;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import io.dropwizard.setup.Bootstrap;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GraphHopperBundleinitialize_Jdk8ModulemethodFikaTest {

    @Test
    void test() {
        GraphHopperBundle bundle = new GraphHopperBundle();
        Bootstrap<?> bootstrap = Mockito.mock(Bootstrap.class);
        ObjectMapper objectMapper = Mockito.mock(ObjectMapper.class);
        
        Mockito.when(bootstrap.getObjectMapper()).thenReturn(objectMapper);
        
        bundle.initialize(bootstrap);
    }
}

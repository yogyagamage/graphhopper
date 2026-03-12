package com.graphhopper.resources;

import com.codahale.metrics.health.HealthCheckRegistry;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.ws.rs.core.Response;

public class HealthCheckResourcedoGet_HealthCheckRegistryrunHealthChecksFikaTest {

    @Test
    public void testDoGet() {
        HealthCheckRegistry mockRegistry = Mockito.mock(HealthCheckRegistry.class);
        Mockito.when(mockRegistry.runHealthChecks()).thenReturn(new java.util.TreeMap<>());
        
        HealthCheckResource resource = new HealthCheckResource(mockRegistry);
        Response response = resource.doGet();
    }
}

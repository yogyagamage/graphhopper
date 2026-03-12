package com.graphhopper.resources;

import com.codahale.metrics.health.HealthCheck;
import com.codahale.metrics.health.HealthCheckRegistry;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.ws.rs.core.Response;
import java.util.SortedMap;
import java.util.TreeMap;

class HealthCheckResourcedoGet_ResponseokFikaTest {

    @Test
    void testDoGet() {
        HealthCheckRegistry registry = Mockito.mock(HealthCheckRegistry.class);
        
        HealthCheck.Result healthyResult = Mockito.mock(HealthCheck.Result.class);
        Mockito.when(healthyResult.isHealthy()).thenReturn(true);
        
        SortedMap<String, HealthCheck.Result> results = new TreeMap<>();
        results.put("testCheck", healthyResult);
        
        Mockito.when(registry.runHealthChecks()).thenReturn(results);
        
        HealthCheckResource resource = new HealthCheckResource(registry);
        resource.doGet();
    }
}

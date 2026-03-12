package com.graphhopper.http;

import com.graphhopper.GraphHopper;
import com.graphhopper.GraphHopperConfig;
import com.graphhopper.http.GraphHopperBundle;
import com.graphhopper.http.GraphHopperBundleConfiguration;
import com.graphhopper.http.health.GraphHopperHealthCheck;
import io.dropwizard.setup.Environment;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GraphHopperBundlerun_EnvironmenthealthChecksFikaTest {

    @Test
    void testRunCallsEnvironmentHealthChecks() {
        // Create mocks for dependencies
        GraphHopperBundleConfiguration configuration = mock(GraphHopperBundleConfiguration.class);
        Environment environment = mock(Environment.class);
        GraphHopperConfig graphHopperConfig = mock(GraphHopperConfig.class);
        GraphHopper graphHopper = mock(GraphHopper.class);
        io.dropwizard.lifecycle.setup.LifecycleEnvironment lifecycleEnvironment = mock(io.dropwizard.lifecycle.setup.LifecycleEnvironment.class);
        io.dropwizard.jersey.setup.JerseyEnvironment jerseyEnvironment = mock(io.dropwizard.jersey.setup.JerseyEnvironment.class);
        com.codahale.metrics.health.HealthCheckRegistry healthCheckRegistry = mock(com.codahale.metrics.health.HealthCheckRegistry.class);
        
        // Configure mocks
        when(configuration.getGraphHopperConfiguration()).thenReturn(graphHopperConfig);
        when(graphHopperConfig.has("gtfs.file")).thenReturn(false);
        when(environment.lifecycle()).thenReturn(lifecycleEnvironment);
        when(environment.jersey()).thenReturn(jerseyEnvironment);
        when(environment.healthChecks()).thenReturn(healthCheckRegistry);
        
        // Create GraphHopperManaged mock behavior
        com.graphhopper.http.GraphHopperManaged graphHopperManaged = mock(com.graphhopper.http.GraphHopperManaged.class);
        when(graphHopperManaged.getGraphHopper()).thenReturn(graphHopper);
        
        // Mock the GraphHopperManaged constructor call
        Mockito.mockConstruction(com.graphhopper.http.GraphHopperManaged.class, (mock, context) -> {
            when(mock.getGraphHopper()).thenReturn(graphHopper);
        });
        
        // Create instance and call entry point
        GraphHopperBundle bundle = new GraphHopperBundle();
        bundle.run(configuration, environment);
    }
}

package com.graphhopper;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GraphHopperresolveCustomAreas_JtsModulemethodFikaTest {

    @Test
    public void testResolveCustomAreasTriggersJtsModuleConstructor() throws IOException {
        // Create a temporary directory for custom areas
        Path tempDir = Files.createTempDirectory("custom-areas-test");
        Path tempFile = tempDir.resolve("test.geojson");
        
        // Create a minimal valid GeoJSON file
        String geojson = "{\"type\":\"FeatureCollection\",\"features\":[]}";
        Files.write(tempFile, geojson.getBytes());
        
        // Instantiate GraphHopper using the provided constructor
        GraphHopper graphHopper = new GraphHopper();
        
        // Call the entry point method with the temporary directory path
        // This will trigger the JtsModule constructor inside resolveCustomAreas
        graphHopper.resolveCustomAreas(tempDir.toString());
        
        // Clean up
        Files.deleteIfExists(tempFile);
        Files.deleteIfExists(tempDir);
    }
}

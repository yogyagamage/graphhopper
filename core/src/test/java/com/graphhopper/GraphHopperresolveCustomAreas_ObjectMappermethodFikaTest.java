package com.graphhopper;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GraphHopperresolveCustomAreas_ObjectMappermethodFikaTest {

    @Test
    public void testResolveCustomAreas() throws IOException {
        // Create a temporary directory to simulate custom areas directory
        Path tempDir = Files.createTempDirectory("customAreasTest");
        try {
            // Create a dummy JSON file to ensure directory is not empty
            Path dummyFile = tempDir.resolve("test.geojson");
            Files.writeString(dummyFile, "{\"type\":\"FeatureCollection\",\"features\":[]}");
            
            // Instantiate GraphHopper using the provided constructor
            GraphHopper graphHopper = new GraphHopper();
            
            // Call the entry point method with the temporary directory path
            // This should trigger the ObjectMapper constructor in the call chain
            graphHopper.resolveCustomAreas(tempDir.toString());
        } finally {
            // Clean up temporary directory
            Files.walk(tempDir)
                 .sorted((a, b) -> -a.compareTo(b))
                 .forEach(path -> {
                     try {
                         Files.delete(path);
                     } catch (IOException e) {
                         // Ignore cleanup errors
                     }
                 });
        }
    }
}

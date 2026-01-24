package com.graphhopper;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GraphHopperresolveCustomAreas_ObjectMapperregisterModuleFikaTest {

    @Test
    public void testResolveCustomAreas() throws IOException {
        // Create a temporary directory that exists
        Path tempDir = Files.createTempDirectory("customAreasTest");
        tempDir.toFile().deleteOnExit();
        
        // Create a dummy JSON file in the directory to ensure the directory stream is not empty
        Path dummyFile = tempDir.resolve("test.geojson");
        Files.writeString(dummyFile, "{\"type\":\"FeatureCollection\",\"features\":[]}");
        
        // Instantiate GraphHopper using the provided constructor
        GraphHopper graphHopper = new GraphHopper();
        
        // Set the customAreasDirectory field to the temporary directory path
        // Since customAreasDirectory is private, we need to use reflection to set it
        try {
            java.lang.reflect.Field field = GraphHopper.class.getDeclaredField("customAreasDirectory");
            field.setAccessible(true);
            field.set(graphHopper, tempDir.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        // Call the entry point method
        // This will traverse the path and invoke ObjectMapper.registerModule(new JtsModule())
        graphHopper.resolveCustomAreas(tempDir.toString());
        
        // Clean up
        Files.deleteIfExists(dummyFile);
        Files.deleteIfExists(tempDir);
    }
}

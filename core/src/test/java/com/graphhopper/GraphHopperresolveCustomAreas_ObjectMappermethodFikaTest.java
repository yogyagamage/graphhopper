package com.graphhopper;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.mockito.Mockito.mock;

public class GraphHopperresolveCustomAreas_ObjectMappermethodFikaTest {

    @Test
    public void testResolveCustomAreas() throws IOException {
        // Create a temporary directory to simulate custom areas directory
        Path tempDir = Files.createTempDirectory("customAreasTest");
        Path tempFile = Files.createFile(tempDir.resolve("test.geojson"));
        Files.write(tempFile, "{\"type\":\"FeatureCollection\",\"features\":[]}".getBytes());

        // Create instance using the provided constructor
        GraphHopper graphHopper = new GraphHopper();
        
        // Set the customAreasDirectory field to point to our temporary directory
        // Since customAreasDirectory is private, we need to use reflection
        try {
            java.lang.reflect.Field field = GraphHopper.class.getDeclaredField("customAreasDirectory");
            field.setAccessible(true);
            field.set(graphHopper, tempDir.toString());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // Call the entry point method - this should trigger ObjectMapper constructor
        GraphHopper.resolveCustomAreas(tempDir.toString());

        // Clean up
        Files.delete(tempFile);
        Files.delete(tempDir);
    }
}

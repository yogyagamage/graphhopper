package com.graphhopper;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GraphHopperresolveCustomAreas_ObjectMappermethodFikaTest {

    @Test
    public void testResolveCustomAreas() throws IOException {
        // Create a temporary directory for custom areas
        Path tempDir = Files.createTempDirectory("custom_areas_test");
        Path jsonFile = tempDir.resolve("test.geojson");
        
        // Create a minimal valid GeoJSON file
        String geojsonContent = "{\"type\":\"FeatureCollection\",\"features\":[]}";
        Files.write(jsonFile, geojsonContent.getBytes());
        
        // Instantiate GraphHopper using the provided constructor
        GraphHopper graphHopper = new GraphHopper();
        
        // Set the custom areas directory to trigger the ObjectMapper instantiation
        // We need to access the private field - using reflection since no setter is provided
        try {
            java.lang.reflect.Field field = GraphHopper.class.getDeclaredField("customAreasDirectory");
            field.setAccessible(true);
            field.set(graphHopper, tempDir.toString());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        
        // Call the entry point method - this should trigger ObjectMapper.<init>()
        GraphHopper.resolveCustomAreas(tempDir.toString());
        
        // Clean up
        Files.delete(jsonFile);
        Files.delete(tempDir);
    }
}

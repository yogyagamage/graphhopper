package com.graphhopper;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphhopper.util.JsonFeatureCollection;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GraphHopperresolveCustomAreas_ObjectMapperregisterModuleFikaTest {

    @Test
    public void testResolveCustomAreas() throws IOException {
        // Create a temporary directory that exists
        Path tempDir = Files.createTempDirectory("customAreasTest");
        
        // Create an empty JSON file in the directory to ensure the directory stream is not empty
        Path jsonFile = tempDir.resolve("test.geojson");
        Files.writeString(jsonFile, "{\"type\":\"FeatureCollection\",\"features\":[]}");
        
        // Instantiate GraphHopper using the provided constructor
        GraphHopper graphHopper = new GraphHopper();
        
        // Set the customAreasDirectory field to the temporary directory path
        // Since there's no setter, we need to use reflection to set the private field
        try {
            java.lang.reflect.Field field = GraphHopper.class.getDeclaredField("customAreasDirectory");
            field.setAccessible(true);
            field.set(graphHopper, tempDir.toString());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        
        // Call the entry point method
        // This should trigger the ObjectMapper.registerModule call in the method
        JsonFeatureCollection result = graphHopper.resolveCustomAreas(tempDir.toString());
        
        // Clean up
        Files.delete(jsonFile);
        Files.delete(tempDir);
    }
}

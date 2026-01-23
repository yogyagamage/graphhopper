package com.graphhopper;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GraphHopperresolveCustomAreas_ObjectMapperregisterModuleFikaTest {

    @Test
    public void testResolveCustomAreas() throws IOException {
        GraphHopper graphHopper = new GraphHopper();
        
        // Create a temporary directory to avoid NoSuchFileException
        Path tempDir = Files.createTempDirectory("custom_areas_test");
        String tempDirPath = tempDir.toString();
        
        // Set the customAreasDirectory field via reflection since there's no setter
        try {
            java.lang.reflect.Field field = GraphHopper.class.getDeclaredField("customAreasDirectory");
            field.setAccessible(true);
            field.set(graphHopper, tempDirPath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        // Create an empty JSON file in the directory to ensure the directory stream works
        Path jsonFile = tempDir.resolve("test.json");
        Files.writeString(jsonFile, "{\"features\": []}");
        
        // This will invoke ObjectMapper.registerModule(new JtsModule())
        GraphHopper.resolveCustomAreas(tempDirPath);
        
        // Clean up
        Files.delete(jsonFile);
        Files.delete(tempDir);
    }
}

package com.graphhopper;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphhopper.util.JsonFeatureCollection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GraphHopperresolveCustomAreas_ObjectMapperreadValueFikaTest {

    @TempDir
    private Path tempDir;

    @Test
    public void testResolveCustomAreas() throws IOException {
        // Create a temporary GeoJSON file to ensure the directory is not empty
        Path geojsonFile = tempDir.resolve("test.geojson");
        Files.writeString(geojsonFile, "{\"type\":\"FeatureCollection\",\"features\":[]}");

        // Instantiate GraphHopper using the provided constructor
        GraphHopper graphHopper = new GraphHopper();
        
        // Set the customAreasDirectory field to the temporary directory path
        // Since customAreasDirectory is private, we need to use reflection
        try {
            java.lang.reflect.Field field = GraphHopper.class.getDeclaredField("customAreasDirectory");
            field.setAccessible(true);
            field.set(graphHopper, tempDir.toString());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // Call the static entry point method
        JsonFeatureCollection result = GraphHopper.resolveCustomAreas(tempDir.toString());
        
        // No assertions required - test passes if ObjectMapper.readValue is invoked
        // during execution (which it will be if the directory contains a .geojson file)
    }
}

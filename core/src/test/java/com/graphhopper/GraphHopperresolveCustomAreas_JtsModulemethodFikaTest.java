package com.graphhopper;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphhopper.util.JsonFeatureCollection;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GraphHopperresolveCustomAreas_JtsModulemethodFikaTest {

    @Test
    public void testResolveCustomAreas() throws IOException {
        GraphHopper graphHopper = new GraphHopper();
        
        // Create a temporary directory for custom areas
        Path tempDir = Files.createTempDirectory("custom_areas_test");
        Path geojsonFile = tempDir.resolve("test.geojson");
        
        // Write a minimal valid GeoJSON to the file
        String minimalGeoJson = "{\"type\":\"FeatureCollection\",\"features\":[]}";
        Files.write(geojsonFile, minimalGeoJson.getBytes());
        
        // Call the entry point method which should trigger JtsModule constructor
        JsonFeatureCollection result = graphHopper.resolveCustomAreas(tempDir.toString());
        
        // Clean up
        Files.deleteIfExists(geojsonFile);
        Files.deleteIfExists(tempDir);
    }
}

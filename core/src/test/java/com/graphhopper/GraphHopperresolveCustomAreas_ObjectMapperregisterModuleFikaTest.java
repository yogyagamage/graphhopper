package com.graphhopper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class GraphHopperresolveCustomAreas_ObjectMapperregisterModuleFikaTest {
    
    @TempDir
    Path tempDir;
    
    @Test
    public void testResolveCustomAreas() throws IOException {
        // Create a valid GeoJSON file to trigger the ObjectMapper.registerModule call
        String geoJsonContent = "{\"type\":\"FeatureCollection\",\"features\":[]}";
        Path geoJsonFile = tempDir.resolve("areas.geojson");
        Files.writeString(geoJsonFile, geoJsonContent);
        
        // Invoke the entry point method with the temporary directory path
        GraphHopper.resolveCustomAreas(tempDir.toString());
    }
}

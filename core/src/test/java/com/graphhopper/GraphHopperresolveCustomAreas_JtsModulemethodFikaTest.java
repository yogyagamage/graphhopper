package com.graphhopper;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GraphHopperresolveCustomAreas_JtsModulemethodFikaTest {

    @Test
    public void testResolveCustomAreasTriggersJtsModuleConstructor() throws IOException {
        // Create a temporary directory for custom areas
        Path tempDir = Files.createTempDirectory("custom-areas-test");
        
        // Create a minimal valid GeoJSON file to ensure the directory is not empty
        String minimalGeoJson = """
            {
                "type": "FeatureCollection",
                "features": []
            }
            """;
        Path geoJsonFile = tempDir.resolve("areas.geojson");
        Files.writeString(geoJsonFile, minimalGeoJson);
        
        try {
            // Call the static entry point method with the temporary directory path
            GraphHopper.resolveCustomAreas(tempDir.toString());
        } finally {
            // Clean up temporary directory
            Files.deleteIfExists(geoJsonFile);
            Files.deleteIfExists(tempDir);
        }
    }
}

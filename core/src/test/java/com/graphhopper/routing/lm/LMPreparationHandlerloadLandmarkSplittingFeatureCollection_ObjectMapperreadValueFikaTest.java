package com.graphhopper.routing.lm;

import com.graphhopper.GraphHopperConfig;
import com.graphhopper.config.LMProfile;
import com.graphhopper.util.PMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LMPreparationHandlerloadLandmarkSplittingFeatureCollection_ObjectMapperreadValueFikaTest {

    @TempDir
    Path tempDir;

    @Test
    public void test() throws IOException {
        File geoJsonFile = tempDir.resolve("test.geojson").toFile();
        try (FileWriter writer = new FileWriter(geoJsonFile)) {
            writer.write("{\"type\":\"FeatureCollection\",\"features\":[]}");
        }

        GraphHopperConfig ghConfig = mock(GraphHopperConfig.class);
        when(ghConfig.has("prepare.lm.weightings")).thenReturn(false);
        when(ghConfig.getInt("prepare.lm.threads", 1)).thenReturn(1);
        when(ghConfig.getLMProfiles()).thenReturn(Arrays.asList(new LMProfile("car")));
        when(ghConfig.getInt("prepare.lm.landmark_count", 16)).thenReturn(16);
        when(ghConfig.getBool("prepare.lm.log_details", false)).thenReturn(false);
        when(ghConfig.getInt("prepare.lm.min_network_size", -1)).thenReturn(-1);
        when(ghConfig.getString("prepare.lm.suggestions_location", "")).thenReturn("");
        when(ghConfig.getString("prepare.lm.split_area_location", "")).thenReturn(geoJsonFile.getAbsolutePath());

        LMPreparationHandler handler = new LMPreparationHandler();
        handler.init(ghConfig);
    }
}

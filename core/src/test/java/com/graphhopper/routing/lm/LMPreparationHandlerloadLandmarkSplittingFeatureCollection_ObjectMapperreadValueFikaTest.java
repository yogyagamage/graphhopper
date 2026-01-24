package com.graphhopper.routing.lm;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphhopper.GraphHopperConfig;
import com.graphhopper.config.LMProfile;
import com.graphhopper.util.JsonFeatureCollection;
import com.graphhopper.util.Parameters;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class LMPreparationHandlerloadLandmarkSplittingFeatureCollection_ObjectMapperreadValueFikaTest {

    @Test
    public void testInitTriggersLoadLandmarkSplittingFeatureCollectionAndObjectMapperReadValue() {
        GraphHopperConfig mockConfig = Mockito.mock(GraphHopperConfig.class);
        
        Mockito.when(mockConfig.has("prepare.lm.weightings")).thenReturn(false);
        Mockito.when(mockConfig.getInt(Parameters.Landmark.PREPARE + "threads", 1)).thenReturn(1);
        Mockito.when(mockConfig.getLMProfiles()).thenReturn(Arrays.asList(new LMProfile("car")));
        Mockito.when(mockConfig.getInt(Parameters.Landmark.COUNT, 16)).thenReturn(16);
        Mockito.when(mockConfig.getBool(Parameters.Landmark.PREPARE + "log_details", false)).thenReturn(false);
        Mockito.when(mockConfig.getInt(Parameters.Landmark.PREPARE + "min_network_size", -1)).thenReturn(-1);
        Mockito.when(mockConfig.getString(Parameters.Landmark.PREPARE + "suggestions_location", ""))
                .thenReturn("");
        Mockito.when(mockConfig.getString(Parameters.Landmark.PREPARE + "split_area_location", ""))
                .thenReturn("");
        
        LMPreparationHandler handler = new LMPreparationHandler();
        handler.init(mockConfig);
    }
}

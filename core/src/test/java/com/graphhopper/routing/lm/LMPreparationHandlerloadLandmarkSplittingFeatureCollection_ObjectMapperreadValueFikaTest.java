package com.graphhopper.routing.lm;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphhopper.GraphHopperConfig;
import com.graphhopper.config.LMProfile;
import com.graphhopper.util.Parameters;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class LMPreparationHandlerloadLandmarkSplittingFeatureCollection_ObjectMapperreadValueFikaTest {

    @Test
    public void testInitCallsLoadLandmarkSplittingFeatureCollectionCallsObjectMapperReadValue() {
        GraphHopperConfig ghConfig = Mockito.mock(GraphHopperConfig.class);
        
        Mockito.when(ghConfig.has("prepare.lm.weightings")).thenReturn(false);
        Mockito.when(ghConfig.getInt(Parameters.Landmark.PREPARE + "threads", 1)).thenReturn(1);
        Mockito.when(ghConfig.getLMProfiles()).thenReturn(Arrays.asList(new LMProfile("car")));
        Mockito.when(ghConfig.getInt(Parameters.Landmark.COUNT, 16)).thenReturn(16);
        Mockito.when(ghConfig.getBool(Parameters.Landmark.PREPARE + "log_details", false)).thenReturn(false);
        Mockito.when(ghConfig.getInt(Parameters.Landmark.PREPARE + "min_network_size", -1)).thenReturn(-1);
        Mockito.when(ghConfig.getString(Parameters.Landmark.PREPARE + "suggestions_location", "")).thenReturn("");
        Mockito.when(ghConfig.getString(Parameters.Landmark.PREPARE + "split_area_location", "")).thenReturn("");
        
        LMPreparationHandler handler = new LMPreparationHandler();
        handler.init(ghConfig);
    }
}

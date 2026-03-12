package com.graphhopper.routing.lm;

import com.graphhopper.GraphHopperConfig;
import com.graphhopper.config.LMProfile;
import com.graphhopper.util.Parameters;
import com.graphhopper.util.Parameters.Landmark;
import org.junit.jupiter.api.Test;

import java.util.*;

public class LMPreparationHandlerloadLandmarkSplittingFeatureCollection_ObjectMapperreadValueFikaTest {

    @Test
    public void testInitCallsLoadLandmarkSplittingFeatureCollectionCallsReadValue() {
        LMPreparationHandler handler = new LMPreparationHandler();
        
        GraphHopperConfig ghConfig = new GraphHopperConfig();
        ghConfig.putObject(Parameters.Landmark.PREPARE + "threads", 1);
        ghConfig.putObject(Parameters.Landmark.COUNT, 16);
        ghConfig.putObject(Landmark.PREPARE + "log_details", false);
        ghConfig.putObject(Landmark.PREPARE + "min_network_size", -1);
        ghConfig.putObject(Landmark.PREPARE + "suggestions_location", "");
        ghConfig.putObject(Landmark.PREPARE + "split_area_location", "");
        
        List<LMProfile> lmProfiles = new ArrayList<>();
        LMProfile profile = new LMProfile("car");
        lmProfiles.add(profile);
        ghConfig.setLMProfiles(lmProfiles);
        
        handler.init(ghConfig);
    }
}

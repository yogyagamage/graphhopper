package com.graphhopper.routing.lm;

import com.graphhopper.GraphHopperConfig;
import com.graphhopper.config.LMProfile;
import com.graphhopper.util.Parameters;
import com.graphhopper.util.Parameters.Landmark;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LMPreparationHandlerinit_GraphHopperConfiggetBoolFikaTest {

    @Test
    void test() {
        LMPreparationHandler handler = new LMPreparationHandler();
        
        GraphHopperConfig config = new GraphHopperConfig();
        
        // Set up config to avoid exceptions and reach the target method call
        // The init method checks for deprecated config "prepare.lm.weightings"
        // We need to ensure it doesn't have that key to avoid IllegalStateException
        
        // The init method calls getLMProfiles() which returns a List<LMProfile>
        // We'll set up the config to return an empty list
        List<LMProfile> emptyList = new ArrayList<>();
        config.putObject("profiles_lm", emptyList);
        
        // The init method calls getInt for "prepare.lm.threads" with default getPreparationThreads()
        // We'll set a value to avoid any issues
        config.putObject("prepare.lm.threads", 1);
        
        // The init method calls getInt for "prepare.lm.count" with default landmarkCount
        config.putObject("prepare.lm.count", 16);
        
        // The init method calls getBool for "prepare.lm.log_details" with default false
        // This is our target method call - we need to ensure it gets called
        // We'll set a value so the method executes normally
        config.putObject("prepare.lm.log_details", false);
        
        // The init method calls getInt for "prepare.lm.min_network_size" with default -1
        config.putObject("prepare.lm.min_network_size", -1);
        
        // The init method calls getString for "prepare.lm.suggestions_location" with default ""
        config.putObject("prepare.lm.suggestions_location", "");
        
        // The init method calls getString for "prepare.lm.split_area_location" with default ""
        config.putObject("prepare.lm.split_area_location", "");
        
        // Call the entry point method
        handler.init(config);
    }
}

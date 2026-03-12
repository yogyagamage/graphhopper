package com.graphhopper.routing.ch;

import com.graphhopper.GraphHopperConfig;
import com.graphhopper.config.CHProfile;
import com.graphhopper.util.PMap;
import com.graphhopper.util.Parameters;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class CHPreparationHandlerinit_GraphHopperConfiggetIntFikaTest {

    @Test
    public void testInitCallsGetInt() {
        GraphHopperConfig ghConfig = new GraphHopperConfig();
        PMap pMap = new PMap();
        pMap.putObject(Parameters.CH.PREPARE + "threads", 2);
        ghConfig.putObject("profiles_ch", Collections.emptyList());
        
        CHPreparationHandler handler = new CHPreparationHandler();
        handler.init(ghConfig);
    }
}

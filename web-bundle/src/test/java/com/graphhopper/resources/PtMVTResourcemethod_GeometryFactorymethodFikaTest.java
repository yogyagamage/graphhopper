package com.graphhopper.resources;

import com.graphhopper.GraphHopper;
import com.graphhopper.gtfs.GtfsStorage;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class PtMVTResourcemethod_GeometryFactorymethodFikaTest {

    @Test
    public void testEntryPointToThirdPartyMethod() throws IOException {
        GraphHopper graphHopper = Mockito.mock(GraphHopper.class);
        GtfsStorage gtfsStorage = Mockito.mock(GtfsStorage.class);
        
        PtMVTResource ptMVTResource = new PtMVTResource(graphHopper, gtfsStorage);
    }
}

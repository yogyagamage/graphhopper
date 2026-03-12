package com.graphhopper.resources;

import com.graphhopper.GraphHopper;
import com.graphhopper.GraphHopperConfig;
import com.graphhopper.config.Profile;
import com.graphhopper.routing.ev.*;
import com.graphhopper.routing.util.EncodingManager;
import com.graphhopper.storage.BaseGraph;
import com.graphhopper.storage.StorableProperties;
import com.graphhopper.util.shapes.BBox;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.mockito.Mockito.when;

public class InfoResourcegetInfo_EnvelopemethodFikaTest {

    @Test
    public void testGetInfoTriggersEnvelopeConstructor() {
        // Mock dependencies for InfoResource constructor
        GraphHopperConfig config = Mockito.mock(GraphHopperConfig.class);
        GraphHopper graphHopper = Mockito.mock(GraphHopper.class);
        EncodingManager encodingManager = Mockito.mock(EncodingManager.class);
        BaseGraph baseGraph = Mockito.mock(BaseGraph.class);
        StorableProperties properties = Mockito.mock(StorableProperties.class);
        
        // Setup config.getProfiles()
        List<Profile> profiles = Collections.singletonList(new Profile("car"));
        when(config.getProfiles()).thenReturn(profiles);
        
        // Setup config.getString() for privateEV
        when(config.getString("graph.encoded_values.private", "")).thenReturn("");
        
        // Setup config.has() for GTFS check
        when(config.has("gtfs.file")).thenReturn(false);
        
        // Setup graphHopper.getEncodingManager()
        when(graphHopper.getEncodingManager()).thenReturn(encodingManager);
        
        // Setup graphHopper.getBaseGraph()
        when(graphHopper.getBaseGraph()).thenReturn(baseGraph);
        
        // Setup graphHopper.getProperties()
        when(graphHopper.getProperties()).thenReturn(properties);
        
        // Setup baseGraph.getBounds()
        BBox bounds = new BBox(9.0, 10.0, 48.0, 49.0);
        when(baseGraph.getBounds()).thenReturn(bounds);
        
        // Setup encodingManager.getEncodedValues()
        List<EncodedValue> encodedValues = new ArrayList<>();
        // Add a BooleanEncodedValue to ensure the loop processes something
        BooleanEncodedValue booleanEncodedValue = Mockito.mock(BooleanEncodedValue.class);
        when(booleanEncodedValue.getName()).thenReturn("test_bool");
        encodedValues.add(booleanEncodedValue);
        when(encodingManager.getEncodedValues()).thenReturn(encodedValues);
        
        // Setup encodingManager.hasEncodedValue() for privateEV check
        when(encodingManager.hasEncodedValue(Mockito.anyString())).thenReturn(false);
        
        // Setup properties.get() calls
        when(properties.get("datareader.import.date")).thenReturn("2024-01-01");
        when(properties.get("datareader.data.date")).thenReturn("2024-01-01");
        
        // Create InfoResource instance
        InfoResource infoResource = new InfoResource(config, graphHopper, true);
        
        // Call the entry point method - this should trigger Envelope constructor
        infoResource.getInfo();
    }
}

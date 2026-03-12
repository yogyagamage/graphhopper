package com.graphhopper.routing.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphhopper.routing.ev.*;
import com.graphhopper.routing.util.parsers.DefaultMaxSpeedParser;
import com.graphhopper.storage.DataAccess;
import com.graphhopper.storage.Directory;
import com.graphhopper.storage.Graph;
import com.graphhopper.util.EdgeIterator;
import com.graphhopper.util.EdgeIteratorState;
import com.graphhopper.util.StopWatch;
import de.westnordost.osm_legal_default_speeds.LegalDefaultSpeeds;
import de.westnordost.osm_legal_default_speeds.RoadType;
import de.westnordost.osm_legal_default_speeds.RoadTypeFilter;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

public class MaxSpeedCalculatorcreateLegalDefaultSpeeds_LegalDefaultSpeedsmethodFikaTest {

    @Test
    public void testCreateLegalDefaultSpeeds() {
        MaxSpeedCalculator calculator = new MaxSpeedCalculator(null);
        calculator.createLegalDefaultSpeeds();
    }
}

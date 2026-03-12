package com.graphhopper.routing.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphhopper.routing.ev.BooleanEncodedValue;
import com.graphhopper.routing.ev.DecimalEncodedValue;
import com.graphhopper.routing.ev.DecimalEncodedValueImpl;
import com.graphhopper.routing.ev.EdgeIntAccess;
import com.graphhopper.routing.ev.EncodedValue;
import com.graphhopper.routing.ev.EncodedValue.InitializerConfig;
import com.graphhopper.routing.ev.EnumEncodedValue;
import com.graphhopper.routing.ev.MaxSpeed;
import com.graphhopper.routing.ev.MaxSpeedEstimated;
import com.graphhopper.routing.ev.UrbanDensity;
import com.graphhopper.routing.util.MaxSpeedCalculator.RoadTypeFilterImpl;
import com.graphhopper.routing.util.MaxSpeedCalculator.RoadTypeImpl;
import com.graphhopper.routing.util.MaxSpeedCalculator.SpeedLimitsJson;
import com.graphhopper.routing.util.parsers.DefaultMaxSpeedParser;
import com.graphhopper.routing.util.parsers.TagParser;
import com.graphhopper.storage.DataAccess;
import com.graphhopper.storage.Directory;
import com.graphhopper.storage.Graph;
import com.graphhopper.util.EdgeIterator;
import com.graphhopper.util.EdgeIteratorState;
import com.graphhopper.util.StopWatch;
import de.westnordost.osm_legal_default_speeds.LegalDefaultSpeeds;
import de.westnordost.osm_legal_default_speeds.RoadType;
import de.westnordost.osm_legal_default_speeds.RoadTypeFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;

public class MaxSpeedCalculatorcreateLegalDefaultSpeeds_ObjectMapperreadValueFikaTest {

    @Test
    public void testCreateLegalDefaultSpeeds() {
        MaxSpeedCalculator.createLegalDefaultSpeeds();
    }
}

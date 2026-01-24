package com.graphhopper.routing.util.parsers;

import com.graphhopper.reader.ReaderWay;
import com.graphhopper.routing.ev.Country;
import com.graphhopper.routing.ev.DecimalEncodedValue;
import com.graphhopper.routing.ev.EdgeIntAccess;
import com.graphhopper.routing.ev.State;
import com.graphhopper.storage.IntsRef;
import de.westnordost.osm_legal_default_speeds.LegalDefaultSpeeds;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class DefaultMaxSpeedParserfilter_LegalDefaultSpeedsisRelevantTagKeyFikaTest {

    @Test
    public void test() {
        // Create mock for LegalDefaultSpeeds (required for constructor)
        LegalDefaultSpeeds speedsMock = Mockito.mock(LegalDefaultSpeeds.class);
        
        // Create instance of class under test using constructor
        DefaultMaxSpeedParser parser = new DefaultMaxSpeedParser(speedsMock);
        
        // Create mock for DecimalEncodedValue (required for init)
        DecimalEncodedValue ruralEncMock = Mockito.mock(DecimalEncodedValue.class);
        DecimalEncodedValue urbanEncMock = Mockito.mock(DecimalEncodedValue.class);
        
        // Create mock for EdgeIntAccess (required for init)
        EdgeIntAccess edgeIntAccessMock = Mockito.mock(EdgeIntAccess.class);
        
        // Initialize parser with required fields
        parser.init(ruralEncMock, urbanEncMock, edgeIntAccessMock);
        
        // Create ReaderWay with necessary tags to trigger the path
        ReaderWay way = new ReaderWay(1L);
        Map<String, Object> tags = new HashMap<>();
        tags.put("country", Country.USA);
        tags.put("highway", "primary");
        way.setTags(tags);
        
        // Create IntsRef (empty relation flags)
        IntsRef relationFlags = new IntsRef(1);
        
        // Execute the entry point method
        parser.handleWayTags(123, edgeIntAccessMock, way, relationFlags);
    }
}

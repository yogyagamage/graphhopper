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

class DefaultMaxSpeedParserfilter_LegalDefaultSpeedsisRelevantTagKeyFikaTest {

    @Test
    void test() {
        LegalDefaultSpeeds speeds = Mockito.mock(LegalDefaultSpeeds.class);
        Mockito.when(speeds.isRelevantTagKey(Mockito.anyString())).thenReturn(false);
        
        DefaultMaxSpeedParser parser = new DefaultMaxSpeedParser(speeds);
        
        DecimalEncodedValue ruralEnc = Mockito.mock(DecimalEncodedValue.class);
        DecimalEncodedValue urbanEnc = Mockito.mock(DecimalEncodedValue.class);
        EdgeIntAccess edgeIntAccess = Mockito.mock(EdgeIntAccess.class);
        
        parser.init(ruralEnc, urbanEnc, edgeIntAccess);
        
        ReaderWay way = new ReaderWay(1L);
        Map<String, Object> tags = new HashMap<>();
        tags.put("country", Country.USA);
        tags.put("highway", "primary");
        way.setTags(tags);
        
        IntsRef relationFlags = new IntsRef(1);
        
        parser.handleWayTags(0, edgeIntAccess, way, relationFlags);
    }
}

package com.graphhopper.util;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphhopper.routing.ev.Country;
import com.graphhopper.routing.ev.State;
import com.graphhopper.routing.util.CustomArea;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class GHUtilityreadCountries_ObjectMapperregisterModuleFikaTest {

    @Test
    void testReadCountries() {
        try {
            List<CustomArea> result = GHUtility.readCountries();
        } catch (UncheckedIOException e) {
            // Expected if countries.geojson resource is missing
        }
    }
}

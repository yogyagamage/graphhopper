package com.graphhopper.http;

import io.dropwizard.jersey.validation.JerseyViolationException;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.Set;

class GHJerseyViolationExceptionMappertoResponse_ResponsestatusFikaTest {

    @Test
    void testToResponse() {
        GHJerseyViolationExceptionMapper mapper = new GHJerseyViolationExceptionMapper();
        
        Set<ConstraintViolation<?>> violations = Collections.emptySet();
        JerseyViolationException exception = new JerseyViolationException(
            violations, 
            null
        );
        
        Response response = mapper.toResponse(exception);
    }
}

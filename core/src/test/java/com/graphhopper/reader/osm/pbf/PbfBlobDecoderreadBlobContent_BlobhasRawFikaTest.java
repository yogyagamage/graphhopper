package com.graphhopper.reader.osm.pbf;

import com.graphhopper.reader.ReaderElement;
import com.graphhopper.reader.osm.SkipOptions;
import org.junit.jupiter.api.Test;
import org.openstreetmap.osmosis.osmbinary.Fileformat;
import java.util.ArrayList;
import java.util.List;

class PbfBlobDecoderreadBlobContent_BlobhasRawFikaTest {

    @Test
    void testRunToHasRaw() {
        // Create a real PbfBlobDecoderListener that does nothing
        PbfBlobDecoderListener listener = new NoOpPbfBlobDecoderListener();
        
        // Create raw blob data that will produce a Blob with hasRaw() == true
        // The blob must be parseable by Fileformat.Blob.parseFrom()
        // We'll create a minimal valid blob with raw data
        byte[] rawBlob = createRawBlobWithRawData();
        
        // Use SkipOptions that doesn't skip anything
        SkipOptions skipOptions = SkipOptions.none();
        
        // Create decoder for OSMHeader blob type to follow the path to readBlobContent()
        PbfBlobDecoder decoder = new PbfBlobDecoder(
            "OSMHeader", 
            rawBlob, 
            listener, 
            skipOptions
        );
        
        // Execute the entry point method
        decoder.run();
    }
    
    private byte[] createRawBlobWithRawData() {
        // Create a Blob with raw data using the protobuf API
        // This ensures Fileformat.Blob.parseFrom() succeeds and blob.hasRaw() returns true
        Fileformat.Blob.Builder blobBuilder = Fileformat.Blob.newBuilder();
        
        // Create raw data (minimal OSMHeader data)
        byte[] headerData = new byte[] {0x08, 0x00}; // Minimal valid HeaderBlock
        
        // Set raw data on the blob
        blobBuilder.setRaw(com.google.protobuf.ByteString.copyFrom(headerData));
        blobBuilder.setRawSize(headerData.length);
        
        // Build and serialize to bytes
        Fileformat.Blob blob = blobBuilder.build();
        return blob.toByteArray();
    }
    
    // Real implementation of PbfBlobDecoderListener that does nothing
    private static class NoOpPbfBlobDecoderListener implements PbfBlobDecoderListener {
        public void complete(List<ReaderElement> decodedEntities) {
            // No-op
        }
        
        public void error(Exception e) {
            // No-op
        }
    }
}

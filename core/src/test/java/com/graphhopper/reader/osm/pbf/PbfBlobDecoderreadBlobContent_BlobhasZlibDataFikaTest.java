package com.graphhopper.reader.osm.pbf;

import com.graphhopper.reader.osm.SkipOptions;
import org.junit.jupiter.api.Test;
import org.openstreetmap.osmosis.osmbinary.Fileformat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;

import static org.mockito.Mockito.mock;

public class PbfBlobDecoderreadBlobContent_BlobhasZlibDataFikaTest {

    @Test
    public void test() throws IOException {
        // Create a blob with zlib data to ensure hasZlibData() is called
        byte[] rawData = "test".getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        deflater.setInput(rawData);
        deflater.finish();
        byte[] buffer = new byte[1024];
        int compressedSize = deflater.deflate(buffer);
        deflater.end();
        
        byte[] zlibData = new byte[compressedSize];
        System.arraycopy(buffer, 0, zlibData, 0, compressedSize);
        
        Fileformat.Blob blob = Fileformat.Blob.newBuilder()
                .setZlibData(com.google.protobuf.ByteString.copyFrom(zlibData))
                .setRawSize(rawData.length)
                .build();
        
        byte[] rawBlob = blob.toByteArray();
        String blobType = "OSMHeader";
        PbfBlobDecoderListener listener = mock(PbfBlobDecoderListener.class);
        SkipOptions skipOptions = mock(SkipOptions.class);
        
        PbfBlobDecoder decoder = new PbfBlobDecoder(blobType, rawBlob, listener, skipOptions);
        decoder.run();
    }
}

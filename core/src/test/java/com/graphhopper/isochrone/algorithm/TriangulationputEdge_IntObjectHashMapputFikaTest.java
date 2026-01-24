package com.graphhopper.isochrone.algorithm;

import com.carrotsearch.hppc.IntObjectHashMap;
import org.locationtech.jts.triangulate.quadedge.QuadEdge;
import org.locationtech.jts.triangulate.quadedge.Vertex;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class TriangulationputEdge_IntObjectHashMapputFikaTest {

    @Test
    void testMakeTriangleTriggersPutEdgeAndIntObjectHashMapPut() {
        Triangulation triangulation = new Triangulation();
        
        Vertex v1 = new Vertex(0, 0);
        Vertex v2 = new Vertex(1, 0);
        Vertex v3 = new Vertex(0, 1);
        
        triangulation.vertices.put(1, v1);
        triangulation.vertices.put(2, v2);
        triangulation.vertices.put(3, v3);
        
        triangulation.makeTriangle(1, 2, 3);
    }
}

package com.azmisahin.component;

import org.junit.Test;
import static org.junit.Assert.*;

public class TraceTest {

    /**
     * Debug Test :-)
     */
    @Test 
    public void testTraceDebug()
    {
        String actual = Trace.Debug("Test");

        assertNotNull( actual );
    }

    /**
     * Info Test :-)
     */
    @Test
    public void testTraceInfo()
    {
        String actual = Trace.Info("Test");

        assertNotNull( actual );
    }    

    /**
     * Warning Test :-)
     */
    @Test
    public void testTraceWarning()
    {
        String actual = Trace.Warning("Test");

        assertNotNull( actual );
    }
    
    /**
     * Error Test :-)
     */
    @Test
    public void testTraceError()
    {
        String actual = Trace.Error("Test");

        assertNotNull( actual );
    }
}
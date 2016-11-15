package com.gmail.fandfisf.logget.aspect;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigourous Test :-)
     */
    @org.junit.Test
    public void testApp() {
        App app = new App();
        try {
            app.throwSomething(34);
        } catch (NullPointerException expected) {
            //Swallow
        }
    }
}

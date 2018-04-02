package co.edu.uniandes.Workshop7.Library;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test2  extends TestCase {

    protected void setUp() {
    }
    protected void tearDown() {
    }
    // there are normally many methods like this
    public void testX() {
        int result = 0*10;
        // assert statements
        Assert.assertEquals(0, result);
    }

    public void testX2() {
        int result = 0*10;
        // assert statements
        Assert.assertEquals(0, result);
    }
}

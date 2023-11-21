package net.codingdemon;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AnotherTestClass extends TestCase {

    public void testMethod1() {
        Assert.assertEquals(1, 1);
    }

    public void testMethod2() {
        Assert.assertFalse(false);
    }
}

package com.hujy.hellomaven;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testSayHello() {
        String result = new HelloWorld().sayHello();
        Assert.assertEquals("Hello Maven!", result);
    }
}

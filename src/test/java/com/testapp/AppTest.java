package com.testapp;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class AppTest {
    @BeforeClass
    public void setUp() {
       // Set up code
    }

    @Test(groups={"fast", "smoke"}, priority = 1)
    public void testAdd() {
        assertEquals(App.add(5.0, 4.0), 9.0, 0.0001);
    }

    @Test(groups={"slow"}, priority = 2)
    public void testMultiply() {
        assertEquals(App.multiply(5.0, 4.0), 20.0, 0.0001);
    }
}
package com.С;
import com.A.Main;
import com.B.HelloWorld;

import static org.junit.Assert.*;

public class main_test {
    @org.junit.Test public void testMainHelloWorld(){
        Main classUpperTest = new Main();
        HelloWorld classUpperTest2 = new HelloWorld();
        assertNotNull("app should have a greeting", classUpperTest.getGreeting());
        assertEquals(classUpperTest.getGreeting(), "hello world!");
        assertEquals(classUpperTest2.bigLetter(), "HELLO WORLD!");
    }
}

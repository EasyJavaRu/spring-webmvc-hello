package ru.easyjava.spring.webmvc.helloservlet;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HelloControllerTest {
    @Test
    public void testGreet() {
        HelloController tested = new HelloController();
        assertThat(tested.greet("TEST"), is("Hello, TEST"));
    }

    @Test
    public void testNull() {
        HelloController tested = new HelloController();
        assertThat(tested.greet(null), is("Hello, Anonymous"));
    }
}
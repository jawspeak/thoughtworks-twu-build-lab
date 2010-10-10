package com.thoughtworks.twu;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class HelloWorldTest {
    private ByteArrayOutputStream baos = new ByteArrayOutputStream();

    @Test
    public void shouldPrintNothing() {
        new HelloWorld(new PrintStream(baos)).run(Lists.<String>newArrayList());
        assertThat(baos.toString(), is(""));
    }

    @Test
    public void shouldPrintTwoElements() {
        new HelloWorld(new PrintStream(baos)).run(Lists.<String>newArrayList("one", "two"));
        assertThat(baos.toString(), is("one\ntwo\n"));
    }

    @Test
    public void shouldPrintFourElements() {
        new HelloWorld(new PrintStream(baos)).run(Lists.<String>newArrayList("one", "two", "three", "four"));
        assertThat(baos.toString(), is("one\ntwo\nthree\nfour\n"));
    }
}
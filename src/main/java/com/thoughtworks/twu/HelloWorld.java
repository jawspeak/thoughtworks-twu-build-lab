package com.thoughtworks.twu;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import java.io.PrintStream;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class HelloWorld {
    private final Predicate<String> displayer = new Predicate<String>() {
        public boolean apply(String each) {
            output.println(each);
            return true;
        }
    };
    
    private final java.io.PrintStream output;

    public HelloWorld(PrintStream out) {
        output = out;    
    }

    public static void main(String... args) {
        new HelloWorld(System.out).run(newArrayList(args));
    }

    public void run(List<String> args) {
        Iterables.all(args, displayer);
    }

}
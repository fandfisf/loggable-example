package com.gmail.fandfisf.logger.aspect;

import com.jcabi.aspects.Loggable;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    @Loggable (exceptionsAsError = true)
    public void throwSomething(int i) {
        throw new NullPointerException("Something was missing.");
    }
}

package com.example.demo.java.executorservice;

import java.util.concurrent.Callable;

public class ExecutorCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "WoooWWW!!!";
    }
}

package com.kamalhakim.strategy;

public class SepiaFilter implements Filter {
    @Override
    public void filter(String filename) {
        System.out.println("Applying sepia filter to" + filename);
    }
}

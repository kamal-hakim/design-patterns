package com.kamalhakim.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String filename) {
        System.out.println("Compressing " + filename + " to Jpeg");
    }
}

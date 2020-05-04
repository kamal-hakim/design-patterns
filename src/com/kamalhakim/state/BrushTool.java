package com.kamalhakim.state;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush tool");
    }

    @Override
    public void mouseUp() {
        System.out.println("Painting with brush");
    }
}

package com.kamalhakim;
import com.kamalhakim.state.Canvas;
import com.kamalhakim.state.BrushTool;
import com.kamalhakim.state.SelectionTool;

public class Main {

    public static void main(String[] args) {
	    Canvas canvas = new Canvas();
	    canvas.setCurrentTool(new BrushTool());
	    canvas.mouseDown();
	    canvas.mouseUp();

	    canvas.setCurrentTool(new SelectionTool());
	    canvas.mouseDown();
	    canvas.mouseUp();
    }
}

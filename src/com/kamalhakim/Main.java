package com.kamalhakim;
import com.kamalhakim.state.Canvas;
import com.kamalhakim.state.BrushTool;
import com.kamalhakim.state.SelectionTool;
import com.kamalhakim.strategy.ImageStorage;
import com.kamalhakim.strategy.JpegCompressor;
import com.kamalhakim.strategy.PngCompressor;
import com.kamalhakim.strategy.SepiaFilter;

public class Main {

    public static void main(String[] args) {
    	/* State pattern */
	    Canvas canvas = new Canvas();
	    canvas.setCurrentTool(new BrushTool());
	    canvas.mouseDown();
	    canvas.mouseUp();

	    canvas.setCurrentTool(new SelectionTool());
	    canvas.mouseDown();
	    canvas.mouseUp();

		/* State pattern end */

		/* Strategy pattern */

		ImageStorage imageStoreJpg = new ImageStorage(new JpegCompressor(), new SepiaFilter());
		imageStoreJpg.store("bird");

		ImageStorage imageStorePng = new ImageStorage(new PngCompressor(), new SepiaFilter());
		imageStorePng.store("apple");

		/* Stategy pattern end */
    }
}

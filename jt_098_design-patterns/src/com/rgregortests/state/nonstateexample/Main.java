package com.rgregortests.state.nonstateexample;

import com.rgregortests.state.Tool;

public class Main {
    public static void main(String[] args) {

        /*
        var canvas = new CanvasNonStatePattern();

        var tollType = ToolType.BRUSH;
        canvas.setCurrentTool(tollType);
        canvas.mouseDown();
        canvas.mouseUp();
        */

        // All from above with test function
        test(new CanvasNonStatePattern());
    }

    public static void test(CanvasNonStatePattern canvas) {

        for (ToolType tool : ToolType.values()) {
            System.out.println("");
            canvas.setCurrentTool(tool);
            canvas.mouseDown();
            canvas.mouseUp();
        }
    }
}

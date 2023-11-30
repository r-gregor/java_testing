package com.rgregortests.state;

public class EraserTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Erasor icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }
}

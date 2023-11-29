package com.rgregortests.polymorphism;

/* POLYMORPHISM */
public class Main {
    public static void main(String[] args) {
        drawUIControl2(new TextBox2());
        drawUIControl2(new Checkbox2());
    }

    public static void drawUIControl2(UIControl2 control2) {
        control2.draw();
    }
}

package xyz.turke1034.lifebuilder;

import processing.core.PApplet;

public class LifeBuilder extends PApplet {

    public static void main(String[] args) {
        PApplet.runSketch(new String[] {""}, new LifeBuilder());
    }

    @Override
    public void settings() {
        size(1080, 720, P2D);
    }

    @Override
    public void setup() {
        surface.setResizable(false);
    }

    @Override
    public void draw() {
        background(0);
    }
}

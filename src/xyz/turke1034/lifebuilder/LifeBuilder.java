package xyz.turke1034.lifebuilder;

import processing.core.PApplet;
import xyz.turke1034.lifebuilder.components.structure.Cell;

import java.util.ArrayList;
import java.util.Random;


public class LifeBuilder extends PApplet {

    public static final Random RAN = new Random();

    public static final int STEP_DURATION = 60;

    int stepProgress = STEP_DURATION;

    ArrayList<Cell> cells = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.runSketch(new String[] {""}, new LifeBuilder());
    }

    @Override
    public void settings() {
        size(1080, 720, P2D);
        fullScreen();
    }

    @Override
    public void setup() {
        surface.setSize(1080, 720);
        surface.setLocation(displayWidth / 2 - width / 2, displayHeight / 2 - height / 2);
        rectMode(CENTER);

         for (int i = 0; i < 50; i++) {
             cells.add(new Cell(RAN.nextInt(-100, 101), RAN.nextInt(-100, 101)));
         }
    }

    @Override
    public void draw() {
        background(0);
        translate(width / 2f, height / 2f);

        if (stepProgress == STEP_DURATION) {
            for (Cell cell : cells) {
                cell.act();
            }

            for (Cell cell : cells) {
                colorMode(HSB, 255);
                color(cell.hue, 255, 255);
                rect(cell.x * 5, cell.y * 5, 5, 5);
            }
        }
        else {
            stepProgress++;
        }
    }
}

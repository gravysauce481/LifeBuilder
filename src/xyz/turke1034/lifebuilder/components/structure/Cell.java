package xyz.turke1034.lifebuilder.components.structure;

import xyz.turke1034.lifebuilder.LifeBuilder;
import xyz.turke1034.lifebuilder.components.Instruction;

public class Cell {
    public int x, y;
    public int hue;
    public Instruction[] instructions = new Instruction[10];

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void act() {
        x += LifeBuilder.RAN.nextInt(-1, 2);
        y += LifeBuilder.RAN.nextInt(-1, 2);
    }
}

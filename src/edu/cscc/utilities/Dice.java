package edu.cscc.utilities;

public abstract class Dice {

    private int value;
    private int numOfSides;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    abstract int roll();
    abstract void clearValue();
}

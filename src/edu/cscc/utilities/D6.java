package edu.cscc.utilities;

public class D6 extends Dice {

    @Override
    int roll() {
        return 0;
    }

    @Override
    void clearValue() {
        System.out.println("Wiping value.");
        setValue(0);
    }
}

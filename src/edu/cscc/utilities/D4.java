package edu.cscc.utilities;

import java.util.Formatter;

/**
 * Class that simulates the roll of a 4-sided die.
 * @author Joshua S. Garrett
 * @version 1.0
 */
public class D4 extends Dice {

    private final int NUM_OF_SIDES = 4;

    D4() {
        System.out.println("Created a " + NUM_OF_SIDES + "-sided dice.");
    }

    /**
     * Returns the value rolled between 1-4
     * @return dice value
     */
    @Override
    int roll() {
        setValue((int)(Math.random() * NUM_OF_SIDES));
        switch (getValue()) {
            case 0:
                setValue(1);
                return getValue();
            case 1:
                setValue(2);
                return getValue();
            case 2:
                setValue(3);
                return getValue();
            case 3:
                setValue(4);
                return getValue();
            default:
                throw new IllegalStateException("Unexpected value: " + getValue());
        }
    }

    /**
     * Clears the dice's value by setting it to 0
     */
    @Override
    void clearValue() {
        System.out.println("Wiping value.");
        setValue(0);
    }
}

class diceTest {
    public static void main(String[] args) {
        D4 die = new D4();
        int count = 0;
        int numOf1s = 0;
        int numOf2s = 0;
        int numOf3s = 0;
        int numOf4s = 0;

        for (int i = 0; i < 50000; i++) {
            System.out.println("Rolling dice. Roll #" + count);
            System.out.println("We rolled a " + die.roll());
            if (die.getValue() == 1) {
                numOf1s++;
                die.clearValue();
            } else if (die.getValue() == 2) {
                numOf2s++;
                die.clearValue();
            } else if (die.getValue() == 3) {
                numOf3s++;
                die.clearValue();
            } else if (die.getValue() == 4) {
                numOf4s++;
                die.clearValue();
            }
            count++;
        }
        // Format output using formatter
        Formatter fmt = new Formatter();
        fmt.format("We rolled a total of %d times.%n", count);
        fmt.format("We rolled a total of %d 1's. Accounting for %%%.2f.%n", numOf1s, (((double)numOf1s / (double)count)* 100));
        fmt.format("We rolled a total of %d 2's. Accounting for %%%.2f.%n", numOf2s, (((double)numOf2s / (double)count)* 100));
        fmt.format("We rolled a total of %d 3's. Accounting for %%%.2f.%n", numOf3s, (((double)numOf3s / (double)count)* 100));
        fmt.format("We rolled a total of %d 4's. Accounting for %%%.2f.%n", numOf4s, (((double)numOf4s / (double)count)* 100));
        System.out.println(fmt);
    }
}
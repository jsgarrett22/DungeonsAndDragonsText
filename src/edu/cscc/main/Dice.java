package edu.cscc.main;

import java.util.Arrays;
import java.util.Collections;

public class Dice {

    public static int roll6() {
        int result = (int)(Math.random() * 6);
        switch (result) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            default:
                throw new IllegalStateException("Unexpected value: " + result);
        }
    }

    /** Rolls a six-sided die given the number of times and returns a sorted array containing each roll
     * */
    public static int[] rollMultiple6(int timesToRoll) {
        int[] rolls = new int[timesToRoll];
        for (int i=0; i < timesToRoll; i++) {
            rolls[i] = roll6();
        }
        Arrays.sort(rolls);
        return rolls;
    }

    /** Returns the sum of the lowest three rolls in a normally sorted array **/
    public static int lowestThree(int[] arrayOfRolls) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arrayOfRolls[i];
        }
        return sum;
    }

    /** Returns the sum of the highest three rolls in a reversed array**/
    public static int highestThree(int[] arrayOfRolls) {
        Integer[] highToLowArray = new Integer[arrayOfRolls.length];
        // Convert each int in the passed in array to an Integer wrapper
        for (int i = 0; i < arrayOfRolls.length; i++) {
            highToLowArray[i] = arrayOfRolls[i];
        }
        // Sort the array in descending order using the comparator
        Arrays.sort(highToLowArray, Collections.reverseOrder());

        // Sum the first three indices
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += highToLowArray[i];
        }
        return sum;
    }
}

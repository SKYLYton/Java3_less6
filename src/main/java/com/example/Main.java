package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ints = {
                4, 7, 5, 8, 6, 6
        };
        System.out.println(Arrays.toString(getArrayAfterFour(ints)));
    }

    public static boolean checkArray(int[] ints) {
        boolean isOne = false;
        boolean isFour = false;
        for (int anInt : ints) {

            if (anInt == 4) {
                isFour = true;
                continue;
            }

            if (anInt == 1) {
                isOne = true;
                continue;
            }

            return false;
        }

        return isOne && isFour;
    }

    public static int[] getArrayAfterFour(int[] ints) throws RuntimeException {
        int lastIndexFour = -1;
        for (int i = ints.length - 1; i >= 0; i--) {
            if (ints[i] == 4) {
                lastIndexFour = i + 1;
                break;
            }
        }

        if (lastIndexFour == -1) {
            throw new RuntimeException("The array does not contain 4");
        }

        int[] newInts = new int[ints.length - lastIndexFour];

        if (newInts.length >= 0) {
            System.arraycopy(ints, lastIndexFour, newInts, 0, newInts.length);
        }

        return newInts;
    }
}

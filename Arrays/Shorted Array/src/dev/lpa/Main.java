package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = getIntegers(5);

        int[] sortedArray = sortIntegers(unsortedArray);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int len) {

        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[len];
        boolean hasNextInt;
        for (int i = 0; i < len; i++) {
            hasNextInt = false;
            while (!hasNextInt) {
                hasNextInt = scanner.hasNextInt();
                if (hasNextInt) {
                    intArray[i] = scanner.nextInt();
                } else {
                    System.out.println("Ez nem egész, kérem újra!");
                }
                scanner.nextLine();
            }
        }

        return intArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
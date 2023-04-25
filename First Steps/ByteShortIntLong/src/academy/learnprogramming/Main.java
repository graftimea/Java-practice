package academy.learnprogramming;

public class Main {

    public static void main (String[] args) {

        int myValue = 10000;
        System.out.println(myValue);

        int myIntMinValue = Integer.MIN_VALUE;
        int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myIntMinValue);
        System.out.println("Integer Maximum Value = " + myIntMaxValue);
        System.out.println("Busted Max value = " + (myIntMaxValue + 1));
        System.out.println("Busted Min value = " + (myIntMinValue -1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myByteMinValue);
        System.out.println("Byte Maximum Value = " + myByteMaxValue);
        System.out.println("Busted Max value = " + (myByteMaxValue + 1));
        System.out.println("Busted Min value = " + (myByteMinValue -1));

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myShortMinValue);
        System.out.println("Short Maximum Value = " + myShortMaxValue);
        System.out.println("Busted Max value = " + (myShortMaxValue + 1));
        System.out.println("Busted Min value = " + (myShortMinValue - 1));

        long myLongValue = 100L;
        System.out.println(myLongValue);
        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myLongMinValue);
        System.out.println("Long Maximum Value = " + myLongMaxValue);
        System.out.println("Busted Max value = " + (myLongMaxValue + 1));
        System.out.println("Busted Min value = " + (myLongMinValue - 1));

        byte myNewByteValue = (byte) (myByteMinValue / 2);
    }
}

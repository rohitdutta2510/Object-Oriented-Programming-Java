package com.company;

public class Main {

    public static void main(String[] args) {

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + minIntValue);
        System.out.println("Integer maximum value = " + maxIntValue);
        System.out.println("Busted MAX value = " + (maxIntValue +1)); // Overflow
        System.out.println("Busted MIN value = " + (minIntValue -1)); // Underflow

        int maxIntTest = 2_147_483_647;

        System.out.println("Byte minimum value = " + Byte.MIN_VALUE);
        System.out.println("Byte maximum value = " + Byte.MAX_VALUE);

        System.out.println("Short minimum value = " + Short.MIN_VALUE);
        System.out.println("Short maximum value = " + Short.MAX_VALUE);

        long myLongValue = 100L;

        System.out.println("Long minimum value = " + Long.MIN_VALUE);
        System.out.println("Long maximum value = " + Long.MAX_VALUE);

        byte minByteValue = Byte.MIN_VALUE;
        byte newByteValue = (byte) (minByteValue/2); // type-casting
        System.out.println("Byte minimum value = " + minByteValue);
        
    }
}

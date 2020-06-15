package com.fenge;

public class Main007 {
    public static void main(String[] args) {
        System.out.println(new Main007().reverse(123));
    }

    public int reverse(int x) {
        boolean negativeFlag = false;
        if (x < 0) {
            negativeFlag = true;
            x = -1 * x;
        }
        long result = 0;
        while (x > 0) {
            int num = x % 10;
            result = result * 10 + num;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE) {
            return 0;
        }
        if (negativeFlag) {
            return (int) (-1 * result);
        }
        return (int) result;
    }
}

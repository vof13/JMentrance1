package com.company;

public class Calculator {

    private static int res;

    public static int calc(int a, int b, String sign){
        if (sign.equals("+")) res = a + b;
        if (sign.equals("-")) res = a - b;
        if (sign.equals("*")) res = a * b;
        if (sign.equals("/")) res = a / b;
        return res;
    }
}

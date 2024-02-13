package com.mastercode.Bootcamp1;

public class Operators {
    public static void main(String[] args) {
        // a,b,c, ---> ucbucagin terefleri

        int a = 10;
        int b = 20;
        int c = 30;

        int p = a + b + c;
        System.out.println("ucbucagin perimetri : " + p);

        // x ---> kvadratin bir terefi

        int x = 5;
        int s1 = x * x;
        int s2 = (int) Math.pow(x,2);
        System.out.println("kvadratin sahesi : " + s1);
        System.out.println("kvadratin sahesi : " + s2);



        int firstNum = 101;
        int secondNum = 10;
        int intResult = firstNum / secondNum;
        System.out.println(intResult);

        int qaliqNumber = firstNum % secondNum;
        System.out.println("qaliq Number : " + qaliqNumber);

        double doubleNumber = 1.123;
        float floatNumber = 4.123f;
        System.out.println("double Number : " + doubleNumber);
        System.out.println("float Number : " + floatNumber);

        double resultdouble = (double) firstNum /(double) secondNum;
        System.out.println("result double : " + resultdouble);

        int firstN =10;
        firstN = firstN - 3;
        System.out.println("First N = " + firstN);
        firstN += 3;
        System.out.println("first N: " + firstN);
        firstN++;
        System.out.println("first N = " + firstN);

        System.out.println("12 == 12 ? " + (12 == 12));
        System.out.println("12 == 11 ? " + (12 == 11));

        System.out.println("1 != 2  " + (1 != 2));





    }
}

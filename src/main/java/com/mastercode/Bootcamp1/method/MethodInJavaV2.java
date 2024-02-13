package com.mastercode.Bootcamp1.method;
// Ctrl + Alt + L   ---> Kodu seliqeye salir

public class MethodInJavaV2 {
    public static void main(String[] args) {
    //    sumV1();
    //    sumV1();
    //    sumV1();

    //    sumV2(1,2);
    //    sumV2(11,21);
    //    sumV2(1324,2345);
    //    sumV2(13567,25889);

        ededinkvadrati(5);
        ededinkvadrati(10);
        ededinkvadrati(20);


    }

    public static void sumV1 (){
        int firstNum = 1;
        int secondNum = 2;
        int Result = firstNum + secondNum;
        System.out.println("Sum = " + Result);

    }

    public static void sumV2(int firstNum, int secondNum){

        int Result = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + Result );

    }

    public static void ededinkvadrati(int number){
        System.out.println(number + "^" + 2 + " = " + (number * number));
    }
}

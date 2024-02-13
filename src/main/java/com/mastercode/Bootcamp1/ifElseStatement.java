package com.mastercode.Bootcamp1;

public class ifElseStatement {
    public static void main(String[] args) {

        boolean isOnline = true;

        if(isOnline == true) {
            System.out.println("we are online !!! ");
        }else {
            System.out.println(" We are not online !!! ");
        }
        System.out.println(isOnline == true ? "we are online !!! " : "we are not online !!!");


        String result = isOnline == true ? "we are online !!! " : " we are not online !!! ";

        System.out.println(result);

        int numberOfMonth = 3;

        if (numberOfMonth == 1){
            System.out.println("January");
        }else if (numberOfMonth == 2){
            System.out.println("February");
        }else if (numberOfMonth == 3){
            System.out.println("March");
        }else {
            System.out.println("Incorrect Number");
        }


    }
}

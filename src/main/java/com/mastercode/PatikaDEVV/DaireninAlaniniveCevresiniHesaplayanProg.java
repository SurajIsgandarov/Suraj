package com.mastercode.PatikaDEVV;

import java.util.Scanner;

public class DaireninAlaniniveCevresiniHesaplayanProg {
    public static void main(String[] args) {

        int r;
        double pi=3.14;
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();


        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alani : " + alan);
        System.out.println("Dairenin cevresi : " + cevre);
    }

}

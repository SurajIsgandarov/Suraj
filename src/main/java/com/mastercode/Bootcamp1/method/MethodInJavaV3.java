package com.mastercode.Bootcamp1.method;
// Ctrl + Alt + L   ---> Kodu seliqeye salir

public class MethodInJavaV3 {

    public static void main(String[] args) {
        int netice = birEdediniQaytar();
        System.out.println("netice: " + netice);

//        int ikiEdedinCemi = cem(10,20);
//        System.out.println(ikiEdedinCemi);

        int birinciEded = 10;
        int ikinciEded = 20;

        int ikiEdedincemi = cem(birinciEded, ikinciEded);
        System.out.println(birinciEded + " + " + ikinciEded + " = " + ikiEdedincemi);
    }

    public static int birEdediniQaytar(){ // 1 ededi qaytaracaq
        return 1;
    }
    public static int cem(int a, int b){
        return a + b;
    }
}

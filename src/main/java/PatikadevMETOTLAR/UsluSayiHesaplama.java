package PatikadevMETOTLAR;

import java.util.Scanner;

public class UsluSayiHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();

        int sonuc = usluSayiHesapla(taban, us);

        System.out.println("Sonuç: " + sonuc);
    }

    static int usluSayiHesapla(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usluSayiHesapla(taban, us - 1);
        }
    }
}
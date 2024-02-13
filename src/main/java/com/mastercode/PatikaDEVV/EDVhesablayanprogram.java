package com.mastercode.PatikaDEVV;

import java.util.Scanner;

public class EDVhesablayanprogram {
        public static void main(String[] args) {

            double Tutar, EDVorani = 0.18, EDVtutari, EDVlitutar;
            Scanner scan = new Scanner(System.in);
            System.out.print("Ucret tutarini giriniz : ");
            Tutar = scan.nextDouble();

            EDVtutari = Tutar * EDVorani;
            EDVlitutar = Tutar + EDVtutari;

            System.out.println("EDV'siz TUTAR : " + Tutar);
            System.out.println("EDV orani : " + EDVorani);
            System.out.println("EDV tutari : " + EDVtutari);
            System.out.println("EDV'li tutar : " + EDVlitutar);

        }
}
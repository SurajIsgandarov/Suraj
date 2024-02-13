import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        int km;
        double Perkm = 2.20, Total, StartPrice=10;
        Scanner scan = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi km cinsinden giriniz : ");
        km = scan.nextInt();

        Total = km * Perkm;
        Total = (Total < 20) ? 20 : Total;
        Total += StartPrice;

        System.out.println("Toplam tutar : " + Total);
    }
}

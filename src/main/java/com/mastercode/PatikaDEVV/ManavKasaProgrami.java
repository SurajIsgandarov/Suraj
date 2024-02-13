import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        double ArmutFiyati=2.14;
        double ElmaFiyati=3.67;
        double DomatesFiyati=1.11;
        double MuzFiyati=0.95;
        double PatlcanFiyati= 5.00;

        System.out.print("Armut Kaç Kilo ? : ");
        double Armutkilo = san.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        double Elmakilo = san.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        double Domateskilo = san.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        double Muzkilo = san.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        double Patlcankilo = san.nextDouble();
        double ToplamTutar =
                (Armutkilo*ArmutFiyati)+
                (Elmakilo*ElmaFiyati)+
                (DomatesFiyati*Domateskilo)+
                (Muzkilo*MuzFiyati)+
                (Patlcankilo*PatlcanFiyati);
        System.out.print("Toplam Tutar : " + ToplamTutar + "TL") ;

    }
}

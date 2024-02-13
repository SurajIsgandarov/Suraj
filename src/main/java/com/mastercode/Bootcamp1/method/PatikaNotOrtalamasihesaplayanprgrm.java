import java.util.Scanner;
public class PatikaNotOrtalamasihesaplayanprgrm {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        matematik = scan.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = scan.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = scan.nextInt();
        System.out.print("turkce notunuzu giriniz : ");
        turkce = scan.nextInt();
        System.out.print("tarih notunuzu giriniz : ");
        tarih = scan.nextInt();
        System.out.print("muzik notunuzu giriniz : ");
        muzik = scan.nextInt();
        int toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
        double NotOrtalamaniz = toplam / 6.0;
        System.out.println("Not Ortalamaniz : " + NotOrtalamaniz);
        String Sonuc = (NotOrtalamaniz>60) ? "Gectiniz" : "Kaldiniz";
        System.out.print(Sonuc);

    }
}

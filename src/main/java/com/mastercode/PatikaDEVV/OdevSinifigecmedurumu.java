import java.util.Scanner;

public class OdevSinifigecmedurumu {
    public static void main(String[] args) {
        int matematik,kimya,fizika,tarih,muzik;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        matematik = scan.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = scan.nextInt();
        System.out.print("Fizika notunuz : ");
        fizika = scan.nextInt();
        System.out.print("Tarih notunuz : ");
        tarih = scan.nextInt();
        System.out.print("Muzik notunuz : ");
        muzik = scan.nextInt();

        double Ortalama = (matematik+kimya+fizika+tarih+muzik) / 5;

        if (Ortalama<=55){
            System.out.println("Derste kaldiniz ! ");
        }else {
            System.out.println("Gectiniz ");
        }
        System.out.println("Not Ortalamaniz : " + Ortalama);


    }
}

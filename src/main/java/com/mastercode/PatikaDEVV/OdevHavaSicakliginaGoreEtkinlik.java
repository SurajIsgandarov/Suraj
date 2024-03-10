import java.util.Scanner;

public class OdevHavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sicaklk giriniz : ");
        sicaklik = scan.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsin ! ");
        } else if (sicaklik > 5 && sicaklik < 25) {
            if (sicaklik < 15) {
                System.out.println("Sinemaya gidebilirsin ! ");
            }
            if (sicaklik > 15) {
                System.out.println("Piknike gidebilirsin ! ");
            }
        }else {
            System.out.println("Yuzmeye gidebilirsin ! ");
        }
    }
}
import java.util.Scanner;

public class VucutKutleIndeksi {
    public static void main(String[] args) {
        double boy, kilo;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu giriniz : ");
        boy = scan.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = scan.nextDouble();
        double vucutkutleindeksi = kilo / (boy * boy);

        System.out.print("Vücut Kitle İndeksiniz : " + vucutkutleindeksi);


    }
}

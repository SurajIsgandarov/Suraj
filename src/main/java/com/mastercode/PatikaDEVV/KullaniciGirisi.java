import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName, password;

        System.out.print("Kullanici adiniz : ");
        userName = scan.nextLine();
        System.out.print("Sfreniz : ");
        password = scan.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("giris yaptiniz ! ");
        }else {
            System.out.println("kullanici adi ve ya sifre yanlis");
        }

    }
}

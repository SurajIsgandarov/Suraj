import java.util.Scanner;

public class OdevKULGiris {

    public static void main(String[] args) {
        // Gerçek şifre, burayı kendi şifrenizle değiştirin
        String dogruSifre = "gizliSifre";

        // Kullanıcı girişi
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı girin: ");
        String kullaniciAdi = scanner.nextLine();

        System.out.print("Şifrenizi girin: ");
        String girilenSifre = scanner.nextLine();

        // Şifre kontrolü
        if (girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Şifre yanlış.");
            sifreSifirla();
        }

        scanner.close();
    }

    static void sifreSifirla() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
        String sifreSifirlamaIstegi = scanner.nextLine();

        if (sifreSifirlamaIstegi.equalsIgnoreCase("evet")) {
            System.out.print("Yeni şifrenizi girin: ");
            String yeniSifre = scanner.nextLine();

            System.out.print("Eski şifrenizi tekrar girin: ");
            String eskiSifre = scanner.nextLine();

            // Şifre kontrolü
            if (yeniSifre.equals(eskiSifre)) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            } else {
                System.out.println("Şifre oluşturuldu.");
            }
        } else {
            System.out.println("Şifre sıfırlama işlemi iptal edildi.");
        }

        scanner.close();
    }
}

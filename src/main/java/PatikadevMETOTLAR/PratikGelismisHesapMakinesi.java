import java.util.Scanner;

public class PratikGelismisHesapMakinesi {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("cikarma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("carpma : " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("ikinci sayi 0'dan farkli olmali");
            return 0;
        }
        int result = a / b;
        System.out.println("bolme : " + result);
        return result;
    }

    static int power(int a, int b){
        int result = 1;
        for(int i=1; i<=b; i++){
            result*=a;
        }
        return result;
    }
    static int mod(int a, int b){
        return a % b;
    }
    static void calc(int a, int b){
        System.out.println("Cevresi : " + 2*(a+b));
        System.out.println("Alanu : " + (a*b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = "1 - toplama isilemi\n"
                + "2-cixma islemi\n"
                + "3-Vurma islemi\n"
                + "4-Bolme islemi\n"
                + "5-uslu sayi hesablama\n"
                + "6-Mod alma\n"
                + "7-Dik dortgen alan ve cevra hesablama\n"
                + "8-Cikis yap";
        while (true) {
            System.out.println(menu);
            System.out.print("Bir islem seciniz : ");
            int select = scan.nextInt();

            if (select == 0) {
                break;
            }
            System.out.print("Ilk sayi : ");
            int a = scan.nextInt();
            System.out.print("Ikinci sayi : ");
            int b = scan.nextInt();
            int result = 0;
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("ust hesabi : " + power(a, b));
                    break;
                case 6:
                    System.out.println("Mod islemi : " + mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Gecersiz bir islem girdiniz : ");
            }
        }
    }

}

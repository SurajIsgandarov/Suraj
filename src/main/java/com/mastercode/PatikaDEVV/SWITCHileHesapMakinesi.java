import java.util.Scanner;
public class SWITCHileHesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, select;
        System.out.print("Birinci sayi girin : ");
        n1 = scan.nextInt();
        System.out.print("Ikinci sayi girin : ");
        n2 = scan.nextInt();
        System.out.println("1-Toplama\n2-Cixma\n3-Vurma\n4-Bolme");
        System.out.print("Isleminizi Seciniz : ");
        select = scan.nextInt();

        switch (select){
            case 1:
                System.out.print("1-Toplama : " + (n1+n2));
                break;
            case 2:
                System.out.print("2-Cixma : " + (n1-n2));
                break;
            case 3:
                System.out.print("3-Vurma : " + (n1*n2));
                break;
            case 4:
                System.out.print("4-Bolme : " + (n1/n2));
                break;
            default:
                System.out.print("Duzgun islemi giriniz ! ");
        }

    }
}

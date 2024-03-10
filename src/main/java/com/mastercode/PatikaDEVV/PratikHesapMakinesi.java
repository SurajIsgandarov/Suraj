import java.util.Scanner;

public class PratikHesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz : "  );
        n1 = scan.nextInt();
        System.out.print("Ikinci sayiyi giriniz : " );
        n2 = scan.nextInt();

        System.out.print("1-toplama\n2-cixma\n3-vurma\n4-bolme");
        System.out.print("Seciminiz : ");
        select = scan.nextInt();

        if (select == 1){
            System.out.print("Toplama : " + (n1 + n2));
        } else if (select == 2) {
            System.out.print("Cixma : " + (n1-n2));
        } else if (select == 3) {
            System.out.print("Vurma : " + (n1*n2));
        } else if (select == 4) {
            if (n2 != 0){
                System.out.println("Bolme : " + (n1/n2));
            }else {
                System.out.println("Bir sayi 0'a bolunemez ! ");
            }
        }else {
            System.out.print("Yanlis islemi girdiniz, Lutfen dogru islemi giriniz !");
        }


    }
}

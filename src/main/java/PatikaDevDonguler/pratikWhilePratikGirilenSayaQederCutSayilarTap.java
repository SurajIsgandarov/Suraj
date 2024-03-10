import java.util.Scanner;

public class pratikWhilePratikGirilenSayaQederCutSayilarTap {
    public static void main(String[] args) {
        int k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        k = scan.nextInt();
        System.out.println(k + "Sayi kadar cut sayilar");

        int i = 0;
        while (i <= k){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

    }
}

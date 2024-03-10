import java.util.Scanner;

public class PratikGirilenSayaQederCutSayilarTapan {
    public static void main(String[] args) {
        int k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir say giriniz : ");
        k = scan.nextInt();


        for (int i=1; i<=k; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }

        }
    }
}

import java.util.Scanner;

public class PratikHarmonikSayilar {
    public static void main(String[] args) {
        // 1 + (1/2) + (1/3) + (1/4) + (1/n)

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayinizi giriniz : ");
        int n = scan.nextInt();
        double result = 0;

        for (double i = 1; i <= n; i++ ){
            result += (1/i);
        }
        System.out.println(result);
    }
}

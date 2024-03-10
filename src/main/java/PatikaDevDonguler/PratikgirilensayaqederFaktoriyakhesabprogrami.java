import java.util.Scanner;

public class PratikgirilensayaqederFaktoriyakhesabprogrami {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktoriali hesablamaq istediyiniz sayi giriniz : ");
        n = scan.nextInt();
        int Total = 1;

        for (int i=1; i <= n; i++){
            Total *= i;
        }
        System.out.println(n + ". Faktorial : " + Total);

    }
}

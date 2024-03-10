import java.util.Scanner;

public class PratikUstsayiHesablayanprogram {
    public static void main(String[] args) {
        int n,k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ust alinacaq say : ");
        n = scan.nextInt();
        System.out.print("Ust olacaq say : ");
        k = scan.nextInt();
        int total=1;
        int i = 1;
        while (i<=k){
            total*=n;
            i++;
        }
        System.out.println("Cavab : " + total);

    }
}

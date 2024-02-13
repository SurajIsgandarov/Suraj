import java.util.Scanner;

public class Daireninalaninicevresi {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin radiusunu giriniz : ");
        r = scan.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alani : " + alan);
        System.out.println("Dairenin cevresi : " + cevre);
    }

}

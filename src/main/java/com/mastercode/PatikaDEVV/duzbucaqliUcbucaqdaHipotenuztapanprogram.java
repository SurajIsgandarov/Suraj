import java.util.Scanner;

import java.util.Scanner;

public class duzbucaqliUcbucaqdaHipotenuztapanprogram {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner scan = new Scanner(System.in);
        System.out.print("1.ci terefi giriniz : ");
        a = scan.nextInt();
        System.out.print("2.ci terefi giriniz : ");
        b = scan.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenuz : " + c);

    }
}

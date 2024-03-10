import java.util.Scanner;

public class MetotTanitimi {
    static int power(int base, int exp){
        int result=1;
        for (int i=1; i<=exp; i++){
            result*=base;
        }
        return result;
    }
    public static void main(String[] args) {
        int case1 = power(2,3);
        System.out.println(case1);
        System.out.println(power(3,4));

        /*
        int base = 2, exp = 3, result = 1;
        for (int i=1; i<=exp; i++){
            result*=base;
        }
        System.out.println(result);

        base = 4;
        exp = 2;
        result = 1;
        for (int i=1; i<=exp; i++){
            result*=base;
        }
        System.out.println(result);

         */

    }
}

import java.util.Scanner;

public class Armstrongsayilar {
    public static void main(String[] args) {
        /*
        int a = 2451, counternumber = 0;

        while (a != 0){
            a = a / 10;
            System.out.println(a);
            counternumber++;
        }
        System.out.println(counternumber);

        // Bir sayinin son basamagini bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i=1; i <= sup; i++ ){
            result*= sub;
        }
        System.out.println("2 ustu 3 : " + result);  */


        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi girniz : ");
        int number = scan.nextInt();
        int basamaknumber = 0;
        int tempNumber = number;
        int basamakValue;
        int result = 0;
        int basPow;

        while (tempNumber!=0){
            tempNumber /= 10;
            basamaknumber ++;
        }
        tempNumber=number;
        while (tempNumber!=0){
            basamakValue = tempNumber %10;
            basPow=1;
            for (int i = 1; i <= basamaknumber; i++){
                basPow *= basamakValue;
            }
            result+= basPow;
            tempNumber /= 10;
        }

        if (result == number){
            System.out.println(number + " sayisi bir armstrong sayidir. ");
        }else{
            System.out.println(number + " sayisi bir armstrong sayisi deyildir. ");
        }
    }

}

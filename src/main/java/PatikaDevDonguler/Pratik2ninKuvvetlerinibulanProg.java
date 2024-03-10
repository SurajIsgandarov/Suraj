import java.util.Scanner;
public class Pratik2ninKuvvetlerinibulanProg {
   public static void main(String[] args) {
      int n;
      Scanner scan = new Scanner(System.in);
      System.out.print("Sinir sayisini giriniz : ");
      n = scan.nextInt();

      for (int i=1; i<=n; i*=2){
         System.out.print(i+", ");
      }

   }
}

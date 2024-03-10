import java.util.Scanner;

public class AsalsayiBulanProgram {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Sayı Giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi <= 1) {
                System.out.println(sayi + " sayısı ASAL değildir !");
            } else {
                if (asalMi(sayi, 2)) {
                    System.out.println(sayi + " sayısı ASALDIR !");
                } else {
                    System.out.println(sayi + " sayısı ASAL değildir !");
                }
            }
        }

        // Recursive olarak asal kontrolü
        private static boolean asalMi(int sayi, int bolen) {
            if (bolen == sayi) {
                return true;
            }
            if (sayi % bolen == 0) {
                return false;
            }
            return asalMi(sayi, bolen + 1);
        }
    }


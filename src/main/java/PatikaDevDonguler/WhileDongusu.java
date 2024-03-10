

public class WhileDongusu {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while (i < 3) {
            do {
                System.out.print(j + ",");
                j++;
            } while (j < 4);
            i++;
        }

        for (int i1 = 0; i1 < 10; i1++) {
            System.out.print(i1);
        }


        int eded = 1;
        while (eded <= 10) {
            eded++;
            if (eded%2 == 0){
                continue;
            }
            System.out.print(eded);
        }


    }
}

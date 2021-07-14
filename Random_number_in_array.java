import java.util.Random;

public class Random_number_in_array {
    public static void main(String[] ar) {
        int a[] = new int[5];
        Random r = new Random();
        for (int i = 0; i < 5; i++) {

            int number = r.nextInt(10);
            a[i] = number;
            System.out.println(a[i]);

        }
    }
}
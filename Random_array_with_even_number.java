import java.util.Random;

public class Random_array_with_even_number {
    public static void main(String []x)
    {
        int even[] = new int[10];
        Random r=new Random();
        for(int i=0; i<10; i++) {
            even[i] = r.nextInt(1000);
            if (even[i] % 2 == 0)
                System.out.println(even[i]);
            even[i]++;

        }
        }
}

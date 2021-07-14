import java.util.Random;

public class sample_random_number {
    public static void main(String []ar)
    {
        Random r=new Random();
        int number=r.nextInt(100);
        System.out.println("The answer is :");
        System.out.println(number);
    }
}

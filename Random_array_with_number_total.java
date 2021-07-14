import java.util.Random;

public class Random_array_with_number_total {
    public static void main(String []z)
    {
        int maths[] = new int[10] , total=0;
        Random r=new Random();
        for(int i=0; i<10; i++)
        {
            maths [i] =r.nextInt(100);
             total=total + maths[i];
            System.out.println(maths[i]);
        }
        System.out.println("The Answer is " + total);
    }
}

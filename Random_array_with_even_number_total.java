import java.util.Random;

public class Random_array_with_even_number_total {
    public static void main(String []x)
    {
        int even[] = new int[10], total=0;
        Random r=new Random();
        for(int i=0; i<10; i++)
        {
            even[i]=r.nextInt(20);
               if(even[i]%2==0)
                   System.out.println(even[i]);
            even[i]++;

            total=total+even[i];
        }

        System.out.println("The answer is  " + total);
    }
}

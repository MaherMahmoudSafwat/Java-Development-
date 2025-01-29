import java.net.CacheRequest;
import java.util.Arrays;

public class Main
{
    public static int minimumSteps(int[] numbers, int k) {
        int Count = 0;
        int Counter = 0;
        Arrays.sort(numbers);
        for(int i = 1; i<numbers.length; i++)
        {
            if(i==1)
            {
                Count+=numbers[i-1]+numbers[i];
                if(Count >= k)
                    return Counter;
            }
            else
            {
                Count+=numbers[i];
                if(Count >= k)
                    return ++Counter;
            }
            Counter++;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int [] Array = {19,98,69,28,75,45,17,98,67};
        System.out.println(minimumSteps(Array,464));
    }
}
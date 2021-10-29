import java.util.*;

public Class FizzBuzz
{
    public static void main (String[] args)
    {
        System.out.println("Please input an integer greater than 1.");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++)
        {
            if (i % 3 == 0)
            {
                if (i % 5 == 0)
                {
                    System.out.println("FizzBuzz");
                }
                else 
                {
                    System.out.println("Fizz");
                }
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}

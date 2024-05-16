import java.util.*;

public class Prime
{
    //prime range
    // public static void primesrange(int no)
    // {
    //     for(int i=2;i<=no;i++)
    //     {
    //       if(isPrime(i))
    //       {
    //         System.out.print(i+" ");
    //       }

    //     }
    //     System.out.println();
    // }
    public static boolean isPrime(int no)
    {
        if(no==2)
        {
            return true;
        }
            for(int i=2;i<=Math.sqrt(no);i++)
            {
                if(no%i==0)
                {
                    return false;
                }
            }
            return true;
    }
    public static void main(String args[])
    {
        
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        System.out.println(isPrime(no));

        //prime numbers in range
        // primesrange(10);  
    }
}
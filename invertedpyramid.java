import java.util.*;

public class invertedpyramid
{
    public static void halfp(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
              System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++)
            {
              System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter number of rows");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        halfp(n);
    }
}
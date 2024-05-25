import java.util.*;

public class floydstriangle
{
    public static void floydt(int n)
    {
        int counter=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter+" ");
                counter++;
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
        floydt(n);
    }
}
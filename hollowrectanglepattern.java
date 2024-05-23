import java.util.*;

public class hollowrectanglepattern
{
    public static void holrect(int nr,int nc)
    {
        for(int i=1;i<=nr;i++)
        {
            for(int j=1;j<=nc;j++)
            {
                if(i==1||i==nr||j==1||j==nc)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int nr,nc;
        System.out.println("Enter number of rows");
        Scanner sc=new Scanner(System.in);
        nr=sc.nextInt();
        System.out.println("Enter number of columns");
        nc=sc.nextInt();
        holrect(nr,nc);
    }
}
import java.util.*;

public class hollowrectanglepattern
{
    
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
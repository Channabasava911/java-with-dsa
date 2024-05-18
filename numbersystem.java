import java.util.*;
public class numbersystem
{
    // public static void bintodec(int binno)
    // {
    //     int myno=binno;
    //     int pow=0;
    //    int  rem=0;
    //     int decno=0;
    //     while(binno>0)
    //     {
    //         rem=binno%10;
    //         decno=decno+(rem*(int)Math.pow(2,pow));
    //         pow++;
    //         binno=binno/10;
    //     }
    //     System.out.println("Decimal number of "+myno+"="+decno);
    // }

    public static void dectobin(int decno)
    {
        int myno=decno;
        int pow=0;
       int  rem=0;
        int binno=0;
        while(decno>0)
        {
            rem=decno%2;
            binno=binno+(rem*(int)Math.pow(10,pow));
            pow++;
            decno=decno/2;
        }
        System.out.println("Binary number of "+myno+"="+binno);
    }
    public static void main(String args[])
    {
        // int binno;
        // //Binary to Decimal
        // System.out.println("Enter number in binary format");
        // Scanner sc=new Scanner(System.in);
        // binno=sc.nextInt();
        // bintodec(binno);

       
        int decno;
        // Decimal to Binary
        System.out.println("Enter number in decimal format");
        Scanner sc=new Scanner(System.in);
        decno=sc.nextInt();
        dectobin(decno);
    }
}
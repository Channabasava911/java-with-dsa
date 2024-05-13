import java.util.*;

public class QS
{
    public static void main(String args[])
    {
        // int tax;
        // System.out.println("Enter your income");
        // Scanner sc=new Scanner(System.in);
        // int income=sc.nextInt();
        // if(income<500000)
        // {
        //     tax=0;
        // }
        // else if(income>=500000 && income<=100000)
        // {
        //     tax=(int)(0.2*income);
        // }
        // else 
        // {
        //     tax=(int)(0.3*income);
        // }
        // System.out.println("Your tax is:"+tax);

        // int a,b,c;
        // System.out.println("Enter values of a,b and c");
        // Scanner sc=new Scanner(System.in);
        // a=sc.nextInt();
        // b=sc.nextInt();
        // c=sc.nextInt();
        // if(a>b && a>c)
        // {
        //     System.out.println(" largest is"+a);
        // }
        // else if(b>c)
        // {
        //     System.out.println("largest is "+b);
        // }
        // else{
        //     System.out.println("largest is"+c);
        // }

        // int no=8;
        // String type=(no%2==0)?"even":"odd";
        // System.out.println(type);

        // for(int i=1;i<=10;i++)
        // {
        //     if(i==3)
        //     {
        //         continue;
        //     }
        //     System.out.print(i+" ");
        // }

        // int i=1;
        // while(i<=10)
        // {
        //     System.out.print(i+" ");
        //     i++;
            
        // }

        // int sum=0;
        // int no=4;
        // for(int i=1;i<=4;i++)
        // {
        //     sum=sum+i;

        // }
        
        // System.out.print(sum);

        // int rev=0;
        // int no=911356;
        // int rem;
        // while(no!=0)
        // {
        //     rem=no%10;
        //     rev=rev*10+rem;
        //     no/=10;
        // }
        // System.out.print(rev);
        
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number:");
            int no=sc.nextInt();
            if(no%10==0)
            {
                continue;
            }
            System.out.println(no);

        }while(true);

    }
}
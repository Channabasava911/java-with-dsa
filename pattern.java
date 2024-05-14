import java.util.*;

public class pattern
{
    public static void main(String args[])
    {    //type-1
        System.out.println("Enter number of lines:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        // for(int line=1;line<=no;line++)
        // {
        //     for(int star=1;star<=line;star++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //inverted star pattern
        // for(int line=1;line<=no;line++)
        // {
        //     for(int star=1;star<=no-line+1;star++)
        //     {
        //         System.out.print("*"); 
        //     }
        //     System.out.println();
        // }

        //number half pyramid
        // for(int line=1;line<=no;line++)
        // {
        //     for(int val=1;val<=line;val++)
        //     {
        //         System.out.print(val); 
        //     }
        //     System.out.println();
        // }

        //character pattern
        char ch='A';
        for(int line=1;line<=no;line++)
        {
            for(int chars=1;chars<=line;chars++)
            {
                System.out.print(ch); 
                ch++;
            }
            System.out.println();
        }


    }
}
import java.util.*;
public class inputarray
{
    public static void main(String args[])
    {
        int marks[]=new int[50];
        System.out.println("Enter marks of english");
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        System.out.println("Enter marks of maths");
        marks[1]=sc.nextInt();
        System.out.println("Enter marks of science");
        marks[2]=sc.nextInt();
        System.out.println("Enter marks of social");
        marks[3]=sc.nextInt();
        System.out.println("English:"+marks[0]);
        System.out.println("Maths:"+marks[1]);
        System.out.println("Science:"+marks[2]);
        System.out.println("Social:"+marks[3]);
        int per=(marks[0]+marks[1]+marks[2]+marks[3])/4;
        System.out.println("Percentage:"+per+"%");
        System.out.println("Length of array:"+marks.length);


    }
}
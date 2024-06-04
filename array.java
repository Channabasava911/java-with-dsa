public class array
{
    // public static void update(int marks[],int notchange)
    // {
    //     notchange=10;
    //     for(int i=0;i<marks.length;i++)
    //     {
    //         marks[i]=marks[i]+1;
    //     }
    // }
    // public static void main(String args[])
    // {
    //     int marks[]={97,98,99};
    //     int notchange=5;
    //     update(marks,notchange);
    //     System.out.println(notchange);
    //     for(int i=0;i<marks.length;i++)
    //     {
    //         System.out.print(marks[i]+" ");
    //     }
    // }

    public static int getlargest(int num[])
    {
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(large<num[i])
            {
                large=num[i];
            }
            if(small>num[i])
            {
                small=num[i];
            }
        }
        System.out.println("Smallest value is:"+small);
        return large;
    }
    public static void main(String args[])
    {
        int num[]={1,4,6,8,7,9};
        System.out.println("Largest value is:"+getlargest(num));
    }

}
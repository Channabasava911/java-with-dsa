public class Maxsubarraysum
{
    // public static void maxsub(int num[])
    // {
    //     int cs=0;
    //     int ms=Integer.MIN_VALUE;
    //     for(int i=0;i<num.length;i++)
    //     {
    //         int start=i;
    //         for(int j=i;j<num.length;j++)
    //         {
    //             int end=j;
    //             cs=0;
    //             for(int k=start;k<=end;k++)
    //             {
    //                 cs=cs+num[k];
    //             }
            
    //             System.out.println(cs);
    //         }
    //         System.out.println(cs);
    //         if(ms<cs)
    //         {
    //             ms=cs;
    //         }
    //     }
        //System.out.println("Maximum Sum="+ms);

        //Prefix sum method for max subarray
    public static void prefixmaxsub(int num[])
    {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int pre[]=new int[num.length];
        pre[0]=num[0];
        for(int i=1;i<pre.length;i++)
        {
            pre[i]=pre[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++)
        {
            int start=i;
            for(int j=i;j<num.length;j++)
            {
                int end=j;
                cs=start==0?pre[end]:pre[end]-pre[start-1];
                if(ms<cs)
                {
                    ms=cs;
                }
                
            }
            
        }
        System.out.println("maxsum="+ms);
    }
    public static void main(String args[])
    {
        int num[]={1,-2,6,-1,3};
        //maxsub(num);
        prefixmaxsub(num);
    }
}
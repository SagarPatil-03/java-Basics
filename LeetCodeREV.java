public class LeetCodeREV {
    
    public static void main(String args[])
    {
        int num =123;
   int rev =0;

        while(num!=0)
        {
            int digit = num%10;
            if(rev>Integer.MAX_VALUE/10)
            {
                return ;
            }
             rev=rev*10+digit;
             num=num/10;
        }
        System.out.println(rev);
    }
}

public class CountChar {
    
    public static void main(String args[])
    {
        String str="sagar";
        int count=0;
        String s="";

        for(int i=0;i<=str.length()-1;i++)
        {
         s=s+str.charAt(i);
         count++;
        }

        System.out.println(count);
        System.out.println("Given String is ="+s);

    }
}

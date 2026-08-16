import java.util.*;

public class RevNum {

    public boolean Rev(int num)
    {   
        if(num<0)
        {
            return false;
        }
        int rev=0;
     
        while(num!=0)
        {
            int digit = num%10;

            rev=rev*10+digit;

            num =num/10;

        }
        

    }
    public static void main(String[] args) {
        Rev(234);
          
        
    }
}

import java.util.*;
class DuplicateChar
{
public static void main(String args[])
{
    String s="sagar";
   
    for(int i=0;i<s.length()-1;i++)
    {
         Char ch = s.toChar(i);
        
        if(ch[i]==ch[i+1])
        {
            System.out.println(ch[i]);
        }
    }
}
}
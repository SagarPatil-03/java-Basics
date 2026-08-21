import java.util.*;
class DuplicateChar
{
public static void main(String args[])
{
    String s="sagar";
   Char ch = s.toChar(i);
    for(int i=0;i<s.length()-1;i++)
    {
        
        if(ch[i]==ch[i+1])
        {
            System.out.println(ch[i]);
        }
    }
}
}
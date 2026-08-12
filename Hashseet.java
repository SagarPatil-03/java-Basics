import java.util.*;
public class Hashseet {

    public static void main(String args[])
    {
     int arr[]={1,2,3,4,3,4,6,7};
           
     HashSet<Integer> hs=new HashSet<>();

     for(int num:arr)
     {
        if(hs.contains(num))
        {
            System.out.println(num);
            break;
        }
        hs.add(num);
     }System.out.println(hs);
    }
    
}

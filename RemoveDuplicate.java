import java.util.*;
public class RemoveDuplicate {

    public static void main(String args[])
    {
        System.out.println("Remove Duplicate From :-");
        int arr[]={1,1,2,2,5};

        int j=1;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[j-1]!=arr[i])
            {
              arr[j]=arr[i];
              j++;

            }
        }
      for(int i=0;i<j;i++)
      {
        System.out.print(arr[i]+",");
      }
    }
    
}

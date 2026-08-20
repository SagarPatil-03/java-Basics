import java.util.*;

public class PrintDuplicate{
    public static void main(String[] args) {
     
    int arr[]={1,2,2,3,4,4,5};
     HashSet<Integer> hs = new HashSet<>();
    for(int i=0;i<arr.length-1;i++){

      if(arr[i]==arr[i+1])
      {

       hs.add(arr[i]);


      }
    }
    System.out.println("Duplicate From the Array :-");
     System.out.println(hs);
    }
}

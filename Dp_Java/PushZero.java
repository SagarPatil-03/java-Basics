import java.util.*;
public class PushZero {

    public static void main(String args[])
        {
            int arr[]={1,0,9,8,0,7};
            int j=0;
            for(int i=0; i<arr.length;i++)
            {
                if(arr[i]!=0)
                {
                    arr[j]=arr[i];
                    j++;

                }
            }

            while(j<arr.length)
            {
                arr[j]=0;
                j++;
            }

            System.out.println(Arrays.toString(arr));

        }
    
    
}

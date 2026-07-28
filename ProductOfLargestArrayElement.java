public class ProductOfLargestArrayElement {

    public static void main(String args[])
    {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7,8};

        int max1=arr1[0];
        int max2=arr2[0];

        for(int num:arr1)
        {
            if(num>max1)
            {
                max1=num;
            }
        }

        for(int num:arr2)
        {
            if(num>max2)
            {
                max2=num;
            }
        }
           System.out.println(max1);
        System.out.println("Maximum Product Of Larget Array Element:-"+max1*max2);

    }
    
}

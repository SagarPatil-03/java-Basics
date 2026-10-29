class MaxSubSum{
    public static void main(String args[])
    {
        int arr[]={1,-2,3,-4,5,6,7};
        int currSum=arr[0];
        int maxSum=arr[0];

        for(int i=1; i<arr.length;i++)
        {
            currSum= Math.max(arr[i], currSum+arr[ijava]);
            maxSum=Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
}
    } 

   


class FindSlargest {
    public static void main(String[] args) {
      int arr[]={10,101,30,45};

        int largest=Integer.MIN_VALUE;
        int Slargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>largest)
                {
                    Slargest=largest;
                    largest=arr[i];
                }
                else if(arr[i]>Slargest && arr[i]!=largest)
                {
                    Slargest=arr[i];
                }
            }

        System.out.println(largest);
        System.out.println(Slargest);
    }
}
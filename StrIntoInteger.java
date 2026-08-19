class StrIntoInteger{
    public static void main(String args[])
    {
        String s="223";

        int num=Integer.parseInt(s);
        int numb=Integer.valueOf(s);

        System.out.println("Using valueOf() :-"+numb);
        System.out.println("Using parseInt():-"+num);
    }
}
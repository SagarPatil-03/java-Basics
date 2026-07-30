import java.util.*;
class HashMapBasic{
    public static void main(String args[])
    {
        HashMap<Integer, String> mp=new HashMap<>();

        //1. Value Add 

        mp.put(101,"sagar");
        mp.put(102,"Vaibhav");

        //2.Check Key is Present Or Not
        System.out.println(mp.containsKey(101));

        //3.Check Value is present or Not;
        System.out.println(mp.containsValue("sagar"));


        //get Value
        System.out.println(mp.get(101));


    }
}
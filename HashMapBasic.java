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


        //4.get Value
        System.out.println(mp.get(101));

        // 5.getorDefault if availbale then show, either what our msg that show.
        System.out.println(mp.getOrDefault(103, "Not Found"));

        //6.Remove
        mp.remove(102);


        //7.Put if absent.
        mp.putIfAbsent(103,"Pankaj");
        
        //8. KeySet
        System.out.println(mp.keySet());

        // 9.clear()
        // map.clear();

         // 10.size()
        System.out.println(mp.size());

        // 11.replace()
        mp.replace(102, "Rohan");

        // entrySet()
        System.out.println(mp.entrySet());

           System.out.println(mp);

    }
}
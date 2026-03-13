import java.util.*;
import java.util.HashMap;
public class HashMap1 {
    static void HashMapMethod(){
        //syntax
        Map<String,Integer> mp=new HashMap<>() ;

        //adding element
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 20);

        //getting value from hashmap from a key
        System.out.println(mp.get("Yash"));
                System.out.println(mp.get("Ravi"));

        //chaning and updating value of key in the hashmap
        mp.put("Akash", 25);
        System.out.println(mp.get("Akash"));

        //removing a pair from hashmap
        System.out.println(mp.remove("Akash"));
                System.out.println(mp.remove("Riya"));

        //checking key in the map
        System.out.println(mp.containsKey("Akash"));
                System.out.println(mp.containsKey("Yash"));


                //Adding new key if new key doesn't already exist
                System.out.println( mp.putIfAbsent("yash",13));
                                System.out.println( mp.putIfAbsent("yashika",13));
                                System.out.println(mp.get("yashika"));

                //get all keys of HashMap
                System.out.println(mp.keySet());

            //get all value of keys
            System.out.println(mp.values());

            //get all entries in the Hashmap
            System.out.println(mp.entrySet());

            //traversing all entries from hashmap-multiple methods
            for(String key:mp.keySet()){
                System.out.printf("Age of %s id %d \n",key,mp.get(key));
            }
System.out.println();


for(Map.Entry<String,Integer> e:mp.entrySet()){
    System.out.printf("age of %s is %d \n ",e.getKey(),e.getValue());
}


    }
    public static void main(String[] args) {
        HashMapMethod();
        
    }
}

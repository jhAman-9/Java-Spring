package BASIC.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {

        // Collection Doesnot Support Index Value
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(7);

        System.out.println(nums);

        System.out.println("Collection aceess without Index");
        for (int it : nums) {
            System.out.println("Collection : " + it);
        }
        




        // List Support Index Value
        List<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(10);
        nums1.add(11);
        nums1.add(12);


        System.out.println("List with Index : " + nums1.get(2));
        System.out.println("List Find Index : " + nums1.indexOf(10));

        // AS Object type and then typecast
        for (Object it : nums1) {
            System.out.println("List Value with obj to int type : " + (Integer) it);
        }





        // Set Store Unique Value and donot have index and values in random order use HashSet
        // unordered_set
        Set<Integer> nums2 = new HashSet<Integer>();
        nums2.add(40);
        nums2.add(60);
        nums2.add(25);
        
        for (int x : nums2) {
            System.out.println("HashSet : " + x);
        }





        // Set for Sorted Value use TreeSet 
        // ordered_set
        Set<Integer> nums3 = new TreeSet<Integer>();
        nums3.add(30);
        nums3.add(20);
        nums3.add(40);
        
        for (int x : nums3) {
            System.out.println("TreeSet : " + x);
        }




        // Iterator to Print Value of all above Collection
        // use if we donot know exact number of index
        Iterator<Integer> values = nums3.iterator();
        while (values.hasNext()) {
            System.out.println("with Iterator : " + values.next());
        }



        // HashMap
        // Map is Interface
        // Store value in key and value pair
        // key are unique and values can repeated
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Aman", 1);
        mp.put("Harsh", 2);
        mp.put("Raj", 3);
        mp.put("Tapesh", 4);

        System.out.println(mp);
        System.out.println("Value of key : " + mp.get("Aman"));
        System.out.println("set of keys : " + mp.keySet());


        System.out.println("Key and Values Using For Loop");
        for (String key : mp.keySet()) {
            System.out.println(key + " : " + mp.get(key));
        }



        // HashTable
        // it is syncronized
        // use it with Multiple Threads to call it syncronizedly
        // Map is Interface
        // Store value in key and value pair
        // key are unique and values can repeated
        Map<String, Integer> mp2 = new Hashtable<>();
        mp2.put("Aman", 1);
        mp2.put("Harsh", 2);
        mp2.put("Raj", 3);
        mp2.put("Tapesh", 4);

        System.out.println(mp2);
        System.out.println("Value of key : " + mp2.get("Aman"));
        System.out.println("set of keys : " + mp2.keySet());


        System.out.println("Key and Values Using For Loop");
        for (String key : mp2.keySet()) {
            System.out.println(key + " : " + mp2.get(key));
        }


    }
    
}

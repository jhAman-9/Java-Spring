# Collection -> Interface
- lots of data Structure / Interface of data structure

# Collections -> Class 
- it has lots of method

# Collection Api 
- MUltiple class interface to work with 
- Map


#  Example 
- List -> ArrayList, LinkedList
- Queue -> Dequeue
- Set -> HashSet, Linked HashSet


# Collection

- Collection Doesnot Support Index Value

        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(7);

        System.out.println(nums);

        System.out.println("Collection access without Index");
        for (int it : nums) {
            System.out.println("Collection : "+ it);
        }


# List

- List Support Index Value

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

        for(int i=0; i<3; i++){
            System.out.println("List Value with index : " + nums1[i]);

        }


# HashSet

- Set Store Unique Value and donot have index and values in random order use HashSet
- Unordered_set

        Set<Integer> nums2 = new HashSet<Integer>();
        nums2.add(40);
        nums2.add(60);
        nums2.add(25);
        
        for (int x : nums2) {
            System.out.println("HashSet : " + x);
        }


# TreeSet

- Set for Sorted Value use TreeSet 
- Ordered_set

        Set<Integer> nums3 = new TreeSet<Integer>();
        nums3.add(30);
        nums3.add(20);
        nums3.add(40);
        
        for (int x : nums3) {
            System.out.println("TreeSet : " + x);
        }

# Iterator

- Iterator to Print Value of all above Collection
- use if we donot know exact number of index

        Iterator<Integer> values = nums3.iterator();
        while (values.hasNext()) {
            System.out.println("with Iterator : " + values.next());
        }


# HashMap

- HashMap
- Map is Interface
- Store value in key and value pair
- key are unique and values can repeated

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


# HashTable

- HashTable
- it is syncronized
- use it with Multiple Threads to call it syncronizedly
- Map is Interface
- Store value in key and value pair
- key are unique and values can repeated

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



# Collections Methods

1) Collections.sort 
    - it has custom comparator
    - sort on the basis of your logic using custom camparator
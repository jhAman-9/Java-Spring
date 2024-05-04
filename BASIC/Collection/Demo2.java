package BASIC.Collection;

// Collections Methods

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Demo2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(95);
        nums.add(52);
        nums.add(29);
        nums.add(76);
        nums.add(18);

        System.out.println("Before Sorting : " + nums);

        Collections.sort(nums);
        System.out.println("After Sorting : " + nums);
        

        Comparator<Integer> comp = new Comparator<Integer>() {
            // sort on the basis of remainder 
            public int compare(Integer i, Integer j) {
                return i%10 > j%10 ? 1 : -1;
            }
        };
        // Sort on the basis of Custom Comparator
        Collections.sort(nums, comp);
        System.out.println("Sort by Custom Comparator : " + nums);
    }
}

package BASIC.Collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class For_Loops {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 24, 5, 2, 5, 6, 8);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        for (int it : nums) {
            System.out.println(it);
        }
        nums.forEach( n -> System.out.println(n));





        // ForEach logic
        Consumer<Integer> con = new Consumer<Integer>(){
            public void accept(Integer n){
                System.out.println(n);
            }
        };

        // after converting into Lambda Expression Looks this
        // nums.forEach(con);

        // after implementing accept method with lambda Expression under for each loop
        // donot even create reference for Consumer
        nums.forEach( n -> System.out.println(n));



    }
    
}

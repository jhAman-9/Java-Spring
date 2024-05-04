package BASIC.Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_api {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 4, 5, 2, 5, 6, 8);

        // Creating copy of nums
        Stream<Integer> s1 = nums.stream();

        // filter the even numbers and s1 Stream is used, we cannot access it again
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        
        // add all elements of s3
        int result = s3.reduce(0, (c, e) -> c + e);

        // s1.forEach(n -> System.out.println(n));
        // s2.forEach(n1 -> System.out.println(n1));
        // s3.forEach(n1 -> System.out.println(n1));
        System.out.println(result);


    }
}

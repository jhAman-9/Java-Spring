package BASIC.Collection;

import java.beans.Expression;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Special_Method_with_Stream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 4, 5, 2, 5, 6, 8);


        // FIlTER Actual Implementation Behind the code
        // Predicates itself a function Interface so we can use lambda Expression here
        Predicate<Integer> fil = new Predicate<Integer>() {
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };

        // Predicates itself a function Interface so we can use lambda Expression here
        Predicate<Integer> Fil = n -> n % 2 == 0;





        // MAP Actual Implementation Behind the code
        Function<Integer, Integer> fun = new Function<Integer,Integer> (){
            public Integer apply(Integer n){
                return n*2;
            }
        };

        // Function itself a function Interface so we can use lambda Expression here
        Function<Integer, Integer> Fun = n -> n * 2;



        int result = nums.stream()
                // Predicates in lambda Expression
                // .filter(n -> n % 2 == 0)
                .filter(fil)
                // Function in Lambda Expression
                // .map(n -> n * 2)
                .map(fun)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result);




        // We can also sort the Stream
        Stream<Integer> sortedValue = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();
        sortedValue.forEach(n -> System.out.println(n));
        


        // ParallelStream which provide multiple Thread to work Faster
        Stream<Integer> sortedValue2 = nums.parallelStream()
                .filter(n -> n % 2 == 0);
        sortedValue2.forEach(n -> System.out.println(n));

    }
}

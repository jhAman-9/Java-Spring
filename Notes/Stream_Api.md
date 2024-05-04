# Stream
- It will help to use values of list with disturbing the actual value of list

        List<Integer> nums = Arrays.asList(3, 4, 5, 2, 5, 6, 8);
        Stream<Integer> s1 = nums.stream();

- Once we use Stream, we Cannot use it again

- with Stream we can manupulate data by creating the another Stream

        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n*2);


# Special method with Stream

- Some Methods we can use with stream
        
        List<Integer> nums = Arrays.asList(3, 4, 5, 2, 5, 6, 8);

        int result = nums.stream()
                .filter( n -> n % 2 == 0)
                .map( n -> n*2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);



- We can also sort the Stream 

        Stream<Integer> sortedValue = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();
        sortedValue.forEach(n -> System.out.println(n));



-  ParallelStream which provide multiple Thread to work Faster

        Stream<Integer> sortedValue2 = nums.parallelStream()
                .filter(n -> n % 2 == 0);
        sortedValue2.forEach(n -> System.out.println(n));


# Behind Filter Method

- FIlTER Actual Implementation Behind the code

        // Predicates itself a function Interface so we can use lambda Expression here
        Predicate<Integer> fil = new Predicate<Integer>() {
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };

- Predicates itself a function Interface so we can use lambda Expression here

        Predicate<Integer> Fil = n -> n % 2 == 0;

# Behind Map Method

- MAP Actual Implementation Behind the code

        Function<Integer, Integer> fun = new Function<Integer,Integer> (){
            public Integer apply(Integer n){
                return n*2;
            }
        };

- Function itself a function Interface so we can use lambda Expression here

        Function<Integer, Integer> Fun = n -> n * 2;

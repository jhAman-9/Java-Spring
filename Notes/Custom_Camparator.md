# Custom Comparator
- 2 Ways to Implement Custom Comparator
- i) Create Your own Custom comparator method
 - ii) implements the Comparable<Type> interface into the class and implement  the compareTo method 
 - In Camparable, giving the power to class to compare its object itself


        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.List;

        class Student implements Comparable<Student>{
            int age;
            String name;

            public Student(int age, String name) {
                this.age = age;
                this.name = name;
            }

            public String toString() {
                return "Student [" + age + " : " + name + "]";
            }

            // Overriding the pre define compareTo method of Comparable Interface
            public int compareTo(Student that) {
                return this.age < that.age ? 1 : -1;
            }
        }



        public class Custom_Comparator {

            public static void main(String[] args) {
                List<Student> studs = new ArrayList<>();
                studs.add(new Student(20, "Aman"));
                studs.add(new Student(22, "Raj"));
                studs.add(new Student(15, "Simran"));

                for (Student s : studs) {
                    System.out.println(s.age + " : " + s.name);
                }


                for (Student s : studs) {
                    System.out.println(s.toString());
                }

                // 1) way to implement Custom Comparator

                // Custom Comparing Method on the basis of Student age
                Comparator<Student> comp = new Comparator<Student>(){
                    public int compare(Student a,Student b){
                        return a.age > b.age ? 1 : -1;
                    }
                };

                // Sort on the Basis of Custom Comparator
                Collections.sort(studs, comp);
                System.out.println("Self made custom Comparator : ");
                for (Student s : studs) {
                    System.out.println(s.toString());
                }

                // 2) way to implement Custom Comparator

                // overriden Comparator method 
                System.out.println("Overriden compareTo Method : ");
                Collections.sort(studs);
                for (Student s : studs) {
                    System.out.println(s);
                }

                // 3) way to implement Custom Comparator

                // Custom comparator method with lambda Expression
                Comparator<Student> lamb_com = (Student a, Student b) -> {
                        return a.age > b.age ? 1 : -1;
                };

                System.out.println("Selt made Custom Comparator with Lambda Expression :");
                Collections.sort(studs, lamb_com);
                for (Student s : studs) {
                    System.out.println(s);
                }
                
            }
        }
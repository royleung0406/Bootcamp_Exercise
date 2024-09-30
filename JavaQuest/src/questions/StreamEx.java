import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        // 1
        Integer[] arr = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> numbers = Arrays.asList(arr);
        List<Integer> ans1 = numbers.stream().filter(n -> n % 2 == 0)
                .map(c -> c * c).sorted((a, b) -> a.compareTo(b))
                .collect(Collectors.toList());

        System.out.println(ans1);

        // 2
        List<String> names =
                Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
        System.out.println(names.stream().filter(name -> name.startsWith("A"))
                .collect(Collectors.toList()));

        // 3
        List<Integer> number3 = Arrays.asList(10, 20, 5, 30, 15);
        System.out.println("Max is "
                + number3.stream().max((a, b) -> a.compareTo(b)).get());
        System.out.println(
                "Min is " + number3.stream().min(Integer::compare).get());

        // 4
        List<String> words = Arrays.asList("apple", "banana", "pear");
        List<Integer> ans = words.stream().map(n -> n.length())
                .collect(Collectors.toList());
        System.out.println(ans);

        // 5
        List<String> words5 =
                Arrays.asList("hi", "hello", "world", "java", "stream");
        long count = words5.stream().filter(s -> s.length() > 3).count();
        System.out.println(count);

        // 6
        List<Integer> numbers6 = Arrays.asList(5, 10, 15, 20, 10, 5);
        Set<Integer> ans6 = numbers6.stream().filter(c -> c > 10)
                .collect(Collectors.toSet());
        System.out.println(ans6);

        // 7
        List<Student> students =
                Arrays.asList(new Student("Alice", 85), new Student("Bob", 75));
        Map<String, Integer> scoreMap = students.stream()
                .collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
        System.out.println(scoreMap);

        // 8
        List<Employee> employees = Arrays.asList(new Employee("John", 65000),
                new Employee("Jane", 55000), new Employee("Doe", 40000));
        List<String> ans8 =
                employees.stream().filter(e -> e.getSalary() > 50000)
                        .map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(ans8);

        // 9
        List<Person> people = Arrays.asList(new Person("Alice", 30),
                new Person("Bob", 25), new Person("Charlie", 30));
        Map<Integer, List<String>> ans9 = people.stream()
                .collect(Collectors.groupingBy(s -> s.getAge(), Collectors
                        .mapping(s -> s.getName(), Collectors.toList())));
        System.out.println(ans9);

        // 10
        List<Person2> people2 = Arrays.asList(new Person2("Alice", "Female"),
                new Person2("Bob", "Male"), new Person2("Charlie", "Male"));
                Map<Boolean, List<Person2>> ans10 = people2.stream().collect(Collectors.partitioningBy(s ->"Male".equals(s.getSex())));
                System.out.println(ans10);
        //11
        List<Integer> numbers11 =  Arrays.asList(5 , 15 , 20 , 7 , 30);
        System.out.println(numbers11 = numbers11.stream().filter(e -> e > 10).map(e -> e *2).collect(Collectors.toList()));
    }
}

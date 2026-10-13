import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp {
    String name, dept;
    int sal;

    Emp(String n, String d, int s) {
        name = n;
        dept = d;
        sal = s;
    }

    String getDept() {
        return dept;
    }

    int getSal() {
        return sal;
    }

    public String toString() {
        return name + " " + sal + " " + dept;
    }
}

class Main {
    public static void main(String[] args) {

        // Task 1
        List<String> names = Arrays.asList(
            "Aman", "Rahul", "Ankit", "Bob", "Aryan"
        );

        List<String> r1 = names.stream()
            .filter(s -> s.startsWith("A"))
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        System.out.println("Task 1: " + r1);

        List<Emp> emps = Arrays.asList(
            new Emp("Aman", "IT", 50000),
            new Emp("Riya", "HR", 40000),
            new Emp("Ankit", "IT", 70000),
            new Emp("Neha", "HR", 60000),
            new Emp("Raj", "Sales", 80000)
        );

        // Task 2
        Map<String, Integer> r2 = emps.stream()
            .collect(Collectors.groupingBy(
                Emp::getDept,
                Collectors.summingInt(Emp::getSal)
            ));

        System.out.println("Task 2: " + r2);

        // Task 3
        List<Emp> r3 = emps.stream()
            .sorted(
                Comparator.comparingInt(Emp::getSal).reversed()
            )
            .limit(3)
            .collect(Collectors.toList());

        System.out.println("Task 3: " + r3);

        // Task 4
        String s = "java is fun java is easy";

        Map<String, Long> r4 = Arrays.stream(s.split("\\s+"))
            .collect(Collectors.groupingBy(
                w -> w,
                Collectors.counting()
            ));

        System.out.println("Task 4: " + r4);
    }
}
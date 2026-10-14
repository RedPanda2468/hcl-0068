import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeDemo {

    // Simple POJO representing an engineering employee
    public static class Employee {
        private final String name;
        private final double salary; // salary in INR

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return String.format("%s – ₹%.2f", name, salary);
        }
    }

    public static void main(String[] args) {
        // Create the list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ravi", 12_500_00));   // ₹12,50,000
        employees.add(new Employee("Priya", 15_200_00));  // ₹15,20,000
        employees.add(new Employee("Astha", 10_800_00));  // ₹10,80,000

        // Sort by salary in descending order
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        // Print the sorted list
        System.out.println("Engineering employees sorted by salary (high → low):");
        employees.forEach(System.out::println);
    }
}
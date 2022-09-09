import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Collections;

public class Sort {
    public static void main(String[] args){
        // Create a LinkedHashMap object called employees
        Map<String, Integer> employees = new TreeMap<>();
        // Add keys and values (Employee name, Salary)
        employees.put("Daniel", 50000);
        employees.put("Carlos", 80000);
        employees.put("Hugo", 45000);
        employees.put("Miguel", 70000);
        System.out.println("List of Employees");
        System.out.println(employees);

        // Descending-order sorting using Map.Entry.comparingByKey()
        System.out.println("List of Salaries in descending order");
        employees
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(element -> System.out.println(element.getKey() + "=" + element.getValue()));
    }
}
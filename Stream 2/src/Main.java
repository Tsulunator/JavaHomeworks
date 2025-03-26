import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class Main{
    static List<Employee> employeeList = new ArrayList<>();
    static List<Employee> employeesJoinedIn2023;
    public static void main(String[] args){

        //1
        /*
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        List<String> filteredEmployees = employeeList.stream()
                .filter(emp -> emp.getFirstName().startsWith("A"))
                .map(emp -> emp.getFirstName() + " " + emp.getLastName())
                .collect(Collectors.toList());

        filteredEmployees.forEach(System.out::println);
         */

        //2
        /*
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        employeesJoinedIn2023 = employeeList.stream()
                .filter(emp -> emp.getId().startsWith("2023"))
                .collect(Collectors.toList());

        employeesJoinedIn2023.forEach(emp ->
                System.out.println(emp.getFirstName() +" "+ emp.getLastName())
        );
         */

        //3
        /*
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        employeeList.sort(Comparator.comparing(Employee::getFirstName)
                .thenComparing(Employee::getSalary));

        employeeList.forEach(emp ->
                System.out.println(emp.getFirstName() + " " + emp.getLastName() + " Salary: " + emp.getSalary())
        );
         */
    }
}
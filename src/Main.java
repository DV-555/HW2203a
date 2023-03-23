import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();

            employees.add(new Employee(3, "John", 25, 5000));
            employees.add(new Employee(1, "Jane", 30, 6000));
            employees.add(new Employee(2, "Bob", 25, 4000));


            System.out.println("Before sorting:");
            System.out.println(employees);

            Collections.sort(employees);

            System.out.println("\nSorting by id:");
            System.out.println(employees);

            Collections.sort(employees, SalaryComparator.salaryComparator );

            System.out.println("\nSorting by salary:");
            System.out.println(employees);

            Collections.sort(employees, AgeComparator.ageComparator);

            System.out.println("\nSorting by age:");
            System.out.println(employees);

            Collections.sort(employees, NameComparator.nameComparator);

            System.out.println("\nSorting by name:");
            System.out.println(employees);

            Collections.sort(employees, AgeAndThenNameComparator.ageAndThenNameComparator);

            System.out.println("\nSorting by age and then name:");
            System.out.println(employees);
        }
    }

    /* Before sorting:
[ID3 John age25 $5000, ID1 Jane age30 $6000, ID2 Bob age25 $4000]

Sorting by id:
[ID1 Jane age30 $6000, ID2 Bob age25 $4000, ID3 John age25 $5000]

Sorting by salary:
[ID2 Bob age25 $4000, ID3 John age25 $5000, ID1 Jane age30 $6000]

Sorting by age:
[ID2 Bob age25 $4000, ID3 John age25 $5000, ID1 Jane age30 $6000]

Sorting by name:
[ID2 Bob age25 $4000, ID1 Jane age30 $6000, ID3 John age25 $5000]

Sorting by age and then name:
[ID2 Bob age25 $4000, ID3 John age25 $5000, ID1 Jane age30 $6000]
*/

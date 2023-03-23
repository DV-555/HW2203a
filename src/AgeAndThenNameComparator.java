import java.util.Comparator;

public class AgeAndThenNameComparator {

    public static Comparator<Employee> ageAndThenNameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            int ageComparison = Integer.compare(e1.getAge(), e2.getAge());
            if (ageComparison != 0) {
                return ageComparison;
            }
            return e1.getName().compareTo(e2.getName());
        }
    };
}

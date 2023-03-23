public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private int salary;

    @Override
    public String toString() {
        return "ID" + id +
                " " + name  +
                " age"+ age +
                " $" + salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id, o.getId());
    }
}

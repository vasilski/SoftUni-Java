package A14DefiningClassesExercises.E02CompanyRoster;

public class Employee {
    private final String name;
    private Double salary;
    private String position;
    private String department;
    private String email;
    private int age;


    public Employee(String name, Double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;
    }

    public Employee(String name, Double salary, String position, String department, int age) {
            this(name, salary, position, department);
            this.age = age;
    }

    public Employee(String name, Double salary, String position, String department, String email) {
        this(name, salary, position, department);
        this.email = email;
    }

    public Employee(String name, Double salary, String position, String department, String email, int age) {
        this(name, salary, position, department, email);
        this.age = age;
    }

    public Double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
    }
}

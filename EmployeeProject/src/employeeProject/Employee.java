package employeeProject;

public class Employee {
    
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return (int) salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Calculando el salario anual del empleado
    public int getAnnualSalary() {
        return (int) (salary * 12);
    }

    // calculando el porcentaje de aumento del salario
    public void raiseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100.0);
        }
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
    }
}

package employeeProject;

public class Main {

    public static void main(String[] args) {
        
        Employee employee1 = new Employee(1, "Diana", "Rosero", 900000);
        System.out.println(employee1);
        System.out.println("Salario anual: " + employee1.getAnnualSalary());

        // Raise the salary by 10%
        employee1.raiseSalary(10);
        System.out.println("Despuès de un 10% de aumento: " + employee1);
        System.out.println("Nuevo salario mensual: " + employee1.getAnnualSalary());
    }
}

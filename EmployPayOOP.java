
import java.util.ArrayList;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee removeEmployee = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                removeEmployee = employee;
                break;
            }
        }
        if (removeEmployee != null) {
            employeeList.remove(removeEmployee);
        }
    }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class EmployPayOOP {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Fawaz Khagga", 1122, 70000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Hamdan", 2, 9, 250);
        PartTimeEmployee emp3 = new PartTimeEmployee("umair", 3, 9, 900);
        FullTimeEmployee emp4 = new FullTimeEmployee("ahmad", 4, 100000);
        FullTimeEmployee emp5 = new FullTimeEmployee("abullah warraich dog dogi wala", 5, 500000);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);
        payrollSystem.addEmployee(emp4);
        payrollSystem.addEmployee(emp5);
        System.out.println("Initial employee details:");
        payrollSystem.displayEmployees();
        System.out.println("Removing employee:");
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining employee details:");
        payrollSystem.displayEmployees();
    }
}

package ObjectMethods;

import java.util.Objects;

class Employee {
    String employeeBatchID;
    String employeeID;
    String employeeName;
    long employeeSalary;
    String employeeCity;

    @Override
    public String toString() {
        return "Employee - {" +
                "employeeBatchID='" + employeeBatchID + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeCity='" + employeeCity + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeSalary == employee.employeeSalary && Objects.equals(employeeBatchID, employee.employeeBatchID) && Objects.equals(employeeID, employee.employeeID) && Objects.equals(employeeName, employee.employeeName) && Objects.equals(employeeCity, employee.employeeCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeBatchID, employeeID, employeeName, employeeSalary, employeeCity);
    }
}

public class MyMethods {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.employeeBatchID = "ADWMB002";
        employee.employeeID = "CAND0111059";
        employee.employeeName = "Aman";
        employee.employeeSalary = 80000;
        employee.employeeCity = "Rourkela";
        System.out.println(employee);


        Employee employee1 = new Employee();
        employee1.employeeBatchID = "ADWMB002";
        employee1.employeeID = "CAND0111059";
        employee1.employeeName = "Aman";
        employee1.employeeSalary = 80000;
        employee1.employeeCity = "Rourkela";
        System.out.println(employee1);

        System.out.println(employee == employee1);
        System.out.println(employee.equals(employee1));
        System.out.println(employee.hashCode());
        System.out.println(employee1.hashCode());


        String s = new String("Odisha");
        System.out.println(s);

    }

}

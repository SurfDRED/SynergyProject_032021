package synergyitacademy.block3.lesson1.staff;

import java.util.ArrayList;
import java.util.List;

public class ListEmployees {
    public static List<Employee> getListEmployees() {
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee("Петров", 10));
        employeesList.add(new Employee("Иванов", 9));
        employeesList.add(new Employee("Сидоров", 11));
        employeesList.add(new Employee("Ячменцев", 9));
        employeesList.add(new Employee("Николаев", 12));
        employeesList.add(new Employee("Веселов", 5));
        employeesList.add(new Employee("Хоруженко", 9));
        employeesList.add(new Employee("Григорьев", 3));
        employeesList.add(new Employee("Бондаренко", 2));
        employeesList.add(new Employee("Сабиров", 1));
        return employeesList;
    }
}
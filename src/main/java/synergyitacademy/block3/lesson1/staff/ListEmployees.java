package synergyitacademy.block3.lesson1.staff;

import java.util.ArrayList;
import java.util.List;

public class ListEmployees {
    public static List<Employees> getListEmployees() {
        List<Employees> employeesList = new ArrayList<>();
        employeesList.add(new Employees("Петров", 10));
        employeesList.add(new Employees("Иванов", 9));
        employeesList.add(new Employees("Сидоров", 11));
        employeesList.add(new Employees("Ячменцев", 9));
        employeesList.add(new Employees("Николаев", 12));
        employeesList.add(new Employees("Веселов", 5));
        employeesList.add(new Employees("Хоруженко", 9));
        employeesList.add(new Employees("Григорьев", 3));
        employeesList.add(new Employees("Бондаренко", 2));
        employeesList.add(new Employees("Сабиров", 1));
        return employeesList;
    }
}
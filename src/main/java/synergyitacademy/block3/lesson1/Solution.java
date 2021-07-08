package synergyitacademy.block3.lesson1;

import synergyitacademy.block3.lesson1.staff.Employee;
import synergyitacademy.block3.lesson1.staff.ListEmployees;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //Наполним список сотрудниками
        List<Employee> employees = ListEmployees.getListEmployees();
        //Задаем стаж
        int workAge = 9;
        //печатаем всех сотрудников с заданным стажем
        printEmployee(employees, workAge);
        System.out.println("-------------------------------");
        //удаляем нечетные элементы, обходя список с конца
        delEmployee(employees);
    }

    public static void printEmployee(Collection<Employee> employees, int workAge) {
        System.out.println("Указанный стаж имеют сотрудники компании:");
        for (Employee itEmp : employees) {
            if (workAge == itEmp.getWorkAge()) {
                System.out.println(itEmp.getFullName());
            }
        }
    }

    public static void delEmployee(List<Employee> employees) {
        boolean oddNumbers = (employees.size()%2)==1;
        for (ListIterator listIterator = employees.listIterator(employees.size());
             listIterator.hasPrevious(); oddNumbers = !oddNumbers) {
            listIterator.previous();
            if (oddNumbers) {
                listIterator.remove();
            }
        }
        //отобразим новый список убрав нечетные элементы
        for (Employee itEmp : employees) {
            System.out.println(itEmp.getFullName());
        }
    }
}
package synergyitacademy.block3.lesson1;

import synergyitacademy.block3.lesson1.staff.Employees;
import synergyitacademy.block3.lesson1.staff.ListEmployees;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //Наполним список сотрудниками
        List<Employees> employees = ListEmployees.getListEmployees();
        //Задаем стаж
        int workAge = 9;
        //печатаем всех сотрудников с заданным стажем
        printEmployee(employees, workAge);
        System.out.println("-------------------------------");
        //удаляем нечетные элементы, обходя список с конца
        delEmployee(employees);
    }

    public static void printEmployee(Collection<Employees> employees, int workAge) {
        System.out.println("Указанный стаж имеют сотрудники компании:");
        for (Employees itEmp : employees) {
            if (workAge == itEmp.getWorkAge()) {
                System.out.println(itEmp.getFullName());
            }
        }
    }

    public static void delEmployee(List<Employees> employees) {
        boolean oddNumbers = true;
        if ((employees.size()%2)==0) {
            oddNumbers = false;
        }
        for (ListIterator listIterator = employees.listIterator(employees.size()); listIterator.hasPrevious(); oddNumbers = !oddNumbers) {
            listIterator.previous();
            if (oddNumbers) {
                listIterator.remove();
            }
        }
        //отобразим новый список убрав нечетные элементы
        for (Employees itEmp : employees) {
            System.out.println(itEmp.getFullName());
        }
    }
}
package synergyitacademy.block3.lesson2;

import synergyitacademy.block3.lesson2.staff.Employee;
import synergyitacademy.block3.lesson2.staff.SetEmployees;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        Set<Employee> employees = SetEmployees.getSetEmployees();
        System.out.println("Задание 1");
        System.out.println("Вывод списка сотрудников по убыванию стажа: ");
        for (Employee itEmp : employees) {
            System.out.println(itEmp.getFullName() + " Стаж: " + itEmp.getWorkAge());
        }
        Set<Integer> setOne = SetEmployees.getIntegerSet();
        Set<Integer> setTwo = SetEmployees.getIntegerSet();
        System.out.println();
        System.out.println("Задание 2");
        System.out.print("Множество One: ");
        for (Integer itSet : setOne) {
            System.out.printf("%2d ", itSet);
        }
        System.out.println();
        System.out.print("Множество Two: ");
        for (Integer itSet : setTwo) {
            System.out.printf("%2d ", itSet);
        }
        System.out.println("\n" + "Объединение двух множеств:");
        union(setOne, setTwo);
        System.out.println("\n" + "Пересечение двух множеств:");
        intersect(setOne, setTwo);
    }

    public static void union(Set set1, Set set2) {
        Set<Integer> unionSet = new TreeSet<>(set1);
        unionSet.addAll(set2);
        printSet(unionSet);
    }

    public static void intersect(Set set1, Set set2) {
        Set<Integer> intersectSet = new TreeSet<>(set1);
        intersectSet.retainAll(set2);
        printSet(intersectSet);
    }

    public static void printSet(Set<Integer> set) {
        for (Integer itSet : set) {
            System.out.printf("%2d ", itSet);
        }
    }
}
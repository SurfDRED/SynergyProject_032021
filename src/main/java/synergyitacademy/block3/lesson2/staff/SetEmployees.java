package synergyitacademy.block3.lesson2.staff;

import java.math.BigDecimal;
import java.util.*;

public class SetEmployees {
    public static Set<Employee> getSetEmployees() {
        Set<Employee> employeesSet = new TreeSet<>((o1, o2) -> {
            if (o1.getWorkAge().compareTo(o2.getWorkAge()) > 0) {
                return -1;
            } else if (o1.getWorkAge().compareTo(o2.getWorkAge()) < 0) {
                return 1;
            } else {
                //Если совпадение по стажу, то проверим по именам по алфавиту
                if (o1.getFullName().compareTo(o2.getFullName()) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        employeesSet.add(new Employee("Петров", new BigDecimal(10)));
        employeesSet.add(new Employee("Иванов", new BigDecimal(9)));
        employeesSet.add(new Employee("Сидоров", new BigDecimal(11)));
        employeesSet.add(new Employee("Ячменцев", new BigDecimal(9)));
        employeesSet.add(new Employee("Николаев", new BigDecimal(12)));
        employeesSet.add(new Employee("Веселов", new BigDecimal(5)));
        employeesSet.add(new Employee("Хоруженко", new BigDecimal(9)));
        employeesSet.add(new Employee("Григорьев", new BigDecimal(3)));
        employeesSet.add(new Employee("Бондаренко", new BigDecimal(2)));
        employeesSet.add(new Employee("Сабиров", new BigDecimal(1)));
        employeesSet.add(new Employee("Хоруженко", new BigDecimal(9)));
        return employeesSet;
    }

    public static Set<Integer> getIntegerSet() {
        Random random = new Random();
        Set<Integer> integerSet = new TreeSet<>();
        for (int i = 1; i <= 20; i++) {
            integerSet.add(random.nextInt(100));
        }
        return integerSet;
    }
}
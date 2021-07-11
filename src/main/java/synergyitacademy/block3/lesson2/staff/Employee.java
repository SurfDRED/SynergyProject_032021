package synergyitacademy.block3.lesson2.staff;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter //используем геттеры
@AllArgsConstructor //консктруктор, использующий все поля класса
@ToString //реализация метода toString()
public class Employee {
    private String fullName;
    private BigDecimal workAge;
}
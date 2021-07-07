package synergyitacademy.block3.lesson1.staff;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter //используем геттеры
@AllArgsConstructor //консктруктор, использующий все поля класса
@ToString //реализация метода toString()
public class Employees {
    String fullName;
    int workAge;
}
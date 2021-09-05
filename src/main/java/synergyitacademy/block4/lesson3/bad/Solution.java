package synergyitacademy.block4.lesson3.bad;

import synergyitacademy.block4.lesson3.bad.human.Student;
import synergyitacademy.block4.lesson3.bad.human.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Человек"));
        humans.add(new Teacher("Учитель"));
        humans.add(new Student("Студент"));
        letHumanLearn(humans);
    }
    public static void letHumanLearn(List<Human> humans) {
        for(Human human: humans) {
            human.read();
            human.teach();
        }
    }
}
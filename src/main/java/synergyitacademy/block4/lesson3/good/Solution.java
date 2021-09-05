package synergyitacademy.block4.lesson3.good;

import synergyitacademy.block4.lesson3.good.Human;
import synergyitacademy.block4.lesson3.good.human.Student;
import synergyitacademy.block4.lesson3.good.human.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        List<Teacher> Teacher = new ArrayList<>();
        humans.add(new Human());
        humans.add(new Student());
        humans.add(new Teacher());
        letHumanRead(humans);
        System.out.println("-------------------------------");
        Teacher.add(new Teacher());
        Teacher.add(new HumanTeacher());

        letHumanTeacher(Teacher);
    }

    public static void letHumanTeacher(List<Teacher> teachers) {
        for(Teacher teacher: teachers) {
            teacher.read();
            teacher.teach();
        }
    }

    public static void letHumanRead(List<Human> humans) {
        for(Human human: humans) {
            human.read();
        }
    }
}
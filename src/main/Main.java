package main;

import course.Course;
import student.Student;
import computer.Computer;

public class Main {

    public static void main(String[] args) {
        Student studentNemanja = new Student();
        studentNemanja.info();

        Student student2 = new Student("Marko", "Markovic", 2000);
        student2.info();

        Course courseQA = new Course("QA kurs", 15);
        courseQA.info();

        Computer computer1 = new Computer(3.4, 8, 250);
        computer1.info();

        Student student3 = new Student("Jovan", "Jovanovic", 1999, courseQA, computer1);
        student3.info();
    }
}

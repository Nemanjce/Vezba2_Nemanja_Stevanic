package main;

import course.Course;
import student.Student;
import computer.Computer;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("--------------------------");
        Student studentNemanja = new Student();
        studentNemanja.info();
        System.out.println("--------------------------");
        Student student2 = new Student("Marko", "Markovic", 2000);
        student2.info();
        System.out.println("--------------------------");
        Course courseQA = new Course("QA kurs", 15);
        courseQA.info();
        System.out.println("--------------------------");
        Computer computer1 = new Computer(3.4, 8, 250);
        computer1.info();
        System.out.println("--------------------------");
        Student student3 = new Student("Jovan", "Jovanovic", 1999, courseQA, computer1);
        student3.info();
    }
}

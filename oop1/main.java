package oop1;
import java.util.Arrays;

/**
 * main 
 */
public class main {

    public static void main(String[] args) {
        Student[] numbers = new Student[5];

        // Student stu1;
        Student stud1 = new Student(13,"bcd",45);
        // stud1.roll = 12;
        // stud1.name = "abc";
        // stud1.marks = 24.98f;
        stud1.greting();
        Student stud2 = new Student(stud1);
        System.out.println(stud2);
        Student random = new Student();
    }
}

/**
 * Students
 */
class Student {
    int roll;
    String name;
    float marks;



    void greting()
    {
        System.out.println("print");
    }
    Student (Student other)
    {
        this.name=other.name;
        this.roll=other.roll;
        this.marks=other.marks;
    }
    Student()
    { 
        // this is how ypu call a constructor from another constructor 
        this(13,"df",13);
        // this.roll = 12;
        // this.name = "abc";
        // this.marks = 24.98f;
    }

    Student(int rno, String naam, float num)
    {
        this.roll = rno;
        this.name = naam;
        this.marks = num;

    }
    
}
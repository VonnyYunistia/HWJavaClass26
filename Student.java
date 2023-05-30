package HWJavaClass26;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private String name;
    private int studentID;
    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }
    public String getName() {
        return name;
    }
    public int getStudentID() {
        return studentID;
    }


    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Ciwit", 123));
        students.add(new Student("BeeBee", 456));
        students.add(new Student("Django", 789));
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }














}

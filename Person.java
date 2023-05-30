package HWJavaClass26;

import java.util.Map;
import java.util.TreeMap;

public class Person {


    private String name;
    private String lastName;
    private int age;
    private double salary;
    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void printDetails() {
        System.out.println("Name: " + name + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

public class Test{


    public static void main(String[] args) {
        Map<Integer, Person> persons = new TreeMap<>();
        persons.put(3, new Person("Ciwit", "Permadi", 25, 50000.0));
        persons.put(1, new Person("BeeBee", "Sagwa", 30, 60000.0));
        persons.put(2, new Person("Django", "Cowboy", 35, 70000.0));
        for (Map.Entry<Integer, Person> entry : persons.entrySet()) {
            Person person = entry.getValue();
            person.printDetails();
        }







}

    }










}

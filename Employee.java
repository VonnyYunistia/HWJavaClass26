package HWJavaClass26;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    public static void main(String[] args) {
        Map<String, Double> employees = new HashMap<>();
        employees.put("John Smith", 100000.0);
        employees.put("Jane Doe", 90000.0);
        employees.put("Mark Smith", 110000.0);
        String highestSalaryEmployee = "";
        double highestSalary = 0.0;
        for (Map.Entry<String, Double> entry : employees.entrySet()) {
            double salary = entry.getValue();
            if (salary > highestSalary) {
                highestSalaryEmployee = entry.getKey();
                highestSalary = salary;
            }
        }
        System.out.println(highestSalaryEmployee + "=$" + highestSalary);
    }









}

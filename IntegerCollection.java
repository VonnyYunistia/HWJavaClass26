package HWJavaClass26;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollection {

    List<Integer> integerList = new ArrayList<>();

integerList.add(10);
integerList.add(20);
integerList.add(30);
integerList.add(20);


    int sum = 0;
for (int num : integerList) {
        sum += num;
    }
System.out.println("The sum of all integers in the list is: " + sum);










}

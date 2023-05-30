package HWJavaClass26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringObject {


    private ArrayList<String> strings;

    public StringObject() {
        strings = new ArrayList<String>();
    }

    public void add(String str) {
        if (!strings.contains(str)) {
            strings.add(str);
        }
    }

    public String concatenate() {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }







}

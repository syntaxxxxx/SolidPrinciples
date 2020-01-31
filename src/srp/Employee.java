package srp;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private final List<String> name = new ArrayList<>();
    private static int count = 0;

    public void addEmployee(String name) {
        this.name.add("index " + (count++) + " => " + "Name: " + name);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), name);
    }
}

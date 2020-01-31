package srp;

import java.io.PrintStream;

class File {
    public void saveToFile(Employee employee, String filename) throws Exception {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(employee.toString());
        }
    }
}
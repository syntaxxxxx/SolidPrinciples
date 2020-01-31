package srp;

public class Main {
    public static void main(String[] args) throws Exception {

        Employee employee = new Employee();
        employee.addEmployee("Fiqri");
        employee.addEmployee("Kece");

        File file = new File();
        String fileName = "employee.txt";
        file.saveToFile(employee, fileName);
        System.out.println(employee);
    }
}
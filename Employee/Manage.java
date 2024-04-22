import java.util.Scanner;
import java.util.ArrayList;

public class Manage {
    static Scanner scanner= new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args){
        Manage manage = new Manage(); 
        manage.initializeEmployees();
        manage.displayEmployees();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add new employee");
            System.out.println("2. Remove an employee");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }

    public static void initializeEmployees() {
        employees.add(new Employee(1, "Duy", 30, "IT", "JD001", 3000));
        employees.add(new Employee(2, "Khanh", 35, "Finance", "AS002", 3500));
        employees.add(new Employee(3, "Ngoc", 28, "HR", "BJ003", 2800));
        employees.add(new Employee(4, "Ha", 32, "Marketing", "EB004", 3200));
        employees.add(new Employee(5, "Minh", 29, "IT", "MW005", 2900));
        employees.add(new Employee(6, "Quan", 31, "Finance", "JL006", 3100));
        employees.add(new Employee(7, "Long", 33, "HR", "DM007", 3300));
        employees.add(new Employee(8, "Anh", 27, "Marketing", "SG008", 2700));
        employees.add(new Employee(9, "Dat", 34, "IT", "WM009", 3400));
        employees.add(new Employee(10, "Manh", 26, "Finance", "OL010", 2600));
    }

    public static void displayEmployees() {
        System.out.println("List of employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void addEmployee(){
        System.out.print("Enter employee Id:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter employee Name:");
        String name = scanner.nextLine();
        System.out.print("Enter employee Age:");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter employee Department:");
        String department = scanner.nextLine();
        System.out.print("Enter employee Code:");
        String code = scanner.nextLine();
        System.out.print("Enter employee Salaryrate:");
        double salaryRate = scanner.nextDouble();
        scanner.nextLine(); 
    
        Employee newEmployee = new Employee(id, name, age, department, code, salaryRate);
        employees.add(newEmployee);
        System.out.println("New employee added successfully.");
    }

    public static void removeEmployee() {
        System.out.print("Enter employee ID to remove:");
        int idToRemove = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getId() == idToRemove) {
                employees.remove(employee);
                found = true;
                System.out.println("Employee with ID " + idToRemove + " removed successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + idToRemove + " not found.");
        }
    }
    
}

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    static int idIterator;

    public static int sumOfSalary (Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static int middleSalary(Employee[] employees) {
        return sumOfSalary(employees) / employees.length;
    }

    public static void printNamesEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            String fio;
            fio =  employees[i].getFirstName() + " "  + employees[i].getLastName();
            System.out.println(fio);
        }
    }



    public static Employee minSalary(Employee[] employees) {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public static Employee maxSalary(Employee[] employees) {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }

        }
        return max;
    }

    public static void main(String[] args) {
         Employee[]  employees = {
                new Employee("John","Mill", 100000, 1),
                new Employee("Antony","Blinkin", 103000, 2),
                new Employee("Max","Sax", 102000, 3),
                new Employee("Josh","Benner", 101000, 4),
                new Employee("Jin","Maven", 100000, 5),
                new Employee("Jotaro","Collax", 100560, 1),
                new Employee("Denis","Great", 103000, 2),
                new Employee("Fazar","Killua", 99670, 3),
                new Employee("Ken","Ortego", 102000, 4),
                new Employee("Wendy","Seylor", 101100, 5),
        };
        System.out.println("База сотрудников: ");
        for (int i = 0; i < employees.length ; i++) {

            System.out.println(employees[i].toString());
            System.out.println("-----------------");
            for (int j = 0; j < employees.length; j++) {
            }
        }

        System.out.println("\n Total salary: " + sumOfSalary(employees) + " rub");
        System.out.println("\n Сотрудник с минимальной зарплатой: " + minSalary(employees));
        System.out.println("\n Сотрудник с максимальной зарплатой: " + maxSalary(employees));
        System.out.println("\n Среднее значение зарплат: " + middleSalary(employees));
        System.out.println("\n ФИО сотрудников : \n");
        printNamesEmployees(employees);





    }



}


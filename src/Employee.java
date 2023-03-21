public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private int department;



    public Employee(String firstName, String lastName, int salary, int department) {
        this.id = Main.idIterator++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;

    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() { return "id: " + this.id + " firstName: " + firstName + " lastName: " + lastName + " Зарплата: " + salary + " Отдел: " + department;}


}

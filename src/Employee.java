public class Employee extends Person{
    public String title;
    public String employer;
    public String employeeGrade;
    public int salary;


    public String toString() {
        return super.toString() + title + name + employer + employeeGrade + salary;
    }
}

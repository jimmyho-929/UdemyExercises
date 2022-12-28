public class EmployerRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Jimmy");
        employee.title = "Software Developer";
        employee.employer = "Creospan";
        employee.salary = 90000;
        employee.employeeGrade = "A";
        employee.setEmail("x@email.com");
        employee.setPhone("111");

        System.out.println(employee.toString());
    }
}

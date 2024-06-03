package may21.employeeconsumer;

public class MainEmployee {
    public static void main(String[] args) {

        EmpDetails empDetails = new EmpDetails();

        Employee employee = new Employee("Mira","Riya");


        String fetchEmp = empDetails.empInfo( e -> e.getFirstName() +" "+e.getLastName(), employee);

        System.out.println(fetchEmp);
    }
}

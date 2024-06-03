package may21.bifunction;

public class Main {

    public static void main(String[] args) {

        Empdetails empdetails = new Empdetails();

        Employee employee = new Employee("Maya","Chaya");

        String result = empdetails.empInfo((firstName , lastName) -> "Employee:"+ firstName+" "+lastName,employee );

        System.out.println(result);

    }
}

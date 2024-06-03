package may21.employee;

import may21.Student;

import java.util.function.Function;

public class EmpDetails {

    public String empInfo (Function<Employee , String> function, Employee employee){

        return function.apply(employee);
    }
}

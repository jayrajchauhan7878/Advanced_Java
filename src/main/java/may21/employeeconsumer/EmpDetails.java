package may21.employeeconsumer;

import java.util.function.Function;

public class EmpDetails {

    public String empInfo (Function<Employee , String> function, Employee employee){

        return function.apply(employee);
    }
}

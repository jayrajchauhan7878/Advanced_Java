package may21.bifunction;

import may21.Student;

import java.util.function.BiFunction;

public class Empdetails {

    public String empInfo(BiFunction <String,String,String> biFunction , Employee employee){

        return biFunction.apply(employee.getFirstName(), employee.getLastName());
    }
}

package may21;

import java.util.function.Function;

public class FunctionDemo{
    
    public String studentInfo(Function <Student , String> function , Student student){
        
        return function.apply(student);
        
    }
}

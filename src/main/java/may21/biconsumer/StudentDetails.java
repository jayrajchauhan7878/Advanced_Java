package may21.biconsumer;

import java.util.function.BiConsumer;

public class StudentDetails {

    public void studentInfo (BiConsumer < String , String > biConsumer , Student student){


         biConsumer.accept(student.getFirstName(), student.getLastName());
    }


}

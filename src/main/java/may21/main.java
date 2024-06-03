package may21;

public class main{

    public static void main(String[] args) {

        FunctionDemo functionDemo = new FunctionDemo();

        Student student = new Student("Roy","Joy");

        String result = functionDemo.studentInfo(s -> "Student:"+ s.getFirstName()+" "+s.getLastName(), student);

        System.out.println(result);

    }
}

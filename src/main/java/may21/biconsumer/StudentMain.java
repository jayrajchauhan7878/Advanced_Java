package may21.biconsumer;

public class StudentMain {

    public static void main(String[] args) {

        StudentDetails studentDetails = new StudentDetails();

        Student student = new Student("John","Wick");

        studentDetails.studentInfo(
                (firstName , lastName) -> System.out.print("First Name :"+firstName + " \nLast Name :"+lastName), student);
    }
}

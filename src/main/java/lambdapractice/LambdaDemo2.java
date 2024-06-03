package lambdapractice;



interface speaker{

    public String song();
}
public class LambdaDemo2 {


    public static void main(String[] args) {

        speaker s = () -> {
            return "Shape of you";
        };

        System.out.println(s.song());
    }
}

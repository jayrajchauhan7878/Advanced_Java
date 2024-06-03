package lambdapractice;


interface MyName1{

    public String say(String name);

}
public class LambdaDemo3 {

    public static void main(String[] args) {

        MyName1 n1 = (name) -> {
            return "Hello," +name;
        };

        MyName1 n2 = name -> {
            return "Hello,"+name;
        };

        System.out.println(n2.say("Jay"));

        MyName1 n3 = name -> "Hello,"+name;

        System.out.println(n3.say("Joy"));
    }

}

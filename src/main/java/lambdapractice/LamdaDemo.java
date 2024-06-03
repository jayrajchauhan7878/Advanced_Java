package lambdapractice;

interface MyName{

    public void SayMyName();
}

public class LamdaDemo {

    public static void main(String[] args) {

        MyName p1 = () -> {
            System.out.println("Jay");
        };

        p1.SayMyName();
    }
}
package lambdapractice;


interface add{

    public int sum(int a,int b);
}
public class LambdaSum {

    public static void main(String[] args) {


        add add1 = (a,b) -> (a+b);
        System.out.println(add1.sum(200,300));


        add add2 = (int a , int b ) -> ( a+b);
        System.out.println(add2.sum(100,200));

    }
}

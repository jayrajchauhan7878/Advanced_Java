package lambdapractice;


interface add1{

    public int sum(int a , int b);
}

public class LambdaWithorWithoutReturn {

    public static void main(String[] args) {

        add1 add1 = (a , b) -> (a=b);
        System.out.println(add1.sum(100,200));

        add1 add2 = ( a ,b ) -> {
            return (a + b);
        };
        System.out.println(add2.sum(200,300));
    }




}

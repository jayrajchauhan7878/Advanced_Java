package lambdapractice;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.add("Jay");
        names.add("Joy");
        names.add("Roy");
        names.add("Doy");

        names.forEach(
                (elements) -> System.out.println(elements)
        );

    }
}

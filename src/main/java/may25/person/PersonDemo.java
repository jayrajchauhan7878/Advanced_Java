package may25.person;

import java.util.*;
import java.util.stream.Collectors;

public class PersonDemo {


    public static void main(String[] args) {


        Person person1 = new Person("1","Robert",40, Optional.of("rob@me.com"));
        Person person2 = new Person("2","Julia",30, Optional.of("julia@me.com"));
        Person person3 = new Person("3","Bob",20, Optional.empty());
        Person person4 = new Person("4","Diana",60, Optional.of("rob@me.com"));
        Person person5 = new Person("5","Eve",10, Optional.empty());


        List<Person> personList  = Arrays.asList(person1,person2,person3,person4,person5);



        personList.forEach(person -> {String email = person.getEmail().orElse("Email not provided");
        System.out.println(person.getName() +" "+email);
        });

        List<Person> personEmail = personList.stream().filter(person -> person.getEmail().isPresent()).collect(Collectors.toList());
        System.out.println("People with email address: "+personEmail);

        Integer defineAge = 50;

        Optional<Person> personOlderThanAge = personList.stream().filter(person -> person.getAge() > defineAge).findFirst();

        personOlderThanAge.ifPresent(person -> System.out.println(("First person older than "+defineAge+":"+personOlderThanAge)));

        List<Person> sortedWithName = personList.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());

        System.out.println("Sorted People with their name : "+sortedWithName);



    }
}

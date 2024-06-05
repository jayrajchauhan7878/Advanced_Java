package may25.person;

import java.util.Objects;
import java.util.Optional;

public class Person {


    private String id;
    private String name;
    private Integer age;
    private Optional<String> email;

    public Person(String id, String name, Integer age, Optional<String> email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Optional<String> getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email=" + email +
                '}';
    }
}

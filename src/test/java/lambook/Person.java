package lambook;

import lombok.Builder;
import lombok.Data;
import lombok.Value;
import lombok.With;

@Data
@Builder
@Value
@With

public class Person {
    String name;
    int age;
    Cat cat;


    public void main(String[] args) {

        Person newOne = new Person("Bob", 12, cat);
        Cat cat1 = new Cat("Barsik", 15, newOne);
        Cat cat2 = new Cat("Murka", 14, newOne);


    }
}
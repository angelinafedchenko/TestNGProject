package lambook;

import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.nio.file.FileStore;
@With
@Builder
@Value

public class Cat {

    String name;
    int age;
    Person person;

    Cat cat = Cat.builder()
            .age(3)
            .build();


}

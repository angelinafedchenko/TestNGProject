package lambook;

import lombok.*;
import org.testng.annotations.Test;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Builder
@Data

public class App {

    private int time;
    private String name;
    @Singular("sheep")
    private List<String>lore;

//    public App(int time, String name, List <String> lore) {
//        this.time = time;
//        this.name = name;
//        this.lore = lore;
//    }

    @Test
    public static void runApp() {

        App app1 = App.builder()
                .name("name")
                .build();
        System.out.println(app1.toString());
    }
}

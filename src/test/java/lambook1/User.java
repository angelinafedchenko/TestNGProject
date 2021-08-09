package lambook1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor

public class User {
    private String email;
    private String firstName;
    private String password;


//    public User (String email, String firstName, String password) {
//        this.email = email;
//        this.firstName = firstName;
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//    public String getPassword() {
//        return password;
//    }
//


    public static void main(String[] args) {
        User a = new User("@gmail", "Bob", "qwerty");
        System.out.println(a.getEmail());

    }

}

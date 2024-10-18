import java.util.HashSet;
import java.util.Set;

public class UserNameManager {
    public static void main(String[] args) {
        Set<String> usernames = new HashSet<>();

        usernames.add("user1");
        usernames.add("user2");

        if (usernames.contains("user1")) {
            System.out.println("Username exists.");
        } 

        usernames.remove("user2");
    }
}
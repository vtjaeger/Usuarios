package Main;

import Users.Admin;
import Users.User;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Vinicius", "vini@", "senha");
        Admin admin1 = new Admin("Bernarda", "be@", "senha123");

        admin1.doComment("Comentário teste");
        user1.doComment("teste");

        admin1.removeComments(user1, 0);
        user1.showFormattedComments();
    }
}
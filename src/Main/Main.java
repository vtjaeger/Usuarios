package Main;

import Users.Admin;
import Users.User;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Vinicius", "vini@", "senha");
        Admin admin1 = new Admin("Bernarda", "be@", "senha123");

        user1.doComment("1");
        user1.doComment("2");

        user1.getComments();
        admin1.removeComments(user1, 0);
        user1.getComments();
    }
}
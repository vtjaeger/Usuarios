package Main;

import Users.Admin;
import Users.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Vinicius", "vini@", "senha");
        Admin admin1 = new Admin("Bernarda", "be@", "senha123");

        admin1.doComment("Comentário teste");
        user1.doComment("teste");


        // METODOS DE ADMIN
//        admin1.changeNames(user1, "Felipe");
//        System.out.println(user1.getName());

//        admin1.removeComments(user1, 0);
//        System.out.println(user1.getComments());

//        admin1.showAllUserComments(user1); ARRUMAR PARA NAO APARECER COMENTARIOS ANTES DOS COMENTS

//        admin1.enviarNotificao(user1, "testando funcao");

//        admin1.isConfiavel();


        // METODOS USER
        user1.atualizarPerfil("felipe", "fe@", "123");
        System.out.println(user1.getName());
        System.out.println(user1.getEmail());
    }
}
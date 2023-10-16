package Users;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User{
    public Admin(String name, String email, String senha) {
        super(name, email, senha);
    }
    public boolean changeNames(User user, String newName) {
        if (newName != null && !newName.isEmpty()) {
            user.setName(newName);
            return true;
        } else {
            return false;
        }
    }
    public boolean removeComments(User user, int index){
        if(index >= 0 && index < user.getComments().size()){
            user.getComments().remove(index);
            return true;
        } else {
            System.out.println("Indice invalido");
            return false;
        }
    }
    public boolean showAllCommentsUser(User user) {
        return user.showFormattedComments();
    }
}

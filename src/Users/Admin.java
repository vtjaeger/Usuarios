package Users;

import Interfaces.Confiavel;
import Interfaces.Notificavel;

public class Admin extends User implements Notificavel, Confiavel {
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

    public boolean removeComments(User user, int index) {
        if (index >= 0 && index < user.getComments().size()) {
            user.getComments().remove(index);
            return true;
        } else {
            System.out.println("Indice invalido");
            return false;
        }
    }

    public boolean showAllUserComments(User user) {
        return user.showFormattedComments();
    }

    @Override
    public void enviarNotificao(User destinatario, String mensagem) {
        System.out.println("Notificação do ADMIN " + getName() + " para " + destinatario.getName() + ": " + mensagem);

    }

    @Override
    public boolean isConfiavel() {
        boolean confiavel = getDataRegistro().getYear() < 2022;
        if(confiavel) {
            System.out.println(getName() + " é confiavel");
        } else{
            System.out.println(getName() + " é usuário desde " + getDataRegistro().getYear());
        }
        return confiavel;
    }
}

package Interfaces;

import Users.User;

public interface Notificavel {
    void enviarNotificao(User destinatario, String mensagem);
}

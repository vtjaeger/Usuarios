package Users;

import Interfaces.Confiavel;
import Interfaces.Notificavel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class User implements Notificavel, Confiavel {
    private String name;
    private String email;
    private String passoword;
    private LocalDate dataRegistro;
    private boolean active;
    private List<String> comments;

    public User(String name, String email, String passoword) {
        this.name = name;
        this.email = email;
        this.passoword = passoword;
        dataRegistro = LocalDate.of(2023,10, 15);
        this.comments = new ArrayList<>();
        this.active = true;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    protected LocalDate getDataRegistro() {
        return dataRegistro;
    }

    protected boolean isActive() {
        return active;
    }
    protected void setName(String name) {
        this.name = name;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected void setPassoword(String passoword) {
        this.passoword = passoword;
    }

    protected void setActive(boolean active) {
        this.active = active;
    }
    public void atualizarPerfil(String name, String email, String senha){
        this.name = name;
        this.email = email;
        this.passoword = senha;

        if(email != null && email.isEmpty()){
            this.email = email;
        }
        if(senha != null && !senha.isEmpty() && !senha.equals(this.passoword)){
            this.passoword = senha;
        }
    }
    public String getDataRegistroBr(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataRegistro.format(formatter);
    }
    public void doComment(String comment){
        comments.add(comment);
    }
    public List<String> getComments(){
        return comments;
    }
    public void showActive(){
        if(active) {
            System.out.println("Ativo");
        }
        else {
            System.out.println("Inativo");
        }
    }
    public List<String> formattedComments(){
        List<String> formattedComents = new ArrayList<>();
        for(String comment : comments){
            String formattedComment = String.format("Comentario de %s: %s", getName(), comment);
            formattedComents.add(formattedComment);
        }
        return formattedComents;
    }
    public boolean showFormattedComments(){
        List<String> formattedComments = formattedComments();

        if(!formattedComments.isEmpty()){
            System.out.println("Comentários:");
            for (String comment : formattedComments) {
                System.out.println(comment);
            }
            return true;
        } else {
            System.out.println("Nenhum comentario disponivel");
            return false;
        }
    }

    @Override
    public void enviarNotificao(User destinatario, String mensagem) {
        if(this != destinatario){
            System.out.println("Notificação de " + getName() + " para: " + destinatario.getName() + ": " + mensagem);
        } else {
            System.out.println("Você não pode enviar uma mensagem para si mesmo.");
        }
    }

    @Override
    public boolean isConfiavel() {
        boolean confiavel = dataRegistro.getYear() < 2022;
        if(confiavel) {
            System.out.println(getName() + " é confiavel");
        } else{
            System.out.println(getName() + " é usuário desde " + dataRegistro.getYear());
        }
        return confiavel;
    }
}

package Users;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class User {
    private String name;
    private String email;
    private String senha;
    private LocalDate dataRegistro;
    private boolean ativo;
    private List<String> comments;

    public User(String name, String email, String senha) {
        this.name = name;
        this.email = email;
        this.senha = senha;
        dataRegistro = LocalDate.of(2023,10, 15);
        this.comments = new ArrayList<>();
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

    public boolean isAtivo() {
        return ativo;
    }
    protected void setName(String name) {
        this.name = name;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    protected void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public void atualizarPerfil(String name, String email, String senha){
        this.name = name;

        if(email != null && email.isEmpty()){
            this.email = email;
        }
        if(senha != null && !email.isEmpty() && !senha.equals(this.senha)){
            this.senha = senha;
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
        System.out.println(comments);
        return comments;
    }
}

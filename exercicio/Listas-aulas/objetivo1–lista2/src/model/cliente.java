package model;

public class cliente {

    String nome;
    String cpf;
    String sobrenome;
    String enedereco;
    String telefone;
    String email;

    public cliente(String nome, String cpf, String sobrenome, String enedereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.sobrenome = sobrenome;
        this.enedereco = enedereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEnedereco() {
        return enedereco;
    }

    public void setEnedereco(String enedereco) {
        this.enedereco = enedereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", enedereco='" + enedereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

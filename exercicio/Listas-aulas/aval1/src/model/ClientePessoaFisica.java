package model;

public class ClientePessoaFisica extends Cliente{
    private String cpf;


    public ClientePessoaFisica(String nome, String sobrenome, String email, String cpf) {
        super(nome, sobrenome, email);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ClientePessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ",Quantidade de Ações " + qteAcoes +
                '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

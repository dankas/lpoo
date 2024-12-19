package model;

public class ClientePessoaJuridica extends Cliente {
    private String cnpj;

    public ClientePessoaJuridica(String nome, String sobrenome, String email, String cnpj) {
        super(nome, sobrenome, email);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "ClientePessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ",Quantidade de Ações " + qteAcoes +
                '}';
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

package model;



public abstract class Cliente implements Socio {
    protected String nome;
    protected String sobrenome;
    protected String email;
    protected int qteAcoes;
    protected double valorAcao;

    public Cliente(String nome, String sobrenome, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.qteAcoes = 0;
        this.valorAcao = 0;
    }

    @Override
    public int getQuantidadeDeAcoes() {
        return this.qteAcoes;
    }

    @Override
    public double getValorAcoes() {
        return this.valorAcao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setQteAcoes(int qteAcoes) {
        this.qteAcoes = qteAcoes;
    }

    public void setValorAcao(double valorAcao) {
        this.valorAcao = valorAcao;
    }
}

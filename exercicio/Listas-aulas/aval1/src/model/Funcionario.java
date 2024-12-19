package model;

public abstract class Funcionario implements Socio {
    protected String nome;
    protected String sobrenome;
    protected double salario;
    protected int qteAcoes;
    protected double valorAcao;

    public Funcionario(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setQteAcoes(int qteAcoes) {
        this.qteAcoes = qteAcoes;
    }

    public void setValorAcao(double valorAcao) {
        this.valorAcao = valorAcao;
    }
}

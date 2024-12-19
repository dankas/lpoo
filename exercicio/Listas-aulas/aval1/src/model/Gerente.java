package model;

public  class Gerente extends Funcionario {
    private double taxaDeBonificacao;

    public Gerente(String nome, String sobrenome, double salario, double taxaDeBonificacao) {
        super(nome, sobrenome, salario);
        this.taxaDeBonificacao = taxaDeBonificacao;
    }

    public double getTaxaDeBonificacao() {
        return taxaDeBonificacao;
    }

    public void setTaxaDeBonificacao(double taxaDeBonificacao) {
        this.taxaDeBonificacao = taxaDeBonificacao;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "taxaDeBonoficação=" + taxaDeBonificacao +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salario=" + salario + '\'' +
                ",Quantidade de Ações " + qteAcoes +
                '}';
    }
}

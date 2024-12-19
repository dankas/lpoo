package model;

public class Vendedor extends Funcionario {
    private double TaxaDeComissao;

    public Vendedor(String nome, String sobrenome, double salario, double taxaDeComissao) {
        super(nome, sobrenome, salario);
        this.TaxaDeComissao = taxaDeComissao;
    }

    public double getTaxaDeComissao() {
        return TaxaDeComissao;
    }

    public void setTaxaDeComissao(double taxaDeComissao) {
        TaxaDeComissao = taxaDeComissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "TaxaDeComissao=" + TaxaDeComissao +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salario=" + salario +'\'' +
                ",Quantidade de Ações " + qteAcoes +
                '}';
    }

}

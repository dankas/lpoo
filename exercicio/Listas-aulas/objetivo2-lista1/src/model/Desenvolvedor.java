package model;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor() {
        super();
    }
    public Desenvolvedor(String nome, double salario,double bonus) {
        super(nome,salario,bonus);

    }
    @Override
    public double getBonus() {
        return this.salario * this.bonus;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}

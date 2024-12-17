package model;

public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, double salario,double bonus) {
        super(nome, salario,bonus);
    }

    @Override
    public double getBonus() {
        return this.salario * this.bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}

package model;

public abstract class Funcionario {
    protected String nome;
    protected double salario;
    protected double bonus;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario,double bonus) {
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public abstract double getBonus();
}

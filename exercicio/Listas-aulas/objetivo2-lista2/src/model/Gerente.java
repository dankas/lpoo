package model;



public class Gerente extends Funcionario implements Investidor {

    private String ticker;
    private int qdeCotas;

    public Gerente(String nome, double salario, String ticker, int qdeCotas) {

        super(nome, salario);
        this.qdeCotas = qdeCotas;
        this.ticker = ticker;
    }

    @Override
    public double getBonus() {
        return this.salario * 0.1;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                        ", qdeCotas=" + qdeCotas +
                '}';
    }

    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public int getQdeCotas() {
        return qdeCotas;
    }

    @Override
    public void setTicker(String ticker) {

    }

    @Override
    public void setQdeCotas(int qdeCotas) {

    }
}

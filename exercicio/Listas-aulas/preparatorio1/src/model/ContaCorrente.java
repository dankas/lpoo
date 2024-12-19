package model;

public class ContaCorrente extends Conta  implements Associado{
    int qteCotas;
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public void setQteCotas(int qteCotas) {
        this.qteCotas = qteCotas;
    }

    @Override
    public void atualiza(double valor) {
        saldo += valor*saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }

    @Override
    public int getQdeCotas() {
        return 0;
    }
}

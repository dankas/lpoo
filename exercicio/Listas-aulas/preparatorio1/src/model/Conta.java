package model;

public abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

     public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }
    public void saca(double valor) {
        this.saldo -= valor;
    }
    abstract public void atualiza(double valor);
}

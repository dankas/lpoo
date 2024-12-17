package model;

public abstract class Conta {
    double saldo;


    void deposita(double valor) {
        this.saldo += valor;
    }
    void saca(double valor) {
        this.saldo -= valor;
    }
    abstract void atualiza(double valor);
}

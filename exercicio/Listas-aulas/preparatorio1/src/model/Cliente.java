package model;

import java.io.Serializable;

public class Cliente implements Associado {
    private String nome;
    private int qteCotas;

    public Cliente(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQteCotas(int qteCotas) {
        this.qteCotas = qteCotas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", qteCotas=" + qteCotas +
                '}';
    }

    @Override
    public int getQdeCotas() {
        return this.qteCotas;
    }
}

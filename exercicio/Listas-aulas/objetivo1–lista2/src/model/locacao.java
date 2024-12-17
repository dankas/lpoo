package model;

import java.util.Date;

public class locacao {
    Date dataHoraLocacao;
    Date dataHoraDevolucao;
    int quilometragem;
    double valor_caucao;
    double valor_locacao;
    boolean devolucao;

    public locacao(Date dataHoraLocacao, Date dataHoraDevolucao, int quilometragem, double valor_caucao, double valor_locacao, boolean devolucao) {
        this.dataHoraLocacao = dataHoraLocacao;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.quilometragem = quilometragem;
        this.valor_caucao = valor_caucao;
        this.valor_locacao = valor_locacao;
        this.devolucao = devolucao;
    }

    public Date getDataHoraLocacao() {
        return dataHoraLocacao;
    }

    public void setDataHoraLocacao(Date dataHoraLocacao) {
        this.dataHoraLocacao = dataHoraLocacao;
    }

    public Date getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(Date dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValor_caucao() {
        return valor_caucao;
    }

    public void setValor_caucao(double valor_caucao) {
        this.valor_caucao = valor_caucao;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public boolean isDevolucao() {
        return devolucao;
    }

    public void setDevolucao(boolean devolucao) {
        this.devolucao = devolucao;
    }

    @Override
    public String toString() {
        return "locacao{" +
                "dataHoraLocacao=" + dataHoraLocacao +
                ", dataHoraDevolucao=" + dataHoraDevolucao +
                ", quilometragem=" + quilometragem +
                ", valor_caucao=" + valor_caucao +
                ", valor_locacao=" + valor_locacao +
                ", devolucao=" + devolucao +
                '}';
    }
}

package model;

public class Automovel {
    String renavan;
    String placa;
    String cor;
    int num_rodas;
    String combustivel;
    int quilometragem;
    String chassi;
    double valor_locacao;

    public Automovel(String renavan, String placa, String cor, int num_rodas, String combustivel, int quilometragem, String chassi, double valor_locacao) {
        this.renavan = renavan;
        this.placa = placa;
        this.cor = cor;
        this.num_rodas = num_rodas;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.chassi = chassi;
        this.valor_locacao = valor_locacao;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNum_rodas() {
        return num_rodas;
    }

    public void setNum_rodas(int num_rodas) {
        this.num_rodas = num_rodas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    @Override
    public String toString() {
        return "automovel{" +
                "renavan='" + renavan + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", num_rodas=" + num_rodas +
                ", combustivel='" + combustivel + '\'' +
                ", quilometragem=" + quilometragem +
                ", chassi='" + chassi + '\'' +
                ", valor_locacao=" + valor_locacao +
                '}';
    }
}

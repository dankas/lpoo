package model;

public class Cliente implements Investidor {
    private String nome;
    private String sobrenome;
    private String ticker;
    private int qdeCotas;
    int id;

    public Cliente(int id,String nome, String sobrenome, String ticker, int qdeCotas) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ticker = ticker;
        this.qdeCotas = qdeCotas;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public int getQdeCotas() {
        return qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", ticker='" + ticker + '\'' +
                ", qdeCotas=" + qdeCotas +
                '}';
    }
}

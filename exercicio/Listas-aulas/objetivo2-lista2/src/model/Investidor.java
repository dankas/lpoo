package model;

public interface Investidor {
    String getTicker();
    int getQdeCotas();
    void setTicker(String ticker);
    void setQdeCotas(int qdeCotas);
}
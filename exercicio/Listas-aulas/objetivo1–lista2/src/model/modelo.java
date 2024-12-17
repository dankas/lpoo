package model;

public class modelo {
    String descricao;

    public modelo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "modelo{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}

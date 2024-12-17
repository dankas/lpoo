package model;

public class marca {

    String descricao;

    public marca(String descricao) {
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
        return "marca{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}

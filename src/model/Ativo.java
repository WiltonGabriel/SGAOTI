package model;

public class Ativo {
    private String patrimonio;
    private String descricao;
    private String status;

    public Ativo(String patrimonio, String descricao, String status) {
        this.patrimonio = patrimonio;
        this.descricao = descricao;
        this.status = status;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

}

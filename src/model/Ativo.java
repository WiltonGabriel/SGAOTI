package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ativo {
    private String nome;
    private LocalDateTime dataRegistro;

    private String patrimonio; //OPT
    private String descricao; //OPT
    private String padraoEncaixe; //IF CPU/Mobo/RAM

    private String status; //Funcionando/Defeito$/Desconhecido/Inoperante default: Pendente

    private String categoria;
    private ArrayList<Ativo> componentes;

    public Ativo(String nome, String patrimonio, String descricao, String status, String padraoEncaixe, String categoria) {
        this.nome = nome;
        this.dataRegistro = LocalDateTime.now();
        this.patrimonio = patrimonio;
        this.descricao = descricao;
        this.padraoEncaixe = padraoEncaixe;
        this.status = status;
        this.categoria = categoria;
        this.componentes = new ArrayList<>();
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPadraoEncaixe() {
        return padraoEncaixe;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public String getStatus() {
        return status;
    }

    public String getCategoria() {
        return categoria;
    }

    public ArrayList<Ativo> getComponentes() {
        return componentes;
    }

}

package repository;

import model.Ativo;

import java.util.ArrayList;

public class AtivoRepository {
    private ArrayList<Ativo> ativos;

    public AtivoRepository() {
        this.ativos = new ArrayList<>();
    }

    public void salvarAtivo(Ativo novoativo) {
        this.ativos.add(novoativo);

        System.out.println("log: Ativo salvo com sucesso!");
    }

    public ArrayList<Ativo> listarAtivos() {
        return this.ativos;
    }

}

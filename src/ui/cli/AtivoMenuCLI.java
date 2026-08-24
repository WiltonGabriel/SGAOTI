package ui.cli;

import java.util.Scanner;
import model.Ativo;
import repository.AtivoRepository;

public class AtivoMenuCLI {
    
    private Scanner scanner;
    private AtivoRepository repository;

    public AtivoMenuCLI(Scanner scanner, AtivoRepository repository) {
        this.scanner = scanner;
        this.repository = repository;
    }

    public void displayMenu() {
        int choice = -1;

        while (choice != 0) {

            System.out.println("\n--- MÓDULO DE ATIVOS ---");
            System.out.println("1. Cadastrar novo ativo");
            System.out.println("2. Listar ativos");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerAsset();
                    break;
                case 2:
                    listAssets();
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void registerAsset() {
        System.out.println("\n--- CADASTRAR NOVO ATIVO ---");
        
        System.out.print("Digite o Patrimônio (ID): ");
        String patrimonio = scanner.nextLine();

        System.out.print("Digite a Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite o Status: ");
        String status = scanner.nextLine();

        Ativo novoAtivo = new Ativo(patrimonio, descricao, status);
        this.repository.salvarAtivo(novoAtivo);
    }

    private void listAssets() {
        System.out.println("\n--- LISTA DE ATIVOS ---");
        var assetList = this.repository.listarAtivos();

        if (assetList.isEmpty()) {
            System.out.println("Nenhum ativo cadastrado ainda.");
        } else {
            
            for (Ativo ativo : assetList) {
                System.out.println("Patrimônio: " + ativo.getPatrimonio() + " | Descrição: " + ativo.getDescricao() + " | Status: " + ativo.getStatus());
            }
        }
    }
}
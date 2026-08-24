package ui.cli;

import java.util.Scanner;
import repository.AtivoRepository;

public class MainMenuCLI {
    private Scanner scanner;
    private AtivoRepository repository;

    public MainMenuCLI() {
        this.scanner = new Scanner(System.in);
        this.repository = new AtivoRepository(); 
    }

    public void displayMenu() {
        int choice = -1;
        
        while (choice != 3) {
            
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Módulo de Ativos");
            System.out.println("2. Módulo de Operações");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    AtivoMenuCLI ativoMenu = new AtivoMenuCLI(this.scanner, this.repository);
                    ativoMenu.displayMenu(); 
                    break;
                case 2:
                    System.out.println("Módulo de Operações ainda não implementado.");
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }   
}
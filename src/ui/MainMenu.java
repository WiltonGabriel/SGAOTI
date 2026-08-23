package ui;

import java.util.Scanner;

public class MainMenu {
    private Scanner scanner;

    public MainMenu() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {

        int choice = -1;
        
        while (choice != 3) {
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Modulo de Ativos");
            System.out.println("2. Modulo de Operações");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Opção 1 selecionada.Entrando no Modulo de Ativos...");
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada. Por enquanto não há nada implementado nesse modulo.");
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada. saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }   
}
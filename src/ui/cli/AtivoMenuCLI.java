package ui.cli;

import java.util.Scanner;
import model.Ativo;
import repository.AtivoRepository;

public class AtivoMenuCLI {
    private Scanner scanner;
    private AtivoRepository ativoRepository;

    public AtivoMenuCLI() {
        this.scanner = new Scanner(System.in);
        this.ativoRepository = new AtivoRepository();
    }

}

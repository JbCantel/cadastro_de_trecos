package com.cantel.cadastro_de_trecos;

import com.cantel.cadastro_de_trecos.crud.Create;
import com.cantel.cadastro_de_trecos.crud.Delete;
import com.cantel.cadastro_de_trecos.setup.AppSetup;
import com.cantel.cadastro_de_trecos.crud.Read;
import com.cantel.cadastro_de_trecos.crud.Update;
import java.util.Scanner;

// criando uma classe 'cadatro de trecos'
public class Cadastro_de_trecos extends AppSetup {

// static : estático / void: diz o tipo ( não retorna nada ) / main: classe principal
    public static void main(String[] args) {
        clearScreen();
        mainMenu();

    }

   // Método que exibe o menu principal.
    public static void mainMenu() {

        System.out.println(appName + "\n" + appSep);
        System.out.println("Menu:");
        System.out.println("\t[1] Listar todos");
        System.out.println("\t[2] Listar");
        System.out.println("\t[3] Novo");
        System.out.println("\t[4] Editar");
        System.out.println("\t[5] Apagar");
        System.out.println("\t[0] Sair");
        System.out.println(appSep);
        System.out.print("Opção: ");

        // Recebe a opção do teclado.
        String option = scanner.next();

        // Executa um método conforme a opção escolhida.
        switch (option) {
            case "0":
                exitProgram();
                break;
            case "1":
                clearScreen();
                Read.readAll();
                break;
            case "2":
                clearScreen();
                Read.read();
                break;
            case "3":
                clearScreen();
                Create.create();
                break;
            case "4":
                clearScreen();
                Update.update();
                break;
            case "5":
                clearScreen();
                Delete.delete();
                break;
            default:
                clearScreen();
                System.out.println("Oooops! Opção inválida!\n");
                mainMenu();
        }
    }

    // Encerra o programa.
    public static void exitProgram() {
        scanner.close();
        clearScreen();
        System.out.println("\n\n HASTA LA VISTA!\n\n");
        System.exit(0);
    }

    // Limpa a tela do terminal.
    public static void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
        }
    }

}

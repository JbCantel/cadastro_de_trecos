package com.cantel.cadastro_de_trecos;

import com.cantel.cadastro_de_trecos.crud.Delete;
import com.cantel.cadastro_de_trecos.setup.AppSetup;
import com.cantel.cadastro_de_trecos.crud.Read;
import java.util.Scanner;

// criando uma classe 'cadatro de trecos'
public class Cadastro_de_trecos extends AppSetup {

// static : estático / void: diz o tipo ( não retorna nada ) / main: classe principal
    public static void main(String[] args) {
        clearScreen();
        mainMenu();

    }

    // Método que exibe o menu principal 
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
            case "0" ->
                exitProgram();
            case "1" -> {
                clearScreen();
                Read.readAll();
            }
            case "2" -> {
                clearScreen();
                Read.read();
            }
            case "3" ->
                newThing();
            case "4" ->
                editThing();
            case "5" -> {
                clearScreen();
                Delete.delete();
            }

            default ->
                reloadMenu();
        }
    }

    // Método que encerra o programa.
    public static void exitProgram() {
        scanner.close();
        clearScreen();
        System.out.println("\n\nHASTA LA VISTA!!\n\n");
        System.exit(0);
    }

    // Lista todos os trecos cadastrados.
    public static void listAll() {

    }

    // Lista um treco específico pelo Id
    public static void listOne() {
    }

    // Cadastra um novo treco.
    public static void newThing() {
    }

    // Edita um treco pelo Id.
    public static void editThing() {
    }

    //Apaga um treco pelo Id.
    public static void deleteThing() {
    }
    // Recarrega o menu principal.

    public static void reloadMenu() {
        clearScreen();
        System.out.println("erroouuuuu!!");
        mainMenu();
    }

    // Limpa a tela do terminal
    public static void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
        }
    }
}

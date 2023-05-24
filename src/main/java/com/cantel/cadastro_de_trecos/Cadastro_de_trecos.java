package com.cantel.cadastro_de_trecos;

import java.util.Scanner;

// criando uma classe 'cadatro de trecos'
public class Cadastro_de_trecos {

    /* scanner: objeto / New: criação de um novo objeto.
    * static : podemos acessar diretamente no código
     */
    static Scanner scanner = new Scanner(System.in);

// static : estático / void: diz o tipo ( não retorna nada ) / main: classe principal
    public static void main(String[] args) {
         clearScreen();
        mainMenu();

    }

    // Método que exibe o menu principal 
    public static void mainMenu() {
        System.out.println("Cadastro de Trecos\n \n Menu: \n \t[1] Listar todos \n \t[2] Listar \n \t[3] Novo\n \t[4] Editar\n \t[5] Apagar\n \t[0] Sair");
        System.out.print("\nOpção: ");
        // Recebe a opção do teclado.
        String option = scanner.next();

        // Executa um método conforme a opção escolhida.
        switch (option) {
            case "0":
                exitProgram();
                break;
            case "1":
                listAll();
                break;
            case "2":
                listOne();
                break;
            case "3":
                newThing();
                break;
            case "4":
                editThing();
                break;
            case "5":
                deleteThing();
                break;
            default:
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

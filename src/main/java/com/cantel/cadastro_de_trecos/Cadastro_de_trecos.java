/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.cantel.cadastro_de_trecos;

import java.util.Scanner;

// criando uma classe 'cadatro de trecos'
public class Cadastro_de_trecos {

// static : estático / void: diz o tipo / main: classe principal
    public static void main(String[] args) {
        System.out.println("Cadatro de Trecos\n \n Menu: \n \t[1] Listar todos \n \t[2] Listar \n \t[3] Novo\n \t[4] Editar\n \t[5] Apagar\n \t[0] Sair");
        System.out.print("\nOpção: ");

        // scanner: objeto / New: criação de um novo objeto.
        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();
        if (option.length() != 1) {
            System.out.println("errouuuuu!!");
        }
    }
}

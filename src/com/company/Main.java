package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno:");
        String nomeAluno  = scanner.nextLine();
        System.out.print("Digite a idade do aluno:");
        int idade = scanner.nextInt();

        VerificarIdade verificarIdade = new VerificarIdade(idade);

        String resultadoFinal = verificarIdade.verificarIdade(idade);
        System.out.println("Resultado: "+resultadoFinal);

        scanner.close();
    }
}

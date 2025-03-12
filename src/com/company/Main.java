package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno:");
        String nomeAluno  = scanner.nextLine();
        System.out.print("Digite a nota do aluno:");
        int nota = scanner.nextInt();

        Verificar verificar = new Verificar(nota);

        String resultadoFinal = verificar.verificarNota(nota);
        System.out.println("Resultado: "+resultadoFinal);

        scanner.close();
    }
}

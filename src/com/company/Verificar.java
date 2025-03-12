package com.company;

public class Verificar {
    private int nota;
    private String resultado;

    public Verificar(int nota){
        this.nota = nota;
    }
    public String verificarNota(int nota){
        if(nota >= 6){
            resultado = "Aprovado!";
        }
        else if(nota >= 5){
            resultado = "Recuperação!";
        }else {
            resultado = "Reprovado!";
        }
        return resultado;
    }
}


package com.company;

public class VerificarIdade {
    private int idade;
    private String resultado;

    public VerificarIdade(int idade){
        this.idade = idade;
    }
    public String verificarIdade(int idade){
        if(idade >= 18){
            resultado = "Maior de idade!";
        }else {
            resultado = "Menor de idade!";
        }
        return resultado;
    }
}


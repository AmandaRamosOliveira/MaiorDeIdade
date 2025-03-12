package com.company;

public class CategoriasDeProdutos {
    private int CodigoProduto;
    public CategoriasDeProdutos(int codigoProduto){
        this.CodigoProduto = codigoProduto;
    }
    public void EscolherCategoria(int codigoProduto){
        String categoria;
        switch (codigoProduto){
            case 1:
                categoria = "Eletronicos";
                break;
            case 2:
                categoria = "Alimento";
                break;
            case 3:
                categoria = "Vestuario";
                break;
            case 4:
                categoria = "Cosmetico";
                break;
            case 5:
                categoria = "Pet";
                break;
            default:
                categoria = "Não encontrado";
        }

    }
}

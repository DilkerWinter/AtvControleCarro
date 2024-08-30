package com.example.controledeveiculos;

public class Veiculos {

    public String nome;
    public String placa;
    public String modelo;
    public String anoFabricacao;
    public String cor;

    public String toString(){
        return nome + " - " + modelo + " - " + cor + " - "  + placa + " - " + anoFabricacao;
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {

        Camisa camisaSimples = new CamisaSimples("Vermelha", "G", 100.00);


        Camisa camisaEstampada = new CamisaEstampada("Vermelha", "G", 100.00, "Skull King");


        exibirInformacoesCamisa(camisaSimples);
        exibirInformacoesCamisa(camisaEstampada);
    }

    private static void exibirInformacoesCamisa(Camisa camisa) {
        camisa.exibirDetalhes();
        camisa.calcularDesconto();
        System.out.println();
    }
}
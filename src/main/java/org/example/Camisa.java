package org.example;

public abstract class Camisa {
    private String cor;
    private String tamanho;
    private double preco;

    public Camisa(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: R$" + preco);
    }

    public abstract double calcularDesconto();
}
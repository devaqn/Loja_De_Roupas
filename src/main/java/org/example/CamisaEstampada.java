package org.example;

public class CamisaEstampada extends Camisa {
    private static final double DESCONTO = 0.05; // 5%
    private String estampa;

    public CamisaEstampada(String cor, String tamanho, double preco, String estampa) {
        super(cor, tamanho, preco);
        this.estampa = estampa;
    }

    public String getEstampa() {
        return estampa;
    }

    public void setEstampa(String estampa) {
        this.estampa = estampa;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Estampa: " + estampa);
    }

    @Override
    public double calcularDesconto() {
        double valorDesconto = getPreco() * DESCONTO;
        double valorFinal = getPreco() - valorDesconto;

        System.out.printf("Valor desconto: R$%.2f\n", valorDesconto);
        System.out.printf("Valor total: R$%.2f\n", valorFinal);

        return valorDesconto;
    }
}
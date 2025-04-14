package org.example;

public class CamisaSimples extends Camisa {
    private double DESCONTO = 0.1;

    public CamisaSimples(String cor, String tamanho, double preco) {
        super(cor, tamanho, preco);
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
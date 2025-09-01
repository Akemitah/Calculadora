package com.mycompany.calculadora.controle;
/**
 *
 * @author 25170696
 */
public class CalculadoraController {
    
    private Double total;
    private boolean primeiraOperacao;
    
    public CalculadoraController(){
        total = 0.0;
        primeiraOperacao = true;
    }
    
    public Double realizaOperacao(String operacao, Double valor){
        if (primeiraOperacao) {
            total = valor;
            primeiraOperacao = false;
        } else {
            if (operacao.equals("+")) {
                total += valor;
            } else if (operacao.equals("-")) {
                total -= valor;
            } else if (operacao.equals("*")) {
                total *= valor;
            } else if (operacao.equals("%")) {
                total = total * (valor / 100);
            } else if (operacao.equals("Pot")) {
                total = Math.pow(total,valor);
            } else if (operacao.equals("/")) {
                if (valor != 0) {
                    total /= valor;
                } else {
                    total = 0.0; // ou você pode lançar um erro
                }
            }
        }

        return total;
    }

    public Double getTotal() {
        return this.total;
    }

    public void zerar() {
        total = 0.0;
        primeiraOperacao = true;
    }
}
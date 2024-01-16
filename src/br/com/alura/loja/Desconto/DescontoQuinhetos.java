package br.com.alura.loja.Desconto;

import br.com.alura.loja.Orcamento.Orcamento;

import java.math.BigDecimal;

public class Cincoitens {
    public BigDecimal Calcular(Orcamento orcamento) {
    if (orcamento.getQuantidadeDeItens() > 5) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
    return  java.math.BigDecimal.ZERO;

}
}

package br.com.alura.loja.Desconto;

import br.com.alura.loja.Orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoQuinhetos extends Desconto {
    public DescontoQuinhetos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal Calcular(Orcamento orcamento) {
    if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
        return orcamento.getValor().multiply(new BigDecimal("0.5"));
    }
    return proximo.Calcular(orcamento);

}
}

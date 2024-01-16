package imposto;

import br.com.alura.loja.Orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {
    public BigDecimal Calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}

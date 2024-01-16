package br.com.alura.loja.Orcamento;

import imposto.CalculadoraDeImposto;
import imposto.ICMS;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(100));
        CalculadoraDeImposto Calculadora = new CalculadoraDeImposto();
        System.out.println(Calculadora.Calcular(orcamento, new ICMS()));
    }

    public static class TestesDesconto {
        public static void main(String[] args) {
            Orcamento orcamento = new Orcamento(new BigDecimal(100));
            CalculadoraDeImposto Calculadora = new CalculadoraDeImposto();
            System.out.println(Calculadora.Calcular(orcamento, new ICMS()));
        }
    }
}

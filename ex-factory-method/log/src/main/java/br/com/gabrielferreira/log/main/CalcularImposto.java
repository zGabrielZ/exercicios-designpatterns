package br.com.gabrielferreira.log.main;

import br.com.gabrielferreira.log.calculadoraimposto.CalculadoraImposto;
import br.com.gabrielferreira.log.calculadoraimposto.impl.CalculadoraImpostoArquivoTxtImpl;
import br.com.gabrielferreira.log.calculadoraimposto.impl.CalculadoraImpostoLoggerImpl;

import java.math.BigDecimal;

public class CalcularImposto {

    public static void main(String[] args) {
        CalculadoraImposto calculadoraImposto = new CalculadoraImpostoLoggerImpl();
        calculadoraImposto.calcular(BigDecimal.valueOf(100.00));

        System.out.println("-----------------------------------------------");

        String saida = System.getProperty("user.home") + "/Downloads/";
        calculadoraImposto = new CalculadoraImpostoArquivoTxtImpl(saida);
        calculadoraImposto.calcular(BigDecimal.valueOf(200.00));
    }
}

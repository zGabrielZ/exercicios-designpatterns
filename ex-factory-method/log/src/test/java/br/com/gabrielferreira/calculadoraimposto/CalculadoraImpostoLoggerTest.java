package br.com.gabrielferreira.calculadoraimposto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

class CalculadoraImpostoLoggerTest {

    private CalculadoraImposto calculadoraImposto;

    @BeforeEach
    void setUp() {
        calculadoraImposto = new CalculadoraImpostoLogger();
    }

    @Test
    @DisplayName("Deve calcular imposto com o log logger")
    void deveCalcularImpostoComLogConsole() {
        calculadoraImposto.calcular(BigDecimal.valueOf(100.00));
        Assertions.assertEquals(BigDecimal.valueOf(90.00).setScale(2, RoundingMode.HALF_EVEN),
                calculadoraImposto.getValorCalculadoAposImposto().setScale(2, RoundingMode.HALF_EVEN));
    }
}

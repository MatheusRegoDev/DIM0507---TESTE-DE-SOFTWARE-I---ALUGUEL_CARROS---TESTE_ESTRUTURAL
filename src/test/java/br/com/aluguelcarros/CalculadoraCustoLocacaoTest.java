package br.com.aluguelcarros;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraCustoLocacaoTest
{
    private final CalculadoraCustoLocacao calculadora = new CalculadoraCustoLocacao();

    @ParameterizedTest
    @CsvSource({"1, 120.00", "2, 240.00"})
    void deveCalcularLocacaoBasica(int numeroDiarias, BigDecimal valorEsperado)
    {
        BigDecimal resultado = calculadora.calcularCustoLocacao(
            CategoriaVeiculo.ECONOMICO,
            NivelCliente.COMUM,
            numeroDiarias,
            0,
            0,
            TipoSeguro.SEM_SEGURO,
            false
        );

        assertEquals(valorEsperado, resultado);
    }
}

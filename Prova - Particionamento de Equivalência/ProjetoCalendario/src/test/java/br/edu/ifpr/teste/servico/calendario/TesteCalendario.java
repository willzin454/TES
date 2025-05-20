package br.edu.ifpr.teste.servico.calendario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteCalendario {

    ServicoCalendario servico = new ServicoCalendario();

    @Test
    public void testeMesValido() {
        String result = servico.gerarCalendarioMesAno(5, 2022);
        assertTrue(result.contains("Maio 2022"));
    }

    @Test
    public void testeAnoCompletoValido() {
        String result = servico.gerarCalendarioAno(2024);
        assertTrue(result.contains("Janeiro 2024"));
        assertTrue(result.contains("Dezembro 2024"));
    }

    @Test
    public void testeReformaGregoriana() {
        String result = servico.gerarCalendarioMesAno(9, 1752);
        assertTrue(result.contains("14 15 16"));
        assertFalse(result.contains("4 5 6"));
    }

    @Test
    public void testeMesInvalido() {
        String result = servico.gerarCalendarioMesAno(0, 2024);
        assertEquals("Parâmetros inválidos.", result);
    }

    @Test
    public void testeAnoInvalido() {
        String result = servico.gerarCalendarioAno(10000);
        assertEquals("Ano inválido.", result);
    }
}
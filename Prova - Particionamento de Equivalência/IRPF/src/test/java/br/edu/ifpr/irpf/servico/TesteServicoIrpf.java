package br.edu.ifpr.irpf.servico;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteServicoIrpf {

    ServicoIrpf servico = new ServicoIrpf();

    @Test
    public void testeIsento() {
        assertEquals(0.0, servico.calcularIrpf(1500.00), 0.01);
    }

    @Test
    public void testeFaixa7_5() {
        assertEquals(45.20, servico.calcularIrpf(2500.00), 0.01);
    }

    @Test
    public void testeFaixa15() {
        assertEquals(95.20, servico.calcularIrpf(3000.00), 0.01);
    }

    @Test
    public void testeFaixa22_5() {
        assertEquals(263.87, servico.calcularIrpf(4000.00), 0.01);
    }

    @Test
    public void testeFaixa27_5() {
        assertEquals(1055.64, servico.calcularIrpf(7000.00), 0.01);
    }

    @Test
    public void testeLimiteIsento() {
        assertEquals(0.0, servico.calcularIrpf(1903.98), 0.01);
    }

    @Test
    public void testeLimiteInicio7_5() {
        assertEquals(0.0, servico.calcularIrpf(1903.99), 0.01);
    }

    @Test
    public void testeAcimaMaximo() {
        assertEquals(1880.64, servico.calcularIrpf(10000.00), 0.01);
    }
}
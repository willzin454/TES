package br.edu.ifpr.teste.servico.maiuscula;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;
import br.edu.ifpr.teste.servico.maiusculas.servicoVerificarLetraMaiuscula;

public class testeMaiuscula {

    @Test
    public void deveFalharComSenhasInvalidas() throws Exception {
        String nomeArquivo = "testeUm.txt";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nomeArquivo);

        if (inputStream == null) {
            throw new Exception("Arquivo testeUm.txt não encontrado na pasta resources.");
        }

        servicoVerificarLetraMaiuscula servico = new servicoVerificarLetraMaiuscula();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String senha;
            while ((senha = reader.readLine()) != null) {
                boolean resultado = servico.validar(senha);
                System.out.println("Testando senha inválida: " + senha + " → Resultado: " + resultado);
                assertFalse(resultado, "A senha deveria ser inválida: " + senha);
            }
        }
    }
}

package br.edu.ifpr.teste.servico.maiusculas;

public class servicoVerificarLetraMaiuscula {

    public boolean validar(String senha) {
        if (senha == null) return false;

        boolean temMaiuscula = false;

        for (char c : senha.toCharArray()) { 
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
                break;
            }
        }
        
        return temMaiuscula;
    }
}

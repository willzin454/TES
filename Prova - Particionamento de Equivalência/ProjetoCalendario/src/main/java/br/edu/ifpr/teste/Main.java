package br.edu.ifpr.teste;

import br.edu.ifpr.teste.servico.calendario.ServicoCalendario;

public class Main {
    public static void main(String[] args) {
        ServicoCalendario servico = new ServicoCalendario();

        switch (args.length) {
            case 0 -> System.out.println(servico.gerarCalendario());
            case 1 -> System.out.println(servico.gerarCalendarioAno(Integer.parseInt(args[0])));
            default -> System.out.println(servico.gerarCalendarioMesAno(
                Integer.parseInt(args[0]), Integer.parseInt(args[1]))
            );
        }
    }
}
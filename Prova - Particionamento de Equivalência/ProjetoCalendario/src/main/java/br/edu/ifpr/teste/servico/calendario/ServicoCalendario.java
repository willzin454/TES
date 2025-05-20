package br.edu.ifpr.teste.servico.calendario;

import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

public class ServicoCalendario {

    public String gerarCalendario() {
        YearMonth ym = YearMonth.now();
        return gerarCalendarioMesAno(ym.getMonthValue(), ym.getYear());
    }

    public String gerarCalendarioAno(int ano) {
        if (ano < 1 || ano > 9999) return "Ano inválido.";
        StringBuilder sb = new StringBuilder();
        for (int mes = 1; mes <= 12; mes++) {
            sb.append(gerarCalendarioMesAno(mes, ano)).append("\n");
        }
        return sb.toString();
    }

    public String gerarCalendarioMesAno(int mes, int ano) {
        if (mes < 1 || mes > 12 || ano < 1 || ano > 9999) return "Parâmetros inválidos.";

        if (ano == 1752 && mes == 9) {
            return "Setembro 1752:\n1 2 3 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30";
        }

        YearMonth ym = YearMonth.of(ano, mes);
        StringBuilder sb = new StringBuilder();
        sb.append(ym.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()))
          .append(" ")
          .append(ano)
          .append(":\n");

        for (int dia = 1; dia <= ym.lengthOfMonth(); dia++) {
            sb.append(dia).append(" ");
        }

        return sb.toString().trim();
    }
}
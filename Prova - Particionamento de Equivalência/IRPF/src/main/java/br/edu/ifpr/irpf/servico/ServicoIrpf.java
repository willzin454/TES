package br.edu.ifpr.irpf.servico;

public class ServicoIrpf {

    public double calcularIrpf(double salario) {
        if (salario <= 1903.98) {
            return 0.0;
        } else if (salario <= 2826.65) {
            return salario * 0.075 - 142.80;
        } else if (salario <= 3751.05) {
            return salario * 0.15 - 354.80;
        } else if (salario <= 4664.68) {
            return salario * 0.225 - 636.13;
        } else {
            return salario * 0.275 - 869.36;
        }
    }
}
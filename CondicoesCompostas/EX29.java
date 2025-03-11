package Exercicios.CondicoesCompostas;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX29 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX29 - Desenvolva um programa que leia o nome de um funcionário," +
                "\nseu salário, quantos anos ele trabalha na empresa e mostre seu" +
                "\nnovo salário, reajustado de acordo com a tabela a seguir:" +
                "\n• Até 3 anos de empresa: aumento de 3%" +
                "\n• entre 3 e 10 anos: aumento de 12.5%" +
                "\n• 10 anos ou mais: aumento de 20%.");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar o nome, salário e tempo de trabalho do funcionário.");
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
        String salarioStr = JOptionPane.showInputDialog("Digite o salário atual:");
        String tempoStr = JOptionPane.showInputDialog("Digite quantos anos trabalha na empresa:");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter o salário e tempo de trabalho para os tipos numéricos apropriados.");
        salarioStr = salarioStr.replace(',', '.');
        tempoStr = tempoStr.replace(',', '.');
        double salario = Double.parseDouble(salarioStr);
        int tempo = Integer.parseInt(tempoStr);

        JOptionPane.showMessageDialog(null, "3º Passo - Verificar o tempo de serviço e calcular o aumento.");
        double aumento;
        if (tempo <= 3) {
            JOptionPane.showMessageDialog(null, "3º Passo - Se o tempo de serviço for até 3 anos, aplica-se um aumento de 3%.");
            aumento = salario * 0.03;
        } else if (tempo > 3 && tempo <= 10) {
            JOptionPane.showMessageDialog(null, "3º Passo - Se o tempo de serviço for entre 3 e 10 anos, aplica-se um aumento de 12.5%.");
            aumento = salario * 0.125;
        } else {
            JOptionPane.showMessageDialog(null, "3º Passo - Se o tempo de serviço for superior a 10 anos, aplica-se um aumento de 20%.");
            aumento = salario * 0.20;
        }

        JOptionPane.showMessageDialog(null, "4º Passo - Calcular o aumento de salário.");
        double novoSalario = salario + aumento;

        JOptionPane.showMessageDialog(null, "5ºPasso - Escolher o formato da moeda que será exibida ao usuário.");
        Locale Brasil = new Locale("pt", "BR");

        JOptionPane.showMessageDialog(null, "6º Passo - Exibir o novo salário do funcionário.");
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSalário Atual: " + NumberFormat.getCurrencyInstance(Brasil).format(salario) +
                "\nTempo de Serviço: " + tempo + " anos\nNovo Salário: " + NumberFormat.getCurrencyInstance(Brasil).format(novoSalario));
    }
}
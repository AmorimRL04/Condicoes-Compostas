package Exercicios.CondicoesCompostas;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX37 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX37 - Uma empresa precisa reajustar o salário dos seus funcionários, " +
                "\nleia o salário atual, o gênero do funcionário e há quantos anos " +
                "\nesse funcionário trabalha na empresa. No final, mostre o seu novo " +
                "salário, baseado na tabela a seguir: " +
                "\n" +
                "\n• Mulheres " +
                "\n• menos de 15 anos de empresa: +5% " +
                "\n• de 15 até 20 anos de empresa: +12% " +
                "\n• mais de 20 anos de empresa: +23% " +
                "\n" +
                "\n• Homens " +
                "\n• menos de 20 anos de empresa: +3% " +
                "\n• de 20 até 30 anos de empresa: +13% " +
                "\n• mais de 30 anos de empresa: +25%");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar o salário atual do funcionário.");
        String salarioStr = JOptionPane.showInputDialog("Digite o salário atual do funcionário:");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        salarioStr = salarioStr.replace(',', '.');
        double salario = Double.parseDouble(salarioStr);

        JOptionPane.showMessageDialog(null, "3º Passo - Solicitar e validar o gênero do funcionário.");
        String genero;
        while (true) {
            genero = JOptionPane.showInputDialog("Digite o gênero do funcionário (M para homem ou F para mulher):").toUpperCase();
            JOptionPane.showMessageDialog(null, "3º Passo - Verifica se o gênero digitado é válido (M ou F)");
            if (genero.equals("M") || genero.equals("F")) {
                break;  // Se válido, sai do loop
            } else {
                JOptionPane.showMessageDialog(null, "3º Passo - Se o gênero digitado for inválido, solicita novamente");
                JOptionPane.showMessageDialog(null, "Gênero inválido! Informe 'M' para homem ou 'F' para mulher.");
            }
        }


        JOptionPane.showMessageDialog(null, "4º Passo - Solicitar o número de anos que o funcionário trabalha na empresa.");
        String anosStr = JOptionPane.showInputDialog("Digite o número de anos que o funcionário trabalha na empresa:");
        int anosTrabalhados = Integer.parseInt(anosStr);

        JOptionPane.showMessageDialog(null, "5º Passo - Calcular o novo salário com base no gênero e nos anos de trabalho.");
        double novoSalario = salario;

        if (genero.equals("F")) {
            JOptionPane.showMessageDialog(null, "5º Passo -  Se o gênero for 'F' (mulher)");
            if (anosTrabalhados < 15) {
                JOptionPane.showMessageDialog(null, "5º Passo - Se a mulher tem menos de 15 anos de empresa, recebe um aumento de 5%");
                novoSalario += salario * 0.05;
            }
            else if (anosTrabalhados >= 15 && anosTrabalhados <= 20) {
                JOptionPane.showMessageDialog(null, "5º Passo - Se a mulher tem entre 15 e 20 anos de empresa, recebe um aumento de 12%");
                novoSalario += salario * 0.12;
            }
            else {
                JOptionPane.showMessageDialog(null, "5º Passo - Se a mulher tem mais de 20 anos de empresa, recebe um aumento de 23%");
                novoSalario += salario * 0.23;
            }
        }

        else if (genero.equals("M")) {
            JOptionPane.showMessageDialog(null, "5º Passo -  Se o gênero for 'M' (Homem)");if (anosTrabalhados < 20) {
                JOptionPane.showMessageDialog(null, "5º Passo - Se o homem tem menos de 20 anos de empresa, recebe um aumento de 3%");
                novoSalario += salario * 0.03;
            }
            else if (anosTrabalhados >= 20 && anosTrabalhados <= 30) {
                JOptionPane.showMessageDialog(null, "5º Passo - Se o homem tem entre 20 e 30 anos de empresa, recebe um aumento de 13%");
                novoSalario += salario * 0.13;
            }
            else {
                JOptionPane.showMessageDialog(null, "5º Passo - Se o homem tem mais de 30 anos de empresa, recebe um aumento de 25%");
                novoSalario += salario * 0.25;
            }
        }

        JOptionPane.showMessageDialog(null, "6º Passo - Escolher o formato da moeda que será exibida ao usuário.");
        Locale Brasil = new Locale("pt", "BR");

        JOptionPane.showMessageDialog(null, "7º Passo - Exibir o novo salário.");
        JOptionPane.showMessageDialog(null, "O novo salário do funcionário é: " +
                NumberFormat.getCurrencyInstance(Brasil).format(novoSalario));
    }
}

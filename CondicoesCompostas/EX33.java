package Exercicios.CondicoesCompostas;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX33 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX33 - Escreva um programa para aprovar ou não o empréstimo bancário" +
                "\npara a compra de uma casa. O programa vai perguntar o valor da" +
                "\ncasa, o salário do comprador e em quantos anos ele vai pagar." +
                "\nCalcule o valor da prestação mensal, sabendo que ela não pode" +
                "\nexceder 30% do salário ou então o empréstimo será negado.");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar o valor da casa, o salário do comprador e o número de anos para pagamento.");
        String valorCasaStr = JOptionPane.showInputDialog("Digite o valor da casa:");
        String salarioStr = JOptionPane.showInputDialog("Digite o salário do comprador:");
        String anosStr = JOptionPane.showInputDialog("Digite em quantos anos o comprador vai pagar:");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        valorCasaStr = valorCasaStr.replace(',', '.');
        salarioStr = salarioStr.replace(',', '.');
        anosStr = anosStr.replace(',', '.');
        double valorCasa = Double.parseDouble(valorCasaStr);
        double salario = Double.parseDouble(salarioStr);
        int anos = Integer.parseInt(anosStr);

        JOptionPane.showMessageDialog(null, "3º Passo - Calcular o valor da prestação mensal.");
        int numeroParcelas = anos * 12;
        double prestacaoMensal = valorCasa / numeroParcelas;

        JOptionPane.showMessageDialog(null, "4º Passo - Verificar se a prestação mensal excede 30% do salário.");
        double limitePrestacao = salario * 0.30;

        JOptionPane.showMessageDialog(null, "5ºPasso - Escolher o formato da moeda que será exibida ao usuário.");
        Locale Brasil = new Locale("pt", "BR");

        JOptionPane.showMessageDialog(null, "6º Passo - Verificar se foi aprovado ou negado o empréstimo");
        String resultado;

        if (prestacaoMensal > limitePrestacao) {
            JOptionPane.showMessageDialog(null, "6º Passo - Caso a prestação mensal seja maior que 30% do salário");
            resultado = "Empréstimo negado! A prestação mensal de " + NumberFormat.getCurrencyInstance(Brasil).format(prestacaoMensal) +
                    " excede 30% do seu salário de " + NumberFormat.getCurrencyInstance(Brasil).format(salario) + ".";
        } else {
            JOptionPane.showMessageDialog(null, "6º Passo - Caso a prestação mensal esteja dentro do limite");
            resultado = "Empréstimo aprovado! A prestação mensal é de " + NumberFormat.getCurrencyInstance(Brasil).format(prestacaoMensal) +
                    " e está dentro do limite de 30% do seu salário.";
        }

        JOptionPane.showMessageDialog(null, "7º Passo - Exibir o resultado final.");
        JOptionPane.showMessageDialog(null, resultado);
    }
}

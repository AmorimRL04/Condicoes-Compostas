package Exercicios.CondicoesCompostas;

import javax.swing.*;

public class EX27 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX27 - Crie um programa que leia duas notas de um aluno e calcule sua média, " +
                "\nmostrando uma mensagem no final, de acordo com a média atingida: " +
                "\n• Média até 4.9: REPROVADO " +
                "\n• Média entre 5.0 e 6.9: RECUPERAÇÃO " +
                "\n• Média 7.0 ou superior: APROVADO");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar ao aluno que digite as duas notas.");
        String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota:");
        String nota2Str = JOptionPane.showInputDialog("Digite a segunda nota:");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        nota1Str = nota1Str.replace(',', '.');
        nota2Str = nota2Str.replace(',', '.');
        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);

        JOptionPane.showMessageDialog(null, "3º Passo - Calcular a média das notas.");
        double media = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, "4º Passo - Verificar a situação e inserir a mensagem da situação do aluno com base na média.");
        String situacao;

        if (media <= 4.9) {
            JOptionPane.showMessageDialog(null, "4º Passo - Se a média é menor ou igual a 4.9, então o aluno está REPROVADO.");
            situacao = "REPROVADO";
        } else if (media >= 5.0 && media <= 6.9) {
            JOptionPane.showMessageDialog(null, "4º Passo - Se a média está entre 5.0 e 6.9, então o aluno está em RECUPERAÇÃO.");
            situacao = "RECUPERAÇÃO";
        } else {
            JOptionPane.showMessageDialog(null, "4º Passo - Se a média é 7.0 ou superior, então o aluno está APROVADO.");
            situacao = "APROVADO";
        }

        JOptionPane.showMessageDialog(null, "5º Passo - Exibir a média e a situação do aluno.");
        JOptionPane.showMessageDialog(null, "Média: " + String.format("%.2f", media) + "\nSituação: " + situacao);
    }
}

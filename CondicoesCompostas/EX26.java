package Exercicios.CondicoesCompostas;

import javax.swing.*;

public class EX26 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX26 - Escreva um algoritmo que leia dois números inteiros e compare-os,"
                +"\nmostrando na tela uma das mensagens abaixo:" +
                "\n• O primeiro valor é o maior" +
                "\n• O segundo valor é o maior" +
                "\n• Não existe valor maior, os dois são iguais");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar ao usuário os dois números inteiros.");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        JOptionPane.showMessageDialog(null, "2º Passo - Comparar os dois números e inserir a mensagem necessária.");
        String mensagem;
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "2º Passo - Se o primeiro valor é maior que o segundo.");
            mensagem = "O primeiro valor é o maior";
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "2º Passo - Se o segundo valor é maior que o primeiro.");
            mensagem = "O segundo valor é o maior";
        } else {
            JOptionPane.showMessageDialog(null, "2º Passo - Se os dois valores são iguais.");
            mensagem = "Não existe valor maior, os dois são iguais";
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir a mensagem de resultado.");
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

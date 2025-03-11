package Exercicios.CondicoesCompostas;

import javax.swing.*;

public class EX28 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX28 - Faça um programa que leia a largura e o comprimento de\n" +
                "um terreno retangular, calculando e mostrando a sua área em m². O programa também deve\n" +
                "mostrar a classificação desse terreno, de acordo com a lista abaixo:" +
                "\n• Abaixo de 100m² = TERRENO POPULAR" +
                "\n• Entre 100m² e 500m² = TERRENO MASTER" +
                "\n• Acima de 500m² = TERRENO VIP.");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar a largura e o comprimento do terreno.");
        String larguraStr = JOptionPane.showInputDialog("Digite a largura do terreno em metros:");
        String comprimentoStr = JOptionPane.showInputDialog("Digite o comprimento do terreno em metros:");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        larguraStr = larguraStr.replace(',', '.');
        comprimentoStr = comprimentoStr.replace(',', '.');
        double largura = Double.parseDouble(larguraStr);
        double comprimento = Double.parseDouble(comprimentoStr);

        JOptionPane.showMessageDialog(null, "3º Passo - Calcular a área do terreno.");
        double area = largura * comprimento;

        JOptionPane.showMessageDialog(null, "4º Passo - Classificar o terreno de acordo com a área.");
        String classificacao;

        if (area < 100) {
            JOptionPane.showMessageDialog(null, "4º Passo - Se a área é menor que 100 m², classificando como TERRENO POPULAR.");
            classificacao = "TERRENO POPULAR";
        } else if (area >= 100 && area <= 500) {
            JOptionPane.showMessageDialog(null, "4º Passo - Se a área está entre 100 e 500 m², classificando como TERRENO MASTER.");
            classificacao = "TERRENO MASTER";
        } else {
            JOptionPane.showMessageDialog(null, "4º Passo - Se a área é maior que 500 m², classificando como TERRENO VIP.");
            classificacao = "TERRENO VIP";
        }

        JOptionPane.showMessageDialog(null, "5º Passo - Exibir a área e a classificação do terreno.");
        JOptionPane.showMessageDialog(null, "Área do terreno: " + String.format("%.2f", area) + " m²\nClassificação: " + classificacao);
    }
}

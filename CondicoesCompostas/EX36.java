package Exercicios.CondicoesCompostas;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX36 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX36 - Um programa de vida saudável quer dar pontos por atividades " +
                "\nfísicas que podem ser trocados por dinheiro. O sistema funciona assim:" +
                "\n• Cada hora de atividade física no mês vale pontos" +
                "\n  - Até 10h de atividade no mês: ganha 2 pontos por hora" +
                "\n  - De 10h até 20h de atividade no mês: ganha 5 pontos por hora" +
                "\n  - Acima de 20h de atividade no mês: ganha 10 pontos por hora" +
                "\n• A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)." +
                "\n\nO programa deve ler quantas horas de atividade uma pessoa teve " +
                "\nno mês, calcular e mostrar quantos pontos ela teve e quanto dinheiro " +
                "\nela conseguiu ganhar.");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar a quantidade de horas de atividade física no mês.");
        String horasStr = JOptionPane.showInputDialog("Digite a quantidade de horas de atividade física no mês:");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        horasStr = horasStr.replace(',', '.');
        double horas = Double.parseDouble(horasStr);

        JOptionPane.showMessageDialog(null, "3º Passo - Calcular os pontos de acordo com as horas praticadas.");
        int pontos = 0;

        if (horas <= 10) {
            JOptionPane.showMessageDialog(null, "3º Passo - Se as horas forem até 10h, o cliente ganha 2 pontos por hora.");
            pontos = (int) (horas * 2);
        } else if (horas <= 20) {
            JOptionPane.showMessageDialog(null, "3º Passo - Se as horas estiverem entre 10h e 20h, o cliente ganha 2 pontos pelas 10 primeiras horas e 5 pontos para cada hora adicional.");
            pontos = (10 * 2) + (int) ((horas - 10) * 5);
        } else {
            JOptionPane.showMessageDialog(null, "3º Passo - Se o total de horas for superior a 20h, o cliente ganha 2 pontos pelas 10 primeiras horas, 5 pontos pelas 10 horas seguintes e 10 pontos para cada hora adicional.");
            pontos = (10 * 2) + (10 * 5) + (int) ((horas - 20) * 10);
        }

        JOptionPane.showMessageDialog(null, "4º Passo - Calcular o valor em dinheiro correspondente.");
        double dinheiro = pontos * 0.05;

        JOptionPane.showMessageDialog(null, "5ºPasso - Escolher o formato da moeda que será exibida ao usuário.");
        Locale Brasil = new Locale("pt", "BR");

        JOptionPane.showMessageDialog(null, "6º Passo - Exibir os resultados.");
        JOptionPane.showMessageDialog(null, "Você praticou " + horas + " horas de atividade física." +
                "\nTotal de pontos acumulados: " + pontos +
                "\nValor em dinheiro ganho: " + NumberFormat.getCurrencyInstance(Brasil).format(dinheiro));
    }
}

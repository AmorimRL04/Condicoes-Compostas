package Exercicios.CondicoesCompostas;

import javax.swing.*;
import java.util.Random;

public class EX31 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX31 - [DESAFIO] Crie um jogo de JoKenPo (Pedra, Papel, Tesoura).");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar a escolha do jogador.");
        String escolhaStr = JOptionPane.showInputDialog("Escolha:\n1 - Pedra\n2 - Papel\n3 - Tesoura");

        JOptionPane.showMessageDialog(null, "1º Passo - Verifica se o jogador cancelou a escolha ou fechou a janela");
        if (escolhaStr == null) return;

        JOptionPane.showMessageDialog(null, "2º Passo - Converter e validar a entrada do jogador.");
        int jogador = Integer.parseInt(escolhaStr);

        if (jogador < 1 || jogador > 3) {
            JOptionPane.showMessageDialog(null, "2º Passo -  Verifica se o valor inserido pelo jogador é inválido");
            JOptionPane.showMessageDialog(null, "Escolha inválida! Digite 1, 2 ou 3.");
            return;
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Gerar a escolha do computador.");
        int computador = new Random().nextInt(3) + 1;
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        JOptionPane.showMessageDialog(null, "4º Passo - Determinar o vencedor.");
        String resultado;


        if (jogador == computador) {
            JOptionPane.showMessageDialog(null, "4º Passo - Verificar se houve empate");
            resultado = "Empate!";
        }

        else if ((jogador == 1 && computador == 3) ||
                (jogador == 2 && computador == 1) ||
                (jogador == 3 && computador == 2)) {
            JOptionPane.showMessageDialog(null, "4º Passo - Verificar se o jogador venceu");
            resultado = "Você venceu!";
        }

        else {
            JOptionPane.showMessageDialog(null, "4º Passo - Caso o jogador não tenha vencido, o computador venceu");
            resultado = "O Computador venceu!";
        }

        JOptionPane.showMessageDialog(null, "5º Passo - Exibir o resultado.");
        JOptionPane.showMessageDialog(null,
                "Você escolheu: " + opcoes[jogador - 1] +
                        "\nComputador escolheu: " + opcoes[computador - 1] +
                        "\n" + resultado);
    }
}

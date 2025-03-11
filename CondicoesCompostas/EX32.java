package Exercicios.CondicoesCompostas;

import javax.swing.*;
import java.util.Random;

public class EX32 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX32 - [DESAFIO] Crie um jogo onde o computador vai sortear um número" +
                "\nentre 1 e 5 e o jogador vai tentar descobrir qual foi o valor sorteado.");

        JOptionPane.showMessageDialog(null, "1º Passo - Exibe as instruções do jogo e mensagem de boas-vindas");
        JOptionPane.showMessageDialog(null, "Bem-vindo ao jogo de Adivinhação!\n" +
                "O computador irá sortear um número entre 1 e 5. Tente adivinhar!");

        JOptionPane.showMessageDialog(null, "2º Passo - Sortear um número entre 1 e 5.");
        int numeroSorteado = new Random().nextInt(5) + 1;

        JOptionPane.showMessageDialog(null, "3º Passo - Solicitar a tentativa do jogador.");
        String tentativaStr = JOptionPane.showInputDialog("Digite um número entre 1 e 5 para tentar adivinhar:");

        if (tentativaStr == null) {
            JOptionPane.showMessageDialog(null, "3º Passo - Verifica se o jogador cancelou a entrada");
            JOptionPane.showMessageDialog(null, "Você cancelou o jogo.");
            return;
        }

        JOptionPane.showMessageDialog(null, "4º Passo - Validar a tentativa do jogador");
        int tentativa = Integer.parseInt(tentativaStr);

        if (tentativa < 1 || tentativa > 5) {
            JOptionPane.showMessageDialog(null, "4º Passo - Verifica se o número digitado pelo jogador está fora do intervalo permitido (1 a 5)");
            JOptionPane.showMessageDialog(null, "Escolha inválida! Digite um número entre 1 e 5.");
            return;
        }

        JOptionPane.showMessageDialog(null, "5º Passo - Verificar se o jogador acertou");
        String resultado;

        if (tentativa == numeroSorteado) {
            JOptionPane.showMessageDialog(null, "5º Passo - Verifica se o jogador acertou o número sorteado");
            resultado = "Você acertou!";
        }

        else {
            JOptionPane.showMessageDialog(null, "5º Passo - Caso contrário, o jogador errou e mostramos qual era o número sorteado");
            resultado = "Você errou! O número sorteado era " + numeroSorteado;
        }

        JOptionPane.showMessageDialog(null, "6º Passo - Exibir o resultado.");
        JOptionPane.showMessageDialog(null, resultado);
    }
}

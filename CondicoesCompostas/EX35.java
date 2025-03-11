package Exercicios.CondicoesCompostas;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX35 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX35 - Uma empresa de aluguel de carros precisa cobrar pelos seus " +
                "\nserviços. O aluguel de um carro custa R$90 por dia para carro" +
                "\npopular e R$150 por dia para carro de luxo. Além disso, o cliente " +
                "\npaga por Km percorrido. Faça um programa que leia o tipo de carro" +
                "\nalugado (popular ou luxo), quantos dias de aluguel e quantos Km " +
                "\nforam percorridos. No final mostre o preço a ser pago de acordo com " +
                "\na tabela a seguir:" +
                "\n" +
                "\n• Carros populares (aluguel de R$90 por dia) " +
                "\n  - Até 100Km percorridos: R$0,20 por Km " +
                "\n  - Acima de 100Km percorridos: R$0,10 por Km " +
                "\n• Carros de luxo (aluguel de R$150 por dia)" +
                "\n  - Até 200Km percorridos: R$0,30 por Km" +
                "\n  - Acima de 200Km percorridos: R$0,25 por Km");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar o tipo de carro, quantidade de dias e Km percorridos.");
        String tipoCarro = JOptionPane.showInputDialog("Digite o tipo de carro (Popular ou Luxo):").trim();
        String diasStr = JOptionPane.showInputDialog("Digite a quantidade de dias de aluguel:");
        String kmStr = JOptionPane.showInputDialog("Digite a quantidade de Km percorridos:");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        diasStr = diasStr.replace(',', '.');
        kmStr = kmStr.replace(',', '.');
        int dias = Integer.parseInt(diasStr);
        double kmPercorrido = Double.parseDouble(kmStr);

        JOptionPane.showMessageDialog(null, "3º Passo - Calcular o valor do aluguel do carro.");
        double valorDiaria = 0, custoKm = 0;

        if (tipoCarro.equalsIgnoreCase("popular")) {
             JOptionPane.showMessageDialog(null, "4º Passo - Caso o carro seja popular, a diária será de R$90.");
            valorDiaria = 90;

            if (kmPercorrido <= 100) {
                JOptionPane.showMessageDialog(null, "4º Passo -Se o km percorrido for até 100, cobra-se R$0,20 por km.");
                custoKm = kmPercorrido * 0.20;
            }

            else {
                JOptionPane.showMessageDialog(null, "4º Passo - Se o km percorrido for maior que 100, cobra-se R$0,10 por km adicional.");
                custoKm = (100 * 0.20) + ((kmPercorrido - 100) * 0.10);
            }
        }

        else if (tipoCarro.equalsIgnoreCase("luxo")) {
            JOptionPane.showMessageDialog(null, "5º Passo -  Caso o carro seja de luxo, a diária será de R$150.");
            valorDiaria = 150;

            if (kmPercorrido <= 200) {
                JOptionPane.showMessageDialog(null, "5º Passo - Se o km percorrido for até 200, cobra-se R$0,30 por km.");
                custoKm = kmPercorrido * 0.30;
            }

            else {
                JOptionPane.showMessageDialog(null, "5º Passo - Se o km percorrido for maior que 200, cobra-se R$0,25 por km adicional.");
                custoKm = (200 * 0.30) + ((kmPercorrido - 200) * 0.25);
            }
        }

        else {
            JOptionPane.showMessageDialog(null, "6º Passo - Se o tipo de carro não for válido, exibe uma mensagem de erro.");
            JOptionPane.showMessageDialog(null, "Tipo de carro inválido! Utilize 'Popular' ou 'Luxo'.");
            return;
        }

        JOptionPane.showMessageDialog(null, "7º Passo - Calcular o total a pagar.");
        double custoTotal = (dias * valorDiaria) + custoKm;

        JOptionPane.showMessageDialog(null, "8º Passo - Escolher o formato da moeda que será exibida ao usuário.");
        Locale Brasil = new Locale("pt", "BR");

        JOptionPane.showMessageDialog(null, "9º Passo - Exibir o valor total.");
        JOptionPane.showMessageDialog(null, "O carro que foi alugado foi do tipo " + tipoCarro + ", por " + dias + " dias, percorreu " + kmPercorrido + " km" +
                "\nO valor total do aluguel é: " + NumberFormat.getCurrencyInstance(Brasil).format(custoTotal));
    }
}

package Exercicios.CondicoesCompostas;

import javax.swing.*;

public class EX34 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX34 - O Índice de Massa Corpórea (IMC) é um valor calculado baseado" +
                "\nna altura e no peso de uma pessoa. De acordo com o valor do IMC," +
                "\npodemos classificar o indivíduo dentro de certas faixas." +
                "\n• abaixo de 18.5: Abaixo do peso" +
                "\n• entre 18.5 e 25: Peso ideal" +
                "\n• entre 25 e 30: Sobrepeso" +
                "\n• entre 30 e 40: Obesidade" +
                "\n• acima de 40: Obesidade mórbida" +
                "\n" +
                "\nObs: O IMC é calculado pela expressão peso/altura² (peso dividido" +
                "\npelo quadrado da altura)");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar o peso e a altura.");
        String pesoStr = JOptionPane.showInputDialog("Digite o seu peso (em kg):");
        String alturaStr = JOptionPane.showInputDialog("Digite a sua altura (em metros):");

        JOptionPane.showMessageDialog(null, "2º Passo -  Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        pesoStr = pesoStr.replace(',', '.');
        alturaStr = alturaStr.replace(',', '.');
        double peso = Double.parseDouble(pesoStr);
        double altura = Double.parseDouble(alturaStr);

        JOptionPane.showMessageDialog(null, "3º Passo - Calcular o IMC.");
        double imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "4º Passo - Classificar o IMC.");
        String classificacao = "";
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "4º Passo - Se o IMC for inferior a 18.5 classificar como abaixo do peso");
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            JOptionPane.showMessageDialog(null, "4º Passo - Se o IMC for inferior a 25 classificar como peso ideal");
            classificacao = "Peso ideal";
        } else if (imc >= 25 && imc < 30) {
            JOptionPane.showMessageDialog(null, "4º Passo - Se o IMC for inferior a 30 classificar como sobrepeso");
            classificacao = "Sobrepeso";
        } else if (imc >= 30 && imc < 40) {
            JOptionPane.showMessageDialog(null, "4º Passo - Se o IMC for inferior a 40 classificar como obesidade");
            classificacao = "Obesidade";
        } else {
            JOptionPane.showMessageDialog(null, "4º Passo - Se o IMC for superior 40 classificar como Obesidade mórbida");
            classificacao = "Obesidade mórbida";
        }

        JOptionPane.showMessageDialog(null, "5º Passo - Exibir o IMC e a classificação.");
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc) + "\nClassificação: " + classificacao);
    }
}

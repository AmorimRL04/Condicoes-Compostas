package Exercicios.CondicoesCompostas;

import javax.swing.*;

public class EX30 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX30 - [DESAFIO] Crie um programa que leia o tamanho de três segmentos" +
                "\nde reta. Analise seus comprimentos e diga se é possível formar um" +
                "\ntriângulo com essas retas. Matematicamente, para três segmentos" +
                "\nformarem um triângulo, o comprimento de cada lado deve ser menor" +
                "\nque a soma dos outros dois." +
                "\n• [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de " +
                "\nmostrar que tipo de triângulo será formado: " +
                "\n• EQUILÁTERO: todos os lados iguais" +
                "\n• ISÓSCELES: dois lados iguais" +
                "\n• ESCALENO: todos os lados diferentes");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar o tamanho dos três segmentos.");
        String aStr = JOptionPane.showInputDialog("Digite o comprimento do primeiro segmento:");
        String bStr = JOptionPane.showInputDialog("Digite o comprimento do segundo segmento:");
        String cStr = JOptionPane.showInputDialog("Digite o comprimento do terceiro segmento:");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter os valores para o formato americano, caso seja digitado com vírgula.");
        aStr = aStr.replace(',', '.');
        bStr = bStr.replace(',', '.');
        cStr = cStr.replace(',', '.');
        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double c = Double.parseDouble(cStr);

        JOptionPane.showMessageDialog(null, "3º Passo - Verificar se os segmentos podem formar um triângulo.");
        String tipoTriangulo = "";
        String resultado = "";

        if (a + b > c && a + c > b && b + c > a) {
            JOptionPane.showMessageDialog(null, "3º Passo - Se os segmentos formam um triângulo, verificar o tipo.");

            if (a == b && b == c) {
                JOptionPane.showMessageDialog(null, "3º Passo - Todos os lados são iguais, triângulo EQUILÁTERO.");
                tipoTriangulo = "EQUILÁTERO";
            }

            else if (a == b || a == c || b == c) {
                JOptionPane.showMessageDialog(null, "3º Passo - Dois lados são iguais, triângulo ISÓSCELES.");
                tipoTriangulo = "ISÓSCELES";
            }

            else {
                JOptionPane.showMessageDialog(null, "3º Passo - Todos os lados são diferentes, triângulo ESCALENO.");
                tipoTriangulo = "ESCALENO";
            }

            resultado = "Os segmentos podem formar um triângulo do tipo: " + tipoTriangulo;
        } else {
            JOptionPane.showMessageDialog(null, "3º Passo - Os segmentos NÃO podem formar um triângulo.");
            resultado = "Os segmentos NÃO podem formar um triângulo.";
        }

        JOptionPane.showMessageDialog(null, "4º Passo - Exibir o resultado.");
        JOptionPane.showMessageDialog(null, resultado);
    }
}
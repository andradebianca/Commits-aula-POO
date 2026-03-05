package com.mycompany.bancosistema;

import javax.swing.JOptionPane; //Biblioteca de telas gráfica. Tendo duas mensagerias: apresentação e capturação de digitação de usuários,

public class Principal {

    public static void main(String[] args) {

        Conta[] conta = new Conta[4];
        int x;
        for (x = 1; x < 3; x++) {
            int agencia = Integer.parseInt(JOptionPane.showInputDialog("Agência da conta (" + x + "): ")); //Integer.parseInt -> conversao de dados.
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Número da conta (" + x + "): "));
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial " + x + "): "));
            double limite = Double.parseDouble(JOptionPane.showInputDialog("Limite (" + x + "): "));
            conta[x] = new Conta(agencia, numero, saldo, limite);
            JOptionPane.showMessageDialog(null, conta[x].imprimir());
        }

        // Classe de exemplo
// Operações:
    }
}

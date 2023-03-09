/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetocalculadora;
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        // Se crea una instancia de ObjetoCalculadora
        ObjetoCalculadora calculadora = new ObjetoCalculadora();
        
        // Se asignan valores a los atributos de la clase
        calculadora.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 1")));
        calculadora.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 2")));
        
        // Se ejecutan las operaciones y se imprimen los resultados utilizando el método modularizado
        imprimirResultado("Suma", calculadora.calcularSuma());
        imprimirResultado("Resta", calculadora.calcularResta());
        imprimirResultado("Multiplicación", calculadora.calcularMultiplicacion());
        imprimirResultado("División", calculadora.calcularDivision());
    }
    
    // Método para imprimir los resultados de las operaciones
    public static void imprimirResultado(String operacion, int resultado) {
        JOptionPane.showMessageDialog(null, operacion + ": " + resultado);
    }
}

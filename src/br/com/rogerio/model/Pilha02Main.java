/*
* 2. Faça um programa que leia um número inteiro maior que zero e que o
* converta em uma base b qualquer, usando a classe Pilha. Mostre o número
* lido e o correspondente na base b.
 */
package br.com.rogerio.model;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class Pilha02Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int base;

        System.out.print("Informe um número inteiro maior que zero: ");
        numero = scan.nextInt();
        System.out.print("Informe a base de conversão: ");
        base = scan.nextInt();
        try {
            
            System.out.println(converterDecimal(numero, base));
           
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Atenção !!!" + erro.getMessage());
        }
    }

    public static String converterDecimal(int numero, int base) throws Exception {

        int quantElementos = 0;
        int num = numero;

        // Com este laço pegamos a quantidade de elementos para a pilha
        while (num != 0) {
            num = num / base;
            quantElementos++;
        }

        Pilha02 p = new Pilha02(quantElementos);

        // Empilhando a pilha com o resto da divisão
        while (!p.isFull()) {
            p.push(numero % base);
            numero = numero / base;
        }

        String saida = "";
        String letras = "1234567890ABCDEF";
        while (!p.isEmpty()) {
            int ntopo = p.top();
            saida += letras.charAt(ntopo);
            p.pop();
        }
            return saida;
    }
}

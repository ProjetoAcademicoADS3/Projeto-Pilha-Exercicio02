/*
* 2. Faça um programa que leia um número inteiro maior que zero e que o
* converta em uma base b qualquer, usando a classe Pilha. Mostre o número
* lido e o correspondente na base b.
 */
package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class Pilha02 {

    private int tamanho;
    private int elemento[];
    private int topo;

    public Pilha02(int tamanho) {
        this.tamanho = tamanho ;
        elemento = new int[tamanho];
        topo = -1;
    }

    public void push(int elemento) throws Exception {
        if (isFull()) {
            throw new Exception("A pilha está cheia!");
        }
        topo++;
        this.elemento[topo] = elemento;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("A pilha está vazia!");
        }
        int elemento;
        elemento = this.elemento[topo];
        topo--;
        return elemento;
    }

    public boolean isEmpty() throws Exception {
        return topo == -1;
    }

    public boolean isFull() throws Exception {

        return topo == this.elemento.length - 1;
    }

    public int top() throws Exception {
        if (isEmpty()) {
            throw new Exception("A pilha está vazia!");
        }
        return elemento[topo];
    }
    
    public int quantElementos(){
        return topo +1;
    }
}

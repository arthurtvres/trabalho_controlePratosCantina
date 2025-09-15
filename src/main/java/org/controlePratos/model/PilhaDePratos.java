package org.controlePratos.model;

import org.controlePratos.entity.Prato;

public class PilhaDePratos {
    private Prato[] pratos;
    private int topo;
    private int capacidade;

    // Construtor
    public PilhaDePratos(int capacidade) {
        this.capacidade = capacidade;
        this.pratos = new Prato[capacidade];
        this.topo = 0; // começa vazia
    }

    // push
    public void adicionarPrato(Prato prato) {
        if (pilhaCheia()) {
            System.out.println("Pilha cheia! Não é possível empilhar mais pratos.");
        } else {
            pratos[topo] = prato;
            topo++;
            System.out.println("Prato limpo empilhado: " + prato);
        }
    }

    // pop
    public Prato retirarPrato() {
        if (pilhaVazia()) {
            System.out.println("Pilha de pratos vazia, não há pratos para pegar!");
            return null;
        } else {
            topo--;
            Prato prato = pratos[topo];
            pratos[topo] = null;
            System.out.println("Prato retirado da pilha: " + prato);
            return prato;
        }
    }

    // peek
    public Prato verUltimoPrato() {
        if (pilhaVazia()) {
            System.out.println("Pilha de pratos vazia, não há pratos para ver!");
            return null;
        } else {
            return pratos[topo - 1];
        }
    }

    // verifica se ta vazia
    public boolean pilhaVazia() {
        return topo == 0;
    }

    // verifica se ta cheia
    public boolean pilhaCheia() {
        return topo == capacidade;
    }

    // mostra estado atual da pilha
    public void exibirPilha() {
        System.out.println("Estado atual da pilha:");
        for (int i = topo - 1; i >= 0; i--) {
            System.out.println(pratos[i]);
        }
    }
}

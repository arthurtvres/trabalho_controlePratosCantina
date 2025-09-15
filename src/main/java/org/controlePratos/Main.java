package org.controlePratos;

import org.controlePratos.entity.Prato;
import org.controlePratos.model.PilhaDePratos;

public class Main {
    public static void main(String[] args) {
        PilhaDePratos p = new PilhaDePratos(10);

        //adicionando pratos.
        System.out.println("Adicionando pratos limpos.");
        for(int i = 1; i<= 5; i++) {
            p.adicionarPrato(new Prato(i, "limpo."));
        }
        System.out.println();

        //retirando dois pratos.
        System.out.println("Retirando dois pratos...");
        for(int i = 1; i < 3; i++) {
            Prato retirado = p.retirarPrato();
        }
        System.out.println();

        //estado prato do topo
        Prato topo = p.verUltimoPrato();
        System.out.println("Estado do prato no topo: "+ topo);
        System.out.println();

        // estado final da pilha
        p.exibirPilha();
    }
}

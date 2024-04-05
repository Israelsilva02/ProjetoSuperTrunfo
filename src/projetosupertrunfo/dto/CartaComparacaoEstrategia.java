package projetosupertrunfo.dto;

import projetosupertrunfo.card.Carta;

public class CartaComparacaoEstrategia {
 
    public Carta compararCartas(Carta... cartas) {
        if (cartas.length == 0) {
            throw new IllegalArgumentException("Pelo menos uma carta deve ser fornecida.");
        }

        Carta vencedora = cartas[0]; 

        for (int i = 1; i < cartas.length; i++) {
            Carta cartaAtual = cartas[i];

            
            if (cartaAtual.getAtaque() > vencedora.getAtaque()) {
                vencedora = cartaAtual;
            } else if (cartaAtual.getAtaque() == vencedora.getAtaque()) {
             
                if (cartaAtual.getDefesa() > vencedora.getDefesa()) {
                    vencedora = cartaAtual;
                }
            }
        }
 
        return vencedora;
    }
}


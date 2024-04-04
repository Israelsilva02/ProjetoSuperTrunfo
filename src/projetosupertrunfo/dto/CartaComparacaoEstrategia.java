package projetosupertrunfo.dto;

import projetosupertrunfo.card.Carta;

public class CartaComparacaoEstrategia {
    // Método para comparar duas cartas e determinar qual é a vencedora
    public Carta compararCartas(Carta... cartas) {
        if (cartas.length == 0) {
            throw new IllegalArgumentException("Pelo menos uma carta deve ser fornecida.");
        }

        Carta vencedora = cartas[0]; 

        for (int i = 1; i < cartas.length; i++) {
            Carta cartaAtual = cartas[i];

            // Comparação com base no ataque
            if (cartaAtual.getAtaque() > vencedora.getAtaque()) {
                vencedora = cartaAtual;
            } else if (cartaAtual.getAtaque() == vencedora.getAtaque()) {
                // Se o ataque for igual, compare a defesa
                if (cartaAtual.getDefesa() > vencedora.getDefesa()) {
                    vencedora = cartaAtual;
                }
            }
        }
 
        return vencedora;
    }
}


package projetosupertrunfo.dto;

import projetosupertrunfo.card.Carta;

public class CartaComparacaoEstrategia {
    // Método para comparar duas cartas e determinar qual é a vencedora
    public Carta compararCartas(Carta carta1, Carta carta2,Carta carta3, Carta carta4,Carta carta5, Carta carta6) {
        // Comparação com base no ataque
        int resultadoAtaque = Integer.compare(carta1.getAtaque(), carta2.getAtaque());
        if (resultadoAtaque != 0) {
            return (resultadoAtaque > 0) ? carta1 : carta2;
        }
        int resultadoAtaque1 = Integer.compare(carta3.getAtaque(), carta4.getAtaque());
        if (resultadoAtaque != 0) {
            return (resultadoAtaque > 0) ? carta3 : carta4;
        }
        int resultadoAtaque2 = Integer.compare(carta5.getAtaque(), carta6.getAtaque());
        if (resultadoAtaque != 0) {
            return (resultadoAtaque > 0) ? carta5 : carta6;
        }
        // Se o ataque for igual, compare a defesa
        int resultadoDefesa = Integer.compare(carta1.getDefesa(), carta2.getDefesa());
        if (resultadoDefesa != 0) {
            return (resultadoDefesa > 0) ? carta1 : carta2;
        }
        int resultadoDefesa1 = Integer.compare(carta3.getDefesa(), carta4.getDefesa());
        if (resultadoDefesa != 0) {
            return (resultadoDefesa > 0) ? carta3 : carta4;
        }
        int resultadoDefesa2 = Integer.compare(carta5.getDefesa(), carta6.getDefesa());
        if (resultadoDefesa != 0) {
            return (resultadoDefesa > 0) ? carta5 : carta6;
        }

        // Se a defesa também for igual, compare a vida
        int resultadoVida = Integer.compare(carta1.getVida(), carta2.getVida());
        if (resultadoVida != 0) {
            return (resultadoVida > 0) ? carta1 : carta2;
        }
        int resultadoVida1 = Integer.compare(carta3.getVida(), carta4.getVida());
        if (resultadoVida != 0) {
            return (resultadoVida > 0) ? carta3 : carta4;
        }
        int resultadoVida2 = Integer.compare(carta5.getVida(), carta6.getVida());
        if (resultadoVida != 0) {
            return (resultadoVida > 0) ? carta5 : carta6;
        }

        // Se todos os atributos forem iguais, retorne null (empate)
        return null;
    }
}

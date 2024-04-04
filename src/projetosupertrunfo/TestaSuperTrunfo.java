package projetosupertrunfo;

import projetosupertrunfo.card.Carta;
import projetosupertrunfo.card.JogadorSingleton;
import projetosupertrunfo.dto.CartaComparacaoEstrategia;
import projetosupertrunfo.dto.Jogador;

public class TestaSuperTrunfo {
    public static void main(String[] args) {
        
        Carta carta1 = new Carta("Charizard", 100, 80, 150);
        Carta carta2 = new Carta("Feraligator", 90, 100, 120);
        Carta carta3 = new Carta("Giratina", 110, 70, 130);
        Carta carta4 = new Carta("Pikachu", 500, 180, 10);
        Carta carta5 = new Carta("Stelix", 90, 1, 20);
        Carta carta6 = new Carta("Dialga", 10, 270, 40);


        CartaComparacaoEstrategia estrategia = new CartaComparacaoEstrategia();

        System.out.println("Jogador 1:");
        System.out.println("Carta: " + carta1.getName() + " (Ataque: " + carta1.getAtaque() + ", Defesa: " + carta1.getDefesa() + ")");
        System.out.println("Jogador 2:");
        System.out.println("Carta: " + carta2.getName() + " (Ataque: " + carta2.getAtaque() + ", Defesa: " + carta2.getDefesa() + ")");

        Carta[] todasAsCartas = {carta1, carta2, carta3, carta4, carta5, carta6};
        Carta vencedora = estrategia.compararCartas(todasAsCartas);

        if (vencedora != null) {
            System.out.println("\nA carta vencedora é: " + vencedora.getName());
            if (vencedora == carta1) {
                System.out.println("Jogador vencedor: Jogador 1");
            } else {
                System.out.println("Jogador vencedor: Jogador 2");
            }
        } else {
            System.out.println("\nEmpate entre as cartas!");
        }
    }
}

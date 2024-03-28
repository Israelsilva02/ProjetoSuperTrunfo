package projetosupertrunfo;

import projetosupertrunfo.card.Carta;
import projetosupertrunfo.card.JogadorSingleton;
import projetosupertrunfo.dto.Jogador;

public class TestaSuperTrunfo {
	public static void main(String[] args) {
        Jogador jogador = JogadorSingleton.getInstance();

        Carta carta1 = new Carta("Picachu", 80, 60);
        Carta carta2 = new Carta("Giratina", 70, 75);

        jogador.addCarta(carta1);
        jogador.addCarta(carta2);

        jogador.(new AttackComparisonStrategy());

        Card winningCard = deck.getWinningCard();
        System.out.println("A carta vencedora é: " + winningCard.getName());
    }
}
